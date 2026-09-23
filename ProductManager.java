public class ProductManager extends Employee {

    @Override
    double calculateSalary() {
        return getSalary() * 1.20;
    }

    @Override
    String role() {
        return "Product Manager";
    }
}
