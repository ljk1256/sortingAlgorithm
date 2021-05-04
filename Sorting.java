package Algorithm;

import java.util.Scanner;

public class Sorting {
	
	// 반복적으로 사용됨으로 따로 구현
	private void printData(int[] data, String type) {
		
		System.out.print(type+"정렬 : ");
		for(int k=0; k<data.length; k++) {
			System.out.print(data[k]+" ");
		}
	}
	
	// 반복적으로 사용됨으로 따로 구현
	private void swap(int index1, int index2, int[] data) {
		int temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}
	
	private int[] bubbleSort(int[] data) {
		
		for(int i=1; i<data.length; i++) {
			
			for(int j=0; j<data.length-i; j++) { // 비교 횟수가 시행 될수록 n-1 씩 줄어듬
				
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
    			
    			if(data[j] < data[minIndex]) { // 최솟값인 경우 갱신
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
    	
    	int gap = data.length;  //구간 설정을 위한 변수
    	
    	for(int i=gap/2; i>0; i/=2) { // 구간이 계속 절반으로 나누어지는 반복문
    		for(int j=i; j<gap; j++) {  // 삽입 정렬
    			int k;
    			int temp = data[j];
    			
    			for(k=j-i; data[k]>temp && 0<=k; k-=i) { // 삽입 정렬을 위해 한칸씩 증가 시킴
    				data[k+i] = data[k];
    			}
    			data[k+i] = temp;
    		}
    	}
    		
    	return data;
    }
    
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Sorting st = new Sorting();
		
		System.out.print("데이터 갯수를 입력하세요 : ");
		int size = scanner.nextInt();
		int[] data = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.print(i+"번째 데이터를 입력하세요 : ");
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
