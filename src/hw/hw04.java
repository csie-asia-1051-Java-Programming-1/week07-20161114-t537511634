package hw;

import java.util.Scanner;

public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int m = scn.nextInt(),n = scn.nextInt();
		System.out.println(gcd(m,n));

	}
	public static int gcd(int m, int n){
		return n==0?m:gcd(n,m%n);
	}

}
