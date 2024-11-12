package nlhdang.exercise3;
import java.util.*;
import java.util.regex.*;

public class ContactManager {

    private List<Contact> contactList = new ArrayList<>();
    private int nextId = 1;

    // Hàm thêm liên hệ
    public boolean addContact(String fullName, String group, String address, String phone) {
        if (!isValidPhoneNumber(phone)) {
            System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại.");
            return false;
        }

        Contact newContact = new Contact(nextId++, fullName, group, address, phone);
        contactList.add(newContact);
        System.out.println("Liên hệ đã được thêm thành công.");
        return true;
    }

    // Kiểm tra định dạng số điện thoại hợp lệ
    public boolean isValidPhoneNumber(String phone) {
        String regex = "^(\\d{10}|\\d{3}[-. ]?\\d{3}[-. ]?\\d{4}|\\(\\d{3}\\)[-. ]?\\d{3}[-. ]?\\d{4}|\\d{3}[-. ]?\\d{3}[-. ]?\\d{4}\\s?x?\\d{1,4}|\\d{3}[-. ]?\\d{3}[-. ]?\\d{4}\\s?ext?\\d{1,4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public void displayAll() {
        if (contactList.isEmpty()) {
            System.out.println("Danh bạ rỗng.");
        } else {
            System.out.println("ID\tName\tFirst Name\tLast Name\tGroup\tAddress\tPhone");
            for (Contact contact : contactList) {
                System.out.println(contact);
            }
        }
    }

    public boolean deleteContact(int id) {
        Contact contactToDelete = null;
        for (Contact contact : contactList) {
            if (contact.id == id) {
                contactToDelete = contact;
                break;
            }
        }

        if (contactToDelete != null) {
            contactList.remove(contactToDelete);
            System.out.println("Liên hệ đã được xóa.");
            return true;
        } else {
            System.out.println("Không tìm thấy liên hệ với ID = " + id);
            return false;
        }
    }
}
