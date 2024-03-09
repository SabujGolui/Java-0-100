import java.util.Scanner;

class loading {
	static final int PROGRESSBAR_LENGTH = 20;

	public static void drawProgressBar(int numerator, int denominator) {
		int percent = (int) (((double) numerator / (double) denominator) * 100);

		String bar = "[";
		int lines = round((PROGRESSBAR_LENGTH * numerator) / denominator);
		int blanks = PROGRESSBAR_LENGTH - lines;

		for (int i = 0; i < lines; i++)
			bar += "|";

		for (int i = 0; i < blanks; i++)
			bar += " ";

		bar += "] " + percent + "%";

		System.out.print(bar + "\r");
	}

	private static int round(double dbl) {
		int noDecimal = (int) dbl;
		double decimal = dbl - noDecimal;

		if (decimal >= 0.5)
			return noDecimal + 1;
		else
			return noDecimal;
	}
}

public class IndiaQ {

	public static int Question() {
		int count = 0;
		Scanner qizObj = new Scanner(System.in);
		String[] qna = { "What is the capital city of India? A)Delhi B)Kolkata C)Bangalore D)Hyderabad",
				"Which state is known as the “Fruit Bowl” of India? A)Delhi B)Kolkata C)Himachal Pradesh D)Hyderabad",
				"What is the national sport of India?", "In which continent is India located?",
				"Which state is known as the Land of Five Rivers", "What is the largest state in India by area?",
				"What is the national dance of India? " };

		String[] ans = { "A", "C", "Field hockey", "Asia", "Punjab", "Rajasthan", "Kathakali" };

		System.out.println("Loading...");
		for (int i = 0; i < 5; i++) {
			loading.drawProgressBar(i + 1, 5);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Start the quiz
		for (int i = 0; i < qna.length; i++) {
			System.out.println(qna[i]);
			String answ = qizObj.nextLine();

			if (answ.equalsIgnoreCase(ans[i])) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println("<-------- Welcome To IndiaQ ------>");
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Your Name ---->");

		String userName = myObj.nextLine();
		System.out.println("Welcome to the game ---->  " + userName);
		int score = Question(); // Start the quiz and get the score
		int percentage = score * 100 / 7;

		// Display the score and percentage
		System.out.println("Congratulations! You have completed the quiz.");
		System.out.println("Your Score : " + score);
		System.out.println("You Score : " + percentage + "%");
	}
}
