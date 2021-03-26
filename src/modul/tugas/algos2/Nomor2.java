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
public class Nomor2 {
     public static void main(String[] args) {
        int [][]A = {
            {2, 3},
            {2, 4},
            {2, 3}
        };
        
        int [][]B = {
        {1, 2},
        {3, 2},
        {2, 9}
        };
        
        if ((A.length == B.length) && (A[0].length == B[0].length)){
            int [][] C = new int[A.length][A[0].length];
            for(int i=0; i<A.length; i++) {
                for(int j=0; j<A[0].length; j++){
                    C[i][j] = A[i][j] - B[i][j];
                }
            }
            for (int[] c: C){
                for(int q: c) {
                    System.out.print(q+" ");
                }
                System.out.println();
            }
            System.out.println(C[1][2]);
        }
        else {
            System.out.println("Matrix tidak sama");
        }
            
    }
    
}
