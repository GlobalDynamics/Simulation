package engine;

public class Tile {
	private TileType tileType;
	private int positionX;
	private int positionY;
	
	public Tile(TileType tileType, int positionX, int positionY)
	{
		this.positionX = positionX;
		this.positionY = positionY;
		this.tileType = tileType;
	}
	
	
	public TileType getTileType() {
		return tileType;
	}
	public void setTileType(TileType tileType) {
		this.tileType = tileType;
	}
	public int getPositionX() {
		return positionX;
	}
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	public int getPositionY() {
		return positionY;
	}
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	
	
}
