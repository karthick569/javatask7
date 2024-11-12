package task7;

import java.util.TreeMap;

public class Quetion6 {

	public static void main(String[] args) 
	{
	    TreeMap<Integer, String> employeeMap = new TreeMap<>();
		        employeeMap.put(101, "Aravind");
		        employeeMap.put(102, "Babu");
		        employeeMap.put(103, "Chandru");
		        employeeMap.put(104, "Dinesh");
		        employeeMap.put(105, "Elamathi");
		        System.out.println("Employee names :");
		        for (String name : employeeMap.values())
		        {
		            System.out.println(name);
		        }
		    }
	}


