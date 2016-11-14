package hw;

import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		float m = scn.nextInt(),n = scn.nextInt();
		System.out.println(c(m)/(c(n)*c(m-n)));
	}

	public static float c(float v){
		if(v==1){
			return 1;
		}else{
			return v*c(v-1);
		}
	}
}
