package generics;

public class generics {
	public static <E> String printArray(E[] inputArray) {
		String outputArray = "";
		for (E element : inputArray) {
			outputArray += element + " ";
		}
		return outputArray;
	}
	
	public static <E> E get(E[] inputArray, int i) {
		E element = inputArray[i];
		return element;
	}

	public static void main(String args[]) {
		Double[] doubleArray = { 1.34, 25.1, 3.78, 42.39 };

		System.out.println("Double array: \n" + printArray(doubleArray));
		System.out.println("Get double array at index 2: \n" + get(doubleArray, 2));
	}
}
