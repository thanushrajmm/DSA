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
