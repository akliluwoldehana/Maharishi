public class PrimeCount{

static int primeCount(int start,int end){
	int primeCounter =0;
        int counter=0; 
	for (int i=start;i<=end;i++){
		
	counter=0;
	
	for(int j=1;j<=i;j++){
	if(i%j==0){
	counter++;
	}
	}
	if(counter==2){
	primeCounter++;
	}


	}
	
	

return primeCounter;
}

public static void main(String []args){

	System.out.println(primeCount(-10,6));

}

} 
