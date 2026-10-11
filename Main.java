
import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    double nilai;

    Mahasiswa(String nama, String nim, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Nilai : " + nilai);
    }

    void cekKelulusan() {
        if (nilai >= 60) {
            System.out.println("Status: LULUS");
        } else {
            System.out.println("Status: TIDAK LULUS");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa[] daftar = new Mahasiswa[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            System.out.print("Masukkan nilai: ");
            double nilai = input.nextDouble();
            input.nextLine();

            daftar[i] = new Mahasiswa(nama, nim, nilai);
        }

        System.out.println("\n=== DATA MAHASISWA ===");

        for (int i = 0; i < 3; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            daftar[i].tampilkanData();
            daftar[i].cekKelulusan();
        }

        input.close();
    }
}
