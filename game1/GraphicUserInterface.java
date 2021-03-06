// [1] 
import javax.swing.JFrame;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;

public class GraphicUserInterface extends JFrame{ //[2]

    public int dist = 5; // spacing
    public Random ale = new Random();
    public int coodX = -100; //mx
    public int coodY = -100; //my

    public int[][] minas = new int[16][9];
    public int qtdMinas = 20;
    public int[][] visinhos = new int [16][9];
    public boolean[][] show = new boolean[16][9];
    public boolean[][] flags = new boolean[16][9];

    public int lados = 0; // neighs

    //70x70
    public int iconeCoodX = 605; //smileyX
    public int iconeCoodY = 5; // smileyY

    public boolean icone1 = true; // happiness

    public Date tempoIni = new Date(); // inicio do programa
    public int tempoX = 1100; 
    public int tempoY = 5;
    public int segundos = 0;

    // variaveis para vencedores
    public boolean vencedor = false;
    public boolean noob = false; // defeat

    public int iconeCoodCenterX = iconeCoodX + 35; //smileycenterX
    public int iconeCoodCenterY = iconeCoodY + 35;

    public boolean win = false; // resetter

    // variaveis para mensagens
    public int messageCoodX = 700; //vicMesX
    // public int messageWin2 = -300; // vicMesY 
    public int messageCoodY = -50; // vicMesY
    public String msg1 = "Winner!"; // VicMes = mensagem
    

    public Date tempoFim; //endDate

    //butao de flag
    public boolean flag = false;
    public int flagCoodX = 445;
    public int flagCoodY = 5;
    public int flagCenterX = flagCoodX + 35;
    public int flagCenterY = flagCoodY + 35;
    public int flagRectX = 445;
    public int flagRectY = 10;
    
    // botões para aumentar ou diminuir o espaço entre as caixas
    // dimensoes para escrever ao lado dos botões
    public int distX = 90;
    public int distY = 10;
    public int dimSizeX = distX + 160; //  
    public int dimSizeY = distY;
    public int aumSizeX = distX + 240; //50 + 80
    public int aumSizeY = distY;


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
                if(ale.nextInt(100) < qtdMinas){ // qtd of mines.
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

            // tabuleiro
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

                    // flags nas minas do jogo
                    if(flags[i][j] == true){
                        graph.setColor(Color.BLACK);
                        graph.fillRect(i*80+32+5, j*80+80+15, 5, 40);
                        graph.fillRect(i*80+20+5, j*80+80+50, 30, 10);
                        graph.setColor(Color.RED);
                        graph.fillRect(i*80+16+5, j*80+80+15, 20, 15);
                        graph.setColor(Color.BLACK);
                        graph.drawRect(i*80+16+5, j*80+80+15, 20, 15);
                        graph.drawRect(i*80+17+5, j*80+80+16, 18, 13);
                        graph.drawRect(i*80+18+5, j*80+80+17, 16, 11);
                    }
                }
            }


            // desenho do icone
            // graph.setColor(Color.YELLOW);
            // graph.fillOval(iconeCoodX, iconeCoodY, 70, 70);
            // graph.setColor(Color.BLACK);
            // graph.fillOval(iconeCoodX+15, iconeCoodY+15, 10, 10);
            // graph.fillOval(iconeCoodX+40, iconeCoodY+15, 10, 10);
            // graph.fillRect(iconeCoodX+20, iconeCoodY+50, 30, 5);

            // desenho icone como retangulo e escrita do reset
            // graph.setColor(Color.WHITE);
            // graph.fillRect(iconeCoodX, iconeCoodY, 70, 70);            
            graph.setColor(Color.RED);
            graph.fillRect(iconeCoodX, iconeCoodY+5, 74, 60);
            graph.setColor(Color.WHITE);
            graph.fillRect(iconeCoodX+2, iconeCoodY+7, 70, 56);
            graph.setColor(Color.BLACK);
            graph.setFont(new Font("Arial", Font.PLAIN, 20));
            graph.drawString("Restart", iconeCoodX+5, iconeCoodY+40);


            // temporizador
            graph.setColor(Color.BLACK);

            graph.fillRect(tempoX, tempoY, 150, 70);

            if(noob == false && vencedor == false){
                segundos = (int)((new Date().getTime()-tempoIni.getTime())/1000); 
            }
            if(segundos > 999){
                segundos = 999;
            }

            graph.setColor(Color.WHITE);

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
            if(vencedor == true){
                graph.setColor(Color.GREEN);
                msg1 = "YOU WIN";
            }else if(noob == true){
                graph.setColor(Color.RED);
                msg1 = "NOOB!";
            }

            // mostra a mensagem relativo ao tempo passado.
            if(vencedor == true || noob == true){
                messageCoodY = -50 + ((int)(new Date().getTime() - tempoFim.getTime()) / 10);
                graph.setColor(Color.WHITE);
                if(vencedor == true && messageCoodY > 67){
                    messageCoodY = 67;
                }
                graph.setFont(new Font("Tahoma", Font.PLAIN, 70));
                graph.drawString(msg1, messageCoodX, messageCoodY);
            }

            // botão da flag
            
            if(flag == true){
                graph.setColor(Color.DARK_GRAY);
                graph.fillRect(flagRectX, flagRectY, 60, 60);
                
            }else{
                graph.setColor(Color.RED);
                graph.fillRect(flagRectX, flagRectY, 60, 60);
                graph.setColor(Color.WHITE);
                graph.fillRect(flagRectX+2, flagRectY+2, 56, 56);
            }
            graph.setColor(Color.BLACK);
            graph.fillRect(flagCoodX+32, flagCoodY+15, 5, 40);
            graph.fillRect(flagCoodX+20, flagCoodY+50, 30, 10);
            graph.setColor(Color.RED);
            graph.fillRect(flagCoodX+16, flagCoodY+15, 20, 15);
            graph.setColor(Color.BLACK);
            graph.drawRect(flagCoodX+16, flagCoodY+15, 20, 15);
            graph.drawRect(flagCoodX+17, flagCoodY+16, 18, 13);
            graph.drawRect(flagCoodX+18, flagCoodY+17, 16, 11);


            // com circulo
            // graph.setColor(Color.WHITE);
            // graph.drawOval(flagCoodX, flagCoodY, 70, 70);
            // graph.drawOval(flagCoodX+1, flagCoodY+1, 68, 68);
            // graph.drawOval(flagCoodX+2, flagCoodY+2, 66, 66);

            // botões para aumenta ou diminuir a distancia entre as caixas
            // BOTÃO DE MENOS
            graph.setColor(Color.WHITE);
            graph.fillRect(distX, distY, 300, 60);
            graph.setColor(Color.BLACK);
            graph.fillRect(dimSizeX+20, dimSizeY+5, 50, 50);
            // DESENHO DO SINAL DE MENOS
            graph.setColor(Color.RED);
            graph.fillRect(dimSizeX+35,dimSizeY+27,20,6);

            // texto
            graph.setColor(Color.BLACK);
            graph.setFont(new Font("Arial", Font.PLAIN,40));
            graph.drawString("Distância", distX+5, distY+45);

            // BOTAO DE MAIS
            graph.setColor(Color.WHITE);
            graph.fillRect(aumSizeX, aumSizeY, 60, 60);
            graph.setColor(Color.BLACK);
            graph.fillRect(aumSizeX+5, aumSizeY+5, 50, 50);

            // DESENHO SINAL DE MAIS
            graph.setColor(Color.RED);
            graph.fillRect(aumSizeX+20,aumSizeY+27,20,6);
            graph.fillRect(aumSizeX+27, aumSizeY+20, 6, 20);

            // numero do espaçamento
            if(dist < 10){
                graph.setColor(Color.WHITE);
                graph.drawString(Integer.toString(dist),aumSizeX+75,aumSizeY+45);
            }else{
                graph.setColor(Color.WHITE);
                graph.drawString(Integer.toString(dist),aumSizeX+65,aumSizeY+45);
            }

            // aula
            // graph.setColor(Color.WHITE);
            // graph.fillRect(distX, distY, 300, 60);

            // graph.setColor(Color.BLACK);
            // graph.fillRect(dimSizeX+5, dimSizeY+10, 50, 40);
            // graph.fillRect(aumSizeX+5, aumSizeY+10, 50, 40);
            // // texto
            // graph.setColor(Color.BLACK);
            // graph.setFont(new Font("Arial", Font.PLAIN,35));
            // graph.drawString("Distância", distX+20, distY+40);

            // graph.setColor(Color.RED);
            // graph.fillRect(dimSizeX+15, dimSizeY+27, 20, 6);
            // graph.fillRect(aumSizeX+15, aumSizeY+27, 20, 6);
            // graph.fillRect(aumSizeX+22, aumSizeY+20, 6, 20);
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

            if(
                (coodX >= dimSizeX+20) && 
                (coodX < dimSizeX+60) &&
                (coodY >= dimSizeY+20) && 
                (coodY < dimSizeY+60)
            ){
                dist--;
                if(dist < 1){
                    dist = 1;
                }
            }else if(
                (coodX >= aumSizeX+20) && 
                (coodX < aumSizeX+60) &&
                (coodY >= aumSizeY+20) && 
                (coodY < aumSizeY+60)
            ){
                dist++;
                if(dist > 15){
                    dist = 15;
                }
            }

            // not needed , uniu com a função abaixo
            // if(clickBoxX() != -1 && clickBoxY() != -1){
            //     show[clickBoxX()][clickBoxY()] = true;
            // }

            // not needed
            if(clickBoxX() != -1 && clickBoxY() != -1){
                System.out.println("Mouse is in [" + clickBoxX() + "," + clickBoxY() + "], Minas vizinhas: " + visinhos[clickBoxX()][clickBoxY()]);
                if(flag == true && show[clickBoxX()][clickBoxY()] == false){
                    if(flags[clickBoxX()][clickBoxY()] == false){
                        flags[clickBoxX()][clickBoxY()] = true;
                        // flag = false;
                    }else{
                        flags[clickBoxX()][clickBoxY()] = false;
                    }
                }else{
                    if(flags[clickBoxX()][clickBoxY()] == false){
                        show[clickBoxX()][clickBoxY()] = true;
                    }
                }
            }
            
            // reset
            if(resetIcon() == true){
                reset();
            }

            // flag click
            if(flagButton() == true){ 
                if(flag  == false){
                    flag = true;
                    System.out.println("flag true");
                }else{
                    flag = false;
                }
            }

            // // ativando aumentar e diminuir a distancia 
            // if((coodX >= dimSizeX + 20) && (coodX < dimSizeY+50) && (coodY >= dimSizeY + 20) && (coodY < dimSizeY+50) ){
            //     dist--;
            //     if(dist < 1){
            //         dist = 1;
            //     }
            //     System.out.println("diminuindo");
            // }

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

    public void reset(){ // resetALl
        tempoIni = new Date();
        vencedor = false;
        noob = false;
        win = true;
        messageCoodY = -300; // reseta para criar o movimento
        msg1 = "Winner!"; // deletar not needed
        flag = false;

        for(int i = 0; i < 16;i++){
            for(int j = 0; j < 9; j++){
                if(ale.nextInt(100) < qtdMinas){
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

        // bug no tempoo
        // tempoIni = new Date();

        // c^2 = a^2 + b^2
        int diffPixels = (int) Math.sqrt(Math.abs(coodX-iconeCoodCenterX) * Math.abs(coodX-iconeCoodCenterX) + Math.abs(coodY-iconeCoodCenterY)*Math.abs(coodY - iconeCoodCenterY));
        if(diffPixels < 35){
            return true;
        }
        return false;
    }

    public boolean flagButton(){
        int diffPixels = (int) Math.sqrt(Math.abs(coodX-flagCenterX) * Math.abs(coodX-flagCenterX) + Math.abs(coodY-flagCenterY)*Math.abs(coodY - flagCenterY));
        if(diffPixels < 35){
            return true;
        }
        return false;
    }

    // metodos para vitoria
    // run continualies in the main method for checking the results.

    public void winner(){ // checkvictorystatus
        // loop para checar cada caixa e se ela tem minas
        if(noob == false){
            for(int i = 0; i < 16; i++){
                for(int j = 0; j < 9; j++){
                    if(show[i][j] == true && minas[i][j] == 1){
                        vencedor = false;
                        noob = true;
                        tempoFim = new Date();
                        System.out.println("Press F");
                    }
                }
            }
        }
        if(pontosTotal() >= 144 - totalMinasFinal() && vencedor == false){
            vencedor = true;
            // win = true;
            tempoFim = new Date();
            System.out.println("Ganhoo!");
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

