public interface Player
{
	public void firstTurn(OceanGrid g);
	public boolean turn(Player other, OceanGrid g);
	public void addShipToArray(int [] c, int n);
	public int[] getArray();
	public Vessel getVessel(String type);
}
