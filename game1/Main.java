public class Main implements Runnable { //[1]

    GraphicUserInterface GUI = new GraphicUserInterface(); //[3]

    public static void main(String[] args) {
        new Thread(new Main()).start(); //[4]
    }

    @Override
    public void run() { //[2]
        while(true){ //[5]
            GUI.att();
        }
    }
}