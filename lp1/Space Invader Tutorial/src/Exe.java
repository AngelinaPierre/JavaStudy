
public class Exe {

	public static void main(String[] args) {
//		System.out.println(GameManager.SCREEN_WIDTH);
//		System.out.println(GameManager.SCREEN_HEIGHT);
		
		// create a instance of the Intro clust/class
//		Intro i = new Intro();
		
		// we need to create a thread to make stop the sleeping process. We create the Intro instance inside the Thread().
		Thread gameThread = new Thread(new Intro());
		// running the gamethread
		gameThread.run();
	}

}
