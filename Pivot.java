package p1;

import java.util.Scanner;

public class Pivot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[5];
		for (int i=0;i<a.length-1;i++) {
			System.out.print("\n Enter elements : ");
			a[i]=sc.nextInt();
		}
		int total = 0;
		int sum = 0;
		int ans = -1 ;
		for (int i=0 ; i<a.length ; i++) {
			total+=a[i];
		}
		for(int i=0;i<a.length;i++) {
			int temp=(total-a[i])-sum;
			if (sum == temp) {
				ans=i;
				System.out.print("\n Left sum is equals to right sum");
				break;
			}
			sum+=a[i];
		}
		System.out.print("\n Pivot index : "+ans);
	}

}