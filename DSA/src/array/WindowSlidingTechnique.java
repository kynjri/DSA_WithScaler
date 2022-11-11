package array;

public class WindowSlidingTechnique {

	public static void main(String[] args) {
		//int k=2;
		int[] arr= {1,8,10,20,7,2};
		//System.out.println("maximum sum of "+k+"="+WST(arr,k));
		int sum=27;
		
		System.out.println(checkSum(arr, sum));

	}
	static int WST(int[] arr,int k){
		int sum=0;
		for(int i=0;i<k;i++) {
			sum=sum+arr[i];
		}
		//System.out.println(sum);
		int curr_sum=sum;
		for(int i=k;i<arr.length;i++) {
			curr_sum=curr_sum+arr[i]-arr[i-k];
			sum=Math.max(curr_sum, sum);
			//System.out.println(curr_sum);
		}
		return sum;
		}
	static boolean checkSum(int[] arr,int sum){
		int curr_sum=0;
		for(int i=0,j=0;i<arr.length;i++) {
			curr_sum+=arr[i];
			//System.out.println("c"+curr_sum);
			if(sum==curr_sum)
				return true;
			while(curr_sum>sum) {
				curr_sum-=arr[j];
				//System.out.println(curr_sum);
				if(sum==curr_sum)
					return true;
						
				j++;
			}
				
		}
		return false;
		
	}

}
