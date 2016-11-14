package hw;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int v = scn.nextInt();
		System.out.println(di(v));
	}
	public static int di(int v){
		int n=v/10;
		if(v==0){
			return 0;
		}else{
			return 1+di(n);
		}
	}

}
