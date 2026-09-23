public class Developer extends Employee {

    @Override
    double calculateSalary() {
        return getSalary() * 1.15;
    }

    @Override
    String role() {
        return "Developer";
    }
}
