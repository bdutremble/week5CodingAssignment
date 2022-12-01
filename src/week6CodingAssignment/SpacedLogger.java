package week6CodingAssignment;

public class SpacedLogger implements Logger {

	// Stretches out provided string by replacing the lack of space between letters with a space and then trims off any blank spaces
	@Override
	public void Log(String log) {
		System.out.println(log.replace(""," ").trim());
	}

	// Adds ERROR in front of the original stretched string
	@Override
	public void Error(String error) {
		System.out.println("ERROR: " + error.replace(""," ").trim());
		
	}

}
