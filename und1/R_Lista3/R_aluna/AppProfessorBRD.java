import java.io.*;

public class AppProfessorBRD{
    public static void main(String args[]) throws java.io.IOException{
        // criação objeto do teclado
        String nome, departamento, aux;
        byte dia,mes;
        short ano;
        int numeroRegistro;
        
        ProfessorData objProf1 = null, objProf2 = null, objProf3 = null;
        
        BufferedReader objTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        // laço para entrada de dados do professor
        for(int i = 1; i <=3; i++){
            System.out.println("***** Informe os dados do Professor "+ i +" ******");
            System.out.println("Digite o Nome : ");
            nome = objTeclado.readLine();
            System.out.println("Digite o Departamento : ");
            departamento = objTeclado.readLine();
            System.out.println("Digite Numero de registro : ");
            aux = objTeclado.readLine();
            numeroRegistro = Integer.valueOf(aux).intValue();
            System.out.println("Digite Dia da admissão : ");
            aux = objTeclado.readLine();
            dia = Byte.valueOf(aux).byteValue();
            System.out.println("Digite Mes da admissão : ");
            aux = objTeclado.readLine();
            mes = Byte.valueOf(aux).byteValue();
            System.out.println("Digite Ano da admissão : ");
            aux = objTeclado.readLine();
            ano = Short.valueOf(aux).shortValue();
            
            // criação de um objeto do tipo data, para add os valores da adimissao
            Data admissao = new Data(dia,mes,ano);
            // criando os objetos dos professores passando os dados coletados pelo teclado.
            if(i == 1){
                objProf1 = new ProfessorData(nome, departamento, admissao, numeroRegistro);
            }else if(i == 2){
                objProf2 = new ProfessorData(nome, departamento, admissao, numeroRegistro);
            }else if(i == 3){
                objProf3 = new ProfessorData(nome, departamento, admissao, numeroRegistro);
            }
            
        }
        System.out.println("*********** Dados do prof. 1 ****************");
        objProf1.showData();
        System.out.println("*********** Dados do prof. 2 ****************");
        objProf2.showData();
        System.out.println("*********** Dados do prof. 3 ****************");
        objProf3.showData();
    }
}