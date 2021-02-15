package TelurBebek;

import java.util.Scanner;

public class Telur {
    double rating = 2.5;

    public Telur(double rating){
        //Variable Didalam Konstruktor
        //Menggunakan Keyword 'this' jika ada Nama Variable Yang Sama
        this.rating = rating;
    }

    public static void main(String[] args){
        //Object untuk Method Void
        Telur data_void = new Telur(5.5);
        //Object untuk Method static
        Telur data_static = new Telur(8.5);
        //Object Untuk Method Return
        Telur data_return = new Telur(8.0);
        //Memasukkan data untuk info pilihan kepada konsumen
        System.out.println("");
        System.out.println("|====== Telur Asin Original ======|");
        data_void.identitas1("|Jenis : Telur Asin Premium", 15000);
        System.out.println("|Rating Pembelian : "+data_void.rating);
        System.out.println("");
        System.out.println("|======= Telur Asin Bakar ========|");
        identitas2("|Jenis : Bakar Super", 19000);
        System.out.println("|Rating Pembelian : "+data_static.rating);
        System.out.println("");
        System.out.println("|====== Telur Bebek Original =====|");
        identitas3("|Jenis : Bebek Unggul", 13000);
        System.out.println("|Rating Pembelian : "+data_static.rating);
        System.out.println("");
        System.out.println("|======== Telur Asin Asap ========|");
        System.out.println("|Nama Saya: "+data_return.nama("Jenis : Asap Premium"));
        System.out.println("|Harga : Rp "+data_return.harga(20000));
        System.out.println("|Rating Pembelian : "+ data_return.rating);
        //Memanggil method static untuk menampilkan pilihan varian telur bebek kepada konsumen
        Unggul.pilihan2();
        //Membuat object bebek untuk memanggil method pilihan untuk memasukkan dan menampilkan input data konsumen
        Bebek bebek = new Bebek();
        bebek.pilihan();

    }

    //Parameter pada Method Void
    void identitas1(String nama, int harga){
        System.out.println(nama);
        System.out.println("|Harga : Rp " + harga);
    }

    //Parameter pada Method Static
    static void identitas2(String nama, int harga){
        System.out.println(nama);
        System.out.println("|Harga : Rp " + harga);
    }
    static void identitas3(String nama, int harga){
        System.out.println(nama);
        System.out.println("|Harga : Rp " + harga);
    }

    //Parameter pada Method Return
    String nama(String nama){
        return nama;
    }
    int harga(int harga){
        return harga;
    }
}
