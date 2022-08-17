import java.util.Scanner;
public class Employee{
    // instance variables - replace the example below with your own
    private int registration, department;
    private float salary;
    private String name, role;

    Scanner kb = new Scanner(System.in);
 
    // Constructor for objects of class Employee

    public Employee(int reg,int d, float s, String n, String rol){
        // initialise instance variables
        this.registration = reg;
        this.department = d;
        this.salary = s;
        this.name = n;
        this.role = rol;
    }
    public Employee(){
    }
    public void showEmployee(){
        System.out.println(getName());
    }
    // setters and getters
    public void setRegistration(int reg){
        this.registration = reg;
    }
    public void setDepartment(int d){
        this.department = d;
    }
    public void setSalary(float s){
        this.salary = s;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setRole(String rol){
        this.role = rol;
    }
    public int getRegistration(){
        return registration;
    }
    public int getDepartment(){
        return department;
    }
    public float getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String getRole(){
        return role;
    }
    public void  setEmployee(){
        System.out.println("Registration: ");
        setRegistration(kb.nextInt());
        System.out.println("Department: ");
        setDepartment(kb.nextInt());
        kb.nextLine();
        System.out.println("Name: ");
        setName(kb.nextLine());
        System.out.println("Salary: ");
        setSalary(kb.nextFloat());
        kb.nextLine();
        System.out.println("Role: ");
        setRole(kb.nextLine());
    }
}
