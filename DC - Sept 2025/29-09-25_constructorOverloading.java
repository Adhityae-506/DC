// Example Input/Output 1:
// Input:

// text
// Hector
// Arun ECE
// Catherine CSE 25000
// Output:

// text
// Name: Hector
// Department: N/A
// Salary: 10000
// Name: Arun
// Department: ECE
// Salary: 15000
// Name: Catherine
// Department: CSE
// Salary: 25000
// Example Input/Output 2:
// Input:

// text
// Rachel
// Babloo Physics
// Pavithra EEE 30000
// Output:

// text
// Name: Rachel
// Department: N/A
// Salary: 10000
// Name: Babloo
// Department: Physics
// Salary: 15000
// Name: Pavithra
// Department: EEE
// Salary: 30000

import java.util.Scanner;

class Professor {
    private String name;
    private String department;
    private int salary;

    public Professor(String name) {
        this.name = name;
        this.department = "N/A";
        this.salary = 10000;
    }

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
        this.salary = 15000;
    }

    public Professor(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Professor prof1 = new Professor(sc.nextLine().trim());
        Professor prof2 = new Professor(sc.next(), sc.nextLine().trim());
        Professor prof3 = new Professor(sc.next(), sc.next(), sc.nextInt());

        display(prof1);
        display(prof2);
        display(prof3);
    }

    private static void display(Professor prof) {
        System.out.println("Name: " + prof.getName());
        System.out.println("Department: " + prof.getDept());
        System.out.println("Salary: " + prof.getSalary());
    }
}
