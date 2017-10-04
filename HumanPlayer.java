import java.util.Arrays;

public class HumanPlayer implements Player
{
	String battleship1Coordinates;
	String battleship2Coordinates;
	String battleship3Coordinates;
	String carrierCoordinates;
	String minesweeperCoordinates;
	String battleship1Orientation;
	String battleship2Orientation;
	String battleship3Orientation;
	String carrierOrientation;
	int humanPlayerArray [] = new int [100];
	int human = 1;
	Vessel battleship1;
	Vessel battleship2;
	Vessel battleship3;
	Vessel carrier;
	Vessel minesweeper;
		
	public HumanPlayer()
	{
		
	}
	
	public void firstTurn(OceanGrid g)
	{
		battleship1Orientation=g.getShipOrientation("Battleship 1", human);
		battleship1Coordinates=g.getShipCoord("Battleship 1",battleship1Orientation,human);
		g.addShipToGrid(g.calcCoordinates(battleship1Coordinates,"Battleship 1", battleship1Orientation),"Battleship");
		addShipToArray(g.calcCoordinates(battleship1Coordinates,"Battleship 1", battleship1Orientation),1);
		battleship1 = new Vessel(2);
		
		battleship2Orientation=g.getShipOrientation("Battleship 2",human);
		battleship2Coordinates=g.getShipCoord("Battleship 2",battleship2Orientation,human);
		g.addShipToGrid(g.calcCoordinates(battleship2Coordinates,"Battleship 2", battleship2Orientation),"Battleship");
		addShipToArray(g.calcCoordinates(battleship2Coordinates,"Battleship 2", battleship2Orientation),2);
		battleship2 = new Vessel(2);
		
		battleship3Orientation=g.getShipOrientation("Battleship 3",human);
		battleship3Coordinates=g.getShipCoord("Battleship 3",battleship3Orientation,human);
		g.addShipToGrid(g.calcCoordinates(battleship3Coordinates,"Battleship 3", battleship3Orientation),"Battleship");
		addShipToArray(g.calcCoordinates(battleship3Coordinates,"Battleship 3", battleship3Orientation),3);
		battleship3 = new Vessel(2);
		
		carrierOrientation=g.getShipOrientation("Carrier",human);
		carrierCoordinates=g.getShipCoord("Carrier",carrierOrientation,human);
		g.addShipToGrid(g.calcCoordinates(carrierCoordinates,"Carrier", carrierOrientation),"Carrier");
		addShipToArray(g.calcCoordinates(carrierCoordinates,"Carrier", carrierOrientation),4);
		carrier = new Vessel(3);
		
		minesweeperCoordinates=g.getShipCoord("Minesweeper",null,human);
		g.addShipToGrid(g.calcCoordinates(minesweeperCoordinates,"Minesweeper", null),"Minesweeper");
		addShipToArray(g.calcCoordinates(minesweeperCoordinates,"Minesweeper", null),5);
		minesweeper = new Vessel(1);
	}
	
	public boolean turn(Player other, OceanGrid g)
	{
		String guess = g.guessShipCoord(human,100,0,0,100);
		int guessCoord = g.calcCoordinates(guess, "Target", null)[0];
		g.increaseCoordinatesSwept();
		
		if(other.getArray()[guessCoord]==0)
		{
			g.hitShipOnGrid(guessCoord,"Miss",human);
			g.printOnTargetRecord("Miss "+guess);
		}
		else
		{
			g.hitShipOnGrid(guessCoord,"Hit",human);
			g.printOnTargetRecord("Hit "+guess);
			g.decreaseEnemyFleetStrength();
			if(other.getArray()[guessCoord]==1)
			{
				other.getVessel("Battleship 1").vesselHit();
				if(other.getVessel("Battleship 1").isVesselSunk())
				{
					g.printOnTargetRecord("Battleship Sunk");
					g.targetMessage("Battleship", guess,human);
				}
			}
			else if(other.getArray()[guessCoord]==2)
			{
				other.getVessel("Battleship 2").vesselHit();
				if(other.getVessel("Battleship 2").isVesselSunk())
				{
					g.printOnTargetRecord("Battleship Sunk");
					g.targetMessage("Battleship", guess,human);
				}
			}
			else if(other.getArray()[guessCoord]==3)
			{
				other.getVessel("Battleship 3").vesselHit();
				if(other.getVessel("Battleship 3").isVesselSunk())
				{
					g.printOnTargetRecord("Battleship Sunk");
					g.targetMessage("Battleship", guess,human);
				}
			}
			else if(other.getArray()[guessCoord]==4)
			{
				other.getVessel("Carrier").vesselHit();
				if(other.getVessel("Carrier").isVesselSunk())
				{
					g.printOnTargetRecord("Carrier Sunk");
					g.targetMessage("Carrier", guess,human);
				}
			}
			else if(other.getArray()[guessCoord]==5)
			{
				other.getVessel("Minesweeper").vesselHit();
				g.printOnTargetRecord("Minesweeper Sunk");
				g.targetMessage("Minesweeper", guess,human);
			}
			if(other.getVessel("Minesweeper").isVesselSunk() && other.getVessel("Carrier").isVesselSunk() && other.getVessel("Battleship 1").isVesselSunk()
				&& other.getVessel("Battleship 2").isVesselSunk() && other.getVessel("Battleship 3").isVesselSunk())
			{
				return true;
			}
		}
		return false;
	}
	
	public int[] getArray()
	{
		return humanPlayerArray;
	}
	
	public Vessel getVessel(String type)
	{
		if(type.equals("Battleship 1"))
		{
			return battleship1;
		}
		else if(type.equals("Battleship 2"))
		{
			return battleship2;
		}
		else if(type.equals("Battleship 3"))
		{
			return battleship3;
		}
		else if(type.equals("Carrier"))
		{
			return carrier;
		}	
		else
		{
			return minesweeper;
		}	
	}
	
	public void addShipToArray(int [] c, int n)
	{
		for(int i = 0; i< c.length; i++)
		{
			humanPlayerArray[c[i]]=n;
		}
	}
		
}