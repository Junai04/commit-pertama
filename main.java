package parkir;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean input = true;
        QueueDinamis baru = new QueueDinamis();
        while (input) {
            System.out.println("RENO'S PARKIR");
            System.out.println("1. Tambah kendaraan Antrian");
            System.out.println("2. Hapus data antrian");
            System.out.println("3. Total Antrian");
            System.out.println("4. Keluar");
            System.out.println(" ");
            System.out.print("Pilih : ");
            int pilih = sc.nextInt();
            if (pilih == 1) {
                System.out.print("Masukkan plat nomor : ");
                String plat = sc.next();
                kendaraan nama = new kendaraan();
                nama.setPlat_nomor(plat);
                baru.enqueue(nama);
                System.out.println("Data berhasil ditambahan");
            }
            if (pilih == 2) {
                if (!baru.isEmpty()) {
                    Object temp = baru.dequeue();
                    System.out.println(" ");
                    System.out.print("Plat Nomor : " + temp);
                } else {
                    System.out.println("Data Antrian Kosong Bang ");
                }
            }
            if (pilih == 3) {
                if (baru.isEmpty()) {
                    System.out.println("Antrian kosong");
                } else {
                    System.out.println("Total Antrian : " + baru.size());
                }

            }if(pilih == 4){
                input = false;
            }

        }
    }
}
