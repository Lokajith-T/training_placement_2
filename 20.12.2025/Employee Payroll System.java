abstract class Employee {
    int id;
    String name;
    double basic;

    abstract double calculateSalary();

    void display() {
        System.out.println(id + " " + name + " Salary: " + calculateSalary());
    }
}

class PermanentEmployee extends Employee {
    double calculateSalary() {
        return basic + 2000;
    }
}

class ContractEmployee extends Employee {
    double calculateSalary() {
        return basic + 1000;
    }
}

class Payroll {
    public static void main(String[] args) {
        Employee e;

        e = new PermanentEmployee();
        e.id = 1;
        e.name = "Ravi";
        e.basic = 15000;
        e.display();

        e = new ContractEmployee();
        e.id = 2;
        e.name = "Anu";
        e.basic = 12000;
        e.display();
    }
}
