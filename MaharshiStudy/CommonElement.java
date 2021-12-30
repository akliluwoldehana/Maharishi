import java.util.Arrays;
public class CommonElement{

public static int[] f(int [] first,int [] second){

int [] output={};
int CommonArrayLength=0;

if(first == null || second == null){
return null;
}
if(first.length == 0 || second.length == 0){

	return output;
}


if(first.length > second.length){
CommonArrayLength = second.length;
}else{
CommonArrayLength = first.length;
}
int IndexCounter = 0;
int [] common=new int[CommonArrayLength];
for(int i=0;i<first.length;i++){
	for(int j=0;j<second.length;j++){
	if(first[i]==second[j]){
		common[IndexCounter]=first[i];
		System.out.println(first[i]);
		IndexCounter++;
	}else{
	continue;
	}

	}
	
}
if(IndexCounter==CommonArrayLength){
return common;
}else{

	int [] finalCommon = new int[IndexCounter];
	for(int x=0;x<finalCommon.length;x++){
	finalCommon[x]=common[x];
	}
	return finalCommon;
}
}

public static void main(String []args){

	int []first={1,8,2};
	int []second={7,7,7};

	System.out.println(Arrays.toString(f(first,second)));

}

}
