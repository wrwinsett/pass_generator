package pass_generator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 AskPassQuestions askPassQuestions = new AskPassQuestions();
	        String[] userInputs = AskPassQuestions.readUserInputs();

	        String favoriteSong = userInputs[0];
	        String childhoodPet = userInputs[1];
	        String favoriteNumber = userInputs[2];
	        String houseNumber = userInputs[3];

		
		Combine combine = new Combine();
			String combined = Combine.combine(favoriteNumber, favoriteSong, houseNumber, childhoodPet);
			
		String newPass = strengthenPassword (combined);
		
		System.out.println(newPass);
		saveToFile(newPass);
		
	}
	
	
	
	 public static String strengthenPassword(String password) {
	        String strongPassword = password.replace('o', '0')
	                .replace('e', '3')
	                .replace('a', '@')
	                .replace('s', '$');

	        return strongPassword;
	    }
	 @SuppressWarnings("resource")
	 public static void saveToFile(String password) {
	 	Scanner savePass = new Scanner(System.in);
	 	System.out.println("Do you want to save your new password to a file? (y/n)");
	 	String choice = savePass.nextLine();

	 	if (choice.equalsIgnoreCase("y")) {
	 		System.out.println("Enter the file name:");
	 		String fileName = savePass.nextLine();

	 		try {
	 			FileWriter myWriter = new FileWriter(fileName + ".txt");
	 			myWriter.write(password);
	 			myWriter.close();
	 			System.out.println("Your password has been saved to " + fileName + ".txt");
	 		} catch (IOException e) {
	 			System.out.println("An error occurred.");
	 			e.printStackTrace();
	 		}
	 	}
	 }
}

