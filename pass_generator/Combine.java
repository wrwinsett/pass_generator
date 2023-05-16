package pass_generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Combine {
	public static String combine(String... strings) {
		//allows you to add as many strings as you want
	    List<String> stringList = new ArrayList<>();
	    //using an array list is for flexibility
	    Collections.addAll(stringList, strings);
	    
	    int size = stringList.size();
	    //gives us the size of the list
	    
        Random random = new Random();
        // generates random numbers
        
        for (int i = size - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Collections.swap(stringList, i, j);
        }
        
	    return String.join(".", strings);
	}

}
