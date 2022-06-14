// [1] 
import javax.swing.JFrame;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;

public class GraphicUserInterface extends JFrame{ //[2]

    String msg1 = "Winner!";
    String msg2 = "Noob, try again!";

    Date tempoFim;

    int dist = 1; // spacing
    Random ale = new Random();
    public int coodX = -100; //mx
    public int coodY = -100; //my

    int[][] minas = new int[16][9];
    int[][] visinhos = new int [16][9];
    boolean[][] show = new boolean[16][9];
    boolean[][] flags = new boolean[16][9];

    int lados = 0; // neighs

    public int iconeCoodX = 605; //smileyX
    public int iconeCoodY = 5; // smileyY

    public boolean icone1 = true; // happiness

    Date tempoIni = new Date(); // inicio do programa
    public int tempoX = 1100; 
    public int tempoY = 5;
    public int segundos = 0;

    public boolean vencedor = false;
    public boolean noob = false; // defeat

    public int iconeCoodCenterX = iconeCoodX + 35; //smileycenterX
    public int iconeCoodCenterY = iconeCoodY + 35;

    public boolean win = false; // resetter
    
    public int messageWin1 = 800;
    public int messageWin2 = -300;

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
                if(ale.nextInt(100) < 50){ // qtd of mines.
                    minas[i][j] = 1;
                }else{
                    minas[i][j] = 0;
                }
                show[i][j] = false;
            }

        }

        for(int i = 0; i < 16;  i++){
            for(int j = 0; j< 9; j++){
                lados = 0;
                for(int k = 0; k < 16; k++){
                    for(int z=0; z<9; z++){
                        if(!((k == i) && (z == j))){
                            if(getVisinhos(i,j,k,z) == true){
                                lados++;
                            }
                        }
                    }
                }
                visinhos[i][j] = lados;
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
                    // if(minas[i][j] == 1){
                    //     graph.setColor(Color.PINK);
                    // }
                    if(show[i][j] == true){
                        graph.setColor(Color.GRAY);
                        if(minas[i][j] == 1){
                            // se a mina existir vai mudar a cor para amarelo
                            graph.setColor(Color.YELLOW);
                        }
                    }
                    if( (coodX>=dist+i*80) && (coodX<i*80+80-dist)  && (coodY >= dist+j*80+106) && (coodY < j*80+186-dist)){
                        graph.setColor(Color.GREEN);
                    }
                    graph.fillRect(dist+i*80,dist+j*80+80,80-2*dist,80-2*dist);
                    if(show[i][j] == true){
                        graph.setColor(Color.RED);
                        if(minas[i][j] == 0 && visinhos[i][j] != 0){
                            // não possui minas, mostra o numero
                            if(visinhos[i][j] == 1){ // cores dos numeros baseado no jogo original.
                                graph.setColor(Color.BLUE);
                            }else if(visinhos[i][j] == 2){
                                graph.setColor(Color.GREEN);
                            }else if(visinhos[i][j] == 3){
                                graph.setColor(Color.RED);
                            }else if(visinhos[i][j] == 4){
                                graph.setColor(new Color(0,0,128));
                            }else if(visinhos[i][j] == 5){
                                graph.setColor(new Color(178,34,34));
                            }else if(visinhos[i][j] == 6){
                                graph.setColor(new Color(72,209,204));
                            }else if(visinhos[i][j] == 8){
                                graph.setColor(Color.DARK_GRAY); // BLACK BUT I CHANGED THE BACKGROUND
                            }
                            graph.setFont(new Font("Arial",Font.BOLD, 40));
                            graph.drawString(Integer.toString(visinhos[i][j]), i*80+27, j*80+80+55);
                        }else if(minas[i][j] == 1){
                            // possui minas, mostra a mina, jogo termina!
                            graph.fillRect(i*80+30, j*80+100, 20, 40);
                            graph.fillRect(i*80+20, j*80+110, 40, 20);
                            graph.fillRect(i*80+5+20, j*80+80+5+20, 30, 30);
                        }
                    }
                }
            }
            // desenho do icone
            graph.setColor(Color.YELLOW);
            graph.fillOval(iconeCoodX, iconeCoodY, 70, 70);
            graph.setColor(Color.BLACK);
            graph.fillOval(iconeCoodX+15, iconeCoodY+15, 10, 10);
            graph.fillOval(iconeCoodX+40, iconeCoodY+15, 10, 10);
            graph.fillRect(iconeCoodX+20, iconeCoodY+50, 30, 5);

            // temporizador
            graph.setColor(Color.BLACK);
            graph.fillRect(tempoX, tempoY, 140, 70); 
            if(noob == false && vencedor == false){
                segundos = (int)((new Date().getTime()-tempoIni.getTime())/1000); 
            }
            if(segundos > 999){
                segundos = 999;
            }
            graph.setColor(Color.white);
            if(vencedor == true){
                graph.setColor(Color.GREEN);
            }else if(noob == true){
                graph.setColor(Color.RED);
            }
            graph.setFont(new Font("Arial",Font.PLAIN,80));
            if(segundos < 10){
                graph.drawString("00"+Integer.toString(segundos),tempoX, tempoY+65);
            }else if(segundos < 100){
                graph.drawString("0"+Integer.toString(segundos),tempoX, tempoY+65);
            }else{
                graph.drawString(Integer.toString(segundos), tempoX, tempoY+65);
            }

            // mensagem
            

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

            coodX = e.getX();
            coodY = e.getY();

            if(clickBoxX() != -1 && clickBoxY() != -1){
                show[clickBoxX()][clickBoxY()] = true;
            }

            if(clickBoxX() != -1 && clickBoxY() != -1){
                System.out.println("Mouse is in [" + clickBoxX() + "," + clickBoxY() + "], Minas vizinhas: " + visinhos[clickBoxX()][clickBoxY()]);
            }
            
            // reset
            if(resetIcon() == true){
                reset();
            }
            
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

    // função para checar os visinhos |pXY = caixa principal | vXY = vizinos
    // vamos ver a diferença entre a caixa escolhida e seus vizinhos subtraindo os eixos
    public boolean getVisinhos(int pX, int pY, int vX, int vY){
        if( (pX - vX < 2) && (pX - vX > -2 ) && (pY - vY < 2) && (pY - vY > -2) && minas[vX][vY] == 1){
            return true;
        }else{
            return false;
        }
    }

    public void reset(){
        tempoIni = new Date();
        vencedor = false;
        noob = false;
        win = true;
        messageWin2 = -300;
        msg1 = "Winner!"; // deletar

        for(int i = 0; i < 16;i++){
            for(int j = 0; j < 9; j++){
                if(ale.nextInt(100) < 20){
                    minas[i][j] = 1;
                }else{
                    minas[i][j] = 0;
                }
                show[i][j] = false;                
                flags[i][j] = false;
            }
        }

        for(int i = 0; i< 16; i++){
            for(int j = 0; j < 9; j++){
                lados = 0;                
                for(int k = 0; k < 16; k++){
                    for(int z = 0; z < 9; z++){
                        if((k!= i) && (z != j)){
                            if(getVisinhos(i,j,k,z) == true){
                                lados++;
                            }
                        }
                    }
                    visinhos[i][j] = lados;
                }
            }
        }
        win = false;
    }

    public boolean resetIcon(){ // inSmiley

        tempoIni = new Date();

        int diffPixels = (int) Math.sqrt(Math.abs(coodX-iconeCoodCenterX) * Math.abs    (coodX-iconeCoodCenterX) + Math.abs(coodY-iconeCoodCenterY)*Math.abs(coodY - iconeCoodCenterY));
        if(diffPixels < 35){
            return true;
        }
        return false;
    }
    // run continualies in the main method for checking the results.
    public void winner(){ // checkvictorystatus
        for(int i = 0; i < 16; i++){
            for(int j = 0; j < 9; j++){
                if(show[i][j] == true && minas[i][j] == 1){
                    vencedor = false;
                    noob = true;
                    tempoFim = new Date();
                    System.out.println("Press F");
                }
            }
            if(pontosTotal() >= 144 - totalMinasFinal()){
                vencedor = true;
                // win = true;
                tempoFim = new Date();
            }
        }
    }

    public int totalMinasFinal(){ //totalMines
        int totalMinas = 0;

        for(int i = 0; i < 16; i++){
            for(int j = 0; j < 9; j++){
                if(minas[i][j] == 1){
                        totalMinas = totalMinas + 1;
                }
            }
        }
        return totalMinas;
    }

    public int pontosTotal(){ // totalBoxesRevelead
        int totalPontos = 0;
        for(int i = 0; i < 16;i++){
            for(int j = 0; j < 9; j++){
                if(show[i][j] == true){
                    totalPontos = totalPontos + 1;
                }

            }
        }
        return totalPontos;
    }

}

