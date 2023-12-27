package game;

public class GameMap {
    static GameTile map[][];

    GameMap(int xsize,int ysize){
        map = new GameTile[xsize][ysize];

    }

    public static GameTile getTile(int x, int y) {
        return map[x][y];
    }
    
}
