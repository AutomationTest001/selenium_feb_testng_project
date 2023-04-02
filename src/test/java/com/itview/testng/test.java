package com.itview.testng;

public class test {

	public static void main(String[] args) {

		int[] array1 = new int[] {8, 2, 3, 4, 5};   
		int[] array2 = new int[] {6, 7, 2, 9, 4,8,7};  
		boolean flag;
		
		for(int i=0;i<array1.length;i++) {
			flag=false;
			for(int j=0;j<array2.length;j++) {
			if(array1[i]==array2[j]) {
				flag=true;
			}
			}
			
			if(flag==true) {				
				//System.out.print("Matching : "+array1[i]+"\n");
			}
			if(flag==false) {				
				System.out.print("No Matching : "+array1[i]+"\n");
			}
		}
	}

}
