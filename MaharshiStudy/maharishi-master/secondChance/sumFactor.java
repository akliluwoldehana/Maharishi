public class sumFactor{

public static int sumfactor(int []a){
    int arraySum = 0;
    int sumFactor = 0;

    for(int i=0;i<a.length;i++){
        arraySum += a[i];
    }
    for(int i=0;i<a.length;i++){
        if(arraySum == a[i]){
            sumFactor++;
        }
    }
   return sumFactor; 
}

public static void main(String []args){
    int a[]={1};
    System.out.println(sumfactor(a));
}

}