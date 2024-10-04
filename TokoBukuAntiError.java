import java.util.Scanner;

public class TokoBukuAntiError {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku;
        double hargaPerBuku = 20000;
        double totalHarga, diskon = 0;
        double totalDiskon;
        double totalBayar;


        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = input.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = input.nextInt();

        totalHarga = jumlahBuku * hargaPerBuku;

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.10; 
            if (jumlahBuku > 2) {
                diskon += 0.02; 
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07; 
            if (jumlahBuku > 3) {
                diskon += 0.02; 
            } else {
                diskon += 0.01; 
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05; 
            }
        }


        totalDiskon = totalHarga * diskon;
        totalBayar = totalHarga - totalDiskon;

        System.out.println("Jumlah diskon: Rp " + totalDiskon);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
    }
}

