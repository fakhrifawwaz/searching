import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15();

        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("-- Data Mahasiswa ke-" + (i+1) + " --");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : "); 
            String nama = sc.nextLine();
            System.out.print("Kelas : "); 
            String kelas = sc.nextLine();
            System.out.print("IPK   : "); 
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("-------------------------");
            list.tambah(new Mahasiswa15(nim, nama, kelas, ipk));
        }

        list.tampil();

        // Sequential Search
        System.out.println("------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching");
        int pss = list.sequentialSearching(cari);
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        // Binary Search
        System.out.println("------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("------------------------------");
        list.insertionSort(); // urutkan dulu sebelum binary search
        int pss2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        sc.close();
    }
}