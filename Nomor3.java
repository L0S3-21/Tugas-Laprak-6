import java.util.Scanner; // untuk memanggil objek scanner

public class Nomor3 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program
        try (Scanner Baju = new Scanner(System.in)) {
            // scanner untuk memasukkan input user
            // try untuk mencegah error pada program atau objek yang berada pada blok 
            int harga = 0; // untuk mendeklarasi sebuah variabel
            System.out.print("masukkan ukuran baju (S, M, L, XL, XXL)= "); // untuk mencetak tulisan
            String ukuran = Baju.nextLine(); // untuk mendeklarasi variabel ke sebuah tipe dan memasukkan input user kedalam variabel
            System.out.print("masukkan jumlah baju = "); 
            int jumlah = Baju.nextInt(); 

            switch (ukuran.toUpperCase()) { // untuk memeriksa nilai sebuah variabel yang dipilih dari kondisi yang terpenuhi
                // toUpperCase untuk membuat semua huruf yang diinput menjadi kapital
                case "S": // untuk membuat kondisi yang harus dipenuhi
                    harga = jumlah * 30000; // untuk membuat nilai dari variabel jika kondisi terpenuhi
                    break; // untuk menghentikan program jika kondisi sudah terpenuhi
                case "M":
                    harga = jumlah * 38000;
                    break;
                case "L":
                    harga = jumlah * 45000;
                    break;
                case "XL":
                    harga = jumlah * 50000;
                    break;
                case "XXL":
                    harga = jumlah * 60000;
                    break;
            }
        System.out.println("Harga yang harus dibayar = "+harga); // untuk mencetak tulisan beserta variabel
        } // untuk menutup objek try
    } // untuk menutup program
} // untuk menutup class
