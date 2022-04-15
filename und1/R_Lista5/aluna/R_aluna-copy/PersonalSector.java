import java.util.Scanner;
import java.util.Arrays;
public class PersonalSector{
    // instance variables - replace the example below with your own
    private int index;
    private Employee[] vetPS;
    
    Scanner kb = new Scanner(System.in);
    
    // Constructor for objects of class PersonalSector

    public PersonalSector(int numEmp){
        this.vetPS = new Employee[numEmp];
        this.index = 0;        
    }
    public void AddEmp(Employee emp){
        vetPS[getIndex()] = emp;
        index++;
    }
    public void showPayroll(){
        
        for(int i = 0; i < index; i++){
            System.out.println("Nome: " + vetPS[i].getName() + "\nSalary: R$" + vetPS[i].getSalary());
        }
    }
    public void showTotalPayroll(){
        float total = 0;
        for(int i = 0; i < index; i++){
            total = total + vetPS[i].getSalary();
        }
        System.out.println("Total Payroll = R$" + total);
    }
    public void ShowBiggerSal(){
        float bgSal = 0;
        String name = "";
        for(int i = 0; i < index; i++){
            if(vetPS[i].getSalary() > bgSal){
                bgSal = vetPS[i].getSalary();
                name = vetPS[i].getName();
            }
        }
        System.out.println("Name: " + name + "\nSalary: R$" + bgSal);
    }
    public void showDepEmp(int num){
        for(int i = 0; i < index; i++){
            if(vetPS[i].getDepartment() == num){
                System.out.println("Name: " + vetPS[i].getName() + "\nRole: " + vetPS[i].getRole());
            }
        }
        
    }
    public void showRoleEmp(String rol){
        
        for(int i = 0; i < index ; i++){
            if(vetPS[i].getRole() == rol){
                System.out.println("Name: " + vetPS[i].getName());
            }
        }
    }
    public void showPayrollOrd(){
        Employee[] vetAux = this.vetPS; // perguntar ao professor sobre esse uso do this;
        for(int i = 0; i < index; i++){
            for(int j = 0; j < index; j++){
                if(vetAux[i].getSalary() < vetAux[j].getSalary()){
                    Employee temp = vetAux[i];
                    vetAux[i] = vetAux[j];
                    vetAux[j] = temp;
                }
            }
        }
        for(int i = 0; i < index; i++){
            System.out.println("Name: " + vetPS[i].getName() + "\nSalary: R$" + vetPS[i].getSalary());
        }
    }
    public void setIndex(int ind){
        this.index = ind;
    }
    public int getIndex(){
        return index;
    }
}
