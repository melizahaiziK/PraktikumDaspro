pertanyaan percobaan 1
1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operator relasional? 
jawaban : karena IF dapat memeriksa nilai kebenaran (boolean) dari suatu ekspresi atau variabel secara langsung
2. Saat program dijalankan, kemudian anda mengsisikan nilai false, bagaimana hasilnya?
jawaban : program tidak mengeluarkan hasil apa apa 
3. Sistem perlu memberikan informasi apabila pengguna memasukkan nilai false, maka terdapat keluaran "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu". Modifikasi program tersebut dengan menambahkan struktur ELSE!

pertanyaan percobaan 2
1. Apa fungsi dari sintaks break?
jawaban : Sintaks break digunakan untuk menghentikan eksekusi dari blok switch-case setelah menjalankan satu kasus case
2. Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE?
jawaban : Sintaks default berfungsi sebagai blok kode yang akan dijalankan jika tidak ada kasus (case) yang sesuai dengan nilai yang diuji dalam switch

pertanyaan percobaan 3
1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian?
jawaban : maka, program akan menampilkan "gagal! Mahasiswa masih memiliki tanggungan kompen" karna meskipun mahasiswa sudah memiliki log bimbingan namun mahasiswa masih harus memenuhi syarat untuk bisa ikut ujian, dan salah satunya adalah bebas dari kompen
2. Jelaskan maksud dari potongan kode berikut! if (bimbinganP1 >= 8 && bimbinganP2 >= 4) 
jawaban : Nilai bimbinganP1 harus lebih besar atau sama dengan 8
Nilai bimbinganP2 harus lebih besar atau sama dengan 4
3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi!
jawaban : 
-jika mahasiswa bebas dari kompen dan jumlah log bimbingan sudah terpenuhi atau memenuhi syarat maka mahasiswa boleh mendaftar ujian skripsi. 
-Jika mahasiswa bebas dari kompen namun salah satu log bimbingan pembimbing masi kurang atau belum memenuhi syarat maka mahasiswa gagal untuk mendaftar ujian dikarenakan log bimbingan masih kurang.
-Jika mahasiswa masih memiliki kompen namun jumlah log bimbingan pembimbing sudah terpenuhi atau memenuhi syarat maka mahasiswa tetap gagal untuk mendaftar ujian dikarenakan masih mempunyai tanggungan kompen.