# Game 1

## Logic

<br>

1) As we know, Minesweeper consists of a matrix of cells behind which several mines are hidden. And our goal is to find out all the cells that don’t carry the bombs. To make the matrix (or game field) we are going to use two 2D arrays- the first one will contain all the numbers and bombs, and the second one will contain only the data that is to be displayed on the screen.
2) The setup and placement of bombs will be done in a randomized fashion.
3) At each turn, the player/user will be prompted to enter the row and column number. The selected cell will get exposed and if there’s a bomb behind it, the game will be over. If not, the cell’s neighbors will be displayed on the screen, based on which the user can play his next chance.

<br>
<hr>

## Let’s Code!

### `Step 1`

- Let's begin with the creation of a 'MineSweeper' class and add the following main function to it.
- Along with the main function, let us also initialize two 2d arrays as explained in Logic point 1

~~~
import java.utl.*;

public class MineSweeper{
    private int[][] fieldVisible = new int[10][10];
    private int[][] fieldHidden = new int[10][10];

    public static void main(String[] args){
        MineSweeper M = new MineSweeper();
        M.startGame();
    }
}
~~~

- Every time we run the code, the main method will create an object belonging to the class `MineSweeper`.
- This class is going to contain methods and rules that will dictate the game.

<br>

### `Step 2`

- Now let's proceed by adding methods to the game.
- The first method that you can add is the `StartGame` method.

~~~
public void startGame(){
    System.out.println("\n\n================Welcome to Minesweeper ! ================\n");
    setupField(1);

    boolean flag = true;
    while(flag){
        displayVisible();
        flag = playMove();
        if(checkWin()){
            displayHidden();
            System.out.println("\n================You WON!!!================");
            break;
        }
    }
}
~~~

<br>

This method will:
- Display the entre-level game/introduction messages.
- Setup the minesweeper playfield.
- Run the game until the player wins/loses.
- Display final message

<br>

### `Step 3`

- The `SetupField` method is going to be used to set up mines in the play-field.
- Currently, i have set up 10 bombs in the field.
- As explained in logic point 2, we will choose random integers from 0-9 for the row and column values and place a bomb on each of those locations.

~~~
public void setupField(int diff){
    int var = 0;
    while(var!=10){
        Random random = new Random();
        int i = random.nextInt(10);
        int j = random.nextInt(10);
        //System.out.println("i: " + i + " j: " + j);
        fieldHidden[i][j] = 100;
        var++;
    }
    buildHidden();
}
~~~

- At the end of this method, we will call `buildHidden` which build the hidden matrix.

<br>

### `Step 4` 

<br>

- After the setting up of the mines, we will build our hidden matrix, consisting of the mine proximity neighbor numbers and the mines.

~~~
public void buildHidden(){
    for(int i = 0; i < 10; i++){
        for(int j = 0; j<10; j++){
            int count = 0;
            if(fieldHidden[i][j] != 100){
                if(i!=0){
                    if(fieldHidden[i-1][j]== 100){
                        count++;
                    }
                    if(j!=0){
                        if(fieldHidden[i-1][j-1]== 100){
                            count++;
                        }
                    }
                }
                if(i!=9){
                    if(fieldHidden[i+1][j]== 100){
                        cont++;
                    }
                    if(j!=9){
                        if(fieldHidden[i+1][j+1] == 100){
                            cont++;
                        }
                    }
                }
                if(j!=0){
                    if(fieldHidden[i][j-1] == 100){
                        cont++;
                    }
                    if(i!=9){
                        if(fieldHidden[i+1][j-1]== 100){
                            cont++;
                        }
                    }
                }
                if(j!=9){
                    if(fieldHidden[i][j+1]== 100){
                        cont++;
                    }
                    if(i!=0){
                        if(fieldHidden[i-1][j+1]== 100){
                            cont++;
                        }
                    }
                }
                fieldHidden[i][j] = cont;
            }
        }
    }
}
~~~

- The logic behind this is pretty simple.
- We will choose each cell and count the number of bombs present in all of its neighboring cells.
- This value will be saved in the hidden matrix cell.

<br>

### `Step 5`

<br>

- Looking back at Step 2, we can now complete the `displayVisible` method.
- The goal of this method is to display the current progress of the game to the player (after each move).

~~~
public void displayVisible(){
    System.out.println("\t");
    for(int i = 0; i < 10; i++){
        System.out.println(" " + i + " ");
    }
    System.out.println("\n");
    for(int i = 0; i < 10; i++){
        System.out.print(i + "\t| ");
        for(int j = 0; j < 10; j++){
            if(fieldVisible[i][j] == 0){
                System.out.println("?");
            }else if(fieldVisible[i][j] == 50){
                System.out.print(" ");
            }else{
                System.out.println(fieldVisible[i][j]);
            }
            System.out.println(" | ");
        }
        System.out.println("\n");
    }
}
~~~

<br>

### `Step 6`

<br> 

- The `playMove` method will allow the player to select a cell, and expose the selected cell and its neighbors.
- If the selected cell contains a mine, the 'Game Over' message will be displayed.
- This method will be called after each turn.

~~~
public boolean playMove(){}
~~~

<br>

### `Step 7`

<br>

- The next two functions: '`fixVisible`' and '`fixNeighbours`' will be useful to change our hidden and visible 2d arrays.

~~~
public void fixVisible(int i, int j){}

public void fixNeighbours(int i, int j){}
~~~

<br>

- Now for the second-last step, let's build the `checkWin` method.
- This method will be used to check if the player has evaded all the mines on the playfield.

~~~
public boolean checkWIn(){}
~~~

- It will return a boolean value back to the `startGame` function present in Step 2.

<br>

### `step 9`

<br> 

- Finally, let's build the `displayHidden` method. This method will be called wheneer a player loses or wins a game.

~~~
public void displayHidden(){}
~~~

- `displayHidden` wil display our hidden 2d array, which will be containing all the mines and mine-proximity neighbor numbers.
- Now, you can just save the file, compile the code, execute it and start playing.

[full code](https://github.com/SohamBhure/Minesweeper)

<br>

## Future Addition

<br>

- Although this game is playable, we can add multiple enhancements to improve the logic and the gaming experience. Here are a few suggestions:
1) Change the game field according to a difficulty level; the player can be prompted to input a difficulty level according to which the number of mines or the playfield sizze can be increased.
2) Improve the logic so as to improve the gaming experience. There can be a few changes made to increase the logical efficiency of the code. Find them out by playing the game and scrupulously going through the code!
3) Think of adding a UI. Currently, this game is to be played on the command line. You can add nice UI that improves the user experience.

<br>
Theses are just a few suggestions that are clearly noticeable. However, remember that the sky is the limit!






































