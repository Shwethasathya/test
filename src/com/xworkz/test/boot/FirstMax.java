package com.xworkz.test.boot;

public class FirstMax{

	public static void main(String[] args) {
		
int arr[]= {45,333,76,29,900,23,474,654,29,454};
int temp=0;

for(int i=0; i<arr.length;i++) {
	
		if(arr[i]>temp) {
			temp=arr[i];
	}
	
}
System.out.println(temp);
		
	}
}

