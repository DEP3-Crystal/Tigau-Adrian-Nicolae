package Exercise2;

//Implement the Person abstract class. It should contain:
//        two String fields: name , address non-arguments constructor which will set name , address fields as empty strings
//        two-arguments constructor: String name , String address
//        getter methods which will be responsible for returning name , address
//        fields values
//        setter methods which will be responsible for setting name , address fields
//        values
//        toString method which should return string in the following format: ?->? ,
//        where ? is the name and address value accordingly


public abstract class Person {

    String name;
    String address;


    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%s->%s", name, address);
    }
}
