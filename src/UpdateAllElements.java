
public class UpdateAllElements {

	public static void updateArray(int[] array, int x) {
		for (int i = 0; i < array.length; i++) {
			array[i] = x;
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	
	public static int searchInt(int[] array, int elem) {
		for(int i = 0; i < array.length; i++) {
			if (array[i] == elem) {
				return i;
			}
		}
		
		return -1; //returneaza un index invalid
	}
	
//interschimbarea elementelor din array
	
	public static void swapElements(int[] array, int index0, int index1) {
		int aux = array[index0];
		array[index0] = array[index1];
		array[index1] = aux;
		
// sau
		
		array[index0] += array[index1];
		array[index1] = array[index0] - array[index1];
		array[index0] -= array[index1];
	}

	public static void main(String[] args) {
		int[] array = new int[5];

//		printArray(array);
//
//		updateArray(array, 10);
//		printArray(array);
		
		array[0] = 135;
		array[1] = 125;
		array[2] = 175;
		array[3] = 185;
		array[4] = 159;
		
		System.out.println(searchInt(array, 1255));
	}

}
