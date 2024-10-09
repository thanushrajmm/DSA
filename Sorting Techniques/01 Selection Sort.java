Problem Link -> [https://www.geeksforgeeks.org/problems/selection-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=selection-sort]

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
		
		
		for(int i = 0; i<n-1; i++){
			int mini = i;
			for(int j = i+1; j<n; j++ ){
				if(arr[j]<arr[mini]){
					mini = j;
				}
			}
			int temp = arr[mini];
			arr[mini]=arr[i];
			arr[i] = temp;
		}
		for(int i = 0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
TC -> O(n^2);
SC -> O(1);
