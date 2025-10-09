import java.util.Scanner; // untuk memanggil objek scanner

public class Nomor5 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program
        Scanner Zodiak = new Scanner(System.in); // untuk membuat variabel bertipe scanner untuk memasukkan input user
            String nama, umur, alamat, zodiak = "", sifat = ""; // untuk mendeklarasi tipe variabel 
            int tanggal, bulan;

            System.out.print("Masukkan nama anda = "); // untuk mencetak output tulisan
            nama = Zodiak.nextLine(); // untuk memasukkan input user ke variabel yang sudah dideklarasi ke suatu tipe
            System.out.print("Masukkan umur anda = ");
            umur = Zodiak.nextLine();
            System.out.print("Masukkan alamat anda = ");
            alamat = Zodiak.nextLine();
            System.out.print("Masukkan tanggal lahir anda = ");
            tanggal = Zodiak.nextInt();
            System.out.print("Masukkan bulan lahir anda = ");
            bulan = Zodiak.nextInt();

            switch (bulan) { // untuk memeriksa nilai sebuah variabel yang dipilih dari kondisi yang terpenuhi
                case 1: // memeriksa perintah jika input variabel bulan sesuai
                    if (tanggal >= 1 && tanggal <= 19) { // membuat kondisi yang harus dipenuhi jika input sesuai 
                        zodiak = "Capricornus"; // output jika kondisi sesuai 
                        sifat = "Disiplin, Bertanggung jawab, Tekun";
                    } else if (tanggal >= 20 && tanggal <= 31) { // kondisi lain yang masih sesuai dengan input variabel
                        zodiak = "Aquarius"; // output jika kondisi sesuai
                        sifat = "Progresif, orisinal, mandiri";
                    }
                    break; // untuk menghentikan program jika kondisi sudah terpenuhi
                case 2:
                    if (tanggal >= 1 && tanggal <= 18) {
                        zodiak = "Aquarius";
                        sifat = "Progresif, orisinal, mandiri";
                    } else if (tanggal >= 19 && tanggal <= 29) {
                        zodiak = "Pisces";
                        sifat = "Belas kasih, intuitif, setia";
                    }
                    break;
                case 3:
                    if (tanggal >= 1 && tanggal <= 20) {
                        zodiak = "Pisces";
                        sifat = "Belas kasih, intuitif, setia";
                    } else if (tanggal >= 21 && tanggal <= 31) {
                        zodiak = "Aries";
                        sifat = "Berani, bersemangat, penuh gairah";
                    }
                    break;
                case 4:
                    if (tanggal >= 1 && tanggal <= 19) {
                        zodiak = "Aries";
                        sifat = "Berani, bersemangat, penuh gairah";
                    } else if (tanggal >= 20 && tanggal <= 30) {
                        zodiak = "Taurus";
                        sifat = "Bisa diandalkan, setia, keras kepala";
                    }
                    break;
                case 5:
                    if (tanggal >= 1 && tanggal <= 20) {
                        zodiak = "Taurus";
                        sifat = "Bisa diandalkan, setia, keras kepala";
                    } else if (tanggal >= 21 && tanggal <= 31) {
                        zodiak = "Gemini";
                        sifat = "Penasaran, Komunikatif, Adaptif";
                    }
                    break;
                case 6:
                    if (tanggal >= 1 && tanggal <= 20) {
                        zodiak = "Gemini";
                        sifat = "Penasaran, Komunikatif, Adaptif";
                    } else if (tanggal >= 21 && tanggal <= 30) {
                        zodiak = "Cancer";
                        sifat = "Setia, Simpatik, Emosional";
                    }
                    break;
                case 7:
                    if (tanggal >= 1 && tanggal <= 22) {
                        zodiak = "Cancer";
                        sifat = "Setia, Simpatik, Emosional";
                    } else if (tanggal >= 23 && tanggal <= 31) {
                        zodiak = "Leo";
                        sifat = "Kreatif, Hangat, Percaya diri";
                    }
                    break;
                case 8:
                    if (tanggal >= 1 && tanggal <= 22) {
                        zodiak = "Leo";
                        sifat = "Kreatif, Hangat, Percaya diri";
                    } else if (tanggal >= 23 && tanggal <= 31) {
                        zodiak = "Virgo";
                        sifat = "Pekerja keras, Setia, Perfeksionis";
                    }
                    break;
                case 9:
                    if (tanggal >= 1 && tanggal <= 22) {
                        zodiak = "Virgo";
                        sifat = "Pekerja keras, Setia, Perfeksionis";
                    } else if (tanggal >= 23 && tanggal <= 30) {
                        zodiak = "Libra";
                        sifat = "Kooperatif, Adil, Diplomatis";
                    }
                    break;
                case 10:
                    if (tanggal >= 1 && tanggal <= 22) {
                        zodiak = "Libra";
                        sifat = "Kooperatif, Adil, Diplomatis";
                    } else if (tanggal >= 23 && tanggal <= 31) {
                        zodiak = "Scorpio";
                        sifat = "Berani, Penuh gairah, Misterius";
                    }
                    break;
                case 11:
                    if (tanggal >= 1 && tanggal <= 21) {
                        zodiak = "Scorpio";
                        sifat = "Berani, Penuh gairah, Misterius";
                    } else if (tanggal >= 22 && tanggal <= 30) {
                        zodiak = "Sagitarius";
                        sifat = "Idealistik, Penuh humor, Antusias";
                    }
                    break;
                case 12:
                    if (tanggal >= 1 && tanggal <= 21) {
                        zodiak = "Sagitarius";
                        sifat = "Idealistik, Penuh humor, Antusias";
                    } else if (tanggal >= 22 && tanggal <= 31) {
                        zodiak = "Capricornus";
                        sifat = "Disiplin, Bertanggung jawab, Tekun";
                    }
                    break;
            } if ((tanggal < 1 || tanggal > 31) && (bulan < 1 || bulan > 12)) { // untuk membuat kondisi jika input diluar kondisi yang ada
                System.out.print("Ngawur"); // output jika 
            }

            System.out.println("Nama   = " +nama); // untuk membuat perintah cetak tulisan beserta variabel 
            System.out.println("Umur   = " +umur);
            System.out.println("Alamat = " +alamat);
            System.out.println("Zodiak = " +zodiak);
            System.out.println("Sifat  = " +sifat);

        Zodiak.close(); // untuk menutup objek scannner
        } // untuk menutup program
    } // untuk menutup class

