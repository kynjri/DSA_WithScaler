package sorting;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LexicalSorting ls=new LexicalSorting();
		//ComparatorBased cb=new ComparatorBased();
		//BubbleSort bs=new BubbleSort();
		CountSort cs=new CountSort();
		ArrayList<Integer> a=new ArrayList<>();
		a.add(15);a.add(11);a.add(7);a.add(19);//a.add(1);
		
		int[] arr= {6, 3, 3, 6, 7, 8, 7, 3, 7};
		int[] ans=cs.countSort(arr);
		
       for(int i:ans)
    	   System.out.print(i+" ");
	}

}
