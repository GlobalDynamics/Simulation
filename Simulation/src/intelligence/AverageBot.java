package intelligence;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import engine.Action;
import engine.Tile;
import engine.TileDirection;
import engine.TileState;

public class AverageBot {
	private int health = 100;
	private int stealthTurns = 0;
	private int teleportLength = 0;
	private int suicideArea = 1;
	
	//abilities
	private boolean hasStealth = false;
	private boolean hasTeleport = false;
	private boolean hasSuicide = true;
	
	private double probabilityOfAttack = .50;
	private double probabilityOfMove = .50;
	private double probabilityOfChase = .50;
	
	
	private Tile tile;
	
	public Action nextAction()
	{
		if(emptyFirstLevel())
		{
			if(tile.getB().tileList.size() > 0)
			{
				TileDirection direction=tile.getDirection(tile,getClosestBot());
				
			}
			else
			{
				return;
			}
		}
	}
	
	public boolean emptyFirstLevel()
	{
		if(tile.getLeftState() != TileState.FILLED 
				&& tile.getRightState() != TileState.FILLED
				&& tile.getTopState() != TileState.FILLED
				&& tile.getBottomState() != TileState.FILLED)
		{
			return true;
		}
		return false;
	}
	
	public Tile getClosestBot()
	{
		Map<Double, Tile> distanceList = new HashMap<Double, Tile>();
		for(Tile t: tile.getB().tileList)
		{
			if(!t.equals(tile))
			{
				double x1 = tile.getPositionX();
				double x2 = t.getPositionX();
				double y1 = tile.getPositionY();
				double y2 = t.getPositionY();
				distanceList.put(Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)), tile);
			}
		}
		TreeMap<Double, Tile> sortedDistances = new TreeMap<Double, Tile>(distanceList);
		return sortedDistances.firstEntry().getValue();
	}
	
	public Tile getTile() {
		return tile;
	}
	public void setTile(Tile tile) {
		this.tile = tile;
	}
	public void decrementHealth(int amount)
	{
		this.health = this.health - amount;
	}
	public void incrementHealth(int amount) {
		this.health = this.health + amount;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStealthTurns() {
		return stealthTurns;
	}
	public void setStealthTurns(int stealthTurns) {
		this.stealthTurns = stealthTurns;
	}
	public int getTeleportLength() {
		return teleportLength;
	}
	public void setTeleportLength(int teleportLength) {
		this.teleportLength = teleportLength;
	}
	public boolean hasStealth() {
		return hasStealth;
	}
	public void setHasStealth(boolean hasStealth) {
		this.hasStealth = hasStealth;
	}
	public boolean hasTeleport() {
		return hasTeleport;
	}
	public void setHasTeleport(boolean hasTeleport) {
		this.hasTeleport = hasTeleport;
	}
	public int getSuicideArea() {
		return suicideArea;
	}
	public void setSuicideArea(int suicideArea) {
		this.suicideArea = suicideArea;
	}
	public boolean hasSuicide() {
		return hasSuicide;
	}
	public void setHasSuicide(boolean hasSuicide) {
		this.hasSuicide = hasSuicide;
	}
	public double getProbabilityOfAttack() {
		return probabilityOfAttack;
	}
	public void setProbabilityOfAttack(double probabilityOfAttack) {
		this.probabilityOfAttack = probabilityOfAttack;
	}
	public double getProbabilityOfMove() {
		return probabilityOfMove;
	}
	public void setProbabilityOfMove(double probabilityOfMove) {
		this.probabilityOfMove = probabilityOfMove;
	}
	public double getProbabilityOfChase() {
		return probabilityOfChase;
	}
	public void setProbabilityOfChase(double probabilityOfChase) {
		this.probabilityOfChase = probabilityOfChase;
	}
	

}
