# JL-QAA

# Tugas 3 Page Factory

PATH :
1. JL-QAA/src/main/java/qaautomation/march2022/pages/BasePageFactory.java
2. JL-QAA/src/main/java/qaautomation/march2022/pages/LoginPageFactory.java
3. JL-QAA/src/main/java/qaautomation/march2022/pages/ProfilePageFactory.java
4. JL-QAA/src/test/java/qaautomation/march2022/AppTestAfterPageFactory.java

# Tugas 4 Automation Test Yopmail

Pada bagian CommonPage, menambahkan 4 fungsi berupa :
1. inputSearchYopmail ini berfungsi untuk mengetik pada kolom search .
2. clickSearchButton ini berfungsi untuk menekan tombol search.
3. switchIFrame ini berfungsi untuk masuk ke dalam switch.
4. getYopmailText ini berfungsi untuk mengambil text yang ada di dalam switch tersebut.

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
