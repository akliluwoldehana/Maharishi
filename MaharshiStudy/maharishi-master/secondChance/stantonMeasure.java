public class stantonMeasure {

    public static int stantonMeasure(int []a){
        int oneFreq = 0;
        int stantonMeasure = 0;
        for (int i=0;i<a.length;i++){
            if(a[i]==1){
                oneFreq++;
            }
        }

        if(oneFreq != 0){
            for (int i=0;i<a.length;i++){
            if(a[i]==oneFreq){
                stantonMeasure++;
            }
        }
        }

        return stantonMeasure;
    }


    public static void main(String [] args){

        int []a={};
        System.out.println(stantonMeasure(a));

    }


}