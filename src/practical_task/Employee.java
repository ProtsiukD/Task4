package practical_task;

/**
 * Created by prots on 27.04.2017.
 */
public class Employee {
    private String name;
    private int department;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int department, double salary) {
        setName(name);
        setDepartment(department);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static String checkDepartment(int department, Employee[] employees) {
        String tmp = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                tmp = "Need department " + employees[i].getDepartment() + ". It;s " + employees[i].getName();
            }
        }
        return tmp;
    }


    public static String sortPrint(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            for (int j = 0; j < employee.length; j++) {
                if (employee[i].salary > employee[j].salary) {
                    Employee tmp = employee[i];
                    employee[i] = employee[j];
                    tmp = employee[j];
                }
            }
        }
        String tmp1 = "";
        for (int i = 0; i < employee.length; i++) {
            String d = tmp1;
            tmp1 = d + '\n' + employee[i].getName() + " " + employee[i].getDepartment() + " " + employee[i].getSalary();
        }
        return tmp1;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Kler", 2, 400);
        Employee employee2 = new Employee("Kris", 7, 100.25);
        Employee employee3 = new Employee("Peers", 9, 240.67);
        Employee employee4 = new Employee("Karla", 4, 346.09);
        Employee employee5 = new Employee("Marco", 5, 237.65);
        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        System.out.println(checkDepartment(2, employees));
            System.out.println(sortPrint(employees));
    }
}