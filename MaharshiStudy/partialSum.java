public class partialSum{

static void psum(int []a,int n){

	int psum = 0;
	int ppsum = 0;
	int counter = 0;
	for(int i=0;i<a.length;i++){
	psum = psum + a[i];
	ppsum = psum - a[i];
	System.out.println("Crnt:"+psum);
	System.out.println("prev:"+ppsum);

	if(ppsum <= n && psum > n){
	counter++;
	}
	}

	System.out.println("nUpCount:"+counter);
}

public static void main(String []args){

	int []a={1,2,-1,5,3,2,-3};
	psum(a,20);
}



}
