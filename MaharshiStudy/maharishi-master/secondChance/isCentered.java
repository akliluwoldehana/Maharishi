public class isCentered{

    public static int isCentered(int []a){
        int isCentered = 0;
        int sum = 0;
        int startIndex=1;
        int endIndex = a.length - 2;
        for(int i=startIndex;i<endIndex;i++){
            sum =+ a[i];

        }
        if(sum == 15){
            isCentered = 1;
            break;
        }else{
            if(endIndex-startIndex == 1){
                isCentered =0;
                break;
            }else
            startIndex++;
            endIndex--;
        }
        return isCentered;
    }
    
    public static void main(String []args){

        int []a={3, 2, 10, 4, 1, 6, 9};
        System.out.println(isCentered(a));
    }
}