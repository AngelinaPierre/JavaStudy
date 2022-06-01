// sound imports
import javax.sound.sampled.AudioSystem;
import java.io.File;
// window imports
import javax.swing.*;
import java.awt.*; 				

// Turning Intro into a thread called Runnable
public class Intro extends JPanel implements Runnable{
	
	// variables
	
	private JFrame window = new JFrame(); // allocating memory, creating the window instance
	private String imagePath = "intro.jpg"; // variable that holds the path for the image file
	private int waitThread = 2000; // 2 seconds of wait.
	private String audioFileName = "bg-music.wav"; // variable that holds the path for the audio file
	
	
	
	
	
	
// creating the constructor 
	
	public Intro(){
		
		// function that will enable us to play Audio | PLAY AUDIO CLIP AS THE SCENE STARTS
		playAudio();		
		
		// defining the panel size, create a new dimension
		this.setPreferredSize(new Dimension(GameManager.SCREEN_WIDTH, GameManager.SCREEN_HEIGHT));
		
		//refers to intro clust
		window.add(this);
		
		// close the window
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// pack the intro panel into the window.
		window.pack(); 
		
		// fullscreen
		// window.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
		// making the window visible
		window.setVisible(true); 
	}
	
	
	
	
	
	
	
// playaudio function - codes that enable us to play a soud clipe
// libraries > javax.sound.sampled.AudioSystem && java.io.File;
	
	 public void playAudio(){
		 
		 try {
		 // access to audio file
		 File audioPath = new File(audioFileName);
		 
		 //1 - we need java's input stream reference
		 // the instance of the audioinputstream is at GameManager class
		 GameManager.stream = AudioSystem.getAudioInputStream(audioPath);
		 
		 //2 - we need reference to Audio CLIP CLASS - open the stream that allows open the file
		 GameManager.clip = AudioSystem.getClip();
		 
		 //3 - OPEN THE STREAM USING THE CLIP CLASS
		 GameManager.clip.open(GameManager.stream);
		 
		 //4 - start the music
		 GameManager.clip.start();
		 } 
		 catch(Exception e) {
			 e.printStackTrace();// in case the file doesn't load/error we catch this exception and shows the error
		 }
	 }
	 
	 
	 
	 
	 
	 
	
// polimorfism to override java default graphics paint method
	 
	public void paint(Graphics g) {
		
		// drawing the image with a local jpeg
		g.drawImage(new ImageIcon(imagePath).getImage(),
				-450,-365, null);
	}
	
// method for the game to run smooth, since we are going to have a lot of objects, if we don't use or thread properly, we can bug the game.
	
	@Override
	public void run() {
		
		// we are going to make this call "sleep" while everything else is working.
		// when we use thread we need to use the Try..Catch
		
		try {
			
			Thread.sleep(waitThread); // 2000 milliseconds
			window.dispose(); // pausing the window after the wait period
			
			// Creating the MENU class
			// JOptionPane.showMessageDialog(null, "Menu Will be here"); // open's a box panel option with a [ok] button
			
			Menu menu = new Menu();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}


