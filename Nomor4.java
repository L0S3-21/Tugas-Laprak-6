import java.util.Scanner; // untuk memanggil objek scanner

public class Nomor4 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program
        Scanner Bonus = new Scanner(System.in); // untuk membuat variabel bertipe scanner untuk memasukkan input user
        double persen = 0; // untuk mendeklarasi tipe variabel 

        System.out.print("masukkan gaji anda = "); // untuk mencetak output tulisan
        int gaji = Bonus.nextInt(); // untuk memasukkan input user ke variabel yang sudah bertipe int
        System.out.print("masukkan masa kerja anda = ");
        int masaKerja = Bonus.nextInt();
        Bonus.nextLine(); // untuk mengubah objek scanner yang sebelumnya bertipe int menjadi string
        System.out.print("masukkan golongan anda (I,II,III,IV) = ");
        String golongan = Bonus.nextLine(); // untuk memasukkan input user ke variabel yang sudah bertipe string

        switch (golongan.toUpperCase()) { // untuk memeriksa nilai sebuah variabel yang dipilih dari kondisi yang terpenuhi
            // toUpperCase untuk membuat semua huruf yang diinput menjadi kapital
            case "I": // untuk memeriksa input user dan kondisi nya terpenuhi
                if (masaKerja >= 0) { // untuk membuat kondisi lain yang harus dipenuhi
                    persen = 0.5; // output jika kondisi terpenuhi
                } else if (masaKerja <=20) { // untuk membuat kondisi lain jika kondisi sebelumnya tidak terpenuhi
                    persen = 0.6;
                } else if (masaKerja <=30) {
                    persen = 0.7;
                }
                break; // untuk menghentikan program jika kondisi sudah terpenuhi
            
            case "II":
                if (masaKerja >=0) {
                    persen = 0.6;
                } else if (masaKerja <=20) {
                    persen = 0.7;
                } else if (masaKerja <=30) {
                    persen = 0.8;
                }
                break;
            
            case "III":
                if (masaKerja >=0) {
                    persen = 0.7;
                } else if (masaKerja <=20) {
                    persen = 0.8;
                } else if (masaKerja <=30) {
                    persen = 0.9;
                } 
                break;
            
            case "IV":
                if (masaKerja >=0) {
                    persen = 0.8;
                } else if (masaKerja <=20) {
                    persen = 0.9;
                } else if (masaKerja <= 30) {
                    persen = 1.0;
                } 
                break;
        }
        if (masaKerja <0 && masaKerja >30){ // membuat kondisi jika semua kondisi yang ada di switch tidak valid
            System.out.println("data tidak valid"); // output jika kondisi terpenuhi
        }
        
        int hasil = ((int)(gaji * persen)); // untuk memasukkan nilai variabel hasil dan mendeklarasikan tipe
        // ((int)()) untuk mengubah variabel bertipe lain kedalam tipe int
        int akhir = gaji + hasil;
        System.out.println("Bonus anda adalah = "+hasil); // untuk mencetak tulisan + variabel 
        System.out.println("Gaji + bonus = "+akhir);
        Bonus.close(); // untuk menutup objek scanner
    } // untuk menutup program
} // untuk menutup class
