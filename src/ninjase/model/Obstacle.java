package ninjase.model;
import java.awt.Color;

public class Obstacle {
       	int x;
	int y;
        int w;
        int h;
        Color color;
        
	public Obstacle(int x, int y, int w, int h, Color color) {
		this.x = x;
		this.y = y;
                this.w = w;
                this.h = h;
                this.color = color;
        }
        
        public int[] values(){
            int[] obstacleData = {this.x, this.y, this.w, this.h};
            return obstacleData;
        }
        
        public Color getObstacleColor(){
            return this.color;
        }
        
        public void setPos(int x, int y, int w, int h){
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
        }        

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
