public class largestAdjacentSum{

    public static int largestAdjecentSum(int []a){
        int Lsum = 0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]+a[i+1] > Lsum){
                Lsum = a[i]  + a[i+1];
            }
        }
    return Lsum;
    }
    public static void main(String []args){
        int []a={1,1,1,1,1,2,1,1,1};
        System.out.print(largestAdjecentSum(a));

    }
}