public class mainClass {
	public static void main(String[] args) {
		Calculator c1 =new Calculator();
		Calculator c2 =new Calculator();
		Calculator c3 =new Calculator();
		Calculator c4 =new Calculator();
		Calculator c5 =new Calculator();
			
		System.out.println(c1.Addition(10,20));
		System.out.println(c2.Subtraction(10,20));
		System.out.println(c3.Multiplication(10,20));
		System.out.println(c4.Division(10,20));
		System.out.println(c5.Modulus(10,20));
	}
}