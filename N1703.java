package baekjoonbronze3;

import java.util.Scanner;

public class N1703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sum =1;
		boolean flag = true;
		while(flag) {
			int n = sc.nextInt();
			if(n==0)
				break;
			int a[]= new int[n];
			int b[]= new int[n];
		for (int i = 0; i < n; i++) {
			a[i] =sc.nextInt();
			b[i] = sc.nextInt();
			sum *=a[i];
			sum -=b[i];
		}
		System.out.println(sum);
		sum=1;
		}
		
		
	}

}
