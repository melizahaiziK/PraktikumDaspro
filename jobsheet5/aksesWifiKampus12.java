package jobsheet5;
import java.util.Scanner;
public class aksesWifiKampus12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pengguna? (Dosen/Mahasiswa): ");
        String Pengguna = sc.nextLine().trim();
        if (Pengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("akses wifi diberikan (dosen): ");
        } else {
            System.out.println("Masukkan jumlah sks: ");
            int sks = sc.nextInt();
             if (sks >= 12) {
                System.out.println("akses wifi diberikan (mahasiswa aktif): ");
            } else if (sks <12) {
                System.out.println("akses ditolak sks kurang dari 12");
            } else {
                System.out.println("akses ditolak");
            }
        } 
    }
}
