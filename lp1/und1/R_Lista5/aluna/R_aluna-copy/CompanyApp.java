import java.util.Scanner;
public class CompanyApp{
    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        int qtdEmp,ctl1=1;
        System.out.println("Type Employee's quantity:");
        qtdEmp = kb.nextInt();
        kb.nextLine();
        
        int registration, department;
        float salary;
        String name, role;
        
        PersonalSector ps = new PersonalSector(qtdEmp);
        // Employee emp = new Employee();
        
        while(ctl1 != 0){
            int ctl2;
            System.out.println("\n==== | Menu | ====");
            System.out.println("|1 - Add Employee| ");
            System.out.println("|2 - Show Payroll| ");
            System.out.println("|3 - Show Total Payroll| ");
            System.out.println("|4 - Show Major Winner| ");
            System.out.println("|5 - Show Employee's by Department| ");
            System.out.println("|6 - Show Employee's by Role| ");
            System.out.println("|7 - Show Employee's by Role (ord. by salary)| ");
            ctl2 = kb.nextInt();
            System.out.println("\n");
            switch(ctl2){
                case 1:
                    int qtd;
                    System.out.println("Quantity of Employee's to add: ");
                    qtd = kb.nextInt();
                    kb.nextLine();                    
                    for(int i = 0; i < qtd; i++){
                        Employee emp = new Employee();
                        emp.setEmployee();
                        ps.AddEmp(emp);
                    }
                    break;                    
                case 2:
                    ps.showPayroll();
                    break;
                case 3:
                    ps.showTotalPayroll();
                    break;
                case 4:
                    ps.ShowBiggerSal();
                    break;
                case 5:
                    int num;
                    System.out.println("Type the Department number: ");
                    num = kb.nextInt();
                    kb.nextLine();
                    ps.showDepEmp(num);
                    break;
                case 6:
                    kb.nextLine();
                    System.out.println("Type the Role's name: ");
                    role = kb.nextLine();
                    ps.showRoleEmp(role);
                    break;
                case 7:
                    ps.showPayrollOrd();
                    break;
                }
        }
    }
}