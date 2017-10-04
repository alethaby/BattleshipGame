import java.awt.*;
import javax.swing.*;

public class Battleship extends JFrame
{
 	public static void main(String[]args)
	{
		OceanGrid gameGrid = new OceanGrid();

		/* 
		Uncomment once complete!
		Creates Player Objects:
		*/
		
		Player human = new HumanPlayer();
		Player computer = new ComputerPlayer();
		
		//Intro and rules/functionality
		
		gameGrid.startMessage();
		
		//Calls first turn method of players which prompts them to set up ships and modifies gameGrid of player:
		
		human.firstTurn(gameGrid);
		computer.firstTurn(gameGrid);
		
		//Runs battleshipGame method of Battleship class which takes players and gui as params, calls players turn methods, modifies gameGrid gui
		
		battleshipGame(human,computer, gameGrid);
		
		/*Test Target Record Output:
		gameGrid.printOnTargetRecord("Miss A2");
		gameGrid.printOnTargetRecord("Miss A3");
		gameGrid.printOnTargetRecord("Miss A4");
		gameGrid.printOnTargetRecord("Miss A5");
		gameGrid.printOnTargetRecord("Miss A6");
		gameGrid.printOnTargetRecord("Miss A7");
		gameGrid.printOnTargetRecord("Miss A8");
		*/
		
	}
	
	private static void battleshipGame(Player h,Player c,OceanGrid g)
	{
		if(h.turn(c,g))
		{
			g.victoryMessage(1);
			return;
		}
		if(c.turn(h,g))
		{
			g.victoryMessage(0);
			return;
		}
		battleshipGame(h,c,g);
	}
}
