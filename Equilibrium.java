package p1;

import java.util.*;
public class Equilibrium {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("\n Enter length : ");
		int n = sc.nextInt();
	    int [] a= new int[n];
	    for(int i=0; i<n ; i++) {
	    	System.out.print("\n Enter elements : ");
	    	a[i]=sc.nextInt();
	    }
	    int []pf=new int[n];
	    int []leftsum = new int[n];
	    int []rightsum = new int [n];
	    int count=0;
	    pf[0]=a[0];
	    System.out.println("\npf[] -----------------");
	    for(int i=1 ; i<n ; i++) {
	    	pf[i]=a[i]+pf[i-1];
	    }
	    for(int i=0; i<n ; i++) {
	    	System.out.print(pf[i]+" ");	    
	    }
	    leftsum[0]=0;
	    for(int i=1; i<n ; i++) {
	    	leftsum[i]=pf[i-1];
	    }
	    System.out.println("\nleftsum[] -----------------");
	    for(int i=0; i<n ; i++) {
	    	System.out.print(leftsum[i]+" ");	    
	    }
	    for(int i=0; i<n ; i++) {
	    	rightsum[i]=pf[n-1]-pf[i];
	    }
	    System.out.println("\nrightsum[] -----------------");
	    for(int i=0; i<n ; i++) {
	    	System.out.print(rightsum[i]+" ");	    
	    }
	    for(int i=0 ; i<n ; i++) {
	    	if(leftsum[i]==rightsum[i])
	    		count++;
	    	else
	    		continue;
	    }
	    System.out.println("\n -----------------");
	    System.out.println("\n Equlibrium index count is : "+count);
	}

}