package Exercise2;

//Implement the Lecturer class. It should extend the Person class.
//        Implementation should meet the below criteria: two fields: specialization, salary
//        two-arguments constructor: specialization, salary
//        getter methods which will be responsible for returning declared fields
//        setter methods which will be responsible for setting declared fields
//        toString method which should return details information about a lecturer
//        Please provide an example usage of above implementation


public class Lecturer extends Person {

    private String specialization;
    private double salary;

    public Lecturer(String specialization, double salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
