

import java.io.*;
import java.util.*;

class Subsets {

	
	static void printSub(ArrayList<String> A, ArrayList<String> curr, int index)
	{
		if(index == A.size())
		{
			System.out.print(curr+" ");
			return;
		}

		printSub(A, curr, index + 1);
		curr.add(A.get(index));
		printSub(A,curr , index + 1);
	}
    public static void main(String [] args) 
    {
    	//String str = "kynj";
    	ArrayList<String> A= new ArrayList<>();
    	ArrayList<String> curr= new ArrayList<>();
    	A.add("1");A.add("2");A.add("3");
    	
    	
    	printSub(A,curr , 0);
        
    }

}