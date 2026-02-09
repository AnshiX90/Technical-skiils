package p1;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        System.out.print("Enter number of rows: ");
        r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        c = sc.nextInt();
        int[][] m1 = new int[r][c];
        int[][] m2 = new int[r][c]; 
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m1[i][j] = sc.nextInt();
            }
        }     
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m2[i][j] = sc.nextInt();
            }
        }     
        System.out.println("\nFirst Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }    
        System.out.println("\nSecond Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
