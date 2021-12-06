package jp.leamingdesign.javastudy;

import java.util.Scanner;

public class BmiCalc2 {
	/*BMI(体格指数を計算するプログラム)
	 * BMI = 体重 / (身長 * 身長)
	 * 体重 kg 身長 cm
	 */
	public static void main(String[] args) {
		double weigth,heigth,bmi;
		
//		weigth = 72;
//		heigth = 168;
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("体重は(kg)：");
		weigth = stdIn.nextDouble();
		System.out.println("身長は(cm)：");
		heigth = stdIn.nextDouble();
		
		heigth /= 100;
		
		bmi = weigth / (heigth * heigth);
		
		System.out.println("bmiは" + bmi + "です。");
		

	}

}
