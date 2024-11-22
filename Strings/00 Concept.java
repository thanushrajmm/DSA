when the input in given in the String form - "100 200 300".
  to convert this into an integer;
import java.util.*;
public class Main{
  public static void main(Strings[] arg){
    
  Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine(); 
    String input = sc.nextLine();
    String[] parts = input.split(" ");
    int[] values = new int[n];
    
   for (int i = 0; i < n; i++) {
            values[i] = Integer.parseInt(parts[i].trim());
  }
-----------------------------------------------------------------------------------------------------------------------
Problem Breakdown
A meeting is scheduled for 10:00 am.
We receive a list of arrival times in HH:MM format.
Our goal is to count how many people arrived after 10:00 am.
  
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arrivalTimes = input.split(" ");
        
        int lateCount = countLateComers(arrivalTimes);
        System.out.println(lateCount);
        
        scanner.close();
    }
    
    public static int countLateComers(String[] arrivalTimes) {
        int lateCount = 0;
        
        for (String time : arrivalTimes) {
            // Split time into hours and minutes
            String[] parts = time.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            
            // Check if the time is later than 10:00 am
            if (hours > 10 || (hours == 10 && minutes > 0)) {
                lateCount++;
            }
        }
        
        return lateCount;
    }
}
    -------------------------------------------------------------------------------------------------
      print only the alphabets
String s = "Word#$#$% Word 1234";
 StringBuffer r = new StringBuffer();
 for (int k = 0; k < s.length(); k++) {
     if(Character.isLetter(s.charAt(k)))
        r.append(s.charAt(k));     
 }
 System.out.println("Result " + r.toString());
    ----------------------------------------------------------------------------------------------

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        String[] parts = input.split(" ");
        double slowest = Double.MAX_VALUE;
        String ans = "";
        
        for (String items : parts) {
            String[] cars = items.split("@");
            String carname = cars[0].trim();   // Changed 'parts' to 'cars'
            double mileage = Double.parseDouble(cars[1].trim());  // Changed 'parts' to 'cars' and used Double.parseDouble
            
            if (mileage < slowest) {
                slowest = mileage;
                ans = carname;
            }
        }
        
        System.out.print(ans);
    }
}
    --------------------------------------------------------------------------------------------------------
Identify the missing letter in a nearly complete palindrome string S
For input malayaam:

left = 2 points to 'l' and right = 5 points to 'y'.
A mismatch is found, so the missing character is determined as 'l' which is printed as output.
For input abcddcb:

left = 0 points to 'a' and right = 6 points to 'b'.
A mismatch is found at the start, so the missing character is determined as 'a' which is printed as output.
      
public class MissingAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        
        int left = 0;
        int right = s.length() - 1;
        char missingChar = ' ';
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // The mismatch found, take the character that is out of place
                if (s.charAt(left + 1) == s.charAt(right)) {
                    missingChar = s.charAt(left);  // left character is missing in the palindrome
                } else {
                    missingChar = s.charAt(right); // right character is missing in the palindrome
                }
                break;
            }
            left++;
            right--;
        }
        
        System.out.println(missingChar);
    }
}
