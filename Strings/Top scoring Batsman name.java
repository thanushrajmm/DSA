The runs scored by N batsmen of a cricket team is passed as the input to the program. 
The program must print the name of the batsman who scored the highest runs. 
(You can assume that no two batsmen will be the top scorers). 
Input Format: The first line denotes the value of N. Next N lines will contain the name of the batsman and the runs score (both separated by a comma) 
Output Format: The first line contains the name of the batsman with the top score. 
Boundary Conditions: 2 <= N <= 11 The length of the names will be from 3 to 100. 
The value of the runs will be from 0 to 500. 
  Example 
Input/Output 1: 
Input: 5 
  BatsmanA,45 
  BatsmanB,52 
  BatsmanC,12 
  BatsmanD,9 
  BatsmanE,78 
  Output: BatsmanE

  
import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of batsmen
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input

        // Create a HashMap to store batsman names as keys and their scores as values
        HashMap<String, Integer> map = new HashMap<>();
        
        // Read each batsman name and score, then store it in the map
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(","); // Split the input by comma
            String batsman = parts[0].trim();  // Extract and trim the batsman name
            int score = Integer.parseInt(parts[1].trim()); // Extract and parse the score
            map.put(batsman, score);
        }

        // Variables to keep track of the top scorer's name and the highest score
        String topScorer = "";
        int highScore = -1;
        
        // Iterate through the entries in the map to find the highest scorer
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String batsman = entry.getKey();  // Get the batsman's name
            int score = entry.getValue();     // Get the batsman's score

            // Check if the current score is higher than the highest score
            if (score > highScore) {
                highScore = score;           // Update the highest score
                topScorer = batsman;         // Update the top scorer
            }
        }
        
        // Print the name of the top scorer
        System.out.print(topScorer);
    }
}
