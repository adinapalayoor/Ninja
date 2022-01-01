package ninjase.model;


public class Ninja {
	int x;
	int y;
	int w;
	int h;
	String imgUrl = "C:\\Users\\adina_l1uzsjt\\Software Engineering\\Ninja\\src\\ninjase\\model\\ninja.png";

	public Ninja(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public int[] values(){
		int[] ninjaData = {this.x, this.y, this.w, this.h};
		return ninjaData;
	}

	public String getNinjaUrl(){
		return this.imgUrl;
	}

	public void setPos(int x, int y, int w, int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}        
}
