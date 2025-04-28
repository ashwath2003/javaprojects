package myJavaProjects;
import java.util.Scanner;

	public class myquizapp {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        String[] questions = {
	            "1. What is the capital of France?",
	            "2. Which data type is used to create a variable that should store text?",
	            "3. Who is the founder of Microsoft?",
	            "4. What is the output of 3 + 2 * 2?",
	            "5. Which company developed Java?"
	        };

	        String[][] options = {
	            {"A) Paris", "B) Rome", "C) Madrid", "D) Berlin"},
	            {"A) int", "B) float", "C) char", "D) String"},
	            {"A) Steve Jobs", "B) Bill Gates", "C) Mark Zuckerberg", "D) Elon Musk"},
	            {"A) 10", "B) 7", "C) 8", "D) 12"},
	            {"A) Oracle", "B) Microsoft", "C) Apple", "D) IBM"}
	        };

	        char[] answers = {'A', 'D', 'B', 'B', 'A'};

	        int score = 0;

	        System.out.println("Welcome to the Java Quiz!");
	        System.out.println();

	        for (int i = 0; i < questions.length; i++) {
	            System.out.println(questions[i]);
	            for (String option : options[i]) {
	                System.out.println(option);
	            }

	            System.out.print("Enter your answer (A/B/C/D): ");
	            char userAnswer = Character.toUpperCase(scan.next().charAt(0));

	            if (userAnswer == answers[i]) {
	                System.out.println("Correct!\n");
	                score++;
	            } else {
	                System.out.println("Wrong! The correct answer was " + answers[i] + ".\n");
	            }
	        }

	        System.out.println();
	        System.out.println("Quiz Completed!");
	        System.out.println("Your Score: " + score + "/" + questions.length);

	        scan.close();
	    }
	}


