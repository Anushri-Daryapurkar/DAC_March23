class Question7{
	
	
	public static void pairs(int arr[], int sum){
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] + arr[j] == sum)
					System.out.println("(" + arr[i] + "," + arr[j] + ")");
			}
		}
	}		
	
	
	public static void main(String args[]){
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 4};
		int sum = 8;
		
		pairs(arr, sum);
	}
	
}