package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Hashing {
	int[] arr;
	public Hashing(int[] arr) {
		this.arr=arr;
	}
	public Hashing() {}
public boolean subArrayWithGivenSum(int[] arr, int sum) {
	
	HashSet<Integer> hs= new HashSet<>();
	int currSum=0;
	for(int i=0;i<arr.length-1;i++) {
		currSum=currSum+arr[i];
		if(currSum==sum)
			return true;
		if(hs.contains(currSum-sum))
			return true;
		hs.add(currSum);
	}
	return false;
}
public ArrayList<Integer>  frequencyOfElementQuery(ArrayList<Integer> A, ArrayList<Integer> B) {
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

    for(int i=0;i<A.size();i++){
       if(map.containsKey(A.get(i))){
           map.put(A.get(i),map.get(A.get(i))+1);
       }
       else
       map.put(A.get(i),1);
    }
    ArrayList<Integer> ans= new ArrayList<Integer>();
    for(int i=0;i<B.size();i++){
        if(map.containsKey(B.get(i))){
            ans.add(map.get(B.get(i)));
        }
        else
        ans.add(0);
    }
    return ans;
}
public int colorful(int A) {
    String str=Integer.toString(A);
    System.out.println(str);
    HashSet<Integer> set=new HashSet<>();       
    int[] pref=new int[str.length()];
    pref[0]=Character.getNumericValue(str.charAt(0));
    System.out.print(pref[0]+" ");
    for(int i=1;i<str.length();i++){
        pref[i]=Character.getNumericValue(str.charAt(i))*pref[i-1];
        System.out.print(pref[i]+" ");
    }
        int prod=0;
    for(int s=0;s<pref.length;s++){
        for(int e=s;e<pref.length;e++){
           if(s==0){
               prod=pref[e];
           }
           else{
               prod=pref[e]/pref[s-1];
           }
           if(set.contains(prod))
           return 0;
           else
           set.add(prod);
        }
    }
    System.out.println();
    return 1;
}

public int[] dNums(int[] A, int B) {
    int[] res=new int[A.length-B+1];
    HashMap<Integer,Integer> map=new HashMap<>();
     
    for(int i=0;i<B;i++){    
       if(map.containsKey(A[i]))
    	   map.put(A[i], map.get(A[i])+1);
       else
    	   map.put(A[i], 1);
    }
    res[0]=map.size();
    int c=1;    
    for(int i=B;i<A.length;i++){
    	if(map.containsKey(A[i])) 
            map.put(A[i],map.get(A[i])+1);
        else
            map.put(A[i],1);
    	
    	if(map.containsKey(A[i-B]) && map.get(A[i-B])==1) 
            map.remove(A[i-B]);
    	else
    		map.put(A[i-B], map.get(A[i-B])-1);
    		 
        res[c]=map.size();
        c++;
    }
   return res;
}
public int countPairSum(int[] A, int B) {
    final int mod = (int)(1e9 + 7);
   int count=0;
   HashMap<Integer,Integer> map=new HashMap<>();

 for(int i = 0 ; i < A.length ; i++){
       if(map.containsKey(B-A[i])){
           count=(count+ map.get(B-A[i]))%mod;
           System.out.println(count);
       }
       map.put(A[i],map.getOrDefault(A[i],0)+1);
   }
   return count;
}
public int countPairDifference(int[] A, int B) {
    final int mod = (int)(1e9 + 7);
    int count=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    int p;
  for(int i = 0 ; i < A.length ; i++){
	   //p=Math.abs(B-A[i]);
      if(map.containsKey(B-A[i])){
          count=(count+ map.get(B-A[i]))%mod;
      }
      map.put(A[i],map.getOrDefault(A[i],0)+1);
    }
    return count;
}
}
