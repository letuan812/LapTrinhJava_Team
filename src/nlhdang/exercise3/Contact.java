package nlhdang.exercise3;

public class Contact {
    int id;
    String fullName;
    String firstName;
    String lastName;
    String group;
    String address;
    String phone;

    public Contact(int id, String fullName, String group, String address, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.group = group;
        this.address = address;
        this.phone = phone;

        String[] nameParts = fullName.split(" ", 2);
        this.firstName = nameParts[0];
        this.lastName = (nameParts.length > 1) ? nameParts[1] : "";
    }

    @Override
    public String toString() {
        return String.format("%d\t%s\t%s\t%s\t%s\t%s\t%s", id, fullName, firstName, lastName, group, address, phone);
    }
}
