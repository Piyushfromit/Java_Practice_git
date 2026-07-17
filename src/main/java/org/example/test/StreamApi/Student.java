package org.example.test.StreamApi;


import java.util.List;


public class Student {

    private long id;
    private long roll;
    private String firstName;
    private  String lastName;
    private long year;
    private List<String> phones;
    private Address address;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRoll() {
        return roll;
    }

    public void setRoll(long roll) {
        this.roll = roll;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }



    public Student(long id, long roll, String firstName, String lastName, long year, List<String> phones, Address address) {
        this.id = id;
        this.roll = roll;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.phones = phones;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", roll=" + roll +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", phones=" + phones +
                ", address=" + address +
                '}';
    }
}
