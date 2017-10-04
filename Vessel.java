public class Vessel
{
	private int health;
	public Vessel(int h)
	{
		health=h;
	}
	
	public void vesselHit()
	{
		health--;
	}
	
	public boolean isVesselSunk()
	{
		if(health>0)
		{
			return false;
		}
		return true;
	}
}