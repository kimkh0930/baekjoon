package baekjoonbronze3;

import java.util.Scanner;

public class N1547 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]= new int[3];
		a[0]=1;
		a[1]=0;
		a[2]=0;
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			
			a[first-1]=a[first-1]^a[second-1];
			a[second-1]=a[second-1]^a[first-1];
			a[first-1]=a[first-1]^a[second-1];
		}
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==1)
				System.out.println(i+1);
		}
		
	}

}
