public class findPorcupine {
	
	public static void findprocupine(int n){
		for(; ;){
		n++;
		if (isPrime(n)){
		       if(n % 10 == 9){
			   if(findnextprime(n)%10==9){
				   System.out.println("I found the Procupine number it is:"+n);
					break;
			   }
		
	       	       }
			}
		}

	
	}


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

	findprocupine(138);
	}	

}
