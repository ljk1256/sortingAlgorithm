package Algorithm;

import java.util.Scanner;

public class Sorting {
	
	private void printData(int[] data, String type) {
		
		System.out.print(type+"정렬 : ");
		for(int k=0; k<data.length; k++) {
			System.out.print(data[k]+" ");
		}
	}
	
	private void swap(int index1, int index2, int[] data) {
		int temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}
	
	private int[] bubbleSort(int[] data) {
		
		for(int i=1; i<data.length; i++) {
			
			for(int j=0; j<data.length-i; j++) {
				
				if(data[j] > data[j+1]) {
					swap(j, j+1, data);
				}
			}
		}
		return data;
	}
	
    private int[] selectionSort(int[] data) {
    	
    	for(int i=0; i<data.length-1; i++) {
    		int minIndex = i;
    		
    		for(int j=i+1; j<data.length; j++) {
    			
    			if(data[j] < data[minIndex]) {
    				minIndex = j;
    			}
    		}
    		swap(minIndex, i, data);
    	}
    	return data;
    }
    
    private int[] insertionSort(int[] data) {
    	
    	for(int i=1; i<data.length; i++) {
    		int insertNumber = data[i];
    		
    		int j = i - 1;
    		
    		while(insertNumber < data[j] && 0<=j) {
    			data[j+1] = data[j];
    			j--;
    		}
    		
    		data[j+1] = insertNumber;
    	}
    	return data;
    }
    
    private int[] shellSort(int[] data) {
    	
    	for()
    		
    	return data;
    }
    
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Sorting st = new Sorting();
		
		System.out.print("데이터 갯수를 입력하세요 : ");
		int size = scanner.nextInt();
		int[] data = new int[size];
		
		for(int i=0; i<size; i++) {
			data[i] = scanner.nextInt();
		}
		String bubble = "bubble";
		String selection = "selection";
		String insertion = "insertion";
		String shell = "shell";
		
		st.printData(st.bubbleSort(data), bubble);
		st.printData(st.selectionSort(data), selection);
		st.printData(st.insertionSort(data), insertion);
		st.printData(st.shellSort(data), shell);
		
		scanner.close();
	}

}
