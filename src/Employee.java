public class Employee {
        String name;
        String lastName;
        String gender;
        int yearOfBirth;

      public  Employee(String name, String lastName, String gender, int yearOfBirth) {

                this.name = name;
                this.lastName = lastName;
                this.gender = gender;
                this.yearOfBirth = yearOfBirth;
        }

        void printInfo() {

                String info = ("Imię:" + " " + getName()+ "\n" + "Nazwisko:"  + " " + getLastName() + "\n"
                        + "Płeć:"  + " " + getGender() + "\n" +  "Data urodzenia:"  + " " + getYearOfBirth());
                System.out.println(info);
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getGender() {
                return gender;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public int getYearOfBirth() {
                return yearOfBirth;
        }

        public void setYearOfBirth(int yearOfBirth) {
                this.yearOfBirth = yearOfBirth;
        }


}



