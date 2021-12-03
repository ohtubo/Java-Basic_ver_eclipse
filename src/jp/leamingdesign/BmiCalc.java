package jp.leamingdesign;

public class BmiCalc {
	/*BMI(体格指数を計算するプログラム)
	 * BMI = 体重 / (身長 * 身長)
	 * 体重 kg 身長 cm
	 */
	public static void main(String[] args) {
		double weigth,heigth,bmi;
		
		weigth = 72;
		heigth = 168;
		
		heigth /= 100;
		
		bmi = weigth / (heigth * heigth);
		
		System.out.println(bmi);
		

	}

}
