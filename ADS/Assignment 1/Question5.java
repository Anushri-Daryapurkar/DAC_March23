class Question5{
	
	public static int LargestSmallest(int numbers[]){
		int largest = numbers[0];
		int smallest = numbers[0];
		for(int i = 0; i<numbers.length; i++){
			if(largest < numbers[i])
				largest = numbers[i];
			
			if(smallest > numbers[i])
				smallest = numbers[i];
		}
		
		System.out.println("Smallest Number: "+smallest);
		return largest;
	}
	
	public static void main(String args[]){
		int numbers[] = {12, 79, 5, 98, 124};
		System.out.println("Largest Number: " + LargestSmallest(numbers));
	}	
}