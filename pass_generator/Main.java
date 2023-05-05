package pass_generator;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner favSong = new Scanner(System.in);
		System.out.println("What was your favorite song last month?" );
		String favoriteSong = favSong.nextLine();
		//code asks user for input, turns that input with a string
		
		Scanner favNumb = new Scanner(System.in);
		System.out.println("What is your favorite number?");
		String favoriteNumber = favNumb.nextLine();
		
		Scanner houseNumb = new Scanner(System.in);
		System.out.println("What is your favorite number?");
		String houseNumber = houseNumb.nextLine();
		
		String newPass = combine(favoriteNumber, favoriteSong, houseNumber);
		
		System.out.println(newPass);
		
	}
	
	public static String combine(String s1, String s2, String s3) {
		Random passChoice = new Random();
		int pick = passChoice.nextInt();
		
		switch(pick) {
		case 0:
			return s1 + s2 + s3;
		case 1:
			return s3 + s2 + s1;
		case 2:
			return s3 + "." + s2 + s1;
		default:
			return s1 + "." + s2 + "." + s3 + "!";
		}
	}

}
