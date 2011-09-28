
public class Point {

	/**
	 * abs. du point
	 */
	protected int x;
	
	/**
	 * ord. du point
	 */
	protected int y;

	/**
	 * Constructeur avec les paramètres
	 * 
	 * @param x
	 * @param y
	 */
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * Methode toString
	 */
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public int getX() {
		return x;
	}

	/**
	 * 
	 */
	public Point() {
		super();
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
