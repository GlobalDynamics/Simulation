package main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import engine.StringRectangle;
import engine.Tile;
import engine.TileType;

public class GridPainter {


		public void updateGrid(Graphics2D g2d, StringRectangle cell, int boardWidth, Tile t)
		{
	    	int index = t.getPositionX() + (t.getPositionY() * boardWidth);
	    	if(t.getTileType() == TileType.BLUE)
	    	{
	    		cell.drawStringRect(g2d, true, Color.BLUE, Color.yellow);
	    	}
	    	else if(t.getTileType() == TileType.RED)
	    	{
	    		cell.drawStringRect(g2d, true, Color.RED, Color.yellow);
	    	}
	    	else
	    	{
	    		cell.drawStringRect(g2d, true, Color.GRAY, Color.yellow);
	    	}
	    	
		}
}
