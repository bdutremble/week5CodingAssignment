package week6CodingAssignment;

public class App {

	public static void main(String[] args) {
		
		AsteriskLogger appAsterisk = new AsteriskLogger();
		SpacedLogger appSpaced = new SpacedLogger();
		
		appAsterisk.Log("Pants");
		System.out.println();
		appAsterisk.Error("Something has gone wrong!");
		System.out.println();
		appSpaced.Log("Stretch");
		System.out.println();
		appSpaced.Error("Oh no, an error!");

	}

}
