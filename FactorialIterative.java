
public class FactorialIterative implements Factorial{

	public int factorial(int n){
		int total = n;
		for(int a = n-1; a > 0; a-- ){
			total = total * a ;
			

		}
		return total;
	}

	
}