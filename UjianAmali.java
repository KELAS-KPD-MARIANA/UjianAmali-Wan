/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujian.amali;
import java.util.Scanner;
public class UjianAmali {
    public static void main(String[] args) {
     
      Scanner input = new Scanner(System.in);
        double[] markah = new double[5];
        double jumlah = 0;


        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan markah ke-" + (i + 1) + ": ");
            markah[i] = input.nextDouble();
            jumlah += markah[i];
        }

        // Menampilkan markah yang dimasukkan
        System.out.println("Markah yang dimasukkan ialah:");
        for (int i = 0; i < 5; i++) {
            System.out.println(markah[i]);
        }

        // Mengira jumlah markah
        System.out.println("\nHasil tambah 5 Markah: " + jumlah);

        // Mengira purata markah
        double purata = jumlah / 5;
        System.out.println("Purata: " + purata);

        // Kira bilangan markah yang melebihi purata
        int Bilangan = 0;
        for (int i = 0; i < 5; i++) {
            if (markah[i] > purata) {
                 Bilangan++;
            }
        }
        System.out.println("Bilangan Markah melebihi Purata: " + Bilangan);
    }
} 
