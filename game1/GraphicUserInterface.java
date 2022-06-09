// [1] 
import javax.swing.JFrame;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;

public class GraphicUserInterface extends JFrame{ //[2]

    

    // [3]
    public GraphicUserInterface(){
        this.setTitle("Campo Minado");
        this.setSize(1286,829); // [4]
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //[5]
        this.setVisible(true); //[6]
        this.setResizable(true); //[7]

        
        Tabuleiro tab = new Tabuleiro(); // [10]    
        this.setContentPane(tab); //[11]

        // [16]
        Mouse mouse = new Mouse();
        this.addMouseMotionListener(mouse);

        Click click = new Click();
        this.addMouseListener(click);

    }

    //[8]
    public class Tabuleiro extends JPanel{ 
        public void paintComponent(Graphics graph){ //[9]
            int dist = 5;
            graph.setColor(Color.black); //[12]
            graph.fillRect(0, 0, 1280, 800); // [12]
            graph.setColor(Color.red);
            for(int i = 0; i < 16; i++){ // [13]
                for(int j = 0; j < 9; j++){
                    graph.fillRect(dist + (i*80), dist + (j * 80 + 80), 80 - (2 * dist), 80 - (2 * dist));
                }
            }
        }
    }

    public class Mouse implements MouseMotionListener { //[14]

        @Override       
        public void mouseDragged(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }
        
    }

    public class Click implements MouseListener { //[15]

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

    }

    public void att(){}


}

