
public class Traveler extends Person {

	private int questionNum;
	private int answerNum;
	
	private String[] questions = {
		"What's the best place you've been?",
		"Do you enjoy flying?"
	};
	
	private String[] answers = {
			"I like cuisine from all over the world",
			"I like spur of the moment trips."
		};
	
	public Traveler(String myName, String occupation) {
		super(myName, occupation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void whatIDo() {
		super.whatIDo();
		System.out.println("I love to travel.");
	}
	
	@Override
	public void askQuestion() {
		System.out.println(questions[questionNum]);
		questionNum += 1;
		
		if (questionNum % 2 == 0) {
			questionNum = 0;
		}
	}

	@Override
	public void answerQuestion() {
		System.out.println(answers[answerNum]);
		answerNum += 1;
		
		if (answerNum % 2 == 0) {
			answerNum = 0;
		}
	}
	

}
