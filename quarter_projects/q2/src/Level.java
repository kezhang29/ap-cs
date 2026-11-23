public class Level {
    public Wall[] walls;

    public Level(int[][] map, int levelNumber, int tileSize) {
        if (levelNumber == 1) {
            walls = new Wall[69];
        } else if (levelNumber == 2) {

        }
        int x,y;
        int k = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                int tile = map[i][j];
                x = tileSize * j;
                y = tileSize * i;
                if (tile == 1) {
                    walls[k] = new Wall(x,y,tileSize,tileSize);
                    k += 1;
                }
            }
        }
    }
}
