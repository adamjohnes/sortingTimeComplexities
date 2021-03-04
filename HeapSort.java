import java.util.Random;
import java.util.Arrays;

public class HeapSort implements Sortable{
	//instance variables
	public int size;
	public String randomOrSorted = "";
	public int[] numArray;
	

	public HeapSort(int size, String randomOrSorted){
		if (randomOrSorted == "random"){
			fillRandomArray(size);
		}
		if (randomOrSorted == "sorted" || randomOrSorted == "ordered"){
			fillOrderedArray(size);
		}
	}

	public void maxHeapify(int size, int index){
		int left = 2 * index + 1; //left child
		int right = 2 * index + 2; //right child
		int max = index; //set max to index
		if (left < size && numArray[max] < numArray[left]){
			max = left;
		}
		if (right < size && numArray[max] < numArray[right]){
			max = right;
		}
		if (max != index){
			int temp = numArray[index]; //swap
			numArray[index] = numArray[max]; //swap
			numArray[max] = temp; //swap
			maxHeapify(size, max);
		}
	}

	public void buildMaxHeap(){
		int size = numArray.length; //very important detail to maintain the updated size, using numArray.length proved to me to NOT WORK.
		for (int i = size / 2 - 1; i >= 0; i--){
			maxHeapify(size, i);
		}
	}

	public void fillRandomArray(int size){
		numArray = new int[size];
		Random ran = new Random();
		for (int i = 0; i < size; i++){
			numArray[i] = i;
		}
		for (int j = size - 1; j > 0; j--){
			int index = ran.nextInt(j + 1);
			int temp = numArray[index]; //swap
			numArray[index] = numArray[j]; //swap
			numArray[j] = temp; //swap
		}
	}

	public void fillOrderedArray(int size){
		numArray = new int[size];
		for (int i = 0; i < size; i++){
			numArray[i] = i;
		}
	}

	public void sort(){
		buildMaxHeap();
		for (int i = numArray.length - 1; i > 0; i--){
			int temp = numArray[0]; //swap
			numArray[0] = numArray[i]; //swap
			numArray[i] = temp; //swap

			maxHeapify(i, 0);
		}
	}
}