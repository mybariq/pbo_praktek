/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082002.p190324;

/**
 *
 * @author Bariq
 */
import java.util.Scanner;
import java.util.Random;
public class ProsesArray1D {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int i, j, n;
        int jum, max, min;
        int imax, imin;
        float rata;
        
        System.out.println("Masukkan banyak data = ");
        n = in.nextInt();//menjadi ukuran array
        int[]A = new int [n];//buat array A dengan ukuran n
        
        //isi Array A
        System.out.println("\n***Mengisi Array***");
        for(i = 0; i <= n-1;i++){
            //System.out.println("Array["+i+"=);
            //A[i] = in.nextInt();
            A[i] = rand.nextInt(100)+1;
        }
        //Proses Isi Array
        jum = A[0];
        max = A[0]; imax = 0;
        min = A[0]; imin = 0;
        for(i=1;i<=n-1;i++){
            jum = jum + A[i];
            if(A[i]>max){
                max = A[i];
                imax = i;
            }
            if(A[i]<min){
                min = A[i];
                imin = i;
            }
        }
        rata = (float)jum / n;
        //Menampilkan isi Array A
        System.out.println("\n**menampilkan isi Array A");
        for(i=0;i<n;i++)
        {
            System.out.print(A[i]+"\t");
        }
        System.out.println("\n***Menamilkan Isi Array A Yang Ganjil");
        for(i=0;i<n;i++){
            if(A[i]%2!=0)
                System.out.print(A[i]+"\t");
        }
        //Menampilkan Isi Array A
        System.out.println("\n***Menampilkan isi array A pada indeks Ganjil");
        for(i=0;i<n;i++){
            if(i%2!=0)
                System.out.println(A[i]+"\t");
        }
        System.out.println("\nJumlah  = "+jum);
        System.out.println("Rata-Rata = "+rata);
        System.out.println("Nilai Terbesar = "+max+" Pada Indeks"+imax);
        System.out.println("Nilai Terkecil = "+min+" Pada Indeks"+imin);
    }
}
