public class GuthrieIndex{

    public static int GuthrieIndex(int num){
        int GuthrieIndex = 0;
        while(num != 1){
            
            if(num % 2 == 0){
                num = num / 2;
               
            }else{
                num = (num * 3) + 1;
                
            }
            GuthrieIndex++;
        }
        return GuthrieIndex;
    }

    public static void main(String [] args){

        System.out.println(GuthrieIndex(42));

    }
}