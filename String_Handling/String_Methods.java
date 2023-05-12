package String_Handling;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello World";

		// Length
		int x = s1.length();
		System.out.println(x);

		System.out.println();

		// CharAt()
		char ch = s1.charAt(0);
		System.out.println(ch);
		System.out.println((int)s1.charAt(0));

		System.out.println();

		// toCharArray
		char arr[] = s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(arr[i]);

		}
		System.out.println();

		// getBytes
		byte[] arr1 = s1.getBytes();
		for (int y : arr) {
			System.out.println(y);

		}
		System.out.println();

		// indexof
		int z = s1.indexOf('H');
		System.out.println(z);

		System.out.println();

		int z1 = s1.indexOf('l');
		System.out.println(z1);

		// z1=-1;

//			do {
//				z1=s1.indexOf('H',z1+1);
//				System.out.println(z1);
//			}
		// z=-1;
		while (z1 != -1) {
			z1 = s1.indexOf('l', z1 + 1);

			if (z1 == -1) {
				break;
			}
			System.out.println(z1);

		}

		System.out.println();

		// lastindexOf
		int p = s1.lastIndexOf('l');
		System.out.println(p);

		System.out.println();

		// equals(==)
		// Example 1 in which the object of string is created reference is different
		// hence it not equal

		String a = new String("abc");
		String b = new String("abc");

		if (a == b) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}

		// Example 2 only string is declared

		String a1 = "Hello";
		String b1 = "Hello";

		if (a1 == b1) {
			System.out.println("Equals");
		} else {
			System.out.println("Not equals");
		}
	}

}
