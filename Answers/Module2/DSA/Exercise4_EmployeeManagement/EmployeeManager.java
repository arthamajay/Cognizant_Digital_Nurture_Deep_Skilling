public class EmployeeManager {
    private Employee[] employees;
    private int count;

    public EmployeeManager(int capacity) {
        employees=new Employee[capacity];
        count=0;
    }

    public void addEmployee(Employee e) {
        if (count<employees.length) {
            employees[count]=e;
            count++;
            System.out.println("Added: "+e.name);
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }

    public Employee searchEmployee(int id) {
        for (int i=0; i<count; i++) {
            if (employees[i].employeeId==id) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        System.out.println("--- Employee List ---");
        for (int i=0; i<count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int id) {
        for (int i=0; i<count; i++) {
            if (employees[i].employeeId==id) {
                System.out.println("Deleted: "+employees[i].name);
                for (int j=i; j<count-1; j++) {
                    employees[j]=employees[j+1];
                }
                employees[count-1]=null;
                count--;
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        EmployeeManager manager=new EmployeeManager(10);
        manager.addEmployee(new Employee(1, "Alice", "Engineer", 85000));
        manager.addEmployee(new Employee(2, "Bob", "Manager", 95000));
        manager.addEmployee(new Employee(3, "Charlie", "Analyst", 70000));

        manager.traverseEmployees();

        System.out.println("\n--- Search Employee ID 2 ---");
        Employee found=manager.searchEmployee(2);
        System.out.println(found!=null ? found : "Not found");

        System.out.println("\n--- Delete Employee ID 1 ---");
        manager.deleteEmployee(1);
        manager.traverseEmployees();
    }
}
