// [1] 
import javax.swing.JFrame;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;

public class GraphicUserInterface extends JFrame{ //[2]

    int dist = 5;
    Random ale = new Random();
    public int coodX = -100;
    public int coodY = -100;

    int[][] minas = new int[16][9];
    int[][] visinhos = new int [16][9];
    boolean[][] show = new boolean[16][9];
    boolean[][] flags = new boolean[16][9];

    // [3]
    public GraphicUserInterface(){
        this.setTitle("Campo Minado");
        this.setSize(1286,829); // [4]
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //[5]
        this.setVisible(true); //[6]
        this.setResizable(false); //[7]

        Tabuleiro tab = new Tabuleiro(); // [10]    
        this.setContentPane(tab); //[11]

        // [16]
        Mouse mouse = new Mouse();
        this.addMouseMotionListener(mouse);

        Click click = new Click();
        this.addMouseListener(click);

        for(int i = 0; i < 16;  i++){
            for(int j = 0; j< 9; j++){
                if(ale.nextInt(100) < 20){ // qtd of mines.
                    minas[i][j] = 1;
                }else{
                    minas[i][j] = 0;
                }
                show[i][j] = false;
            }
        }

    }

    //[8]
    public class Tabuleiro extends JPanel{ 
        public void paintComponent(Graphics graph){ //[9]
            graph.setColor(Color.black); //[12]
            graph.fillRect(0, 0, 1280, 800); // [12]
            for(int i = 0; i < 16; i++){ // [13]
                for(int j = 0; j < 9; j++){
                    graph.setColor(Color.RED);
                    if(show[i][j] == true){
                        graph.setColor(Color.PINK);
                    }
                    if( (coodX>=dist+i*80) && (coodX<i*80+80-dist)  && (coodY >= dist+j*80+106) && (coodY < j*80+186-dist)){
                        graph.setColor(Color.GREEN);
                    }
                    graph.fillRect(dist+i*80,dist+j*80+80,80-2*dist,80-2*dist);
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
            coodX = e.getX();
            coodY = e.getY();
            // System.out.println("X: " + coodX + " Y: " + coodY);
        }
        
    }

    public class Click implements MouseListener { //[15]

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            if(clickBoxX() != -1 && clickBoxY() != -1){
                show[clickBoxX()][clickBoxY()] = true;
            }

            if(clickBoxX() != -1 && clickBoxY() != -1){
                System.out.println("Mouse is in [" + clickBoxX() + "," + clickBoxY() + "]");
            }
            // System.out.println("The Mouse was clicked!");
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

    public int clickBoxX(){
        for(int i = 0; i < 16; i++){
            for(int j = 0; j < 9; j++){
                if( (coodX>=dist+i*80) && (coodX<dist+i*80+80-2*dist)  && (coodY >= dist+j*80+106) && (coodY < j*80+186-dist)){
                    return i;
                }
            }
        }
        return -1;
    }

    public int clickBoxY(){
        for(int i = 0; i < 16; i++){
            for(int j = 0; j < 9; j++){
                if( (coodX>=dist+i*80) && (coodX<dist+i*80+80-2*dist)  && (coodY >= dist+j*80+106) && (coodY < j*80+186-dist)){
                    return j;
                }
            }
        }
        return -1;
    }

    public void att(){}


}

