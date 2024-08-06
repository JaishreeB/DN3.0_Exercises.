public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        // Add employees
        ems.addEmployee(new Employee(1, "Alice", "Manager", 80000));
        ems.addEmployee(new Employee(2, "Bob", "Developer", 60000));
        ems.addEmployee(new Employee(3, "Charlie", "Analyst", 50000));

        // Traverse employees
        System.out.println("Employees:");
        ems.traverseEmployees();

        // Search for an employee
        Employee emp = ems.searchEmployee(2);
        if (emp != null) {
            System.out.println("Found Employee: " + emp);
        } else {
            System.out.println("Employee not found.");
        }

        // Delete an employee
        ems.deleteEmployee(2);
        System.out.println("After deletion:");
        ems.traverseEmployees();
    }
}
