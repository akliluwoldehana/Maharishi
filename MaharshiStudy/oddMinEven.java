public class oddMinEven {

public static int f(int []a){

int length=a.length;
int Even = 0;
int Odd= 0;

for(int i=0;i<length;i++){

if(a[i]%2==0){
Even += a[i];
}else{
Odd += a[i];
}
}
return Odd - Even;
}

public static void main(String []args){

int []a = {1,2,3,4};
int result=f(a);
System.out.println(result);

}
}
