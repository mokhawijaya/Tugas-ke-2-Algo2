package modul.tugas.algos2;
public class Nomor1 {
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] A = {
            {34 , 56 , 41},
            {45 , 36 , 37},
            {51 , 32 , 46}
        };
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}
