# Bai-Tap-JaVa
Lab 0:
Bài 1. Cài đặt biến môi trường, JDK và Netbean IDE.
Bài 1.2. Viết chương trình nhập vào 1 số và in số đó ra màn hình.

Bài 1.3. Viết chương trình nhập vào 2 số và in tổng, hiệu, tích, thương 2 số đó ra màn hình.

Bài 2.1. Viết chương trình in ra tổng của 10 số đầu tiên (sử dụng vòng lặp for hoặc while).

Bài 2.2. Viết chương trình in ra tổng của 10 số chẵn đầu tiên (sử dụng vòng lặp for hoặc while).

Bài 3. Viết chương trình giải phương trình bậc nhất.

Bài 4. Viết chương trình giải phương trình bậc hai.

Bài 5. Viết chương trình tính tổng S = 1 + 2 + 3 + … + n với n nguyên dương được nhập từ bàn
phím.

Bài 6. Viết chương trình tính tổng S = 1 + 1/2 + 1/3 + … + 1/n với n nguyên dương được nhập từ
bàn phím.

Bài 7. Viết chương trình tính n! với n là số nguyên dương được nhập từ bàn phím.
import java.util.Scanner;

Bài 8. Viết chương trình tính tổng S = 1 /1! + 2 /2! + ....+ n / n!

Bài 9. Dãy số Fibonacci được định nghĩa như sau: F0 =1, F1 = 1; Fn = Fn-1 + Fn-2 với n>=2.
Hãy viết
chương trình tìm số Fibonacci thứ n.

Bài 10. Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. Ví dụ: Số
8545604 có tổng các
chữ số là: 8+5+4+5+6+0+4= 32.

Bài 11. Viết chương trình kiểm tra xem một số nguyên nhập vào có phải là số nguyên tố.

Bài 12. Viết chương trình nhập vào một mảng số nguyên có n phần tử
a) Xuất giá trị các phần tử của mảng.
b) Tìm phần tử có giá trị lớn nhất, nhỏ nhất.
c) Đếm số phần tử là số chẵn
d) Tìm các phần tử là số nguyên tố.
e) Sắp xếp mảng tăng dần
f) Tìm phần tử có giá trị x

Bài 13. Cho ma trận số nguyên cấp n x m. Cài đặt các hàm thực hiện các chức năng sau:
a) Nhập ma trận.
b) In ma trận.
c) Tìm phần tử nhỏ nhất.
d) Tìm phần tử lẻ lớn nhất.
e) Tìm dòng có tổng lớn nhất.

Bài 14. Viết chương trình nhập vào vào ma trận A có n dòng, m cột, các phần tử là những số
nguyên lớn hơn 0
và nhỏ hơn 100 được nhập vào từ bàn phím. Thực hiện các chức năng sau:
a) Tìm phần tử lớn nhất của ma trận cùng chỉ số của số đó.
b) Tìm và in ra các phần tử là số nguyên tố của ma trận (các phần tử không nguyên tố thì thay
bằng số 0).
c) Sắp xếp tất cả các cột của ma trận theo thứ tự tăng dần và in kết quả ra màn hình.


LAB1:

Phần I.
Viết một chương trình Java in ra màn hình thông tin cá nhân của bạn: Họ tên, mã sinh
viên, lớp, địa chỉ email. Thông tin cần ghi theo đúng thứ tự đó, giữa hai thông tin có đúng
1 dấu tab ('\t'). Sau đó là 20 dòng sau đây:
9 bottles of beer on the wall, 9 bottles of beer.
Take one down, pass it around,
8 bottles of beer on the wall, 8 bottles of beer.
Take one down, pass it around,
...
1 bottle of beer on the wall, 1 bottle of beer.
Take one down, pass it around,
No more bottles of beer on the wall.

Phần II.
Viết các hàm sau và kiểm tra kết quả trong phương thức main
a. Viết hàm tìm ước số chung lớn nhất của 2 số nguyên a và b
b. Viết hàm tính fibonaci (int n) 
-------------------------------------------------------------------
BAITAPZALO
BT:
Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
+ Mỗi cán bộ cần quản lý lý các thuộc tính: Họ tên, năm sinh, giới tính, 
địa chỉ
+ Các công nhân cần quản lý: Bậc (công nhân bậc 3/7, bậc 4/7 ...)
+ Các kỹ sư cần quản lý: Ngành đào tạo
+ Các nhân viên phục vụ cần quản lý thông tin: công việc
1. Xây dựng các lớp NhanVien, CongNhan, KySu kế thừa từ lớp CanBo
2. Xây dựng các hàm để truy nhập, hiển thị thông tin và kiểm tra về các 
thuộc tính của các lớp.
3. Xây dựng lớp QLCB cài đặt các phương thức thực hiện các chức năng 
sau:
- Nhập thông tin mới cho cán bộ
- Tìm kiếm theo họ tên
- Hiển thị thông tin về danh sách các cán bộ
- Thoát khỏi chương trình