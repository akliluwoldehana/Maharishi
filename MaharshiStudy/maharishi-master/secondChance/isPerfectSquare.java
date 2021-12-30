import java.lang.Math;
public class isPerfectSquare{

public static int isperfect(int a){
	int flag = 0;
	double sqrtResult =  Math.sqrt(a);
	int base = (int) sqrtResult;

	if( sqrtResult - base == 0){
	flag = 1;
	}


return flag;
}


public static void main(String []args){

	System.out.println(isperfect(10));
	System.out.println(isperfect(9));
	System.out.println(isperfect(6));
	System.out.println(isperfect(25));
	
}







}
