# Praktikum 2 PBO

## S1 Informatika UNS

> Silakan posting di grup kelas / Spada apabila anda masih belum memahami instruksi berikut. 

1. Clone repository ini dengan perintah ```git clone alamat_url_repository``` atau gunakan Git GUI client.

2. Ini adalah project aplikasi Java yang dibuat menggunakan [gradle build tool](https://gradle.org/). Terdapat banyak file yang digenerate, jangan hapus file-file tersebut. Yang perlu anda edit adalah file **src/main/java/com/hello/Calculator.java**

3. Di dalam file **src/main/java/com/hello/Calculator.java** buat method untuk mengurangi, mengkalikan, dan membagi bilangan. Gunakan nama-nama method sebagai berikut (nama method yang digunakan harus sama persis) :
* ```subtractNumbers``` (mengurangi bilangan / subtract numbers)
* ```multiplyNumbers``` (mengkalikan bilangan / multiply numbers)
* ```divisionNumbers``` (memembagi bilangan / divide numbers)

4. Setelah menambahkan method, tampilkan output hasil dari method ```subtractNumbers```, ```multiplyNumbers```, dan ```divisionNumbers``` di dalam method ```main```. Selanjutnya lakukan submit code anda, caranya dengan **Add** --> **commit** --> dan lakukan **push** menggunakan tool git ke repository Github. Script unit test akan dijalankan otomatis untuk memeriksa apakah method-method yang anda tulis sudah benar.

### (Opsional) Bagaimana memeriksa code yang sudah anda tulis sebelum submit code?

Anda dapat melakukan build dan run code ini melalui IDE / command line dan memeriksa output method-method yang sudah anda tulis.

Atau anda dapat menjalankan script unit test yang sudah disertakan pada project ini (file **src/test/java/com/hello/CalculatorTest.java**).

### Kriteria penilaian

1. Unit test **src/test/java/com/hello/CalculatorTest.java** passed

2. Ada code untuk menampilkan output method di dalam method main file **src/main/java/com/hello/Calculator.java**

3. Kecepatan submit dan ketepatan code yang dibuat

## Instructions in English

1. Clone this repository through command line ```git clone alamat_url_repository``` or you can use any Git GUI client tools.

2. This project is Java app project, created using [gradle build tool](https://gradle.org/). Don't delete any files. You just need to edit **src/main/java/com/hello/Calculator.java**

3. Create new method inside **src/main/java/com/hello/Calculator.java**. Add this methods (write exactly the same method name) :
* ```subtractNumbers``` (method to subtract numbers)
* ```multiplyNumbers``` (method to multiply numbers)
* ```divisionNumbers``` (method to divide numbers)

4. Display the output from ```subtractNumbers```, ```multiplyNumbers```, and ```divisionNumbers``` inside the ```main``` method. Finally, submit your code : Do **Add** --> **commit** --> and **push** to Github repository using Git tool. The unit test script will automatically run to check your code.

### (Optional) How to check your code before submitting

You can build and run your code using any IDE or command line, check the output from your methods.

Or you can tun the unit test script included in this project (**src/test/java/com/hello/CalculatorTest.java**).

### How to get the best score 

1. Unit test **src/test/java/com/hello/CalculatorTest.java** must passed

2. You must show the output from subtract, multiply, and division method inside **src/main/java/com/hello/Calculator.java**

3. Submit your code as fast as possible, better if no error ocurred
