package ex;

/*
 * Date: 2016/11/14
 * Author: 105021029 �L���E
 */
import java.util.*;

public class ex03 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�n��J���Ʀr�Ӽ�x�C�Py�C�ƭ�?");

		float x = scn.nextFloat();
		float y = scn.nextFloat();
		System.out.println("�п�J�ƭ�");

		float[][] s = new float[(int) y][(int) x];

		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {

				s[i][j] = scn.nextInt();
			}
		}

		System.out.println(var2(s,x,y)+"\n"+std2(var2(s, x, y)));

	}

	public static float var2(float s[][], float x, float y) {

		float aa = 0, sum = 0,n=y*x;

		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				sum += s[i][j];
			}
		}

		sum = sum / n;

		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {

			aa += Math.pow(s[i][j] - sum, 2);
			}
		}

		return aa / n;

	}

	public static float std2(float n) {
		float sum = 0;
		sum = (float) Math.sqrt(n);
		return sum;
	}
}
