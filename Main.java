import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    double nilai;
    
    void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Nilai : " + nilai);
    }

    void cekKelulusan() {
        if (nilai >= 60) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Tidak Lulus");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        Mahasiswa[] daftarMahasiswa = {mhs1, mhs2, mhs3};

        System.out.println("=== PROGRAM DATA MAHASISWA ===");

        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("Masukkan nama: ");
            daftarMahasiswa[i].nama = input.nextLine();

            System.out.print("Masukkan NIM: ");
            daftarMahasiswa[i].nim = input.nextLine();

            System.out.print("Masukkan nilai: ");
            daftarMahasiswa[i].nilai = input.nextDouble();
            input.nextLine();
        }

        System.out.println("\n=== HASIL DATA MAHASISWA ===");

        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            daftarMahasiswa[i].tampilkanData();
            daftarMahasiswa[i].cekKelulusan();
        }

        input.close();
    }
}
