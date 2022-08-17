public class CharVector
{
    private char[] vetchar;
    //Constructor for objects of class CharVector
    public CharVector(String frase)
    {
        this.vetchar = frase.toCharArray();
    }
    // An example of a method - replace this comment with your own
    public void showCharVector(){
        for(int i = 0; i< vetchar.length; i++){
            System.out.println(vetchar[i]);
        }
    }
    public int vogals(String frase){
        int contVogals = 0;
        frase.toLowerCase();
        for(int i = 0; i< frase.length(); i++){
            char charac = frase.charAt(i);
            if(charac == 'a' || charac=='e' || charac=='i' || charac=='o' || charac=='u'){
                contVogals++;
            }
        }
        return contVogals;
    }
    //aplicação teste.
    public static void main(String args[]){
        String frase = "test String to charVector";
        int qtd;
        CharVector charvet = new CharVector(frase);
        charvet.showCharVector();     
        qtd = charvet.vogals(frase);
        System.out.println("Qtd Vogals = " + qtd);
    }
}

