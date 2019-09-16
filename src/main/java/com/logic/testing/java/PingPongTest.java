package com.logic.testing.java;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class PingPongTest {
public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int players = sc.nextInt();
		List<String> times = new ArrayList<String>();
		for (int i = 0; i < players; i++) {
			sc = new Scanner(System.in);
			int first_value = 0;
			int second_value = 0;
			int temp = 0;
			
			int count = 0;
			while(sc.hasNextInt()) {
				count++;
				if (temp>0) {
					first_value = temp;
				}				
				temp = sc.nextInt();
				if(count==2)
					break;
			}
			second_value=temp;
			times.add(""+first_value+"-"+second_value);
		}
		sc.close();
		int singles=0,doubles=0,diff=0,previous_start=0,previous_end=0;
		for (String timeRange : times) {
				String[] timeRanges = timeRange.split("-");
				int start = Integer.parseInt(timeRanges[0].trim());
				int end = Integer.parseInt(timeRanges[1].trim());
				if (previous_start ==start && end>=previous_end && diff>0) {
					singles=singles+diff;
					start=previous_end;
				}				
				diff = end-start;
				previous_start=start;
				previous_end = end;
			
			}
		
		System.out.println("OutPut : "+singles+" "+doubles);
	}
}
