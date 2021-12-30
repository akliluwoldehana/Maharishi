public class ConcatenatedSum{

    public static void CheckConcatenatedSum(int num,int catlen){
        int lastDigit; 
        int sum=1;
        while(num != 1){
            lastDigit = num % 10;
            
            sum = sum + lastDigit;
            System.out.println(lastDigit);
            num = num / 10;
        }

    }

    public static void main(String []args){
        CheckConcatenatedSum(198,3);

    }
}