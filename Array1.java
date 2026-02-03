package p1;

public class Array1 {

	public static void main(String[] args) {
		int [] a = {-3,2,6,8,4,8,5};
		int count = 0 ;
		int max = a[0];
		for (int i = 0 ; i < a.length ; i++ ) {
				if (a[i] > max)
					max=a[i];
			}
		for(int i = 0 ; i<a.length ; i++) {
			if(max > a[i])
				count++;
		}
		System.out.print("\n Count : "+count);

	}

}