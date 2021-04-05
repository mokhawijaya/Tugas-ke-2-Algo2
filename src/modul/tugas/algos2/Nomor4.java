/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.tugas.algos2;

/**
 *
 * @author LENOVO
 */
public class Nomor4 {
    public static void main(String[] args){
        int [][]A= {
            {1,3,2},
            {2,3,3}
        };
        System.out.println("Masukan Matriks yang akan diTranspose : ");
        int [][]B= new int[3][2];
        for(int i=0;i<A.length; i++){
            for(int j=0; j<A[0].length;j++){
            System.out.print(A[i][j] + " ");    
            }
            System.out.println("");
            }
        for(int i=0;i<A.length;i++){
            for(int j=0; j<A[0].length; j++){
            B[j][i]=A[i][j];
            }
        }
        System.out.println("Transpose Matriks : ");
        for (int i=0;i<A[0].length;i++){
            for (int j=0;j<A.length;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
                System.out.println("Mokhamad Akbar Wijaya(20090037)");
    }
}
