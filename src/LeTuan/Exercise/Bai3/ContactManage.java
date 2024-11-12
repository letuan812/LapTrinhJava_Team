package LeTuan.Exercise.Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactManage {
    public int newID = 1;
    List<Contact> contactList = new ArrayList<>();

    public boolean addContact(String fullName, String phone, String address, String group) {
        if (!checkPhoneNumber(phone)) {
            System.out.println("Sai dinh dnag so dien thoai");

            return false;
        }

        Contact contact = new Contact(newID++, fullName, phone, address, group);
        contactList.add(contact);
        System.out.println("Them thanh cong.");
        return true;
    }

    public Contact addContact2(String fullName, String phone, String address, String group) {

        if (!checkPhoneNumber(phone)) {
            System.out.println("Sai dinh dnag so dien thoai");

            return null;
        }

        Contact contact = new Contact(newID++, fullName, phone, address, group);

        System.out.println("Them thanh cong.");
        return contact;
    }

    public void hienThiThongTin() {
        if (contactList.isEmpty()) {
            System.out.println("Danh sach rong");
        } else {
            System.out.println("ID\tName\tFirst Name\tLast Name\tGroup\tAddress\tPhone");
            for (Contact ct : contactList) {
                System.out.println(ct); //Gọi hàm toString da Overie
            }
        }
    }

    public void hienThiThongTin(List<Contact> contactList1) {
        if (contactList1.isEmpty()) {
            System.out.println("Danh sach rong");
        } else {
            System.out.println("ID\tName\tFirst Name\tLast Name\tGroup\tAddress\tPhone");
            for (Contact ct : contactList1) {
                System.out.println(ct); //Gọi hàm toString da Overie
            }
        }
    }

    public void deleteContact(int id) {
        Contact contactDel = null;
        for (Contact ct : contactList) {
            if (ct.getId() == id) {
                contactDel = ct;
                break;
            }
        }
        if (contactDel == null) {

            System.out.println("Khong tim thay ID " + id);
            return;
        }
        contactList.remove(contactDel);
        System.out.print("Xoa thanh cong: " + contactDel);
    }

    public boolean checkPhoneNumber(String phone) {

        String regex = "^(\\d{10}|\\d{3}[-. ]?\\d{3}[-. ]?\\d{4}|\\(\\d{3}\\)[-. ]?\\d{3}[-. ]?\\d{4}|\\d{3}[-. ]?\\d{3}[-. ]?\\d{4}\\s?x?\\d{1,4}|\\d{3}[-. ]?\\d{3}[-. ]?\\d{4}\\s?ext?\\d{1,4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();

    }


}
