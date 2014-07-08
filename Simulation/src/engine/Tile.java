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
	
    public double GetAngleOfLineBetweenTwoPoints(Tile p1, Tile p2)
    {
        double xDiff = p2.getPositionX() - p1.getPositionX();
        double yDiff = p2.getPositionY() - p1.getPositionY();
        return Math.toDegrees(Math.atan2(yDiff, xDiff));
    }
    
    public TileDirection getDirection(Tile p1, Tile p2)
    {
    	double angle = GetAngleOfLineBetweenTwoPoints(p1, p2);
    	if(angle >= 0 && angle <90)
    	{
    		return TileDirection.UP;
    	}
    	else if(angle >= 90 && angle <180)
    	{
    		return TileDirection.RIGHT;
    	}
    	else if(angle >= 180 && angle <270)
    	{
    		return TileDirection.DOWN;
    	}
    	else if(angle >= 270 && angle <360)
    	{
    		return TileDirection.LEFT;
    	}
		return TileDirection.NONE;
    }
	
	public TileState getLeftState()
	{
		int boardEndPointX = b.getBoardWidth();
		int boardEndPointY = b.getBoardLength();
		int leftTile = this.positionX -1;
		if(leftTile < 0)
		{
			return TileState.X_START;
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
	public TileState getRightState()
	{
		int boardEndPointX = b.getBoardWidth();
		int boardEndPointY = b.getBoardLength();
		int rightTile = this.positionX +1;
		if(rightTile > boardEndPointX)
		{
			return TileState.X_END;
		}
		else if(!b.isTileEmpty(rightTile, this.positionY))
		{
			return TileState.FILLED;
		}
		else if(b.isTileEmpty(rightTile, this.positionY))
		{
			return TileState.EMPTY;
		}
		else
		{
			//Best not to go at all
			return TileState.FILLED;
		}
	}
	public TileState getTopState()
	{
		int boardEndPointX = b.getBoardWidth();
		int boardEndPointY = b.getBoardLength();
		int topTile = this.positionY +1;
		if(topTile > boardEndPointX)
		{
			return TileState.Y_END;
		}
		else if(!b.isTileEmpty(topTile, this.positionY))
		{
			return TileState.FILLED;
		}
		else if(b.isTileEmpty(topTile, this.positionY))
		{
			return TileState.EMPTY;
		}
		else
		{
			//Best not to go at all
			return TileState.FILLED;
		}
	}
	public TileState getBottomState()
	{
		int boardEndPointX = b.getBoardWidth();
		int boardEndPointY = b.getBoardLength();
		int bottomTile = this.positionY -1;
		if(bottomTile < 0)
		{
			return TileState.Y_START;
		}
		else if(!b.isTileEmpty(bottomTile, this.positionY))
		{
			return TileState.FILLED;
		}
		else if(b.isTileEmpty(bottomTile, this.positionY))
		{
			return TileState.EMPTY;
		}
		else
		{
			//Best not to go at all
			return TileState.FILLED;
		}
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
