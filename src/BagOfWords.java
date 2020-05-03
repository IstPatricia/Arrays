import java.util.Scanner;

public class BagOfWords {

//metoda pt a mari spatiul alocat; facem alt array dublu	
	
	public static String[] doubleCapacity(String[] oldArray) {
		String[] newArray = new String[oldArray.length * 2];
//		newArray[0] = oldArray[0];
//		newArray[1] = oldArray[1];
		
		for( int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		return newArray;
	}
	
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int maxWords = 2;
	int numElements = 0;
	String stopWord = "St0p!";
	String[] words = new String[maxWords];
	String currentWord;
	
	do {
		currentWord = sc.next();
		if (numElements == words.length) {
			doubleCapacity(words);
			words = doubleCapacity(words);
		}
		
		words[numElements] = currentWord;
		numElements++;
		System.out.println("Array size is: " + words.length);
		
		if(numElements == 1000) {
			break;
		}
	} while (!currentWord.contentEquals(stopWord));
	
	for (int i= 0; i < 10; i++) {
		System.out.println(i + "|" + words[i]);
	}

	sc.close();
	}

}
