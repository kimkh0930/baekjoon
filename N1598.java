package baekjoonbronze3;

import java.util.Scanner;

public class N1598 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = a%4;
		int d = b%4;
		
		if(c==0)
			c=4;
		if(d==0)
			d=4;
		
		int y = c-d;
		int x = (a-1)/4-(b-1)/4;
		
		if(x<0)
			x= -x;
		if(y<0)
			y = -y;
		
		System.out.println(x+y);
	}

}
