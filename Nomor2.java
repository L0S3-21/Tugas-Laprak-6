import java.util.Scanner; // untuk memanggil objek scanner

public class Nomor2 { // untuk membuat class
        public static void main(String[] args) { // untuk memulai program
        try (Scanner Month = new Scanner(System.in)) {
            // scanner untuk memasukkan input user
            // try untuk mencegah error pada program atau objek yang berada pada blok 
            System.out.print ("Masukkan bulan = "); // untuk mencetak output tulisan 
            String bulan = Month.nextLine(); // untuk mendeklarasi variabel ke tipe String dan memasukkan input user kedalam variabel

            switch (bulan.toLowerCase()) { // untuk memeriksa nilai sebuah variabel yang dipilih dari kondisi yang terpenuhi
                //toUpperCase untuk membuat huruf menjadi kapital
                case "januari", "maret", "mei", "juli", "agustus", "oktober", "desember": // untuk membuat kondisi yang harus dipenuhi
                    System.out.print("31 Hari"); // output yang dicetak jika kondisi terpenuhi
                    break; // untuk menghentikan program jika kondisi sudah terpenuhi
            
                case "april", "juni", "september", "november":
                    System.out.print("30 Hari");
                    break;

                case "februari":
                    System.out.print("28 Hari");
                    break;   
            } // untuk menutup program
        } // untuk menutup class
    }
}
