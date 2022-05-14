import java.io.*;

import javax.swing.ToolTipManager;

public class criaFuncionario{
    public static void main(String[] args) throws java.io.IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String kbAux;

        String cgc, nome;
        int qtd, idade, indVota=0, indNaoVota=0, indFacultativo=0;
        Empresa objEmp;
        Pessoa objPessoa;
        Pessoa vota[], naoVota[], facultativo[];
        System.out.println("Informe o CGC da empresa: ");
        cgc = kb.readLine();
        System.out.println("Informe a quantidade de funcionários da empresa:");
        kbAux = kb.readLine();
        qtd = Integer.valueOf(kbAux).intValue();
        objEmp = new Empresa(cgc, qtd);
        vota = new Pessoa[qtd];
        naoVota = new Pessoa[qtd];
        facultativo = new Pessoa[qtd];
        for(int i = 0; i < qtd; i++){
            System.out.println("Informe o nome do funcionário: ");
            nome = kb.readLine();
            System.out.println("Informe a idade do funcionário: ");
            kbAux = kb.readLine();
            idade = Integer.valueOf(kbAux).intValue();
            objPessoa = new Pessoa(nome, idade);
            objEmp.funcionario[i] = objPessoa;
            objEmp.calculoDeVotantes(objPessoa);
        }
        for(int i = 0; i < qtd; i++){
            if(objEmp.funcionario[i].situacao == "Não Vota"){
                naoVota[indNaoVota] = objEmp.funcionario[i];
                indNaoVota++;
            }else if(objEmp.funcionario[i].situacao == "Voto Obrigatório"){
                vota[indVota] = objEmp.funcionario[i];
                indVota++;
            }else{
                facultativo[indFacultativo] = objEmp.funcionario[i];
                indFacultativo++;
            }
        }
        System.out.println("Voto Obrigatório");
        for(int i = 0; i < indVota; i++){
            System.out.println("Nome = " + vota[i].nome + "Idade = "+ vota[i].idade);
        }
        System.out.println("Voto Facultativo");
        for(int i = 0; i < indFacultativo; i++){
            System.out.println("Nome = " + facultativo[i].nome + "Idade = "+ facultativo[i].idade);
        }
        System.out.println("Não Votam");
        for(int i = 0; i < indNaoVota; i++){
            System.out.println("Nome = "+naoVota[i].nome+ " Idade = "+naoVota[i].idade);
        }
    }
}