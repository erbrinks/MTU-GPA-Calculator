import java.util.*;


public class Main {
	
	public int classCounter = 0;
	
	
	public static void main(String[] args) {
		
		Double gradePoint = 0.0;
		int overallCredits = 0;
		int creditCount = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many classes are you taking? (numerical value)" + "\n" + "Please enter value here:");
		String classCount = sc.nextLine();
		Double[] allClassGrades = new Double[Integer.parseInt(classCount)];
		int allClassGradesCounter = 0;
		
		System.out.print("\n" + "Please add a class using the following syntax: [credit count], [grade point]. Ex: 4, 3.0" + "\n" + "Credit count meaning: A is 4.0, AB is 3.5, B is 3.0, BC is 2.5, C is 2.0, CD is 1.5, D is 1.0, F is 0.0" + "\n");
		
		//Loop to keep prompting class grades
		 do {
			System.out.println("Please enter next class information here:");
			String input = sc.nextLine();
			String[] info = input.split(",");
			for (int i = 0; i <= 3; i++) {
				if (i == 0) {
					creditCount = Integer.parseInt(info[i]);
					overallCredits = overallCredits + creditCount;
				} else if (i == 1) {
					gradePoint = Double.parseDouble(info[i]);
				}
			}
			allClassGrades[allClassGradesCounter] = calculator(gradePoint, creditCount);
			allClassGradesCounter++;
		} while (allClassGradesCounter < Integer.parseInt(classCount));
		
		//Loop to calculate the final GPA
		double points = 0.0;
		for (int i = 0; i < allClassGrades.length; i++) {
			points = points + allClassGrades[i];
			
		}
		double GPA = points / overallCredits;
		
		System.out.println("\n" + "Final GPA: " + GPA);
		
		
	}
	
	static double calculator(double gradePoint, int creditCount) {
		double classGrade = gradePoint * creditCount;
		return classGrade;
	}
	
	
}
