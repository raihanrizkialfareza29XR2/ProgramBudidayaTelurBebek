package TelurBebek;

import java.util.Scanner;

public class Bebek {
    // Boolean running = true untuk digunakan ketika konsumen disuruh memilih antara mengulang atau tidak
    boolean running = true;

    void pilihan() {
        // Menggunakan perulangan while ketika konsumen disuruh memilih antara mengulang atau tidak
        while (running) {
            // Membuat Scanner baru
            Scanner input = new Scanner(System.in);
            System.out.println("");
            // Input pilihan produk konsumen
            System.out.print("Silakan Masukkan Produk Telur Bebek Pilihan Anda : ");
            int pilihan = input.nextInt();
            // Input pilihan varian konsumen
            System.out.print("Silakan Masukkan Pilihan Varian : ");
            int varian = input.nextInt();
            // Menggunakan percabangan if untuk mengeksekusi masing masing pilihan konsumen
            // Jika konsumen memilih pilihan nomor 1, maka yang dieksekusi adalah jenis produk telur asin original
            if (pilihan == 1) {
                System.out.println("");
                System.out.println("|=== Anda Memilih Telur Asin Original ===|");
                // Input jumlah produk yang akan dibeli
                System.out.print("|Silakan Masukkan Jumlah Produk yang Hendak Dibeli : ");
                int produk = input.nextInt();
                // Rumus penghitungan harga masing masing produk berdasarkan jenis dan variannya
                double harga1 = (produk * 15000);
                double harga2 = (produk * 18000);
                System.out.println("");
                // Menggunakan perulangan equalsIgnoreCase jika konsumen ingin mengulang ke bagian input pilihan produk
                System.out.print("|Ingin Mengulang? (Y/T) : ");
                Scanner darurat = new Scanner(System.in);
                String ulang = darurat.nextLine();
                if (ulang.equalsIgnoreCase("T")) {
                    running = false;
                }
                // Menggunakan percabangan if untuk menentukan total harga berdasarkan varian dan harga pokok dari masing2 produk yang dipilih
                // Jika konsumen memilih varian 2 maka harganya akan lebih mahal 3000 dikarenakan produk original tanpa tambahan apapun
                if (varian == 2){
                    System.out.println("");
                    System.out.println("|Total Harga yang Harus Dibayarkan : " + produk + " x 18.000");
                    System.out.println("|= " + harga2 + " Rupiah");
                }
                // Jika konsumen memilih varian 1 maka harganya akan tetap mengikuti harga pokok
                else if (varian == 1){
                    System.out.println("");
                    System.out.println("|Total Harga yang Harus Dibayarkan : " + produk + " x 15.000");
                    System.out.println("|= " + harga1 + " Rupiah");
                }
            }
            else if (pilihan == 2){
                System.out.println("");
                System.out.println("|=== Anda Memilih Telur Asin Bakar ===|");
                // Input jumlah produk yang akan dibeli
                System.out.print("|Silakan Masukkan Jumlah Produk yang Hendak Dibeli : ");
                int produk = input.nextInt();
                // Rumus penghitungan harga masing masing produk berdasarkan jenis dan variannya
                double harga1 = (produk * 19000);
                double harga2 = (produk * 22000);
                System.out.println("");
                // Menggunakan perulangan equalsIgnoreCase jika konsumen ingin mengulang ke bagian input pilihan produk
                System.out.print("|Ingin Mengulang? (Y/T) : ");
                Scanner daruratt = new Scanner(System.in);
                String ulang = daruratt.nextLine();
                if (ulang.equalsIgnoreCase("T")) {
                        running = false;
                }
                // Menggunakan percabangan if untuk menentukan total harga berdasarkan varian dan harga pokok dari masing2 produk yang dipilih
                // Jika konsumen memilih varian 2 maka harganya akan lebih mahal 3000 dikarenakan produk original tanpa tambahan apapun
                if (varian == 2){
                    System.out.println("");
                    System.out.println("|Total Harga yang Harus Dibayarkan : " + produk + " x 22.000");
                    System.out.println("|= " + harga2 + " Rupiah");
                }
                // Jika konsumen memilih varian 1 maka harganya akan tetap mengikuti harga pokok
                else if (varian == 1){
                    System.out.println("");
                    System.out.println("|Total Harga yang Harus Dibayarkan : " + produk + " x 19.000");
                    System.out.println("|= " + harga1 + " Rupiah");
                }
            }
            else if (pilihan == 3){
                System.out.println("");
                System.out.println("|=== Anda Memilih Telur Bebek Original ===|");
                // Input jumlah produk yang akan dibeli
                System.out.print("|Silakan Masukkan Jumlah Produk yang Hendak Dibeli : ");
                int produk = input.nextInt();
                // Rumus penghitungan harga masing masing produk berdasarkan jenis dan variannya
                double harga1 = (produk * 13000);
                double harga2 = (produk * 16000);
                System.out.println("");
                // Menggunakan perulangan equalsIgnoreCase jika konsumen ingin mengulang ke bagian input pilihan produk
                System.out.print("|Ingin Mengulang? (Y/T) : ");
                Scanner darurattt = new Scanner(System.in);
                String ulang = darurattt.nextLine();
                if (ulang.equalsIgnoreCase("T")) {
                    running = false;
                }
                // Menggunakan percabangan if untuk menentukan total harga berdasarkan varian dan harga pokok dari masing2 produk yang dipilih
                // Jika konsumen memilih varian 2 maka harganya akan lebih mahal 3000 dikarenakan produk original tanpa tambahan apapun
                if (varian == 2){
                    System.out.println("");
                    System.out.println("|Total Harga yang Harus Dibayarkan : " + produk + " x 16.000");
                    System.out.println("|= " + harga2 + " Rupiah");
                }
                // Jika konsumen memilih varian 1 maka harganya akan tetap mengikuti harga pokok
                else if (varian == 1){
                    System.out.println("");
                    System.out.println("|Total Harga yang Harus Dibayarkan : " + produk + " x 13.000");
                    System.out.println("|= " + harga1 + " Rupiah");
                }
            }
            else if (pilihan == 4){
                System.out.println("");
                System.out.println("|=== Anda Memilih Telur Asin Asap ===|");
                // Input jumlah produk yang akan dibeli
                System.out.print("|Silakan Masukkan Jumlah Produk yang Hendak Dibeli : ");
                int produk = input.nextInt();
                // Rumus penghitungan harga masing masing produk berdasarkan jenis dan variannya
                double harga1 = (produk * 20000);
                double harga2 = (produk * 23000);
                System.out.println("");
                // Menggunakan perulangan equalsIgnoreCase jika konsumen ingin mengulang ke bagian input pilihan produk
                System.out.print("|Ingin Mengulang? (Y/T) : ");
                Scanner daruratttt = new Scanner(System.in);
                String ulang = input.nextLine();
                if (ulang.equalsIgnoreCase("T")) {
                    running = false;
                }
                // Menggunakan percabangan if untuk menentukan total harga berdasarkan varian dan harga pokok dari masing2 produk yang dipilih
                // Jika konsumen memilih varian 2 maka harganya akan lebih mahal 3000 dikarenakan produk original tanpa tambahan apapun
                if (varian == 2){
                    System.out.println("");
                    System.out.println("|Total Harga yang Harus Dibayarkan : " + produk + " x 23.000");
                    System.out.println("|= " + harga2 + " Rupiah");
                }
                // Jika konsumen memilih varian 1 maka harganya akan tetap mengikuti harga pokok
                else if (varian == 1){
                    System.out.println("");
                    System.out.println("|Total Harga yang Harus Dibayarkan : " + produk + " x 20.000");
                    System.out.println("|= " + harga1 + " Rupiah");
                }
            }
        }
    }
}
