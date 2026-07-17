package org.example.test.StreamApi;




public class Address {


    private long id;
    private String state;
    private String district;
    private String street;
    private String pincode;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }


    public Address(long id, String state, String district, String street, String pincode) {
        this.id = id;
        this.state = state;
        this.district = district;
        this.street = street;
        this.pincode = pincode;
    }
}
