package p1;
import java.util.Scanner;
public class SumOfFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter matrix elements:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Sum of frame elements = " + sum);
    }
}
