class Solution {
    public int maxProfit(int[] arr) {
         int n = arr.length;
        int[] before = new int[n];
    	int min = arr[0];
    	int high = 0;
    	for(int i=0; i<n; i++){
    		if(arr[i] < min){
    			min = arr[i];
    		}
    		if(arr[i] - min > high){
    			high = arr[i] - min;
    		}
			before[i] = high;
    	}
    	
    	int[] after = new int[n];
    	int max = arr[n-1];
    	high = 0;
    	for(int i = n-1; i>=0; i--){
    		if(arr[i] > max){
    			max = arr[i];
    		}
    		if(max - arr[i] > high){
    			high = max - arr[i];
    		}
    		after[i] = high;
    	}
    	
    	int mp = 0;
    	for(int i=0; i<n; i++){
    		if(before[i] + after[i] > mp)
    			mp = before[i] + after[i];
    	}
        
    	return mp;
    }
}