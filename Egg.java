public class Egg {
	public Egg() {
		System.out.println("Constructor");
		this.number = 5;
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		Egg egg = new Egg();
		System.out.println(egg.number);
	}

	private int number = 3;

	{
	 System.out.println("Block");
	 number = 4; 
	}
 }
