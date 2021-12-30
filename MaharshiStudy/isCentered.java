public class isCentered{

static int isCentered(int []a){

if(a.length%2==0){
return 0;
}
if(a.length==0){
return 0;
}
int MiddleIndex = (int) (a.length / 2);
int result=1;

for(int i=0; i<a.length; i++){
if(a[MiddleIndex] >=  a[i] && i != MiddleIndex){
result = 0;
}else{
continue;
}
}

return result;
}

public static void main(String []args){

int []sample = {3,2,1,4,5};
System.out.println(isCentered(sample)); 

}

}
