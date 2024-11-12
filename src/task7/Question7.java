package task7;

import java.util.ArrayList;
import java.util.List;

public class Question7 {

	public static void main(String[] args)
	{ 

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Dates");

        String[] array = list.toArray(new String[0]);

        System.out.println("Array elements:");
        for (String fruit : array) 
        {
            System.out.println(fruit);
        }
    }


	}


