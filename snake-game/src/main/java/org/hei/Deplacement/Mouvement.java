package org.hei.Deplacement;

import org.hei.Position.Direction;

public class Mouvement {
    Direction direction;
    Point point;
    boolean alive = true;

    public void up(){
        while(alive){
            if(direction == Direction.UP){
                point.y++;
            }
        }
    }
    public void down(){
        while(alive){
            if(direction == Direction.UP){
                point.y--;
            }
        }
    }
    public void right(){
        while(alive){
            if(direction == Direction.UP){
                point.x++;
            }
        }
    }
    public void left(){
        while(alive){
            if(direction == Direction.UP){
                point.x--;
            }
        }
    }
}
