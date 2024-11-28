package baitap3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactManage {
    List<Contact> contactList = new ArrayList<>();
    public int newid=1;
    public boolean addContact(String hoten,String sdt,String diachi,String nhom){
        if (!checkPhoneNumber(sdt)){
            System.out.println("Sai dinh dang sdt");
            return false;
        }
        Contact contact= new Contact(newid++, hoten ,sdt ,diachi, nhom);
        contactList.add(contact);
        System.out.println("Them thanh cong");
        return true;
    }
    public Contact addContact2(String hoten, String sdt, String diachi, String nhom) {
        if (!checkPhoneNumber(sdt)) {
            System.out.println("Sai dinh dnag so dien thoai");
            return null;
        }
        Contact contact = new Contact(newid++,hoten, sdt, diachi, nhom);
        System.out.println("Them thanh cong.");
        return contact;
    }

    public void hienthithongtin(){
        if(contactList.isEmpty()){
            System.out.println("Danh sach rong");
        }
        else {
            System.out.println("ID\tName\tFirst Name\tLast Name\tGroup\tAddress\tPhone");
            for (Contact ct : contactList) {
                System.out.println(ct);// gọi hàm toString da Overise
            }
        }
    }
    public void deleteContact(int id){
        Contact contactDel=null;
        for(Contact ct: contactList){
            if(ct.getid()==id){
                contactDel=ct;
                break;
            }
        }
        if (contactDel == null){
            System.out.println("Khong tim thay ID " + id);
            return;
        }
        contactList.remove(contactDel);
        System.out.println("Xoa thanh cong: " + contactDel);
    }
    public boolean checkPhoneNumber(String sdt){
        String regex = "^(\\d{10}|\\d{3}[-. ]?\\d{3}[-. ]?\\d{4}|\\(\\d{3}\\)[-. ]?\\d{3}[-. ]?\\d{4}|\\d{3}[-. ]?\\d{3}[-. ]?\\d{4}\\s?x?\\d{1,4}|\\d{3}[-. ]?\\d{3}[-. ]?\\d{4}\\s?ext?\\d{1,4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sdt);
        return matcher.matches();

      // 1234567890
      //  123-456-7890
        //123-456-7890 x1234
        //123-456-7890 ext1234
          //      (123)-456-7890
        //123.456.7890
        //123 456 7890
    }
}
