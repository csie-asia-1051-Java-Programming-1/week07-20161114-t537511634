package ex;

/*
 * Date: 2016/11/14
 * Author: 105021029 汪元浩
 */
import java.util.*;

public class ex02 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		float n;

		System.out.println("請輸入要輸入的數字個數?");

		n = scn.nextFloat();
		System.out.println("請輸入數值");


		float s[] = new float[(int) n];

		for (int i = 0; i < n; i++) {

			s[i] = scn.nextInt();

		}

		System.out.println(std(var(s, n)));

	}

	public static float var(float s[], float n) {

		float aa = 0, sum = 0;

		for (int i = 0; i < n; i++) {

			sum += s[i];

		}

		sum = sum / n;

		for (int i = 0; i < n; i++) {

			aa += Math.pow(s[i] - sum, 2);

		}

		return aa / n;

	}
	public static float std(float n){
		float sum =0;
		sum= (float) Math.sqrt(n);
		return sum;
	}
}
