import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
public class BattingStatistics {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DecimalFormat decimalFormat = new DecimalFormat ("0.000");
		
		String choice = "yes";
		int atBatResults;
		int totalScore = 0;
		int timesAtBat = 0;
		
		System.out.println("Welcome to Batting AVerage Calculator");
		
		ArrayList <Integer> inputs = new ArrayList<Integer>();

		while (choice.equalsIgnoreCase("yes")) {
			
			
			System.out.println("Enter number of times at bat:");
			timesAtBat = sc.nextInt();
			
			System.out.println("0 = Out, 1 = Single, 2 = Double, 3 = Triple, 4 = Home Run");
			
			for (int i = 0; i < timesAtBat; i++){
			int x = i + 1;	
			
			System.out.println("input results for at bat "+ x +": "+"\t");
			
			atBatResults = sc.nextInt();
			totalScore = totalScore+atBatResults;
			inputs.add(atBatResults);
			
			}
			
			float battingAverage = (float) 3/ (float) timesAtBat;
			System.out.println("\nBatting Percentage:" + decimalFormat.format(battingAverage));
			
			float sluggingPercentage = (float) totalScore / (float) timesAtBat;
		
			
			System.out.println("\nBatting Percentage:" + decimalFormat.format (sluggingPercentage));
			System.out.println("Another Batter? y/n:");
			choice = sc.next();
			System.out.println();
			
			if (choice.equalsIgnoreCase("n")){
				
				System.out.println("Peace!");
				sc.close();
			
			}

	}

	for(int input:inputs){
		System.out.println("input entered " + input);
				}
		}
}