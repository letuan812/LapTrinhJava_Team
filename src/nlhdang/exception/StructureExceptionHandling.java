package nlhdang.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StructureExceptionHandling {

    // Phương thức có thể ném ra IOException (sử dụng throws)
    public static void readFile(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            // Sử dụng throw để ném ra ngoại lệ nếu file không tồn tại
            throw new IOException("File không tồn tại: " + filePath);
        }

        FileReader fileReader = new FileReader(file);
        System.out.println("Đọc file thành công.");
        fileReader.close();
    }

    public static void main(String[] args) {
        try {
            // Khối try: Gọi phương thức có thể gây ra IOException
//            readFile("src/nlhdang/exception/valid-file.txt");
            readFile("invalid-file.txt");
        } catch (IOException e) {
            // Khối catch: Bắt và xử lý ngoại lệ IOException
            System.out.println("Lỗi xảy ra: " + e.getMessage());
        } catch (Exception e) {
            // Khối catch khác để xử lý bất kỳ ngoại lệ nào khác
            System.out.println("Một ngoại lệ khác đã xảy ra: " + e.getMessage());
        } finally {
            // Khối finally: Luôn thực thi, dùng để dọn dẹp tài nguyên
            System.out.println("Thực hiện dọn dẹp tài nguyên.");
        }
    }
    public class DivisionExample {
        public static void main(String[] args) {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Lỗi: Không thể chia cho 0.");
            }
        }
    }









}
