/**
 * 
 */
package com.isn.core.example;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author VenkatS
 *
 */
public class SortingArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {9,7,1,2,8,4,6};
		
		int temp;
		for (int i = 0; i < a.length; i++) {
			
			for (int j =i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		
			
		}
		
		Arrays.stream(a).forEach(x->{System.out.println(x);});
		
		IntStream.of(a).forEach(y->{System.out.println(y);});


	}

}
