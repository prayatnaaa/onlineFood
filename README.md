## Pengenalan

Program onlineFood ini merupakan sebuah project yang menggunakan 
bahasa pemrograman Java dengan konsep Object Oriented Programming (OOP). 
Project onlineFood ini sendiri merupakan suatu program restoran yang berbasis online,
dimana semua sistem beli membeli dilakukan secara online.
Pada program ini, user dapat masuk sebagai **admin** maupun **customer** pada 
program onineFoog yang telah dibuat. Adapun beberapa fitur 
yang dapat diakses ketika melakukan run pada program ini.
<br>

##### Fitur Admin
- Menambahkan restaurant 
- Melihat restaurant
- Membuat menu di masing-masing restaurant 
- Menghapus restaurant
<br>
##### Fitur Customer
- Membuat pesanan pada setiap restaurant
- Melihat pesanan / History pesanan yang  dibuat
<br>
<br>
## Alur Program
Berikut merupakan alur atau flow jalannya program onlineFood ini. 
<br>
### Login
Hal pertama yang user perlu lakukan ketika menjalankan program ini adalah meng-input
data diri atau kredensial agar dapat melanjutkan program. Terdapat dua opsi 
input yang dapat digunakan untuk melanjutkan program, yaitu ***admin*** (administrator) dan ***customer*** (pelanggan).
Berikut merupakan syntax untuk melanjutkan program sebagai admin maupun customer

<img src="img/Image 18-04-23 at 13.33.jpg">
<img src="img/Image 18-04-23 at 15.38.jpg">

### Menu Admin

1. ***Tampilan Awal***
<br>
Berikut merupakan tampilan awal ketika user masuk sebagai admin pada program,
dimana admin dapat melihat restaurant, menambah restaurant, menghapus resturant. Selain itu,
admin juga dapat menambahkan menu setelah menambahkan restaurant.
<br>
<img src= "img/Image 18-04-23 at 15.50.jpg">
<br>

2. ***Menu Melihat Restaurant***
<br>
Admin dapat melihat restaurant yang tersedia atau yang telah dibuat pada menu 'Lihat Restaurant'. Berikut merupakan
tampilan ketika memilih menu 'Lihat Restaurant' ketika admin belum memasukan.
restaurant.
<br>
<img src= "img/Image 18-04-23 at 15.51.jpg">
<br>
Berikut merupakan tampilan menu 'Lihat Restaurant' jika sudah ada data restaurant.
<br>
<img src= "img/Image 18-04-23 at 15.54.jpg">
<br>
Admin dapat menambahkan menu setelah berhasil membuat restaurant. Berikut merupakan tampilan tambah menu, 
dimana user memilih untuk menambah menu pada restaurant Mcdonald.
<br>
<img src= "img/Image 18-04-23 at 15.57.jpg">
<br>
<img src= "img/Image 18-04-23 at 15.59.jpg">
<br>
3. ***Menu Menambah Restaurant***
   <br>
   Admin dapat membuat restaurant pada menu 'Tambah Restaurant'. Berikut merupakan
   tampilan ketika admin sudah masuk ke menu 'Tambah Restaurant'.
   <br>
   <img src= "img/Image 18-04-23 at 15.52.jpg">
   <br>
4. ***Menu Menghapus Restaurant***
   <br>
   Admin dapat melakukan penghapusan data restaurant yang tersedia pada menu 'Hapus Restaurant'.
   Berikut merupakan tampilan ketika admin masuk ke menu 'Hapus Restaurant', dimana pada gambar dibawah admin melakukan
   penghapusan data restaurant Burger King.
   <br>
   <img src= "img/Image 18-04-23 at 15.55.jpg">
   <br>
   <img src= "img/Image 18-04-23 at 15.56.jpg">
<br>
5. ***Menu Kembali ke Menu Login***
Admin juga dapat kembali lagi ke menu login atau tampilan awal ketika admin memilih
menu 'Kembali ke Login'.

### Menu Customer

1. ***Tampilan Awal***
<br>
Berikut merupakan tampilan awal ketika user masuk sebagai customer pada program,
dimana customer dapat membuat pesanan, melihat pesanan, dan kembali ke tampilan awal.
<br>
<img src= "img/Image 18-04-23 at 16.32.jpg">
<br>

2. ***Membuat Pesanan***
<br>
Customer dapat melakukan pembuatan pesanan pada menu 'Buat Pesanan'. Namun, sebelum 
membuat pesanan, customer wajib untuk memilih restaurant yang diinginkan agar dapat melihat menu yang 
tersedia pada restaurant tersebut. Berikut merupakan tampilan dari flow yang terjadi
ketika customer ingin membuat pesanan.
<br>
<img src= "img/Image 18-04-23 at 16.34.jpg">
<br>
<img src= "img/Image 18-04-23 at 16.35.jpg">
<br>
<img src= "img/Image 18-04-23 at 16.35 2.jpg">

Setelah melakukan pemesanan menu, maka akan muncul tampilan daftar pesanan, dimana 
daftar pesanan menampilkan menu yang dipesan, jumlah menu yang dipesan, jarak restaurant dari lokasi 
yang dituju, dan total harga dari pemesanan.
<br>
3. ***Melihat Pesanan***
<br>
Customer dapat melihat pesanan atau history pesanan yang telah dibuat pada menu 'Lihat Pesanan'. Berikut merupakan tampilan
 dari menu 'Lihat Pesanan'.
<br>
<img src= "img/Image 18-04-23 at 16.38.jpg">
<br>

4. ***Menu Kembali ke Menu Login***
   Customer juga dapat kembali lagi ke menu login atau tampilan awal ketika customer memilih
   menu 'Menu Login'.

## Unified Modeling Language (UML)

Unified Modeling Language atau UML merupakan jenis diagram yang digunakan pada 
pengambaran program agar dapat lebih jelas menggambarkan struktur OOP. 
Berikut merupakan UML dari program onlineFood.
<br>
<br>
<img src= "img/UML.jpg">