package arrays;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		;
		for (int element: toPower(4,2)) {
			System.out.println(element);

		}

	}
	
	public static int[] toPower(int size, int power) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = (int) Math.pow(i, 2);
		}
		return array;
	}

}
