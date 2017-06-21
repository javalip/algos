package practice1;

public class OddOrEvenInAnArray {

	public void oddOrEvenInAnArray(int[] array) {
		if (array != null&& array.length > 0 ) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] != 0 && array[i] != 1) {
					if (array[i] % 2 == 0) {
						System.out.println(array[i] + " is even number :-)");
					} else
						System.out.println(array[i] + " is odd number :-)");
				} else if (array[i] == 0) {
					System.out.println(array[i] + " this element is 0");
				} else {
					System.out.println(array[i] + " is odd number :-)");
				}
			}
		} else {
			System.out.println("array is empty");
		}
	}

	public static void main(String[] args) {
		OddOrEvenInAnArray oddOrEven = new OddOrEvenInAnArray();
		int[] a = null;
		oddOrEven.oddOrEvenInAnArray1(a);
	}

	public void oddOrEvenInAnArray1(int[] array) {
		if ( array == null || array.equals(null)||array.length == 0 ) {
			System.out.println("Array is empty");
		} else {
			for (int i = 0; i < array.length; i++) {
				if (array[i] != 0 && array[i] != 1) {
					if (array[i] % 2 == 0) {
						System.out.println(array[i] + " is even :-)");
					} else {
						System.out.println(array[i] + " is odd :-)");
					}
				} else if (array[i] == 1) {
					System.out.println(array[i] + " element is 1 ");
				} else if (array[i] == 0) {
					System.out.println(array[i] + " element is 0 ");
				}

			}

		}
	}
}
