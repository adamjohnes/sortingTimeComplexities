//Coded by Adam Johnes
//This program generates a random or sorted array with an arbitrary amount of elements, then sorts it and logs the time. 
import java.util.Random;
import java.util.Arrays;

public class Main{
		//instance variables
		static int insertRandomCount = 1;
		static int insertSortedCount = 1;
		static int heapRandomCount = 1;
		static int heapSortedCount = 1;

	public static void main(String[] args){
			double startTime = (double)System.nanoTime();

			Sortable inSort1 = new InsertionSort(100000, "random");
			inSort1.sort();

			double endTime = (double)System.nanoTime();
			double duration = (endTime - startTime) / 1000000;
			printTime(duration, 'i', 'r');

			startTime = (double)System.nanoTime();

			Sortable inSort2 = new InsertionSort(100000, "sorted");
			inSort2.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'i', 's');

			startTime = (double)System.nanoTime();

			Sortable inSort3 = new InsertionSort(200000, "random");
			inSort3.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'i', 'r');

			startTime = (double)System.nanoTime();

			Sortable inSort4 = new InsertionSort(200000, "sorted");
			inSort4.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'i', 's');

			startTime = (double)System.nanoTime();

			Sortable inSort5 = new InsertionSort(300000, "random");
			inSort5.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'i', 'r');

			startTime = (double)System.nanoTime();

			Sortable inSort6 = new InsertionSort(300000, "sorted");
			inSort6.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'i', 's');

			startTime = (double)System.nanoTime();

			Sortable inSort7 = new InsertionSort(400000, "random");
			inSort7.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'i', 'r');

			startTime = (double)System.nanoTime();

			Sortable inSort8 = new InsertionSort(400000, "sorted");
			inSort8.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'i', 's');

			startTime = (double)System.nanoTime();

			Sortable inSort9 = new InsertionSort(500000, "random");
			inSort9.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'i', 'r');

			startTime = (double)System.nanoTime();

			Sortable inSort0 = new InsertionSort(500000, "sorted");
			inSort0.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'i', 's');

			startTime = (double)System.nanoTime();

			Sortable hSort1 = new HeapSort(100000, "random");
			hSort1.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'h', 'r');

			startTime = (double)System.nanoTime();

			Sortable hSort2 = new HeapSort(100000, "sorted");
			hSort2.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'h', 's');

			startTime = (double)System.nanoTime();

			Sortable hSort3 = new HeapSort(200000, "random");
			hSort3.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'h', 'r');

			startTime = (double)System.nanoTime();

			Sortable hSort4 = new HeapSort(200000, "sorted");
			hSort4.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'h', 's');

			startTime = (double)System.nanoTime();

			Sortable hSort5 = new HeapSort(300000, "random");
			hSort5.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'h', 'r');

			startTime = (double)System.nanoTime();

			Sortable hSort6 = new HeapSort(300000, "sorted");
			hSort6.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'h', 's');

			startTime = (double)System.nanoTime();

			Sortable hSort7 = new HeapSort(400000, "random");
			hSort7.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'h', 'r');

			startTime = (double)System.nanoTime();

			Sortable hSort8 = new HeapSort(400000, "sorted");
			hSort8.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'h', 's');

			startTime = (double)System.nanoTime();

			Sortable hSort9 = new HeapSort(500000, "random");
			hSort9.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'h', 'r');

			startTime = (double)System.nanoTime();

			Sortable hSort0 = new HeapSort(500000, "sorted");
			hSort0.sort();

			endTime = (double)System.nanoTime();
			duration = (endTime - startTime) / 1000000;
			printTime(duration, 'h', 's');
	}

	static void printTime(double value, char sortType, char randomOrSorted){
		if (sortType == 'i'){
			if (randomOrSorted == 'r'){
				System.out.println("Random Insertion Sort #" + insertRandomCount + " took " + value + " milliseconds.");
				insertRandomCount = insertRandomCount + 1;
			}
			if (randomOrSorted == 's'){
				System.out.println("Sorted Insertion Sort #" + insertSortedCount + " took " + value + " milliseconds.");
				insertSortedCount = insertSortedCount + 1;
			}
		}
		if (sortType == 'h'){
			if (randomOrSorted == 'r'){
				System.out.println("Random Heap Sort #" + heapRandomCount + " took " + value + " milliseconds.");
				heapRandomCount = heapRandomCount + 1;
			}
			if (randomOrSorted == 's'){
				System.out.println("Sorted Heap Sort #" + heapSortedCount + " took " + value + " milliseconds.");
				heapSortedCount = heapSortedCount + 1;
			}
		}
	}
}