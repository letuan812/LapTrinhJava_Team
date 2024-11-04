### Bài 1 :
Viết một chương trình cho phép người dùng nhập và sắp xếp thông tin nhân viên (Id, Tên, Họ, Số điện thoại, Email, Địa chỉ, Ngày sinh, Giới tính, Lương, Phòng ban), và hiển thị thông tin nhân viên trên màn hình.

Chi tiết các chức năng:

1.  Hiển thị menu và yêu cầu người dùng chọn một tùy chọn
    -   Menu chính:
        -   Thêm nhân viên
        -   Cập nhật nhân viên
        -   Xóa nhân viên
        -   Tìm kiếm nhân viên
        -   Sắp xếp nhân viên theo lương
        -   Thoát
2.  Thêm nhân viên:
    -   Tất cả các thuộc tính đều bắt buộc.
    -   Kiểm tra trùng lặp ID trước khi thêm nhân viên mới.
3.  Cập nhật nhân viên:
    -   Tìm kiếm nhân viên theo ID và cho phép người dùng cập nhật thông tin của nhân viên đó.
4.  Xóa nhân viên:
    -   Chương trình cho phép người dùng tìm kiếm nhân viên theo ID và xóa nhân viên đó nếu tìm thấy.
5.  Tìm kiếm nhân viên:
    -   Chương trình cho phép người dùng tìm kiếm nhân viên bằng Tên (Tên hoặc Họ) hoặc một phần của tên.
6.  Sắp xếp nhân viên:
    -   Sắp xếp danh sách nhân viên theo mức lương tăng dần.

Chương trình phải sử dụng kiến thức về interface

----------
### Bài 2 :
Thiết kế một chương trình cho phép người dùng nhập số lượng phần tử của mảng. Tạo số nguyên ngẫu nhiên trong khoảng số mà người dùng đã nhập. Hiển thị mảng chưa được sắp xếp và mảng đã được sắp xếp bằng cách sử dụng merge sort.

Chi tiết các chức năng:

1.  Hiển thị màn hình yêu cầu người dùng nhập một số thập phân dương.
    -   Người dùng chạy chương trình, hiển thị màn hình yêu cầu người dùng nhập một số thập phân dương.
    -   Người dùng nhập một số thập phân dương. Sau đó, thực hiện Chức năng 2.
2.  Hiển thị và sắp xếp mảng.
    -   Tạo số nguyên ngẫu nhiên trong khoảng số cho mỗi phần tử của mảng.
    -   Hiển thị mảng trước và sau khi sắp xếp.

----------
### Bài 3 :
Tạo một chương trình quản lý danh bạ với menu tương tác và các chức năng như yêu cầu, chúng ta sẽ phân tích các đặc tả và yêu cầu thành các thành phần chính:

Tổng quan chương trình

1.  Hiển thị Menu:
    -   Hiển thị các lựa chọn:
        1.  Thêm một liên hệ.
        2.  Hiển thị tất cả các liên hệ.
        3.  Xóa một liên hệ.
        4.  Thoát chương trình.
2.  Xử lý lựa chọn của người dùng:
    -   Nếu người dùng chọn số 1: Chương trình cho phép thêm một liên hệ với các thông tin sau:
        -   ID (tự động tăng dần, liên hệ đầu tiên có ID = 1, mỗi liên hệ mới có ID bằng ID cuối cùng + 1).
        -   Tên đầy đủ (fullname): Người dùng nhập tên đầy đủ và chương trình tự động tách ra firstName và lastName dựa trên khoảng trắng đầu tiên.
        -   Nhóm (group), Địa chỉ (address), và Số điện thoại (phone).
        -   Kiểm tra định dạng hợp lệ cho số điện thoại (theo các mẫu đã cho).
    -   Nếu người dùng chọn số 2: Hiển thị danh sách tất cả các liên hệ theo định dạng sau:
        -   Cột: ID, Name, First Name, Last Name, Group, Address, Phone.
    -   Nếu người dùng chọn số 3: Chương trình yêu cầu nhập ID của liên hệ cần xóa:
        -   Kiểm tra ID có tồn tại hay không. Nếu không, hiển thị "Không tìm thấy liên hệ".
    -   Nếu người dùng chọn số 4: Thoát chương trình.

Yêu cầu chi tiết về các hàm

Cần triển khai các hàm sau:

-   addContact
-   displayAll
-   deleteContact

Gợi ý cài đặt các hàm:

1.  Hàm addContact:
    -   Cài đặt hàm public boolean addContact(List<Contact> list, Contact contact).
    -   Đầu vào:
        -   list: Danh sách chứa các liên hệ hiện tại.
        -   contact: Thông tin liên hệ cần thêm.
    -   Kết quả trả về: Trạng thái thêm thành công hay không.
2.  Hàm displayAll:
    -   Cài đặt hàm public void displayAll(List<Contact> list).
    -   Đầu vào:
        -   list: Danh sách liên hệ cần hiển thị.
    -   Kết quả trả về: Không trả về (void). Chương trình sẽ hiển thị danh sách liên hệ.
3.  Hàm deleteContact:
    -   Cài đặt hàm public boolean deleteContact(List<Contact> list, Contact contact).
    -   Đầu vào:
        -   list: Danh sách liên hệ.
        -   contact: Liên hệ cần xóa.
    -   Kết quả trả về: Trạng thái xóa thành công hay không.

Yêu cầu định dạng số điện thoại:

Số điện thoại phải hợp lệ theo các mẫu:

-   1234567890
-   123-456-7890
-   123-456-7890 x1234
-   123-456-7890 ext1234
-   (123)-456-7890
-   123.456.7890
-   123 456 7890

Giao diện dự kiến của chương trình

Khi chạy, chương trình sẽ hiển thị menu và hướng dẫn người dùng chọn các chức năng, đồng thời kiểm tra các điều kiện hợp lệ cho từng thao tác.