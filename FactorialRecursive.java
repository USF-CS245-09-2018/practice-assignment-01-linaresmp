public class FactorialRecursive implements Factorial{

	public int factorial(int n){
		int total = n;

		if(n==1){
			return 1;
		}

		if (n>1){
			total = n*factorial(n-1);
			
			}
		return total; 


		


	}
	
}