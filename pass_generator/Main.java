package pass_generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner favSong = new Scanner(System.in);
		System.out.println("What was your favorite song last month?" );
		String favoriteSong = favSong.nextLine();
		//code asks user for input, turns that input with a string
		
		Scanner oldPet = new Scanner(System.in);
		System.out.println("Who was your childhood pet?" );
		String childhoodPet = oldPet.nextLine();
		//code asks user for input, turns that input with a string
		
		Scanner favNumb = new Scanner(System.in);
		System.out.println("What is your favorite number?");
		String favoriteNumber = favNumb.nextLine();
		
		Scanner houseNumb = new Scanner(System.in);
		System.out.println("What was the number of your childhood home?");
		String houseNumber = houseNumb.nextLine();
		
		String combined = combine(favoriteNumber, favoriteSong, houseNumber, childhoodPet);
		String newPass = strengthenPassword (combined);
		
		System.out.println(newPass);
		
	}
	
	public static String combine(String s1, String s2, String s3, String s4) {
	    List<String> strings = Arrays.asList(s1, s2, s3, s4);
	    Collections.shuffle(strings);
	    return String.join(".", strings);
	}
	
	 public static String strengthenPassword(String password) {
	        String strongPassword = password.replace('o', '0')
	                .replace('e', '3')
	                .replace('a', '@')
	                .replace('s', '$');

	        return strongPassword;
	    }
}

