class Block {

	{System.out.println("Instance Block");}

	static { System.out.println("Static Block"); }
	
	{ System.out.println("Just a Block"); }

	public Block() {
		System.out.println("Constructor");
	}
	
	public static void main(String [] args) {
		System.out.println("Main Method");
		Block block  = new Block();
	}
}
