import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main(String[] args) {

        Employee developer = new Developer();
        developer.setName("Francesco Totti");
        developer.setEmail("francesco@developer.it");
        developer.setSalary(8000);


        Employee productManager = new ProductManager();
        productManager.setName("Giulia Tofana");
        productManager.setEmail("giuliatofana@productmanager.it");
        productManager.setSalary(10000);

        Employee devOpsEngineer = new DevOpsEngineer();
        devOpsEngineer.setName("Andrea Pirlo");
        devOpsEngineer.setEmail("andreapirlo@devopsengineer.it");
        devOpsEngineer.setSalary(9000);

        List<Employee> employees = new ArrayList<>();
        employees.add(developer);
        employees.add(productManager);
        employees.add(devOpsEngineer);
    }
}
