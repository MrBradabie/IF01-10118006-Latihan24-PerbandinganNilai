
package if01.pkg10118006.latihan24.perbandingannilai;
import java.util.Scanner;
/*
 * Nama      : Alfarizi Rizki Pane
 * Kelas     : IF-1
 * NIM       : 10118006
 * Deskripsi : Membandingkan 2 buah nilai 
 */

public class IF0110118006Latihan24PerbandinganNilai {

    public static void main(String[] args) {

          int n1, n2;
        String hasil,perulangan;      
        do {            

            System.out.println("");

            System.out.println("Program perbandingan nilai");

        System.out.println("__________________________");

        System.out.print("Masukan Nilai ke 1 :");

        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt();
        System.out.print("Masukan Nilai ke 2 :");

        n2 = scanner.nextInt();
        
        if (n1 > n2) {
                hasil = "Lebih Besar";
            } else if (n1 < n2){
                hasil = "Lebih Kecil";
            } else{
                hasil = "Sama dengan";
            }
               
              
        System.out.println("Hasil : "+n1+" "+hasil+" "+n2);
        System.out.println("");
        System.out.println("Ulangi Aktifitas ? (Ya/Tidak)");
        perulangan = scanner.next();

                
        } while (perulangan.toUpperCase().equals("YA"));
    }

}