package engine;

public class Tile {
	private Board b;
	private TileType tileType;
	private int positionX;
	private int positionY;
	
	public Tile(TileType tileType, int positionX, int positionY)
	{
		this.positionX = positionX;
		this.positionY = positionY;
		this.tileType = tileType;
	}
	
	public TileState getLeftState()
	{
		int boardEndPointX = b.getBoardWidth();
		int boardEndPointY = b.getBoardLength();
		int leftTile = this.positionX +1;
		if(leftTile > boardEndPointX)
		{
			return TileState.END;
		}
		else if(!b.isTileEmpty(leftTile, this.positionY))
		{
			return TileState.FILLED;
		}
		else if(b.isTileEmpty(leftTile, this.positionY))
		{
			return TileState.EMPTY;
		}
		else
		{
			//Best not to go at all
			return TileState.FILLED;
		}
		
	}
	public void getRight()
	{
		
	}
	public void getTop()
	{
		
	}
	public void getBottom()
	{
		
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


	public Board getB() {
		return b;
	}


	public void setB(Board b) {
		this.b = b;
	}
	
	
}
