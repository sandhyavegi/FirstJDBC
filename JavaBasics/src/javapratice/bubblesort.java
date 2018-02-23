package javapratice;

public class bubblesort {

	public static void main(String[] args) {
	int intArray[]={9,7,8,5,6};
	for(int i:intArray){
		System.out.println(i);
		
	}
	System.out.println("before sorting");
      bubblesort(intArray) ;
      for(int i:intArray){
  		System.out.println(i);
	}
	}

	private static void bubblesort(int[] intArray) {
		int temp=0;
		for(int i=0;i<intArray.length;i++){
			for(int j=1;j<(intArray.length)-i;j++){
				if(intArray[j-1]>intArray[j]){
					temp=intArray[j-1];
					intArray[j-1]=intArray[j];
					intArray[j]=temp;
				
				
				}
				
			
			}
		}
		
	}

}
