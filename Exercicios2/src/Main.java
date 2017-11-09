
public class Main {

	public static void main(String[] args) {

		int[] a = new int[100];

		int[] b = new int[100];
		
		int[] c = new int[100];

		for (int i = 0; i < a.length; i++) {
//			a[i] = i;
//			b[i] = Math.sqrt(a[i]);
//			if (a[i] < 10) {
//				System.out.print("A = " + a[i]);
//				System.out.println("     B = " + b[i]);
//			} else if (a[i] < 100) {
//				System.out.print("A = " + a[i]);
//				System.out.println("    B = " + b[i]);
//			} else {
//				System.out.print("A = " + a[i]);
//				System.out.println("   B = " + b[i]);
//			}
			
			a[i] = i;
			b[i] = i;
			c[i] = a[i] + b[i];
			if (a[i] < 10) {
				System.out.print("A = " + a[i]);
				System.out.print("     B = " + b[i]);
				System.out.println("     C = " + c[i]);
			} else if (a[i] < 100) {
				System.out.print("A = " + a[i]);
				System.out.print("    B = " + b[i]);
				System.out.println("    C = " + c[i]);
			} else {
				System.out.print("A = " + a[i]);
				System.out.print("   B = " + b[i]);
				System.out.println("   C = " + c[i]);
			}

		}

	}

}
