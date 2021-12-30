public class poe {

static int poeFinder(int []a){
	int poeIndex = 0;
	int leftSum =0;
	int rightSum = 0;

	for(int i=1;i<a.length;i++){
	
		//find left sum
		for(int j=0;j<i;j++){
		leftSum += a[j];
		}
		System.out.println(leftSum);
		//find right sum
		for(int j=a.length-1;j>i;j--){
		rightSum += a[j];
		}
		System.out.println(rightSum);
		//check if right sum and left sum are equal
		if(leftSum == rightSum){
		return i;
		}
	}


	return poeIndex;

}

public static void main(String []args){
	
	int []a= {1,2,6,2,0,1}	;
	System.out.println(poeFinder(a));

}


} 
