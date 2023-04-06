package exceptionsandfiles;

public class CommondExceptions {
public static void main(String[] args) {
	int a = 5;
	int b = 0;
	
	// identify thepotential problem area
	//sorround with try catch block
	try {
	int c = a/b;
	
	}catch(ArithmeticException e) {
		System.out.println("CANOT DIVIDE BY ZERO");
		System.out.println(e.toString());
	}
	
	String[] states = {"texas", "california","new york"};
	
	try {
	for (int i = 0; i<=states.length;i++) {
		System.out.println(states[i]);
	}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
}
}
