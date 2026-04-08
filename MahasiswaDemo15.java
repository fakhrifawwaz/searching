import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15();

        int jumMhs=5;

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
            list.tambah(new Mahasiswa15(nim,nama,kelas,ipk));
        }

        list.tampil();
        //melakukan pencarian sequential
        System.out.println("------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequantial searching");
        double posisi = list.sequentialSearching(cari);
        int pss= (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        sc.close();
    }

}