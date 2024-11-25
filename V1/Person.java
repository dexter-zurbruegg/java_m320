public class Person {
    private String name;
    private String birthday;
    private String address;

    // Constructor
    public Person(String name, String birthday, String address) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getAddress() {
        return this.address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Override toString for easier display
    @Override
    public String toString() {
        return "Name: " + name + ", Birthday: " + birthday + ", Address: " + address;
    }
}
