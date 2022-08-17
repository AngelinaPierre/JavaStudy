public class VetorDeChar{
    // declaração de variaveis
    char[] vet;
    int tamanho;
    
    // construtor
    public VetorDeChar(String frase){
        // colocando elementos da frase no vetor
        vet = frase.toCharArray();
        // verificando o tamanho do vetor
        tamanho = frase.length();
    }
    public int getVogais(){
        int cont=0;
        for(int i = 0; i < tamanho; i++){
            if((vet[i] =='a') || (vet[i] =='e') || (vet[i] =='i') || (vet[i] =='o') || (vet[i] =='u') || (vet[i] =='A') || (vet[i] =='E') || (vet[i] =='I') || (vet[i] =='O') || (vet[i] =='U')){
                cont++;
            }
        }
        return cont;
    }
    
    public String getPalavra(int z){
        String palavra="";
        while((z < tamanho) && (vet[z] != ' ')){
            palavra += vet[z];
            z++;
        }
        if(!palavra.equals("") ){
            return palavra;
        }else{
            return " ";
        }
    }
    
    public int getPalavrasIguais(){
        int cont=0, tamanhoPalavra=0, i=0,x=0, t=0;
        String palavra1="", palavra2="";
        // atribuindo o memso tamanho ao vetor auxiliar
        char[] vetAux = new char[vet.length];
        for(x=0; x< vet.length; x++){
            vetAux[x] = vet[i];
        }
        while(i < tamanho){
            palavra1 = getPalavra(i);
            if(!palavra1.equals(' ')){
                x = i + palavra1.length();
                while(x < tamanho){
                    palavra2 = getPalavra(x);
                    if((palavra1.equals(palavra2)) && (!palavra2.equals(" "))){
                        cont++;
                        tamanhoPalavra = palavra1.length();
                        t=x;
                        while((t < ( x + tamanhoPalavra)) && ( t < vetAux.length)){
                            vetAux[t] = ' ';
                            t++;
                        }
                    }
                    x = x + palavra2.length();
                }
            }
            i = i + palavra1.length();
        }
        return cont;
    }
}