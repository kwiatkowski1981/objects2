public class Company {
    public static void main(String[] args) {

        Employee employee1 = new Employee ();
        employee1.name = "John";
        employee1.lastname = "Smith";
        employee1.yearOfBirth = 1978;
        employee1.gender = "male";

        Employee employee2 = new Employee ();
        employee2.name = "Xena";
        employee2.lastname = "Makapaca";
        employee2.yearOfBirth = 1985;
        employee2.gender = "female";
        String employee2Info = employee2.gender + ", " + employee2.name + ", " + employee2.lastname + ", " +
                employee2.yearOfBirth;


        Employee employee3 = new Employee ();
        employee3.name = "Mick";
        employee3.lastname = "Simons";
        employee3.yearOfBirth = 1974;
        employee3.gender = "male";


        System.out.println(employee1.gender);
        System.out.println(employee1.name);
        System.out.println(employee1.lastname);
        System.out.println(employee1.yearOfBirth);

        System.out.println(employee2Info);

        System.out.println(employee3.gender);
        System.out.println(employee3.yearOfBirth);
        System.out.println(employee3.lastname);
        System.out.println(employee3.name);


    }
}
