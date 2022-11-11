package sorting;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LexicalSorting ls=new LexicalSorting();
		ComparatorBased cb=new ComparatorBased();
		ArrayList<Integer> a=new ArrayList<>();
		a.add(15);a.add(11);a.add(7);a.add(19);//a.add(1);
		
		int[] arr= {36, 63, 63, 26, 87, 28, 77, 93, 7};
		int[] ans=cb.tensPlaceSort(arr);
		
       for(int i:ans)
    	   System.out.print(i+" ");
	}

}
