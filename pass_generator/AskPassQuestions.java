package pass_generator;

import java.util.Scanner;

public class AskPassQuestions {
	
	private static Scanner scanner;

    public AskPassQuestions() {
        scanner = new Scanner(System.in);
    }

    public static String[] readUserInputs() {
    	System.out.println("Hey! We're gonna ask some questions to create a new password for you.");
    	System.out.println("Please answer all questions in the form of one word or numerical answers.");
    	
    	 try {
             // Pause execution for 1 second (1000 milliseconds)
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
    	
        String[] inputs = new String[7];

        System.out.println("What was your favorite song last month?");
        inputs[0] = scanner.nextLine();

        System.out.println("Who was your childhood pet?");
        inputs[1] = scanner.nextLine();

        System.out.println("What is your favorite number?");
        inputs[2] = scanner.nextLine();

        System.out.println("What was the number of your childhood home?");
        inputs[3] = scanner.nextLine();
        
        System.out.println("Who was your first best friend?");
        inputs[4] = scanner.nextLine();
        
        System.out.println("How many members are you in your family?");
        inputs[5] = scanner.nextLine();
        
        System.out.println("What is your mother's maiden name?");
        inputs[6] = scanner.nextLine();

        return inputs;
    }

}
