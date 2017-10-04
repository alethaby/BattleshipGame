import java.util.Arrays;

public class ComputerPlayer implements Player
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
	int computerPlayerArray [] = new int [100];
	int computer = 0;
	boolean checkIfSunk=true;
	int prevCoord;
	int firstCoord=100;
	int primaryCoord=100;
	int carrierHitCount=0;
	int hitCount=0;
	int sunkCount=0;
	int smartCount=0;
	
	Vessel battleship1;
	Vessel battleship2;
	Vessel battleship3;
	Vessel carrier;
	Vessel minesweeper;
	
	public ComputerPlayer()
	{
		
	}
	
	public void firstTurn(OceanGrid g)
	{
		battleship1Orientation=g.getShipOrientation("Battleship 1", computer);
		battleship1Coordinates=g.getShipCoord("Battleship 1",battleship1Orientation,computer);
		addShipToArray(g.calcCoordinates(battleship1Coordinates,"Battleship 1", battleship1Orientation),1);
		battleship1 = new Vessel(2);
		
		battleship2Orientation=g.getShipOrientation("Battleship 2",computer);
		battleship2Coordinates=g.getShipCoord("Battleship 2",battleship2Orientation,computer);
		addShipToArray(g.calcCoordinates(battleship2Coordinates,"Battleship 2", battleship2Orientation),2);
		battleship2 = new Vessel(2);
		
		battleship3Orientation=g.getShipOrientation("Battleship 3",computer);
		battleship3Coordinates=g.getShipCoord("Battleship 3",battleship3Orientation,computer);
		addShipToArray(g.calcCoordinates(battleship3Coordinates,"Battleship 3", battleship3Orientation),3);
		battleship3 = new Vessel(2);
		
		carrierOrientation=g.getShipOrientation("Carrier",computer);
		carrierCoordinates=g.getShipCoord("Carrier",carrierOrientation,computer);
		addShipToArray(g.calcCoordinates(carrierCoordinates,"Carrier", carrierOrientation),4);
		carrier = new Vessel(3);
		
		minesweeperCoordinates=g.getShipCoord("Minesweeper",null,computer);
		addShipToArray(g.calcCoordinates(minesweeperCoordinates,"Minesweeper", null),5);
		minesweeper = new Vessel(1);
	}
	
	public boolean turn(Player other, OceanGrid g)
	{
		String guess;
		int guessCoord;
		
		if((hitCount>3 && sunkCount<2 && carrierHitCount>0) || (hitCount>4 && sunkCount<2) || (smartCount>0 && smartCount<10))
		{
			smartCount++;
			guess = g.guessShipCoord(computer,prevCoord,hitCount,firstCoord,primaryCoord);
			guessCoord = g.calcCoordinates(guess, "Target", null)[0];
		}
		else if(checkIfSunk)
		{
			guess = g.guessShipCoord(computer,100,0,firstCoord,100);
			guessCoord = g.calcCoordinates(guess,"Target", null)[0];	
		}
		else if(checkIfSunk==false && carrierHitCount>1)
		{
			guess = g.guessShipCoord(computer,prevCoord,carrierHitCount,firstCoord,100);
			guessCoord = g.calcCoordinates(guess, "Target", null)[0];
		}
		else if(checkIfSunk==false)
		{
			guess = g.guessShipCoord(computer,prevCoord,0,firstCoord,100);
			guessCoord = g.calcCoordinates(guess, "Target", null)[0];
		}
		else
		{
			guess = g.guessShipCoord(computer,100,0,firstCoord,100);
			guessCoord = g.calcCoordinates(guess, "Target", null)[0];
		}

		if(other.getArray()[guessCoord]==0)
		{
			g.targetMessage("Miss ", guess,computer);
			g.hitShipOnGrid(guessCoord,"Miss",computer);
		}
		else
		{
			if(hitCount<1)
			{
				primaryCoord = guessCoord;
			}
			checkIfSunk = false;
			prevCoord = guessCoord;
			g.targetMessage("Hit ", guess,computer);
			g.hitShipOnGrid(guessCoord,"Hit",computer);
			hitCount++;
			
			if(other.getArray()[guessCoord]==1)
			{
				other.getVessel("Battleship 1").vesselHit();
				if(other.getVessel("Battleship 1").isVesselSunk())
				{
					g.targetMessage("Battleship 1","0",computer);
					checkIfSunk = true;
					sunkCount++;
				}
			}
			else if(other.getArray()[guessCoord]==2)
			{
				other.getVessel("Battleship 2").vesselHit();
				if(other.getVessel("Battleship 2").isVesselSunk())
				{
					g.targetMessage("Battleship 2","0",computer);
					checkIfSunk = true;
					sunkCount++;
				}
			}
			else if(other.getArray()[guessCoord]==3)
			{
				other.getVessel("Battleship 3").vesselHit();
				if(other.getVessel("Battleship 3").isVesselSunk())
				{
					g.targetMessage("Battleship 3","0",computer);
					checkIfSunk = true;
					sunkCount++;
				}
			}
			else if(other.getArray()[guessCoord]==4)
			{
				if(carrierHitCount<1)
				{
					firstCoord = prevCoord;
				}
				other.getVessel("Carrier").vesselHit();
				carrierHitCount++;
				if(other.getVessel("Carrier").isVesselSunk())
				{
					g.targetMessage("Carrier","0",computer);
					checkIfSunk = true;
					carrierHitCount=0;
					sunkCount++;
				}
			}
			else if(other.getArray()[guessCoord]==5)
			{
				other.getVessel("Minesweeper").vesselHit();
				g.targetMessage("Minesweeper","0",computer);
				checkIfSunk = true;
				sunkCount++;
			}
			if(other.getVessel("Minesweeper").isVesselSunk() && other.getVessel("Carrier").isVesselSunk() && other.getVessel("Battleship 1").isVesselSunk()
				&& other.getVessel("Battleship 2").isVesselSunk() && other.getVessel("Battleship 3").isVesselSunk())
			{
				return true;
			}
		}
		System.out.println(prevCoord);
		System.out.print(checkIfSunk);
		return false;
	}
	
	public int[] getArray()
	{
		return computerPlayerArray;
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
		else if (type.equals("Carrier"))
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
			computerPlayerArray[c[i]]=n;
		}
	}
		
}

