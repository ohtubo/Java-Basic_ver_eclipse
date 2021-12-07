package jp.leamingdesign.javastudy;

import java.util.Scanner;

public class DisplayMonth {

	public static void main(String[] args) {
		
		int month;
		
		Scanner strIn = new Scanner(System.in);
		System.out.println("何月の英語を知りたいですか？");
		month = strIn.nextInt();
		switch(month) {
		case 1:
			System.out.println("January");
		    break;
		case 2:
			System.out.println("February");
		    break;
		case 3:
			System.out.println("March");
		    break;
		case 4:
			System.out.println("April");
		    break;
		case 5:
			System.out.println("May");
		    break;
		default:
			break;
		}
		
	}

}
