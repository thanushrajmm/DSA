Problem Link -> [https://www.geeksforgeeks.org/problems/bubble-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=bubble-sort]
import java.io.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<n-1; i++){
			int didSwap = 0;
			for(int j=0; j<n-i-1;j++){
			if(arr[j]>arr[j+1]){
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				didSwap=1;
		}
		}
		if(didSwap==0){
			break;
		}
	}
	for(int i = 0; i<n; i++){
	System.out.print(arr[i]+" ");
}
}
}
TC -> O(n^2);
SC -> O(1);
