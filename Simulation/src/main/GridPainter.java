package main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import engine.Tile;

public class GridPainter {


		public void updateGrid(Graphics2D g2d, Rectangle cell, int boardWidth, Tile t)
		{

	    	int index = t.getPositionX() + (t.getPositionY() * boardWidth);
	    	g2d.setColor(Color.BLUE);
	        g2d.fill(cell);
		   
		}
}
