/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119016.latihan37.rataratanilai2;
import java.util.Scanner;
/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan cara 
 * melakukan penghitungan rata rata nilai berbasis objek
 */
public class RataRata {
public int x[], n, jum;
public void input(){
        n = 0;
        Scanner rrt = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jum = rrt.nextInt();
        x = new int[jum];
        for(int i = 0; i < jum; i++){
            System.out.print("Nilai mahasiswa ke-"+(i + 1)+" :");
            x[i] = rrt.nextInt();
            n += x[i];
        }
    }
    
    public static void main(String[] args) {
        RataRata rata = new RataRata();
        rata.input();
        System.out.println("Maka, rata-rata nilainya adalah : "+ rata.avg(rata.n,rata.jum));
        
    }

    private double avg(double total, double jumlah){
        double rata = jum/n;
        return rata;
    }
}
