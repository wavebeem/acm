import java.util.*;

public class Main {
    public static int calcSize(int x, int y) {
        return calcSize(x, y, 0);
    }

    public static int calcSize(int x, int y, int size) {
        boolean ok = true;
        if (x+size >= mapSize || y+size >= mapSize)
            return size;

        for (int i=x; i <= x+size; i++) {
            for (int j=y; j <= y+size; j++) {
                if (map[j][i] == '#') {
                    ok = false;
                }
            }
        }

        return !ok? size: calcSize(x, y, size + 1);
    }

    public static char[][] map;
    public static int [][] sizes;
    public static int      mapSize;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numTests = in.nextInt();

        for (int i=0; i < numTests; i++) {
            mapSize = in.nextInt();

            map   = new char[mapSize][mapSize];
            sizes = new int [mapSize][mapSize];

            for (int j=0; j < mapSize; j++) {
                char[] line = in.next().toCharArray();
                for (int k=0; k < mapSize; k++) {
                    map[k][j] = line[k];
                }
            }

            for (int j=0; j < mapSize; j++) {
                for (int k=0; k < mapSize; k++) {
                    sizes[j][k] = calcSize(k, j);
                }
            }

            int maxSize = -1;
            for (int x=0; x < mapSize; x++) {
                for (int y=0; y < mapSize; y++) {
                    if (sizes[y][x] > maxSize) {
                        maxSize = sizes[y][x];
                    }
                }
            }
            System.out.println(maxSize);
        }
    }
}
