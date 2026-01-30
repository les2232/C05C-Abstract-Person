
public class Musician extends Person {
	private String instrumentPlayed;
	private String bandName;
	
	public Musician(String myName, String occupation, String instrumentPlayed, String bandName) {
		super(myName, occupation);
		this.instrumentPlayed = instrumentPlayed;
		this.bandName = bandName; 
	}

	@Override
	public void whatIDo() {
		super.whatIDo();
		System.out.println("I got a gig this weekend.");
	}
	
	@Override
	public void askQuestion() {
		System.out.println("Do you wanna hear my band, " + bandName + "?");
		
	}
	@Override
	public void answerQuestion() {
		System.out.println("I play the " + instrumentPlayed + " in " + bandName + ".");

	}
	
}
