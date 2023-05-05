package pass_generator;

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
		
		System.out.println("your new password is: " + favoriteNumber + favoriteSong + houseNumber + "!");
		
	}

}
