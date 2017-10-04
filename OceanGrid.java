import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.border.LineBorder;
import java.lang.Math;
import java.awt.event.*;

public class OceanGrid
{
	
	JTextArea targetRecord;
	private int targetRecordManagement = 1;
	
	JProgressBar enemyStrengthProgressBar;
	private int enemyStrength = 100;
	
	JProgressBar coordinatesSweptProgressBar;
	private int targeted= 0;
	
	ArrayList <Integer> humanDeployCoords = new ArrayList<Integer>();
	ArrayList <Integer> computerDeployCoords = new ArrayList<Integer>();
	ArrayList <String> humanGuessedCoords = new ArrayList<String>();
	ArrayList <String> computerGuessedCoords = new ArrayList<String>();
	
	String computerCoordList [] = {"A0","A1","A2","A3","A4","A5","A6","A7","A8","A9","B0","B1","B2","B3","B4","B5","B6","B7","B8","B9",
		"C0","C1","C2","C3","C4","C5","C6","C7","C8","C9","D0","D1","D2","D3","D4","D5","D6","D7","D8","D9","E0","E1","E2","E3","E4","E5","E6","E7","E8","E9",
		"F0","F1","F2","F3","F4","F5","F6","F7","F8","F9","G0","G1","G2","G3","G4","G5","G6","G7","G8","G9","H0","H1","H2","H3","H4","H5","H6","H7","H8","H9",
		"I0","I1","I2","I3","I4","I5","I6","I7","I8","I9","J0","J1","J2","J3","J4","J5","J6","J7","J8","J9"};
	
	JButton myButton = new JButton();
	JButton myButton1 = new JButton();
	JButton myButton2 = new JButton();
	JButton myButton3 = new JButton();
	JButton myButton4 = new JButton();
	JButton myButton5 = new JButton();
	JButton myButton6 = new JButton();
	JButton myButton7 = new JButton();
	JButton myButton8 = new JButton();
	JButton myButton9 = new JButton();
	JButton myButton10 = new JButton();
	JButton myButton11 = new JButton();
	JButton myButton12 = new JButton();
	JButton myButton13 = new JButton();
	JButton myButton14 = new JButton();
	JButton myButton15 = new JButton();
	JButton myButton16 = new JButton();
	JButton myButton17 = new JButton();
	JButton myButton18 = new JButton();
	JButton myButton19 = new JButton();
	JButton myButton20 = new JButton();
	JButton myButton21 = new JButton();
	JButton myButton22 = new JButton();
	JButton myButton23 = new JButton();
	JButton myButton24 = new JButton();
	JButton myButton25 = new JButton();
	JButton myButton26 = new JButton();
	JButton myButton27 = new JButton();
	JButton myButton28 = new JButton();
	JButton myButton29 = new JButton();
	JButton myButton30 = new JButton();
	JButton myButton31 = new JButton();
	JButton myButton32 = new JButton();
	JButton myButton33 = new JButton();
	JButton myButton34 = new JButton();
	JButton myButton35 = new JButton();
	JButton myButton36 = new JButton();
	JButton myButton37 = new JButton();
	JButton myButton38 = new JButton();
	JButton myButton39 = new JButton();
	JButton myButton40 = new JButton();
	JButton myButton41 = new JButton();
	JButton myButton42 = new JButton();
	JButton myButton43 = new JButton();
	JButton myButton44 = new JButton();
	JButton myButton45 = new JButton();
	JButton myButton46 = new JButton();
	JButton myButton47 = new JButton();
	JButton myButton48 = new JButton();
	JButton myButton49 = new JButton();
	JButton myButton50 = new JButton();
	JButton myButton51 = new JButton();
	JButton myButton52 = new JButton();
	JButton myButton53 = new JButton();
	JButton myButton54 = new JButton();
	JButton myButton55 = new JButton();
	JButton myButton56 = new JButton();
	JButton myButton57 = new JButton();
	JButton myButton58 = new JButton();
	JButton myButton59 = new JButton();
	JButton myButton60 = new JButton();
	JButton myButton61 = new JButton();
	JButton myButton62 = new JButton();
	JButton myButton63 = new JButton();
	JButton myButton64 = new JButton();
	JButton myButton65 = new JButton();
	JButton myButton66 = new JButton();
	JButton myButton67 = new JButton();
	JButton myButton68 = new JButton();
	JButton myButton69 = new JButton();
	JButton myButton70 = new JButton();
	JButton myButton71 = new JButton();
	JButton myButton72 = new JButton();
	JButton myButton73 = new JButton();
	JButton myButton74 = new JButton();
	JButton myButton75 = new JButton();
	JButton myButton76 = new JButton();
	JButton myButton77 = new JButton();
	JButton myButton78 = new JButton();
	JButton myButton79 = new JButton();
	JButton myButton80 = new JButton();
	JButton myButton81 = new JButton();
	JButton myButton82 = new JButton();
	JButton myButton83 = new JButton();
	JButton myButton84 = new JButton();
	JButton myButton85 = new JButton();
	JButton myButton86 = new JButton();
	JButton myButton87 = new JButton();
	JButton myButton88 = new JButton();
	JButton myButton89 = new JButton();
	JButton myButton90 = new JButton();
	JButton myButton91 = new JButton();
	JButton myButton92 = new JButton();
	JButton myButton93 = new JButton();
	JButton myButton94 = new JButton();
	JButton myButton95 = new JButton();
	JButton myButton96 = new JButton();
	JButton myButton97 = new JButton();
	JButton myButton98 = new JButton();
	JButton myButton99 = new JButton();
	
	JButton oceanArray [] = {myButton, myButton1, myButton2, myButton3, myButton4, myButton5, myButton6, myButton7, myButton8, myButton9, 
		myButton10, myButton11, myButton12, myButton13, myButton14, myButton15, myButton16, myButton17, myButton18, myButton19, 
		myButton20, myButton21, myButton22, myButton23, myButton24, myButton25, myButton26, myButton27, myButton28, myButton29, 
		myButton30, myButton31, myButton32, myButton33, myButton34, myButton35, myButton36, myButton37, myButton38, myButton39,
		myButton40, myButton41, myButton42, myButton43, myButton44, myButton45, myButton46, myButton47, myButton48, myButton49,
		myButton50, myButton51, myButton52, myButton53, myButton54, myButton55, myButton56, myButton57, myButton58, myButton59,
		myButton60, myButton61, myButton62, myButton63, myButton64, myButton65, myButton66, myButton67, myButton68, myButton69,
		myButton70, myButton71, myButton72, myButton73, myButton74, myButton75, myButton76, myButton77, myButton78, myButton79,
		myButton80, myButton81, myButton82, myButton83, myButton84, myButton85, myButton86, myButton87, myButton88, myButton89,
		myButton90, myButton91, myButton92, myButton93, myButton94, myButton95, myButton96, myButton97, myButton98, myButton99};
		
	JButton oButton = new JButton();
	JButton oButton1 = new JButton();
	JButton oButton2 = new JButton();
	JButton oButton3 = new JButton();
	JButton oButton4 = new JButton();
	JButton oButton5 = new JButton();
	JButton oButton6 = new JButton();
	JButton oButton7 = new JButton();
	JButton oButton8 = new JButton();
	JButton oButton9 = new JButton();
	JButton oButton10 = new JButton();
	JButton oButton11 = new JButton();
	JButton oButton12 = new JButton();
	JButton oButton13 = new JButton();
	JButton oButton14 = new JButton();
	JButton oButton15 = new JButton();
	JButton oButton16 = new JButton();
	JButton oButton17 = new JButton();
	JButton oButton18 = new JButton();
	JButton oButton19 = new JButton();
	JButton oButton20 = new JButton();
	JButton oButton21 = new JButton();
	JButton oButton22 = new JButton();
	JButton oButton23 = new JButton();
	JButton oButton24 = new JButton();
	JButton oButton25 = new JButton();
	JButton oButton26 = new JButton();
	JButton oButton27 = new JButton();
	JButton oButton28 = new JButton();
	JButton oButton29 = new JButton();
	JButton oButton30 = new JButton();
	JButton oButton31 = new JButton();
	JButton oButton32 = new JButton();
	JButton oButton33 = new JButton();
	JButton oButton34 = new JButton();
	JButton oButton35 = new JButton();
	JButton oButton36 = new JButton();
	JButton oButton37 = new JButton();
	JButton oButton38 = new JButton();
	JButton oButton39 = new JButton();
	JButton oButton40 = new JButton();
	JButton oButton41 = new JButton();
	JButton oButton42 = new JButton();
	JButton oButton43 = new JButton();
	JButton oButton44 = new JButton();
	JButton oButton45 = new JButton();
	JButton oButton46 = new JButton();
	JButton oButton47 = new JButton();
	JButton oButton48 = new JButton();
	JButton oButton49 = new JButton();
	JButton oButton50 = new JButton();
	JButton oButton51 = new JButton();
	JButton oButton52 = new JButton();
	JButton oButton53 = new JButton();
	JButton oButton54 = new JButton();
	JButton oButton55 = new JButton();
	JButton oButton56 = new JButton();
	JButton oButton57 = new JButton();
	JButton oButton58 = new JButton();
	JButton oButton59 = new JButton();
	JButton oButton60 = new JButton();
	JButton oButton61 = new JButton();
	JButton oButton62 = new JButton();
	JButton oButton63 = new JButton();
	JButton oButton64 = new JButton();
	JButton oButton65 = new JButton();
	JButton oButton66 = new JButton();
	JButton oButton67 = new JButton();
	JButton oButton68 = new JButton();
	JButton oButton69 = new JButton();
	JButton oButton70 = new JButton();
	JButton oButton71 = new JButton();
	JButton oButton72 = new JButton();
	JButton oButton73 = new JButton();
	JButton oButton74 = new JButton();
	JButton oButton75 = new JButton();
	JButton oButton76 = new JButton();
	JButton oButton77 = new JButton();
	JButton oButton78 = new JButton();
	JButton oButton79 = new JButton();
	JButton oButton80 = new JButton();
	JButton oButton81 = new JButton();
	JButton oButton82 = new JButton();
	JButton oButton83 = new JButton();
	JButton oButton84 = new JButton();
	JButton oButton85 = new JButton();
	JButton oButton86 = new JButton();
	JButton oButton87 = new JButton();
	JButton oButton88 = new JButton();
	JButton oButton89 = new JButton();
	JButton oButton90 = new JButton();
	JButton oButton91 = new JButton();
	JButton oButton92 = new JButton();
	JButton oButton93 = new JButton();
	JButton oButton94 = new JButton();
	JButton oButton95 = new JButton();
	JButton oButton96 = new JButton();
	JButton oButton97 = new JButton();
	JButton oButton98 = new JButton();
	JButton oButton99 = new JButton();
	
	JButton oceanTargetArray [] = {oButton, oButton1, oButton2, oButton3, oButton4, oButton5, oButton6, oButton7, oButton8, oButton9, 
		oButton10, oButton11, oButton12, oButton13, oButton14, oButton15, oButton16, oButton17, oButton18, oButton19, 
		oButton20, oButton21, oButton22, oButton23, oButton24, oButton25, oButton26, oButton27, oButton28, oButton29, 
		oButton30, oButton31, oButton32, oButton33, oButton34, oButton35, oButton36, oButton37, oButton38, oButton39,
		oButton40, oButton41, oButton42, oButton43, oButton44, oButton45, oButton46, oButton47, oButton48, oButton49,
		oButton50, oButton51, oButton52, oButton53, oButton54, oButton55, oButton56, oButton57, oButton58, oButton59,
		oButton60, oButton61, oButton62, oButton63, oButton64, oButton65, oButton66, oButton67, oButton68, oButton69,
		oButton70, oButton71, oButton72, oButton73, oButton74, oButton75, oButton76, oButton77, oButton78, oButton79,
		oButton80, oButton81, oButton82, oButton83, oButton84, oButton85, oButton86, oButton87, oButton88, oButton89,
		oButton90, oButton91, oButton92, oButton93, oButton94, oButton95, oButton96, oButton97, oButton98, oButton99};
	
	public OceanGrid()
	{
		JFrame battleshipWindow = new JFrame("Battleship");
    	battleshipWindow.setVisible(true);
		battleshipWindow.setSize(1310,500);
		battleshipWindow.setResizable(false);
		battleshipWindow.setLocation(150, 100);
		battleshipWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		TOOLBAR WITH startMessage as output for "info" button
		
		JToolBar toolBar = new JToolBar(); 
		battleshipWindow.add(toolBar,BorderLayout.NORTH); 
		JButton info = new JButton("Info"); 
		toolBar.add(info);
		toolBar.setFloatable(false);
		
		info.addActionListener( new ActionListener()
		{
   		 @Override
    		public void actionPerformed(ActionEvent e)
    		{
        		JOptionPane.showMessageDialog(null, "-- Welcome to Battleship! - Created by Aidan Lethaby - 2017 - Here is how to play --\nYou have 5 ships: a carrier, 3 battleships, and a minesweeper. The carrier is 3\ngrid points, the battleships are 2, and the minesweeper is 1. First, you place your\nships by choosing their orientation and the coordinate of the ship's bow. The rest\nof the ship will then follow either to the right (if horizontal) and below (if vertical).\nThen, you and the computer take turns trying to sink the enemy fleet until it is\ndestroyed. You can keep track of what you have hit, sunk, or missed, enemy health\nand percent of coordinates swept via the \"Target Record\", \"Target\" map and\nprogress bars below. Updates are ongoing for a more advanced computer player." , "Welcome!", JOptionPane.PLAIN_MESSAGE);
   		 	}
		});
		*/
		
		JPanel battleshipPanel = new JPanel(new GridLayout(11,11));
		battleshipWindow.add(battleshipPanel, BorderLayout.LINE_START);
		
		JLabel myLabel = new JLabel("   Map  ");
		
		JLabel myLabel0 = new JLabel("     0");
		JLabel myLabel1 = new JLabel("     1");
		JLabel myLabel2 = new JLabel("     2");
		JLabel myLabel3 = new JLabel("     3");
		JLabel myLabel4 = new JLabel("     4");
		JLabel myLabel5 = new JLabel("     5");
		JLabel myLabel6 = new JLabel("     6");
		JLabel myLabel7 = new JLabel("     7");
		JLabel myLabel8 = new JLabel("     8");
		JLabel myLabel9 = new JLabel("     9");
		JLabel myLabel10 = new JLabel("    A");
		JLabel myLabel11 = new JLabel("    B");
		JLabel myLabel12 = new JLabel("    C");
		JLabel myLabel13 = new JLabel("    D");
		JLabel myLabel14 = new JLabel("    E");
		JLabel myLabel15 = new JLabel("    F");
		JLabel myLabel16 = new JLabel("    G");
		JLabel myLabel17 = new JLabel("    H");
		JLabel myLabel18 = new JLabel("    I");
		JLabel myLabel19 = new JLabel("    J");
		battleshipPanel.add(myLabel);
		battleshipPanel.add(myLabel0);
		battleshipPanel.add(myLabel1);
		battleshipPanel.add(myLabel2);
		battleshipPanel.add(myLabel3);
		battleshipPanel.add(myLabel4);
		battleshipPanel.add(myLabel5);
		battleshipPanel.add(myLabel6);
		battleshipPanel.add(myLabel7);
		battleshipPanel.add(myLabel8);
		battleshipPanel.add(myLabel9);

		battleshipPanel.add(myLabel10);
		battleshipPanel.add(myButton);
		battleshipPanel.add(myButton1);
		battleshipPanel.add(myButton2);
		battleshipPanel.add(myButton3);
		battleshipPanel.add(myButton4);
		battleshipPanel.add(myButton5);
		battleshipPanel.add(myButton6);
		battleshipPanel.add(myButton7);
		battleshipPanel.add(myButton8);
		battleshipPanel.add(myButton9);
		battleshipPanel.add(myLabel11);
		battleshipPanel.add(myButton10);
		battleshipPanel.add(myButton11);
		battleshipPanel.add(myButton12);
		battleshipPanel.add(myButton13);
		battleshipPanel.add(myButton14);
		battleshipPanel.add(myButton15);
		battleshipPanel.add(myButton16);
		battleshipPanel.add(myButton17);
		battleshipPanel.add(myButton18);
		battleshipPanel.add(myButton19);
		battleshipPanel.add(myLabel12);
		battleshipPanel.add(myButton20);
		battleshipPanel.add(myButton21);
		battleshipPanel.add(myButton22);
		battleshipPanel.add(myButton23);
		battleshipPanel.add(myButton24);
		battleshipPanel.add(myButton25);
		battleshipPanel.add(myButton26);
		battleshipPanel.add(myButton27);
		battleshipPanel.add(myButton28);
		battleshipPanel.add(myButton29);
		battleshipPanel.add(myLabel13);
		battleshipPanel.add(myButton30);
		battleshipPanel.add(myButton31);
		battleshipPanel.add(myButton32);
		battleshipPanel.add(myButton33);
		battleshipPanel.add(myButton34);
		battleshipPanel.add(myButton35);
		battleshipPanel.add(myButton36);
		battleshipPanel.add(myButton37);
		battleshipPanel.add(myButton38);
		battleshipPanel.add(myButton39);
		battleshipPanel.add(myLabel14);
		battleshipPanel.add(myButton40);
		battleshipPanel.add(myButton41);
		battleshipPanel.add(myButton42);
		battleshipPanel.add(myButton43);
		battleshipPanel.add(myButton44);
		battleshipPanel.add(myButton45);
		battleshipPanel.add(myButton46);
		battleshipPanel.add(myButton47);
		battleshipPanel.add(myButton48);
		battleshipPanel.add(myButton49);
		battleshipPanel.add(myLabel15);
		battleshipPanel.add(myButton50);
		battleshipPanel.add(myButton51);
		battleshipPanel.add(myButton52);
		battleshipPanel.add(myButton53);
		battleshipPanel.add(myButton54);
		battleshipPanel.add(myButton55);
		battleshipPanel.add(myButton56);
		battleshipPanel.add(myButton57);
		battleshipPanel.add(myButton58);
		battleshipPanel.add(myButton59);
		battleshipPanel.add(myLabel16);
		battleshipPanel.add(myButton60);
		battleshipPanel.add(myButton61);
		battleshipPanel.add(myButton62);
		battleshipPanel.add(myButton63);
		battleshipPanel.add(myButton64);
		battleshipPanel.add(myButton65);
		battleshipPanel.add(myButton66);
		battleshipPanel.add(myButton67);
		battleshipPanel.add(myButton68);
		battleshipPanel.add(myButton69);
		battleshipPanel.add(myLabel17);
		battleshipPanel.add(myButton70);
		battleshipPanel.add(myButton71);
		battleshipPanel.add(myButton72);
		battleshipPanel.add(myButton73);
		battleshipPanel.add(myButton74);
		battleshipPanel.add(myButton75);
		battleshipPanel.add(myButton76);
		battleshipPanel.add(myButton77);
		battleshipPanel.add(myButton78);
		battleshipPanel.add(myButton79);
		battleshipPanel.add(myLabel18);
		battleshipPanel.add(myButton80);
		battleshipPanel.add(myButton81);
		battleshipPanel.add(myButton82);
		battleshipPanel.add(myButton83);
		battleshipPanel.add(myButton84);
		battleshipPanel.add(myButton85);
		battleshipPanel.add(myButton86);
		battleshipPanel.add(myButton87);
		battleshipPanel.add(myButton88);
		battleshipPanel.add(myButton89);
		battleshipPanel.add(myLabel19);
		battleshipPanel.add(myButton90);
		battleshipPanel.add(myButton91);
		battleshipPanel.add(myButton92);
		battleshipPanel.add(myButton93);
		battleshipPanel.add(myButton94);
		battleshipPanel.add(myButton95);
		battleshipPanel.add(myButton96);
		battleshipPanel.add(myButton97);
		battleshipPanel.add(myButton98);
		battleshipPanel.add(myButton99);

		JPanel battleshipTargetPanel = new JPanel(new GridLayout(11,11));
		battleshipWindow.add(battleshipTargetPanel, BorderLayout.LINE_END);
		
		JLabel oLabel = new JLabel("Target ");
		
		JLabel oLabel0 = new JLabel("     0");
		JLabel oLabel1 = new JLabel("     1");
		JLabel oLabel2 = new JLabel("     2");
		JLabel oLabel3 = new JLabel("     3");
		JLabel oLabel4 = new JLabel("     4");
		JLabel oLabel5 = new JLabel("     5");
		JLabel oLabel6 = new JLabel("     6");
		JLabel oLabel7 = new JLabel("     7");
		JLabel oLabel8 = new JLabel("     8");
		JLabel oLabel9 = new JLabel("     9");
		JLabel oLabel10 = new JLabel("    A");
		JLabel oLabel11 = new JLabel("    B");
		JLabel oLabel12 = new JLabel("    C");
		JLabel oLabel13 = new JLabel("    D");
		JLabel oLabel14 = new JLabel("    E");
		JLabel oLabel15 = new JLabel("    F");
		JLabel oLabel16 = new JLabel("    G");
		JLabel oLabel17 = new JLabel("    H");
		JLabel oLabel18 = new JLabel("    I");
		JLabel oLabel19 = new JLabel("    J");
		battleshipTargetPanel.add(oLabel);
		battleshipTargetPanel.add(oLabel0);
		battleshipTargetPanel.add(oLabel1);
		battleshipTargetPanel.add(oLabel2);
		battleshipTargetPanel.add(oLabel3);
		battleshipTargetPanel.add(oLabel4);
		battleshipTargetPanel.add(oLabel5);
		battleshipTargetPanel.add(oLabel6);
		battleshipTargetPanel.add(oLabel7);
		battleshipTargetPanel.add(oLabel8);
		battleshipTargetPanel.add(oLabel9);

		battleshipTargetPanel.add(oLabel10);
		battleshipTargetPanel.add(oButton);
		battleshipTargetPanel.add(oButton1);
		battleshipTargetPanel.add(oButton2);
		battleshipTargetPanel.add(oButton3);
		battleshipTargetPanel.add(oButton4);
		battleshipTargetPanel.add(oButton5);
		battleshipTargetPanel.add(oButton6);
		battleshipTargetPanel.add(oButton7);
		battleshipTargetPanel.add(oButton8);
		battleshipTargetPanel.add(oButton9);
		battleshipTargetPanel.add(oLabel11);
		battleshipTargetPanel.add(oButton10);
		battleshipTargetPanel.add(oButton11);
		battleshipTargetPanel.add(oButton12);
		battleshipTargetPanel.add(oButton13);
		battleshipTargetPanel.add(oButton14);
		battleshipTargetPanel.add(oButton15);
		battleshipTargetPanel.add(oButton16);
		battleshipTargetPanel.add(oButton17);
		battleshipTargetPanel.add(oButton18);
		battleshipTargetPanel.add(oButton19);
		battleshipTargetPanel.add(oLabel12);
		battleshipTargetPanel.add(oButton20);
		battleshipTargetPanel.add(oButton21);
		battleshipTargetPanel.add(oButton22);
		battleshipTargetPanel.add(oButton23);
		battleshipTargetPanel.add(oButton24);
		battleshipTargetPanel.add(oButton25);
		battleshipTargetPanel.add(oButton26);
		battleshipTargetPanel.add(oButton27);
		battleshipTargetPanel.add(oButton28);
		battleshipTargetPanel.add(oButton29);
		battleshipTargetPanel.add(oLabel13);
		battleshipTargetPanel.add(oButton30);
		battleshipTargetPanel.add(oButton31);
		battleshipTargetPanel.add(oButton32);
		battleshipTargetPanel.add(oButton33);
		battleshipTargetPanel.add(oButton34);
		battleshipTargetPanel.add(oButton35);
		battleshipTargetPanel.add(oButton36);
		battleshipTargetPanel.add(oButton37);
		battleshipTargetPanel.add(oButton38);
		battleshipTargetPanel.add(oButton39);
		battleshipTargetPanel.add(oLabel14);
		battleshipTargetPanel.add(oButton40);
		battleshipTargetPanel.add(oButton41);
		battleshipTargetPanel.add(oButton42);
		battleshipTargetPanel.add(oButton43);
		battleshipTargetPanel.add(oButton44);
		battleshipTargetPanel.add(oButton45);
		battleshipTargetPanel.add(oButton46);
		battleshipTargetPanel.add(oButton47);
		battleshipTargetPanel.add(oButton48);
		battleshipTargetPanel.add(oButton49);
		battleshipTargetPanel.add(oLabel15);
		battleshipTargetPanel.add(oButton50);
		battleshipTargetPanel.add(oButton51);
		battleshipTargetPanel.add(oButton52);
		battleshipTargetPanel.add(oButton53);
		battleshipTargetPanel.add(oButton54);
		battleshipTargetPanel.add(oButton55);
		battleshipTargetPanel.add(oButton56);
		battleshipTargetPanel.add(oButton57);
		battleshipTargetPanel.add(oButton58);
		battleshipTargetPanel.add(oButton59);
		battleshipTargetPanel.add(oLabel16);
		battleshipTargetPanel.add(oButton60);
		battleshipTargetPanel.add(oButton61);
		battleshipTargetPanel.add(oButton62);
		battleshipTargetPanel.add(oButton63);
		battleshipTargetPanel.add(oButton64);
		battleshipTargetPanel.add(oButton65);
		battleshipTargetPanel.add(oButton66);
		battleshipTargetPanel.add(oButton67);
		battleshipTargetPanel.add(oButton68);
		battleshipTargetPanel.add(oButton69);
		battleshipTargetPanel.add(oLabel17);
		battleshipTargetPanel.add(oButton70);
		battleshipTargetPanel.add(oButton71);
		battleshipTargetPanel.add(oButton72);
		battleshipTargetPanel.add(oButton73);
		battleshipTargetPanel.add(oButton74);
		battleshipTargetPanel.add(oButton75);
		battleshipTargetPanel.add(oButton76);
		battleshipTargetPanel.add(oButton77);
		battleshipTargetPanel.add(oButton78);
		battleshipTargetPanel.add(oButton79);
		battleshipTargetPanel.add(oLabel18);
		battleshipTargetPanel.add(oButton80);
		battleshipTargetPanel.add(oButton81);
		battleshipTargetPanel.add(oButton82);
		battleshipTargetPanel.add(oButton83);
		battleshipTargetPanel.add(oButton84);
		battleshipTargetPanel.add(oButton85);
		battleshipTargetPanel.add(oButton86);
		battleshipTargetPanel.add(oButton87);
		battleshipTargetPanel.add(oButton88);
		battleshipTargetPanel.add(oButton89);
		battleshipTargetPanel.add(oLabel19);
		battleshipTargetPanel.add(oButton90);
		battleshipTargetPanel.add(oButton91);
		battleshipTargetPanel.add(oButton92);
		battleshipTargetPanel.add(oButton93);
		battleshipTargetPanel.add(oButton94);
		battleshipTargetPanel.add(oButton95);
		battleshipTargetPanel.add(oButton96);
		battleshipTargetPanel.add(oButton97);
		battleshipTargetPanel.add(oButton98);
		battleshipTargetPanel.add(oButton99);

		JPanel recordPanel = new JPanel();
		targetRecord = new JTextArea(50,47);
		recordPanel.add(targetRecord);
		targetRecord.setEditable(false);
		targetRecord.setText("- Target Record -");
		Font courier = new Font("Courier New",Font.BOLD,15);
		targetRecord.setFont(courier);
		battleshipWindow.add(recordPanel, BorderLayout.CENTER);
		
		JPanel infoPanel = new JPanel(new GridLayout(1,3));	
		JProgressBar radarProgressBar = new JProgressBar();
		enemyStrengthProgressBar = new JProgressBar();
		coordinatesSweptProgressBar = new JProgressBar();
		infoPanel.add(enemyStrengthProgressBar);
		infoPanel.add(coordinatesSweptProgressBar);
		infoPanel.add(radarProgressBar);
		enemyStrengthProgressBar.setValue(100);
		coordinatesSweptProgressBar.setValue(0);
		radarProgressBar.setOrientation(JProgressBar.HORIZONTAL);
		radarProgressBar.setStringPainted(true);
		radarProgressBar.setString("-Radar-");
		radarProgressBar.setIndeterminate(true);
		enemyStrengthProgressBar.setOrientation(JProgressBar.HORIZONTAL);
		enemyStrengthProgressBar.setStringPainted(true);
		enemyStrengthProgressBar.setString("-Enemy Fleet Strength-");
		coordinatesSweptProgressBar.setOrientation(JProgressBar.HORIZONTAL);
		coordinatesSweptProgressBar.setStringPainted(true);
		coordinatesSweptProgressBar.setString("-Coordinates Swept-");
		battleshipWindow.add(infoPanel, BorderLayout.SOUTH);
		
		radarProgressBar.setForeground(Color.GREEN);
		radarProgressBar.setBackground(Color.BLACK);
		enemyStrengthProgressBar.setForeground(Color.BLACK);
		enemyStrengthProgressBar.setBackground(Color.RED);
		coordinatesSweptProgressBar.setForeground(Color.DARK_GRAY);
		coordinatesSweptProgressBar.setBackground(Color.BLACK);
		Color oceanBlue = new Color(29,94,207);
		for(int i=0; i<oceanArray.length; i++)
		{
			oceanArray[i].setBackground(oceanBlue);
			oceanTargetArray[i].setBackground(oceanBlue);
		}
	}
	
	public void printOnTargetRecord(String str)
	{
		targetRecordManagement++;
		if(targetRecordManagement>=4)
		{
			targetRecord.insert("\n",0);
			targetRecord.insert("- "+str+" ",0);
			targetRecordManagement=0;	
		}
		else
		{
			targetRecord.insert("- "+str+" ",0);
		}	
	}
	
	public void decreaseEnemyFleetStrength()
	{
		enemyStrength-=10;
		if(enemyStrength<0)
		{
			enemyStrength=0;
		}
		enemyStrengthProgressBar.setValue(enemyStrength);
	}
	
	public void increaseCoordinatesSwept()
	{
		targeted++;
		if(targeted>100)
		{
			targeted=100;
		}
		coordinatesSweptProgressBar.setValue(targeted);
	}
	
	public String getShipOrientation(String type, int player)
	{
		String shipOrientation;
		if(player==0)
		{
			if(Math.random()*10>4)
			{
				shipOrientation = "HORIZONTAL";
			}
			else
			{
				shipOrientation = "VERTICAL";
			}
		}
		else
		{
			shipOrientation = JOptionPane.showInputDialog(null, type+" Orientation (type: \"Horizontal\" or \"Vertical\")","Deploy Fleet", JOptionPane.PLAIN_MESSAGE).toUpperCase();
			while(!(shipOrientation.equals("HORIZONTAL") || shipOrientation.equals("VERTICAL")))
			{
				shipOrientation = JOptionPane.showInputDialog(null, "Give VALID Orientation (type: \"Horizontal\" or \"Vertical\")","Deploy Fleet", JOptionPane.PLAIN_MESSAGE).toUpperCase();
			}
				
		}
		return shipOrientation;
	}

	public String getShipCoord(String type, String or, int player)
	{
		String shipCoord;
		if(player==0)
		{
			shipCoord=computerCoordList[(int)(Math.random()*100)];
			while(isOverlaping(shipCoord,type,or,player)||isValidCoordinate(shipCoord,type,or)==false)
			{
				shipCoord = computerCoordList[(int)(Math.random()*100)];
			}
		}
		else
		{
			shipCoord = JOptionPane.showInputDialog(null, type+" Deployment Coordinates","Deploy Fleet", JOptionPane.PLAIN_MESSAGE).toUpperCase();
			while(isValidCoordinate(shipCoord,type,or)==false)
			{
				shipCoord = JOptionPane.showInputDialog(null, "Give VALID Deployment Coordinates for "+type,"Deploy Fleet", JOptionPane.PLAIN_MESSAGE).toUpperCase();
			}
			while(isValidCoordinate(shipCoord,type,or)==false || isOverlaping(shipCoord,type,or,player))
			{
				shipCoord = JOptionPane.showInputDialog(null, "Coordinates Overlap an Already Deployed Ship: Choose New Coordinate.","Deploy Fleet", JOptionPane.PLAIN_MESSAGE).toUpperCase();
			}	
		}
		return shipCoord;
	}

	
	private boolean isValidCoordinate(String coord,String type, String or)
	{
		String validLetter []= {"A","B","C","D","E","F","G","H","I","J"};
		String invalidHBattleshipCoords []= {"A9","B9","C9","D9","E9","F9","G9","H9","I9","J9"};
		String invalidVBattleshipCoords []= {"J0","J1","J2","J3","J4","J5","J6","J7","J8","J9"};
		String invalidHCarrierCoords []= {"A9","B9","C9","D9","E9","F9","G9","H9","I9","J9","A8","B8","C8","D8","E8","F8","G8","H8","I8","J8"};
		String invalidVCarrierCoords []= {"J0","J1","J2","J3","J4","J5","J6","J7","J8","J9","I0","I1","I2","I3","I4","I5","I6","I7","I8","I9"};
		if(coord==null || coord.length()<2 || coord.length()>2)
		{
			return false;
		}
		if(!coord.substring(1).matches(".*\\d+.*"))
		{
			return false;
		}
		String testLetter = coord.substring(0,1);
		int testNumber = Integer.parseInt(coord.substring(1));
		for(int i=0; i<validLetter.length; i++)
		{
			if(testLetter.equals(validLetter[i])==false && i==validLetter.length-1)
			{
				return false;
			}	
			else if(testLetter.equals(validLetter[i]))
			{
				i=validLetter.length;
			}
		}
		if(testNumber<0)
		{
			return false;
		}
		if(type.substring(0,type.length()-2).equals("Battleship"))
		{
			if(or.equals("HORIZONTAL"))
			{
				for(int i=0; i<invalidHBattleshipCoords.length; i++)
				{
					if(coord.equals(invalidHBattleshipCoords[i]))
					{
						return false;
					}	
					else if(coord.equals(invalidHBattleshipCoords[i])==false && i==invalidHBattleshipCoords.length-1)
					{
						i=invalidHBattleshipCoords.length;
					}
				}
			}
			else if(or.equals("VERTICAL"))
			{
				for(int i=0; i<invalidVBattleshipCoords.length; i++)
				{
					if(coord.equals(invalidVBattleshipCoords[i]))
					{
						return false;
					}	
					else if(coord.equals(invalidVBattleshipCoords[i])==false && i==invalidVBattleshipCoords.length-1)
					{
						i=invalidVBattleshipCoords.length;
					}
				}
			}
		}
		
		else if(type.equals("Carrier"))
		{
			if(or.equals("HORIZONTAL"))
			{
				for(int i=0; i<invalidHCarrierCoords.length; i++)
				{
					if(coord.equals(invalidHCarrierCoords[i]))
					{
						return false;
					}	
					else if(coord.equals(invalidHCarrierCoords[i])==false && i==invalidHCarrierCoords.length-1)
					{
						i=invalidHCarrierCoords.length;
					}
				}
			}
			else if(or.equals("VERTICAL"))
			{
				for(int i=0; i<invalidVCarrierCoords.length; i++)
				{
					if(coord.equals(invalidVCarrierCoords[i]))
					{
						return false;
					}	
					else if(coord.equals(invalidVCarrierCoords[i])==false && i==invalidVCarrierCoords.length-1)
					{
						i=invalidVCarrierCoords.length;
					}
				}
			}
		}
		return true;
	}
	
	public boolean isOverlaping(String coord,String type, String or,int player)
	{
		int coordTest [] = calcCoordinates(coord, type, or);
		if(player==0)
		{
			for(int i = 0; i < coordTest.length; i++)
			{
				for(int t = 0; t < computerDeployCoords.size(); t++)
				{
					if(coordTest[i]==computerDeployCoords.get(t))
					{
						return true;
					}			
				}
			
			}
			for(int i = 0; i < coordTest.length; i++)
			{		
				computerDeployCoords.add(coordTest[i]);	
			}
		}
		else
		{
			for(int i = 0; i < coordTest.length; i++)
			{
				for(int t = 0; t < humanDeployCoords.size(); t++)
				{
					if(coordTest[i]==humanDeployCoords.get(t))
					{
						return true;
					}			
				}
			
			}
			for(int i = 0; i < coordTest.length; i++)
			{		
				humanDeployCoords.add(coordTest[i]);	
			}	
		}		
		return false;
	}
	
	public int[] calcCoordinates(String coord,String type, String or)
	{
		if(type.substring(0,type.length()-2).equals("Battleship"))
		{
			int shipCoords [] = new int [2];
			int ascii = (int)coord.charAt(0);
			int number = Integer.parseInt(coord.substring(1));
			shipCoords[0]= (ascii-65)*10+number;
			if(or.equals("HORIZONTAL"))
			{
				shipCoords[1]= (ascii-65)*10+number+1;
			}
			else if(or.equals("VERTICAL"))
			{
				shipCoords[1]= (ascii-65)*10+number+10;
			}
			return shipCoords;
		}
		else if(type.equals("Carrier"))
		{
			int shipCoords [] = new int [3];
			int ascii = (int)coord.charAt(0);
			int number = Integer.parseInt(coord.substring(1));
			shipCoords[0]= (ascii-65)*10+number;
			if(or.equals("HORIZONTAL"))
			{
				shipCoords[1]= (ascii-65)*10+number+1;
				shipCoords[2]= (ascii-65)*10+number+2;
			}
			else if(or.equals("VERTICAL"))
			{
				shipCoords[1]= (ascii-65)*10+number+10;
				shipCoords[2]= (ascii-65)*10+number+20;
			}
			return shipCoords;
		}
		else
		{
			int shipCoords [] = new int [1];
			int ascii = (int)coord.charAt(0);
			int number = Integer.parseInt(coord.substring(1));
			shipCoords[0]= (ascii-65)*10+number;
			return shipCoords;
		}
	}
	
	public void addShipToGrid(int [] c, String t)
	{
		for(int i = 0; i< c.length; i++)
		{
			oceanArray[c[i]].setBackground(Color.GRAY);
			if(t.equals("Battleship"))
			{
				LineBorder border = new LineBorder(Color.YELLOW,2);
				oceanArray[c[i]].setBorder(border);
			}
			else if(t.equals("Carrier"))
			{
				LineBorder border = new LineBorder(Color.WHITE,2);
				oceanArray[c[i]].setBorder(border);
			}
			else if(t.equals("Minesweeper"))
			{
				LineBorder border = new LineBorder(Color.ORANGE,2);
				oceanArray[c[i]].setBorder(border);
			}
		}
	}
	
	public String guessShipCoord(int player,int prevCoord,int hitCount,int firstCoord,int primaryCoord)
	{
		String guessCoord=null;
		if(player==0)
		{
			if(prevCoord<100)
			{
				if(primaryCoord<100)
				{
					guessCoord = computerCoordList[primaryCoord];
					for(int z=0; z<computerGuessedCoords.size();z++)
					{	
						while(guessCoord.equals(computerGuessedCoords.get(z)))
						{
							int randomF = (int)(Math.random()*24);
							if(randomF==0 && (int)(primaryCoord%10)!=0)
							{
								guessCoord = computerCoordList[primaryCoord-1];
							}
							else if(randomF==1 && (int)(primaryCoord/10)!=9)
							{
								guessCoord = computerCoordList[primaryCoord+10];
							}
							else if(randomF==2 && (int)(primaryCoord/10)!=0)
							{
								guessCoord = computerCoordList[primaryCoord-10];
							}
							else if(randomF==3 && (int)(primaryCoord%10)!=9)
							{
								guessCoord = computerCoordList[primaryCoord+1];
							}
							else if(randomF==4 && (int)(primaryCoord%10)>=2 && (int)(primaryCoord/10)>=2)
							{
								guessCoord = computerCoordList[primaryCoord-22];
							}
							else if(randomF==5 && (int)(primaryCoord%10)>=1 && (int)(primaryCoord/10)>=2)
							{
								guessCoord = computerCoordList[primaryCoord-21];
							}
							else if(randomF==6 && (int)(primaryCoord/10)>=2)
							{
								guessCoord = computerCoordList[primaryCoord-20];
							}
							else if(randomF==7 && (int)(primaryCoord%10)<=8 && (int)(primaryCoord/10)>=2)
							{
								guessCoord = computerCoordList[primaryCoord-19];
							}
							else if(randomF==8 && (int)(primaryCoord%10)<=7 && (int)(primaryCoord/10)>=2)
							{
								guessCoord = computerCoordList[primaryCoord-18];
							}
							else if(randomF==9 && (int)(primaryCoord%10)>=2 && (int)(primaryCoord/10)>=1)
							{
								guessCoord = computerCoordList[primaryCoord-12];
							}
							else if(randomF==10 && (int)(primaryCoord%10)>=1 && (int)(primaryCoord/10)>=1)
							{
								guessCoord = computerCoordList[primaryCoord-11];
							}
							else if(randomF==11 && (int)(primaryCoord%10)<=8 && (int)(primaryCoord/10)>=1)
							{
								guessCoord = computerCoordList[primaryCoord-9];
							}
							else if(randomF==12 && (int)(primaryCoord%10)<=7 && (int)(primaryCoord/10)>=1)
							{
								guessCoord = computerCoordList[primaryCoord-8];
							}
							else if(randomF==13 && (int)(primaryCoord%10)>=2)
							{
								guessCoord = computerCoordList[primaryCoord-2];
							}
							else if(randomF==14 && (int)(primaryCoord%10)<=7)
							{
								guessCoord = computerCoordList[primaryCoord+2];
							}
							else if(randomF==15 && (int)(primaryCoord%10)>=2 && (int)(primaryCoord/10)<=8)
							{
								guessCoord = computerCoordList[primaryCoord+8];
							}
							else if(randomF==16 && (int)(primaryCoord%10)>=1 && (int)(primaryCoord/10)<=8)
							{
								guessCoord = computerCoordList[primaryCoord+9];
							}
							else if(randomF==17 && (int)(primaryCoord%10)<=8 && (int)(primaryCoord/10)<=8)
							{
								guessCoord = computerCoordList[primaryCoord+11];
							}
							else if(randomF==18 && (int)(primaryCoord%10)<=7 && (int)(primaryCoord/10)<=8)
							{
								guessCoord = computerCoordList[primaryCoord+12];
							}
							else if(randomF==19 && (int)(primaryCoord%10)>=2 && (int)(primaryCoord/10)<=7)
							{
								guessCoord = computerCoordList[primaryCoord-18];
							}
							else if(randomF==20 && (int)(primaryCoord%10)>=1 && (int)(primaryCoord/10)<=7)
							{
								guessCoord = computerCoordList[primaryCoord+19];
							}
							else if(randomF==21 && (int)(primaryCoord/10)<=7)
							{
								guessCoord = computerCoordList[primaryCoord+20];
							}
							else if(randomF==22 && (int)(primaryCoord%10)<=8 && (int)(primaryCoord/10)<=7)
							{
								guessCoord = computerCoordList[primaryCoord+21];
							}
							else if(randomF==23 && (int)(primaryCoord%10)<=9 && (int)(primaryCoord/10)<=7)
							{
								guessCoord = computerCoordList[primaryCoord+22];
							}
							z=0;
						}
					}
				}
				else if(hitCount>1)
				{
					guessCoord = computerCoordList[firstCoord];
					if(firstCoord-prevCoord==1 || prevCoord-firstCoord==1)
					{
						for(int a=0; a<computerGuessedCoords.size();a++)
						{	
							while(guessCoord.equals(computerGuessedCoords.get(a)))
							{
								int randomA = (int)(Math.random()*4);
								if(randomA==0 && (int)(firstCoord%10)!=9 && (int)(firstCoord%10)!=8)
								{
									guessCoord = computerCoordList[firstCoord+2];
								}
								else if(randomA==0 && (int)(firstCoord%10)!=9)
								{
									guessCoord = computerCoordList[firstCoord+1];
								}
								else if(randomA==1 && (int)(firstCoord%10)!=0)
								{
									guessCoord = computerCoordList[firstCoord-1];
								}
								else if(randomA==2 && (int)(firstCoord%10)!=0 && (int)(firstCoord%10)!=1)
								{
									guessCoord = computerCoordList[firstCoord-2];
								}
								a=0;
							}
						}
					}
					else
					{
						for(int b=0; b<computerGuessedCoords.size();b++)
						{	
							while(guessCoord.equals(computerGuessedCoords.get(b)))
							{
								int randomB = (int)(Math.random()*4);
								if(randomB==0 && (int)(firstCoord/10)!=9 && (int)(firstCoord/10)!=8)
								{
									guessCoord = computerCoordList[firstCoord+20];
								}
								if(randomB==0 && (int)(firstCoord/10)!=9)
								{
									guessCoord = computerCoordList[firstCoord+10];
								}
								else if(randomB==1 && (int)(firstCoord/10)!=0)
								{
									guessCoord = computerCoordList[firstCoord-10];
								}
								else if(randomB==2 && (int)(firstCoord/10)!=0 && (int)(firstCoord/10)!=1)
								{
									guessCoord = computerCoordList[firstCoord-20];
								}
								b=0;
							}
						}
					}
				}
				else
				{
					guessCoord = computerCoordList[prevCoord+1];
					for(int i=0; i<computerGuessedCoords.size();i++)
					{	
						while(guessCoord.equals(computerGuessedCoords.get(i)))
						{
							int random = (int)(Math.random()*3);
							if(random==0 && (int)(prevCoord%10)!=0)
							{
								guessCoord = computerCoordList[prevCoord-1];
							}
							else if(random==1 && (int)(prevCoord/10)!=9)
							{
								guessCoord = computerCoordList[prevCoord+10];
							}
							else if(random==2 && (int)(prevCoord/10)!=0)
							{
								guessCoord = computerCoordList[prevCoord-10];
							}
							i=0;
						}
					}
				}	
			}
			else
			{
				guessCoord=computerCoordList[(int)(Math.random()*100)];
				for(int p=0; p<computerGuessedCoords.size();p++)
				{
					while(guessCoord.equals(computerGuessedCoords.get(p)))
					{
						guessCoord = computerCoordList[(int)(Math.random()*100)];
						p=0;
					}
				}	
			}
			computerGuessedCoords.add(guessCoord);		
		}
		else
		{
			guessCoord = JOptionPane.showInputDialog(null, "Target Coordinate : ","Target Enemy Fleet", JOptionPane.PLAIN_MESSAGE).toUpperCase();
			while(isValidCoordinate(guessCoord,"Target",null)==false)
			{
				guessCoord = JOptionPane.showInputDialog(null, "VALID Target Coordinate : ","Target Enemy Fleet", JOptionPane.PLAIN_MESSAGE).toUpperCase();;
			}
			for(int t =0; t<humanGuessedCoords.size();t++)
			{
				while(guessCoord.equals(humanGuessedCoords.get(t)) || isValidCoordinate(guessCoord,"Target",null)==false)
				{
					guessCoord = JOptionPane.showInputDialog(null, "Already Targeted Coordinate, Choose new Target Coordinate : ","Target Enemy Fleet", JOptionPane.PLAIN_MESSAGE).toUpperCase();;
					t=0;
				}
			}
			humanGuessedCoords.add(guessCoord);	
		}
		return guessCoord;
	}
	
	public void targetMessage(String type, String coord,int player)
	{
		if(player ==0)
		{
			if(coord.equals("0"))
			{
				JOptionPane.showMessageDialog(null, "Computer Sunk Your "+type,"Computer Turn",JOptionPane.WARNING_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Computer : "+type+" "+coord,"Computer Turn",JOptionPane.PLAIN_MESSAGE);
			}		
		}
		else
		{
				JOptionPane.showMessageDialog(null, "You destroyed the enemy "+type,"Sunk",JOptionPane.INFORMATION_MESSAGE);		
		}		
	}
	
	public void hitShipOnGrid(int c, String t,int player)
	{
		if(player==0)
		{
			if(t.equals("Miss"))
			{
				LineBorder border = new LineBorder(Color.RED);
				oceanArray[c].setBorder(border);
			}
			else if(t.equals("Hit"))
			{
				oceanArray[c].setBackground(Color.RED);
			}
		}
		else
		{
			if(t.equals("Miss"))
			{
				LineBorder border = new LineBorder(Color.RED);
				oceanTargetArray[c].setBorder(border);
			}
			else if(t.equals("Hit"))
			{
				oceanTargetArray[c].setBackground(Color.RED);
			}
		}			
	}
	
	public void startMessage()
	{
			JOptionPane.showMessageDialog(null, "-- Welcome to Battleship! - Created by Aidan Lethaby - 2017 - Here is how to play --\nYou have 5 ships: a carrier, 3 battleships, and a minesweeper. The carrier is 3\ngrid points, the battleships are 2, and the minesweeper is 1. First, you place your\nships by choosing their orientation and the coordinate of the ship's bow. The rest\nof the ship will then follow either to the right (if horizontal) and below (if vertical).\nThen, you and the computer take turns trying to sink the enemy fleet until it is\ndestroyed. You can keep track of what you have hit, sunk, or missed, enemy health\nand percent of coordinates swept via the \"Target Record\", \"Target\" map and\nprogress bars below. Updates are ongoing for a more advanced computer player." , "Welcome!", JOptionPane.PLAIN_MESSAGE);
	}
	
	public void victoryMessage(int player)
	{
		if(player==0)
		{
			JOptionPane.showMessageDialog(null, "Defeat : Your Fleet has Been Destroyed","Game Over",JOptionPane.PLAIN_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Victory : Enemy Fleet Destroyed","Game Over",JOptionPane.PLAIN_MESSAGE);
		}
	}
	
}