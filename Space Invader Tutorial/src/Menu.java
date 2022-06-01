// class that we will instantiate once we start the game
// see at Intro class in @override run() method.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {
	// NEED TO CREATE A WINDOW FOR OUR MENU (instance of JFrame)
	private static JFrame  frame;
	
	// we are going to use JFrame has a data field.
	
	// BORDER LAYOUT CAN HOLD UP TO 5 BUTTONS!
	
	// WE WILL SET UP START BUTTON THAT GOES AT THE TOP
	
	private static void setupStartButton(Container pane) {
		// CREATE A BUTTON
		JButton button = new JButton();
		// SET BUTTON'S SIZE | TAKES A DIMENSION AS A PARAMETER
		// FOR THE DIMENSION WE HAVE 5 ITEMS TO FIT IN. | WANT THE START BUTTON WIDTH TO MATCH THE WINDOW WIDTH
		// CALLING THE GameManager script to take the values of the window.
		button.setPreferredSize(new Dimension(GameManager.SCREEN_WIDTH, 
				GameManager.SCREEN_HEIGHT/5)); // dividing the screen high into 5 pieces and setting to the height
		// SET AN ICON/ CUSTOM IMAGE TO YOUR BUTTON
		button.setIcon(new ImageIcon("start.png"));
		
		// NOW LET'S MAKE IT FUNCTIONAL.
		
		// THE PARAMETER TAKES THE ACTIONSLISTENER INTERFACE WHERE WE DEFINE 
		// WHAT ACTION WE ARE GOING TO TAKE ONCE THE BUTTON IS PRESSED
		button.addActionListener(new ActionListener() { // creating a instance 
			// WE NEED TO OVERRIDE THE ACTION_PERFORMED FUNCTION
			// THE ACTIONS IS, WHEN CLICKED OPENS THE GAMEPLAY WINDOW.
			
			// ACTION EVENT IS THE PARAMETER WE HAVE TO MATCH TO OVERRIDE
			public void actionPerformed(ActionEvent e) {
				// close current window
				frame.dispose();
				// START THE GAME
				// CREATE A JOPTION PANE TO SHOW WHILE DON'T HAVE THE GAMEPLAY WINDOW.
				JOptionPane.showMessageDialog(null, "Next tutorial!");
			}
		}); 
		
		// TIME TO AADD THE START BUTTON TO THE TOP OF THE BORDERLAYOUT (JOPTION PANE))
		pane.add(button, BorderLayout.PAGE_START); // PAGE_START = TOP OF THE PAGE
	}
	
	// REAPET THE STEPS OF THE BUTTON CREATION 5 TIMES.
		
	private static void setupLeftButton(Container pane) {
		// CREATE A BUTTON
				JButton button = new JButton();
				// SET BUTTON'S SIZE | TAKES A DIMENSION AS A PARAMETER
				// FOR THE DIMENSION WE HAVE 5 ITEMS TO FIT IN. | WANT THE START BUTTON WIDTH TO MATCH THE WINDOW WIDTH
				// CALLING THE GameManager script to take the values of the window.
				button.setPreferredSize(new Dimension(GameManager.SCREEN_WIDTH/5, 
						GameManager.SCREEN_HEIGHT/3)); 
				// NOTE: I WANT THIS BUTTON TO BE ON THE LEFT WITH A WIDTH THAT ALLOWS 5 MORE BUTTONS
				// TO FIT, THUS I AM DIVIDING IT WITH 5 ON THE WIDTH.
				// DIVIDING IT WITH 3 MORE BUTTONS WITH CUSTOM SIZES (ON THE HEIGHT FOR THE SAME REASON)
				// SET AN ICON/ CUSTOM IMAGE TO YOUR BUTTON
				button.setIcon(new ImageIcon("exit.png"));
				
				// NOW LET'S MAKE IT FUNCTIONAL.
				
				// THE PARAMETER TAKES THE ACTIONSLISTENER INTERFACE WHERE WE DEFINE 
				// WHAT ACTION WE ARE GOING TO TAKE ONCE THE BUTTON IS PRESSED
				button.addActionListener(new ActionListener() { // creating a instance 
					// WE NEED TO OVERRIDE THE ACTION_PERFORMED FUNCTION
					// THE ACTIONS IS, WHEN CLICKED OPENS THE GAMEPLAY WINDOW.
					
					// ACTION EVENT IS THE PARAMETER WE HAVE TO MATCH TO OVERRIDE
					public void actionPerformed(ActionEvent e) {
						// close current window
						frame.dispose();
						// YOU CAN OPEN INTO ANOTHER WINDOW
						JOptionPane.showMessageDialog(null, "LEFT BUTTON IS PRESSED");
						
						// WHAT IF YOU WANTED TO CLOSE THE ENTIRE GAME? NEED TO STOP THE MUSIC
						
						// NEED TO TRY CATCH
						try {
							GameManager.stream.close(); // music stops
						}catch(Exception ex) {
							ex.printStackTrace();
						}
						
					}
				}); 
				
				// TIME TO AADD THE START BUTTON TO THE TOP OF THE BORDERLAYOUT (JOPTION PANE))
				pane.add(button, BorderLayout.LINE_START); // LINE_START = LEFT OF THE PAGE
	}
	
	private static void setupRightButton(Container pane) {
				JButton button = new JButton();
				button.setPreferredSize(new Dimension(GameManager.SCREEN_WIDTH/5, 
						GameManager.SCREEN_HEIGHT/3)); 
				button.setIcon(new ImageIcon("q.png"));
				
				// SIMMILAR TO LEFT BUTTON
				
				// NOW LET'S MAKE IT FUNCTIONAL.
				
				button.addActionListener(new ActionListener() { 
					
					public void actionPerformed(ActionEvent e) {
//						frame.dispose();
//						JOptionPane.showMessageDialog(null, "Next tutorial!");
						
						// JUST WANT A PRINT STATEMENT
						System.out.println("Q BUTTON IS BEING PRESSEED!");
						// YOU CAN LOAD INTO ANOTHER WINDOW
					}
					
				}); 
				pane.add(button, BorderLayout.LINE_END); // LINE_END = RIGHT OF THE PAGE
	}
	
	// NOT A BUTTON
	private static void setupCenterImage(Container pane) {
		// CREATE A LABEL  THAT ITS NOT A TEXT BUT A ICON  
		
		JLabel label = new JLabel(); // WE WILL SET THE LABEL TO BE AN IMAGE
		
		label.setPreferredSize(new Dimension(GameManager.SCREEN_HEIGHT/2, GameManager.SCREEN_HEIGHT/3));
		label.setIcon(new ImageIcon("menu_1.png"));
		pane.add(label, BorderLayout.CENTER);
		
		
	}
	
	private static void setupBottomButton(Container pane) {
		JButton button = new JButton();
		button.setPreferredSize(new Dimension(GameManager.SCREEN_WIDTH, 
				GameManager.SCREEN_HEIGHT/5)); 
		button.setIcon(new ImageIcon("about.png"));
		
		// SIMMILAR TO LEFT BUTTON
		
		// NOW LET'S MAKE IT FUNCTIONAL.
		
		button.addActionListener(new ActionListener() { 
			
			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
//				JOptionPane.showMessageDialog(null, "Next tutorial!");
				
				// JUST WANT A PRINT STATEMENT
				System.out.println("ABOUT BUTTON IS BEING PRESSEED!");
				// YOU CAN LOAD INTO ANOTHER WINDOW
				
			}
			
		}); 
		pane.add(button, BorderLayout.PAGE_END); // PAGE_END = BOTTOM OF THE PAGE
	}
	
	// LET US ADD ALL THE COMPONENTS TO OUR PANE
	
	public static void addComponents(Container pane) {
		pane.setComponentOrientation(java.awt.ComponentOrientation.LEFT_TO_RIGHT);
		
		// ADD START BUTTON
		setupStartButton(pane);
		// ADD CENTER BUTTON
		setupCenterImage(pane);
		// LEFT BUTTON
		setupLeftButton(pane); 
		// RIGHT BUTTON
		setupRightButton(pane);
		// BOTTOM BUTTON
		setupBottomButton(pane);
	}
	
	// CREATE OR SET UP THE FRAME/WINDOW
	private static void createFrame() {
		frame = new JFrame("MENU"); // TITLE WOULD BE MENU
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // HOUSE KEEPING. CLOSES THE APP
		addComponents(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}
	
	// CONSTRUCTOR TO BE USED WHEN INSTANTIATING THIS CLASS.
	// WE NEED TO CREATE AN INSTANCE OF THE FRAME IN THE CONSTRUCTOR.
	// IN A WAY SO THE AWT EVENTS DON'T GET IN THE WAI I SUPPOSE? JAVA DOCS
	
	public Menu() {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			// OVERRIDE THE RUN METHOD
			public void run() {
				createFrame();
			}
		});
	}
	
}












