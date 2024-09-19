package assign2;

  class EmployeeRole {
    public String getRole() {
        return "Employee";
    }
}

class Manager extends EmployeeRole {
    @Override
    public String getRole() {
        return "Associate ";
    }
}

class Developer extends EmployeeRole {
    @Override
    public String getRole() {
        return "Developer";
    }
}

public class employee {
    public static void main(String[] args) {
        EmployeeRole emp1 = new Manager();
        EmployeeRole emp2 = new Developer();

        System.out.println(emp1.getRole());
        System.out.println(emp2.getRole());
    }
}