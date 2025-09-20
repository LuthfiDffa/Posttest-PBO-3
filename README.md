# Showroom Mobil Sport

| Nama                      | NIM           | Kelas             |
|---------------------------|---------------|-------------------|
| Luthfi Daffa Purbaya   | 2409116102    | Sistem Informasi C |

## Deskripsi Program
Program ini merupakan sebuah sistem manajemen data showroom mobil sport berbasis Java, fitur utama nya sendiri mencakup operasi CRUD (Create, Read, Update, Delete) terhadap data-data mobil yang ada di showroom. Setiap data mobil juga memiliki atribut yaitu merk, model, tahun, dan harga.

Program juga menerapkan:

1. Encapsulation dengan penggunaan getter dan setter.
2. Inheritance dengan membuat satu superclass mobilsport dan dua subclass mobilsportcoupe serta mobilsportconvertible.
3. Polymorphism (Overriding), di mana method info() di subclass menampilkan data sesuai tipe mobil (Coupe atau Convertible).

## Alur Program
1. Program menampilkan menu utama berupa:
   - Tambah data mobil
   - Lihat semua data
   - Ubah data mobil
   - Hapus data mobil
   - Keluar
2. Pengguna memilih menu dengan memasukkan angka 1–5.
3. Setiap pilihan menu memanggil method dari class `mobilservice`:
   - **Tambah** : Pengguna menambah dan memilih tipe mobil (Coupe / Convertible), lalu mengisi data umum (merk, model, tahun, harga) serta data tambahan sesuai tipe (jumlah pintu atau status atap terbuka).  
   - **Lihat** : Program menampilkan seluruh data mobil sport yang sudah tersimpan. Output berbeda sesuai tipe mobil karena menerapkan method overriding.  
   - **Ubah** : mengganti data mobil sesuai nomor urut yang dipilih.  
   - **Hapus** : menghapus data mobil sesuai nomor urut yang dipilih.
   - **Keluar** : menghentikan program berjalan.
4. Program terus berjalan hingga user memilih menu keluar.

##  Struktur Packages & Class
   
<img width="354" height="268" alt="image" src="https://github.com/user-attachments/assets/6546543f-6301-4394-9e6e-5d14577ee747" />

Bisa terlihat pada struktur project di atas, saya menambahkan 2 class baru di dalam package model, yaitu:
1. mobilsportcoupe.java
2. mobilsportconvertible.java
Pada package model,  mobilsport.java menjadi superclass nya sedangkan mobilsportcoupe.java dan mobilsportconvertible.java menjadi subclass nya. Tujuannya adalah untuk menerapkan konsep inheritance, di mana mobilsport menyimpan atribut warisan/umum seperti merk, model, tahun, dan harga, sementara mobilsportcoupe dan mobilsportconvertible menambahkan atribut khusus mereka sendiri:
- mobilsportcoupe: atribut tambahannya pintu (jumlah pintu).
- mobilsportconvertible: atribut tambahan atapTerbuka (status atap).

Jadi  tipe Coupe adalah mobil sport dengan desain atap tetap (nggak bisa dibuka) dan biasanya punya dua pintu. Sedangkan tipe Convertible adalah mobil sport dengan desain atap terbuka yang bisa dilipat atau dilepas, sehingga bisa dipakai dalam mode atap tertutup atau terbuka.

# Penggunaan Program

<details>
<summary><h3>Menu Showroom Mobil Sport</h3></summary>

<img width="653" height="147" alt="image" src="https://github.com/user-attachments/assets/d9bd3829-bdfb-422b-816c-f3f8a3d62c39" />

Ketika program dijalankan, sistem akan langsung menampilkan menu utama yang berisi daftar pilihan menu. Disini pengguna diminta untuk memasukkan nomor menu sesuai dengan pilihan yang mereka inginkan. Setelah itu, inputan pengguna akan dijalankan oleh program dan kemudian kembali menampilkan menu utama, proses ini terus berulang hingga pengguna memilih opsi Keluar untuk menghentikan program.

## 1. Tambah Data Mobil

<img width="1011" height="167" alt="image" src="https://github.com/user-attachments/assets/f5c493a1-0ddb-4249-b996-a7d730ee14e6" />

<img width="858" height="170" alt="image" src="https://github.com/user-attachments/assets/89bb26ea-bc44-4dd9-bd53-c14de139e0b7" />

Saat memilih menu ini, pengguna diminta untuk menginput informasi mobil seperti merk, model, tahun, dan harga. Setelah itu, pengguna juga menentukan tipe mobil, apakah Coupe atau Convertible. Jika memilih Coupe, maka ada input tambahan berupa jumlah pintu. Sedangkan jika memilih Convertible, pengguna mengisi status atap (terbuka atau tidak).

## 2. Lihat Data Mobil

<img width="752" height="204" alt="image" src="https://github.com/user-attachments/assets/71713f01-1eb5-4391-962a-9c1fface77b5" />

Saat memilih menu ini, program akan menampilkan semua data mobil yang tersimpan beserta detailnya, termasuk merk, model, tahun, harga, serta atribut khusus sesuai tipe mobil (jumlah pintu untuk Coupe atau status atap untuk Convertible).















