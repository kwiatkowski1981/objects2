public class Company {
    public static void main(String[] args) {





        int maxEmployees = 100;
        int currentEmployees = 0;

        Employee[] employees = new Employee[maxEmployees];

        employees[0] = new Employee ("marian", "Durny", "mężczyzna", 1976);
        employees[0].printInfo();
    }
}
