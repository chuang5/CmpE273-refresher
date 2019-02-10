package array;

public class array {
	int[] array;
	public array() {
		array = new int[5];
		for(int i = 0; i < array.length; i++) {
			array[i] = (i+3) * 13;
		}
	}
	
	public int find(int i) {
		int value = array[i];
		return value;
	}
	
	public int size() {
		int size = array.length;
		return size;
	}
	
	public String printArray() {
		String arrayStr = "";
		for(int i = 0; i < array.length; i++) {
			arrayStr += array[i] + " ";
		}
		return arrayStr;
	}
	
	public static void main(String[] args) {
		array object = new array();
		
		System.out.println("Initial Size of array : " + object.size());
		System.out.println("Array: " + object.printArray());
		System.out.println("Find index 3 of array : " + object.find(3));
	}
}
