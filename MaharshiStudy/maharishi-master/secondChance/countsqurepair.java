import java.lang.Math;
public class countsqurepair{

public static void main(String []args){
int [] a = {9,0,2,-5,7};
int counter = 0;
for(int i=0;i<5;i++){
for(int j=0;j<5;j++){

	if(i!=j){

	System.out.println("Indexs" + i + " " +j);
	System.out.println("Value at Indexs" + a[i] + " " +a[j]);

                System.out.println("SqaureRoot Value:"+Math.sqrt(a[i]+a[j]));
	if(a[i] > 0 && a[j] > 0 &&  a[i] < a[j] && Math.floor(Math.sqrt(a[i] + a[j])) == Math.sqrt(a[i] + a[j])){
                System.out.println("Sqaure pairs are:"+a[i]+":"+a[j]);
		counter++;
	}  
	}

}
}
System.out.println("Number of squrePrime is:"+counter);
}
}
