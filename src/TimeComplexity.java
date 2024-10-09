public class TimeComplexity {
//O
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);// O(1)
		for (int j = 0; j < 10; j++) {
			System.out.print(j + " ");

		}
		System.err.println("+++++++++++");
//1+n+n+n
//1+3n linear equation
//3n
//n----O(n)
		for (int j = 0; j < 10; j++) {

			for (int m = 0; m < 10; m++) {

				System.out.print(j + " " + m);
			}
			System.out.println();

		}
//(1+n+n+n)(1+n+n+n) //quadratic equation
//(1+3n)(1+3n)
//1+3n+3n+9n^2 
//1+6n+9n^2
//6n+9n^2
//3(2n+3n^2)
//2n+3n^2
//n(2+3n)
//3n^2
//O(n^2)		
		System.err.println("+++++++++++");
		for (int j = 0; j < 10; j++) {

			for (int m = 0; m < 10; m++) {

				for (int n = 0; n < 10; n++) {

					System.out.print(j + " " + m + " " + n);
				}
			}
			System.out.println();

		}

	}

}
