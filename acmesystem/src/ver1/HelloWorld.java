package ver1;

public class HelloWorld {
	
	public static void heyNow() {
		String Msg = "Hey Now!";
		System.out.println(Msg);
	}

	public static void whatFor(String str) {
		System.out.println(str + "stringArg, what for?");
	}

	public static void main(String[] args) {
		System.out.println("Hello from Eclipse");
		
		System.out.println("Daishuna is working locally on her branch");
		whatFor("Hey ");
	}

}
