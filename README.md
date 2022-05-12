# JL-QAA

# Tugas 1 TreeMapSet
TreeSet berupa nama kota yang terdiri dari 6 kota bertipe data string dan menampilkan output berupa nama kotanya sesuai dengan treeset tersebut. TreeMap berupa nomor bulan dan nama bulan yang sudah tersusun secara acak dan menampilkan 3 output :

1. First Entry yang akan menampilkan nomor dan nama bulan pertama.
2. Last Entry yang akan menampilkan nomor dan nama bulan terakhir.
3. Higher Key yang akan menampilkan nomor bulan sesuai dengan yang parameter yang kita isi ( Contoh isi 10 maka akan menampilkan lebih dari 10 berupa 11).
PATH : JL-QAA/src/test/java/com/javatree/TreemapsetExam.java 

# Tugas 2 Simple-Calculator-Java
Terdapat 3 inputan berupa first number, second number dan choose an operator. Input nomor pertama dan inputan harus berupa nomor bila selain nomor akan menampilkan error message. Dilanjut dengan input nomor kedua yang harus berupa nomor juga lalu input operator antara +, -, *, / yang nanti akan masuk ke case sesuai dengan operator yang di input dan bila inputan tidak sesuai dengan operator yang ada maka akan masuk ke case default yang akan menampilkan error message berupa invalid operator.

PATH : JL-QAA/src/test/java/com/calculator/Calculator.java

# Tugas 3 Page Factory

PATH :
1. JL-QAA/src/main/java/qaautomation/march2022/pages/BasePageFactory.java
2. JL-QAA/src/main/java/qaautomation/march2022/pages/LoginPageFactory.java
3. JL-QAA/src/main/java/qaautomation/march2022/pages/ProfilePageFactory.java
4. JL-QAA/src/test/java/qaautomation/march2022/AppTestAfterPageFactory.java

# Tugas 4 Automation Test Yopmail

Pada bagian CommonPage, menambahkan 4 fungsi berupa :
1. inputSearchYopmail --> ini berfungsi untuk mengetik pada kolom search .
2. clickSearchButton --> ini berfungsi untuk menekan tombol search.
3. switchIFrame --> ini berfungsi untuk masuk ke dalam switch.
4. getYopmailText --> ini berfungsi untuk mengambil text yang ada di dalam switch tersebut.

Pada bagian CommonPageTest menggunakan test testYopmail yang akan membuka tab baru dan masuk ke website
yopmail dan mengisi text automationtest pada kolom search dan menekan bottonnya dan akan mengambil text pada iframe
yang sudah ditentukan.

PATH : 
1. JL-QAA/src/main/java/qaautomation/march2022/pages/CommonPage.java
2. JL-QAA/src/test/java/qaautomation/march2022/CommonPageTest.java

# Tugas 5 Automation Register for Kolak Project

Disini menggunakan faker untuk merandom email dan nomor telepon, lalu menggunakan RestAssured dengan baseurl website
kolakproject lalu membuat string sesuai dengan kolom dan variabel yang dibutuhkan dan membuat response untuk memasukan data
string yang sudah dibuat.

PATH : JL-QAA/src/test/java/qaautomation/march2022/RegisterKolak.java

# Tugas 7 Log Error for reqres single user

Pada bagian HTTP Request "get list user" menggunakan path /api/users/2 yang dimana ini untuk menetukan path yang akan digunakan. Lalu pada bagian JSR223 PostProcessor
menambahkan code berupa : 
log.error(jsonData.data.email) -- > ini digunakan untuk mendapatkan log error berupa email.
log.error(jsonData.data.first_name) ini digunakan untuk mendapatkan log error berupa first name.
log.error(jsonData.data.last_name) ini digunakan untuk mendapatkan log error berupa last name.
log.error(jsonData.data.id.toString()) ini digunakan untuk mendapatkan log error berupa id, dikarenakan type data id ini berupa integer maka harus diubah ke string terlebih dahulu karena data yang diambil diubah dalam bentuk string.
