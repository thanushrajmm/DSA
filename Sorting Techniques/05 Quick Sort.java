//[4, 2, 7, 3, 8, 5, 1]
import java.io.*;
import java.util.Scanner;

public class Main {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
           while(arr[i]<=pivot && i<high){
               i++;
           }
           while(arr[j]>=pivot && j>low){
               j--;
           }
           if(i<j){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
    }
    int temp1 = arr[low];
    arr[low] = arr[j];
    arr[j] = temp1;
    
    return j;
    }
    public static void quicksort(int arr[], int low, int high){
        if(low<high){
        int pIndex = partition(arr,low,high);
        quicksort(arr,low,pIndex-1);
        quicksort(arr,pIndex+1,high);
    }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		quicksort(arr, 0, n-1);
		for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
		
	    }
    }
