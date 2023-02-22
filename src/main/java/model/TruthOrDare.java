package model;

/**  
* Jonathan Argueta-Herrera - jiarguetaherrera  
* CIS175 Spring 2023
* Jan 17, 2023  
*/

public class TruthOrDare {
	private String choice;
	private String truth;
	private String dare;
	
	public TruthOrDare(String choice) {
		super();
		this.choice = choice;
		setChoice(choice);
	}

	public String getChoice() {
		choice.toUpperCase();
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}
	
	public String getTruth() {
		truth = "Whats your biggest fear";
		return truth;
	}

	public void setTruth(String truth) {
		this.truth = truth;
	}

	public String getDare() {
		dare = "Show the most embarrasing photo of yourself in your phone";
		return dare;
	}

	public void setDare(String dare) {
		this.dare = dare;
	}

	@Override
	public String toString() {
		return "TruthOrDare [choice=" + choice + "]";
	}
	
	

	

	
	
	

}
