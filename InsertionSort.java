import java.util.Random;
import java.util.Arrays;

public class InsertionSort implements Sortable{
	//instance variables
	public int size; //size of the array
	public String randomOrSorted = ""; //designates array to be sorted or random
	public int[] numArray; //array to hold numbers

	public InsertionSort(int size, String randomOrSorted){
		if (randomOrSorted == "random"){
			fillRandomArray(size); //if designated to random, call fillRandomArray
		}
		if (randomOrSorted == "sorted" || randomOrSorted == "ordered"){
			fillOrderedArray(size); //if designated to ordered/sorted, call fillOrderedArray
		}
	}

	public void fillRandomArray(int size){
		numArray = new int[size]; //initialize an array of designated size
		Random ran = new Random(); //random var
		for (int i = 0; i < size; i++){
			numArray[i] = i; //fill array with numbers
		}
		for (int j = size - 1; j > 0; j--){
			int index = ran.nextInt(j + 1); //index is equal to a random number within the range of size
			int temp = numArray[index]; //swap
			numArray[index] = numArray[j]; //swap
			numArray[j] = temp; //swap
		}
	}

	public void fillOrderedArray(int size){
		numArray = new int[size]; //initialize an array of designated size
		for (int i = 0; i < size; i++){
			numArray[i] = i; //fill array with consecutive ints
		}
	}

	public void sort(){
		for (int i = 1; i < numArray.length; i++){
			int key = numArray[i]; //key is equal to the int at numArray[i]
			int j = i - 1; 
			while (j >= 0 && numArray[j] > key){ //> prints them ascendingly, > prints them descendingly
				numArray[j + 1] = numArray[j];
				j = j - 1;
			}
			numArray[j + 1] = key;
		}
	}
}