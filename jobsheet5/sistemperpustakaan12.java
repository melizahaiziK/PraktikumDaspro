package jobsheet5;
import java.util.Scanner;
public class sistemperpustakaan12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Membawa kartu mahasiswa? (Ya/Tidak): ");
        String Membawakartu = sc.nextLine().trim();
        if (Membawakartu.equalsIgnoreCase("Ya")) {
            System.out.println("boleh masuk");
        } else {
            System.out.println("Registrasi online? (Ya/Tidak): ");
            String Registrasionline = sc.nextLine().trim();
            if (Registrasionline.equalsIgnoreCase("Ya")) {
               System.out.println("Bole masuk");
        } else {
            System.out.println("Tidak bole masuk karena tidak membawa kartu mahasiswa dan tidak registrasi online");
            }
        }
   }
           
}