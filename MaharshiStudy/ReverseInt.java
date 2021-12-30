public class ReverseInt {

static int reverse(int n){

int sign = 1;

int lastDigit;
int Reversed=0;

if(n<0){

sign = -1;
n=-n;
}

while(n>0){

	lastDigit = n % 10;
	Reversed = (Reversed * 10)+ lastDigit;
	n = n / 10;
}

return Reversed;
}

public static void main(String []args){
	System.out.println((int) reverse(65));
}
}
