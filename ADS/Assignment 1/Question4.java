class Question4{
	
	public static void duplicateElement(int arr[]){
		for(int i = 0; i<arr.length; i++){
			for(int j = i+1; j<arr.length; j++){
				if(arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}
	
	
	public static void main(String args[]){
		int arr[] = {1, 4, 6, 3, 2, 4, 8, 2, 8, 2};
		duplicateElement(arr);
		
	}
	
}