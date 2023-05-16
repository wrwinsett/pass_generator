package pass_generator;

import java.util.Scanner;

public class AskPassQuestions {
	
	private static Scanner scanner;

    public AskPassQuestions() {
        scanner = new Scanner(System.in);
    }

    public static String[] readUserInputs() {
        String[] inputs = new String[4];

        System.out.println("What was your favorite song last month?");
        try {
			inputs[0] = scanner.nextLine();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        System.out.println("Who was your childhood pet?");
        inputs[1] = scanner.nextLine();

        System.out.println("What is your favorite number?");
        inputs[2] = scanner.nextLine();

        System.out.println("What was the number of your childhood home?");
        inputs[3] = scanner.nextLine();

        return inputs;
    }

}
