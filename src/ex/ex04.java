package ex;

/*
 * Date: 2016/11/14
 * Author: 105021029 �L���E
 */
import java.util.*;

public class ex04 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�ƭ�");
		int n = scn.nextInt();
		System.out.println(fun(n));
	}

	public static int fun(int n){
		if(n==0){
			return 1;
		}else{
			return n*fun(n-1);
		}
	}
}
