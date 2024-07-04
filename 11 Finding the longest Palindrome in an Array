Example:
121, 2322, 54545, 999990
O/P -> 545545

Solution:
import java.util.Map;
import java.util.Scanner;

class Main
{
    public static boolean isPalindrome(int n){ //function to check the element is Palindrome
        int rem, num, rev = 0;
        num = n; 
        while(n!=0){
            rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }
    if(num == rev){
        return true;
    }
    else return false;
    }
    public static int largest(int []arr, int n){    //Arranging the Array in descending Order 

        int i,j,temp;
        //descending Order 
        for(i=0;i<n;i++){
            for(j = 0;j<n;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(i = 0;i<n;i++){          //Checking the array for the largest palindrome;
            if(isPalindrome(arr[i]))
            return arr[i];           //if yes, return the element;
        }
        return -1;                   //else return -1;
    }
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the size of an array");
    int size = s.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the elements of an array");
    for(int i = 0; i<size; i++)
        arr[i] = s.nextInt();

    int larger = largest(arr, size);             //storing the largest palindrome in larger         
    if(larger == -1){
        System.out.println("No Palindrome");
    }
    else
        System.out.println("Largest Palindrome in the Array" + larger);
    
}
}
