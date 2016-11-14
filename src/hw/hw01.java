package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int x = scn.nextInt(), y = scn.nextInt() , z = scn.nextInt();
		System.out.println(lcn(x,y,z));
	}
	public static int lcn(int x, int y, int z){
		int v = 0,flag = 0,n=1;
		while(flag!=1){
			if(n%x==0 && n%y==0 && n%z==0){
				v=n;
				flag++;
			}
			n++;
		}
		return v;
	}

}
