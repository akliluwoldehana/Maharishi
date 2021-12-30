public class IsGuthrieSequence {


    public static int IsGuthrieSequence(int []a){

        int isGuthrie = 1;
        if(a[a.length - 1] != 1){
            isGuthrie = 0;

        }else{
            for(int i=0; i<a.length -1 ;i++){

                if(a[i] % 2 == 0 ){
                    if(a[i] / 2 != a[i+1]){
                        isGuthrie = 0;

                    }

                }else{
                    if((a[i] * 3) +1 != a[i+1]){
                        isGuthrie = 0;
                    }

                }

            }

        }   

return isGuthrie;

    }
    public static void main(String [] args){


        int [] a = {7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1};
        System.out.println(IsGuthrieSequence(a));

    }

}