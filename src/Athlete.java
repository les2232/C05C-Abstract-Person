import java.util.Random;

public class Athlete extends Person {
	private Random randomNum = new Random();

	private String[] questions = {
			"What is your training routine?",
			"What are your training goals?",
			"What is the hardest part of training?",
			"What's your favorite sport?"
	};
	
	private String[] answers = {
			"Played a game last night",
			"Train for three hours a day",
			"It's important to be consistent",
			"Showing up beats motivating"
	};
	
	public Athlete(String myName, String occupation) {
		super(myName, occupation);
	}
	
	@Override
	public void whatIDo() {
		super.whatIDo();
		System.out.println("The game this weekend was great!");
	}

	@Override
	public void askQuestion() {
		int r = randomNum.nextInt(4);
		System.out.println(questions[r]);
		
	}

	@Override
	public void answerQuestion() {
		int r = randomNum.nextInt(4);
		System.out.println(answers[r]);
	}

}
