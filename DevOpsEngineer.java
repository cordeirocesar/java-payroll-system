public class DevOpsEngineer extends Employee {

    @Override
    double calculateSalary() {
        return getSalary() * 1.10;
    }

    @Override
    String role() {
        return "DevOps Engineer";
    }
}
