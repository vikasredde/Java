import java.util.*;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " (ID:" + id + ", Salary:" + (int)salary + ")";
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return super.name + " (ID:" + super.id + ", Salary:" + (int)super.salary + ", Dept:" + department + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        while (true) {
            String line = sc.nextLine().trim();
            if (line.equals("Q")) {
                break;
            }

            String[] parts = line.split("\\s+");
            if (parts.length < 4) continue;

            String type = parts[0];
            String name = parts[1];
            int id = Integer.parseInt(parts[2]);
            double salary = Double.parseDouble(parts[3]);

            if (type.equals("E")) {
                employees.add(new Employee(name, id, salary));
            } else if (type.equals("M")) {
                if (parts.length >= 5) {
                    String dept = parts[4];
                    employees.add(new Manager(name, id, salary, dept));
                }
            }
        }

        // Sort by salary descending
        employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

        // Print result
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        sc.close();
    }
}