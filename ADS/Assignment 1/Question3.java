class Question3{
	
	public static int secondLargest(int arr[], int total)
	{
		for(int i = 0; i < total; i++){
			for(int j = i+1; j < total; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr[total-2];
		
	}
	
	
	
	public static void main(String args[]){
		int arr[] = {1, 7, 4, 9, 6, 5, 8};
		int total = arr.length;
		System.out.println("Second Largest: " + secondLargest(arr, total));
	}
	
}