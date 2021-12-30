public class FindNextPrimeNum {

public static boolean isPrime(int n){
boolean isPrime = true;

	for(int i=2;i<=n/2;i++){
	
		if(n % i == 0){
		isPrime = false;
		}
	
	}

return isPrime;
}
public static int findnextprime(int n){
	n++;
	while(!(isPrime(n))){
	
		n++;
	
	}
return n;
}



public static void main(String [] args){

	System.out.println(findnextprime(10));
}

}
