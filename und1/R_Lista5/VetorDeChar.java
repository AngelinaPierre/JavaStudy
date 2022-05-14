
/**
5.	Escreva uma classe chamada “VetorDeChar” que tenha como atributo um vetor de char e um construtor que receba como parâmetro uma frase.
 No construtor deve ser passada a frase para o vetor de char. 
Dica: Use o método “toCharArray” da classe String para colocar os elementos da frase no vetor.  
Exemplo: char vetor[] = frase.toCharArray();
Acrescente os seguintes métodos a classe:
a.	um método que retorne o número de vogais existentes na frase.
b.	um método que retorne o número palavras iguais na frase.
*/

public class VetorDeChar
{
    char[] vet;
    int tamanho;
        
    public VetorDeChar(String frase)
    {
        vet = frase.toCharArray();
        tamanho=frase.length();
    }   

    public int getVogais()
    {
        int i, cont=0;
        for (i=0; i < tamanho; i++)
        {
             if ((vet[i] == 'a') || (vet[i] == 'e') || (vet[i] == 'i') || (vet[i] == 'o') || (vet[i] == 'u') ||
                (vet[i] == 'A') || (vet[i] == 'E') || (vet[i] == 'I') || (vet[i] == 'O') || (vet[i] == 'U')) 
             {
                  cont++;
             }
        }
        return cont;
    }
    
    public String getPalavra(int z)
    {
        String palavra="";
        while ((z < tamanho) && (vet[z] != ' '))
        {
            palavra += vet[z];
            z++;
        }
        if (!palavra.equals(""))
           return palavra;
        else
           return " ";
    }    
    
    public int getPalavrasIguais()
    {
        int cont=0, x=0, i=0, tamanhoPalavra=0, t=0;
        String palavra1="", palavra2="";
        char[] vetAux = new char[vet.length];
        for (x=0;x < vet.length; x++)
        {
            vetAux[x]=vet[i];
        }    
        while (i < tamanho)
        {
            palavra1= getPalavra(i);
            if (!palavra1.equals(' '))
            {
               x= i + palavra1.length();
               while (x < tamanho)
               {
                  palavra2 = getPalavra(x);
                                  
                  if ((palavra1.equals(palavra2)) && (!palavra2.equals(" ")))
                  {
                     cont++;
                     tamanhoPalavra = palavra1.length();
                     t=x;
                     while ((t < (x+tamanhoPalavra)) && (t < vetAux.length))
                     {
                        vetAux[t]=' ';
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
         