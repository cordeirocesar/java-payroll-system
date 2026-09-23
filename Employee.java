public abstract class Employee extends Person {

    private double salary;

    public Employee() {
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract double calculateSalary();

    void showInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Role: " + role());
        System.out.println("Basic Salary: " + getSalary());
        System.out.println("Total Earnings: " + calculateSalary());
        System.out.println("-------------------------------");
    }

    abstract String role();
}
