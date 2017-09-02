package model;

public class Aresta {
	
	@Override
	public String toString() {
		return "Aresta [x=" + x + "]";
	}

	private int x;

	public Aresta(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	
}
