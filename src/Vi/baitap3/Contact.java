package baitap3;

public class Contact {
        int id;
        String ho;
        String ten;
        String nhom;
        String diachi;
        String sdt;
        String hoten;
        public Contact(int id, String hoten, String nhom, String diachi, String sdt) {
            this.id=id;
            String[] nameParts=hoten.split(" ",2);
            this.ho=nameParts[0];
            this.ten=nameParts.length> 1?nameParts[1]:"";
            this.nhom=nhom;
            this.diachi=diachi;
            this.sdt=sdt;
        }
        public int getid() {
            return id;
        }
        public String gethoten() {
            return ho+ " "+ ten;
        }
        public String getho() {
            return ho;
        }
        public String getten() {
            return ten;
        }
        public String getnhom() {
            return nhom;
        }
        public String getdiachi() {
            return diachi;
        }
        public String getsdt() {
            return sdt;
        }
         @Override
         public String toString() {
              return String.format("%d\t%s\t%s\t%s\t%s\t%s\t%s", id, hoten, ho,ten ,nhom, diachi, sdt);
          }
    }
