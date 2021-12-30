public class repsEqual{

    public static int repsEqual(int []a ,int  n){
      
      int repsEqual = 0;

      for(int lastIndex = a.length -1; lastIndex >=0; lastIndex--){
        int lastDigit = n % 10;
          System.out.println("LastIndex:"+a[lastIndex]+",LastDigit:"+lastDigit+"N:"+n);
          n = n / 10;
          if(lastDigit == a[lastIndex]){
              repsEqual = 1;
          }else{
              repsEqual = 0;
              break;
          }
      }
      return repsEqual;
    }

    public static void main(String [] args){

        int []a ={0,3, 2, 0, 5, 3};
        System.out.println(repsEqual(a,32053));

    }
}