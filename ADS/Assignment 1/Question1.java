class Question1{
	
	public static int missingNumber(int numbers[], int n){
		int sum = ((n + 1) * (n + 2)) / 2;
		for(int i = 0; i<n; i++)
			sum -= numbers[i];
		return sum;
	}
	
	public static void main(String args[]){
		int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20};
		int n = numbers.length;
		System.out.println("Missing number is "+missingNumber(numbers, n));
	}	
}