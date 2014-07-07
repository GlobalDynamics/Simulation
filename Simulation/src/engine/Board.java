package engine;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private Tile[][] boardArray;
	private int boardLength = 20;
	private int boardWidth = 20;
	public List<Tile> tileList = new ArrayList<Tile>();
	
	
	public Board(Tile[][] boardArray, int boardLength, int boardWidth)
	{
		this.boardArray = boardArray;
		this.boardLength = boardLength;
		this.boardWidth = boardWidth;
		
//		 int [] [] test = {{2,0,1,0,0}, 
//             {1,0,0,0,0},
//             {0,0,0,0,0},  //1 is unit
//             {0,0,0,0,0},
//             {0,0,0,0,2}};
	}
	
	public Board(int boardLength, int boardWidth)
	{
		this.boardLength = boardLength;
		this.boardWidth = boardWidth;
	}
	
	public boolean isTileEmpty(int x, int y)
	{
		for(Tile t: tileList)
		{
			if(t.getPositionX() == x && t.getPositionY() == y)
			{
				return false;
			}
		}
		return true;
	}

	public int getBoardLength() {
		return boardLength;
	}

	public void setBoardLength(int boardLength) {
		this.boardLength = boardLength;
	}

	public int getBoardWidth() {
		return boardWidth;
	}

	public void setBoardWidth(int boardWidth) {
		this.boardWidth = boardWidth;
	}
	public void generateTiles()
	{
		
	}
	
	public void generateTilesTest()
	{
		Tile t = new Tile(TileType.BLUE, 0,0);
		Tile t2 = new Tile(TileType.RED, 0,10);
		tileList.add(t);
		tileList.add(t2);
	}
	
	public void incrementTileTest()
	{
		tileList.get(0).setPositionX(tileList.get(0).getPositionX() + 1);
		tileList.get(1).setPositionX(tileList.get(1).getPositionX() + 1);
	}
	
	
}
