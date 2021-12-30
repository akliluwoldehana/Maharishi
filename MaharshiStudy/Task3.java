public class Task3{

static char []f(char []a,int start,int len){

	int arrayLength=0;
	if(len > a.length+1 || start > a.length || start < 0 || len < 0 || a.length == 0){
	return null;
	}
	for(int i=start;i<=len-1;i++){
		arrayLength++;
	}
	char []result = new char[arrayLength];

	for(int i=start;i<=len-1;i++){
	result[i]=a[i];
	}
return result;
}

public static void main(String []args){

	char []a={'a','b','c'};
	char []result = f(a,1,3);
	if(result == null){
	System.out.println("Null");
	}else{
	for (int i=0; i<result.length;i++){
	System.out.println(result[i]);
	}
	}
}
}
