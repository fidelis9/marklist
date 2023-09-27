package programs;
import java.util.Scanner;

public class marklist {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Entries:  ");
        int numSub = scanner.nextInt();
        String [] StudentNames = new String [numSub];
        int Mark1[] = new int[4], Mark2[] = new int[4], Mark3[] = new int[4];
        int [] roll = new int [numSub];
        char result= 'P';
        int Total[] = new int[4];
    	float Average[] = new float[4];
    	String [] grade = new String[4];
        
        for(int i = 0; i < numSub; i++) {
        	System.out.println("Enter the roll number: ");
        	roll[i] = scanner.nextInt();
        	System.out.println("Enter the name: ");
        	StudentNames[i] = scanner.next();
        	System.out.println("Enter Mark1 score: ");
        	Mark1[i] = scanner.nextInt();
        	System.out.println("Enter Mark2 score: ");
        	Mark2[i] = scanner.nextInt();
        	System.out.println("Enter Mark3 score: ");
        	Mark3[i] = scanner.nextInt();
        
        	Total[i] = Mark1[i] + Mark2[i] + Mark3[i];
        	Average[i] = Total[i] / 3;
        	
        	if (Average[i] >= 80 ) {grade[i] = "A";}
        	else if (Average[i] >= 75) {grade[i] = "B+";}
        	else if (Average[i] >= 65) {grade[i] = "B";}
        	else if (Average[i] >= 55) {grade[i] = "C+";}
        	else if (Average[i] >= 50) {grade[i] = "C";}
        	else if (Average[i] >= 40) {grade[i] = "D";}
        	else if (Average[i] < 40) {grade[i] = "F";}
        	
              	}
       System.out.println("");
       System.out.println("**************************************************************************");
       System.out.println("\t\t\t STUDENT MARKLIST\t\t");
       System.out.println("**************************************************************************");
       System.out.println("ROLL\t NAME\t MARK1\t MARK2\t MARK3\t TOTAL\t RESULT\t Average GRADE\t ");
       System.out.println(""+roll[0]+ "\t "+StudentNames[0]+ "\t "+Mark1[0]+ "\t"+Mark2[0]+ "\t"+Mark3[0]+ "\t "+Total[0]+ "\t"+result+ "\t"+Average[0]+ "\t\t" +grade[0]);
       System.out.println(""+roll[1]+ "\t "+StudentNames[1]+ "\t "+Mark1[1]+ "\t"+Mark2[1]+ "\t"+Mark3[1]+ "\t "+Total[1]+ "\t"+result+ "\t"+Average[1]+ "\t\t" +grade[1]);
       System.out.println(""+roll[2]+ "\t "+StudentNames[2]+ " "+Mark1[2]+ "\t"+Mark2[2]+ "\t"+Mark3[2]+ "\t "+Total[2]+ "\t"+result+ "\t"+Average[2]+ "\t\t" +grade[2]);
       System.out.println(""+roll[3]+ "\t "+StudentNames[3]+ "\t "+Mark1[3]+ "\t"+Mark2[3]+ "\t"+Mark3[3]+ "\t "+Total[3]+ "\t"+result+ "\t"+Average[3]+ "\t\t" +grade[3]);
       
      
        
 
	}
       
             
             
             
            }
        	
        
        
	
	

       
        	
        	
        	
        	
               
        

	


