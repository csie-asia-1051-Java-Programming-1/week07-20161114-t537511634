package hw;

import java.util.Scanner;

public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		String l = scn.next();
		char[]s = l.toCharArray();
		ba(s);
	}
	public static void ba(char s[]){
		for(int i = s.length-1;i>=0;i--){
			System.out.print(s[i]);
		}System.out.println();
	}

}
