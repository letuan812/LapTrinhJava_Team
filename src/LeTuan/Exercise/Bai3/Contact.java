package LeTuan.Exercise.Bai3;

public class Contact {
    private int id;
    private String fullName;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String group;

    public Contact(int id, String fullName, String phone, String address, String group) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
        this.group = group;

        String[] splitName = fullName.split(" ", 2);

        this.firstName = splitName[0].toUpperCase();
        this.lastName = splitName[1].toUpperCase();

        //this.firstName =
    }

    @Override
    public String toString() {
        return String.format("ID: %d, First Name: %s, Last Name: %s,  Phone: %s, Address: %s, Group: %s",
                id, firstName, lastName, phone, address, group);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


}
