package week6CodingAssignment;

public class AsteriskLogger implements Logger{

	
	// Prints three stars on either side of the given string
	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");
	}

		//
	@Override
	public void Error(String error) {
		// TODO Auto-generated method stub
		int starsNumber = error.length();
		starsNumber = starsNumber + 13;
		System.out.println("*".repeat(starsNumber));
		System.out.println("***ERROR: " + error + "***");
		System.out.println("*".repeat(starsNumber));
	}
	
	

}

