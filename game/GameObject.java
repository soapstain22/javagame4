package game;

import game.interactions.BehaviorLocate;

/**
 * GameObject
 */
public abstract class GameObject{
    GameCoordinate gc;
    
    boolean move(int x, int y){
        if (GameMap.getTile(gc.x+x,gc.y+y).isSolid) {
            
        }
        return false;
    }
}