public class primeNumber {

public static int isPrime(int n){
int isPrime = 1;
int counter = 0;
for(int i=2;i<=n/2;i++){

	if(n % i == 0){
	isPrime = 0;
	}

}

return isPrime;
}

public static void main (String [] args){
	for (int i=2;i<100;i++)
	{
	System.out.println("Number"+i+"is prime:"+isPrime(i));
	}
}


}
