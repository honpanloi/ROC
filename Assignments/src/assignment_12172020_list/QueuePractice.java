package assignment_12172020_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

	public static void main(String[] args) {
		
		Queue<String> jobQueue = new LinkedList<String>();
		
		jobQueue.add("Bush teeth");
		jobQueue.add("Wash face");
		jobQueue.add("Eat breakfast");
		
		System.out.println("jobQueue = "+jobQueue);
		
		System.out.println("Take a look of the next element in line(jobQueue.peek()): "+jobQueue.peek());
		System.out.println("Take the next element("+jobQueue.poll().toString()+") in line out of the queue");
		
		System.out.println("jobQueue after jobQueue.poll() = "+jobQueue);
		
		jobQueue.add("Get dressed");
		System.out.println("jobQueue after jobQueue.add(\"Dress\"); = "+jobQueue);
		
		jobQueue.add("Commute");
		jobQueue.add("Work");
		jobQueue.add("Lunch");
		jobQueue.add("Work");
		jobQueue.add("Commute");
		
		System.out.println("jobQueue after adding a bunch of jobs ="+jobQueue);
		System.out.println("The size of jobQueue now = " +jobQueue.size());
		
		//Collections.sort(jobQueue);
		
		System.out.println("\nCreating a integer LinkedList as a queue");
		Queue<Integer> numQueue = new LinkedList<Integer>();
		numQueue.add(1654);
		numQueue.add(45);
		numQueue.add(54564);
		numQueue.add(144);
		numQueue.add(1645654);
		numQueue.add(164);
		numQueue.add(1011464);
		numQueue.add(14554);
		numQueue.add(16777754);
		
		System.out.println("It is order by insertion: \n"+numQueue);
		numQueue.clear();
		System.out.println("numQueue after numQueue.clear(); = " + numQueue);
		
		System.out.println("\nCreating an integer PriorityQueue, with the same insertion order");
		System.out.println("It's ordered in a method called heap");
		
		Queue<Integer> pq = new PriorityQueue<Integer>(); //min heap, min number pop first
		pq.add(1654);
		pq.add(45);
		pq.add(54564);
		pq.add(144);
		pq.add(1645654);
		pq.add(164);
		pq.add(1011464);
		pq.add(14554);
		pq.add(16777754);
		
		
		System.out.println("The order of a priorityQueue is not ordered by insertion: \n"+pq);
		
		System.out.println("pq.size() = "+pq.size());
		
		int numberOfPolls = pq.size();
		
		System.out.println("pg.poll() "+numberOfPolls+" times");
		for (int i = 0; i < numberOfPolls; i++) {
			System.out.print(pq.poll()+" ");
		}
		
		Queue<Integer> pq2 = new PriorityQueue<Integer>(Collections.reverseOrder()); //max heap, max number pop first
		pq2.add(1654);
		pq2.add(45);
		pq2.add(54564);
		pq2.add(144);
		pq2.add(1645654);
		pq2.add(164);
		pq2.add(1011464);
		pq2.add(14554);
		pq2.add(16777754);
		
		System.out.println("pq2.size() = "+pq2.size());
		
		numberOfPolls = pq2.size();
		
		System.out.println("pg2.poll() "+numberOfPolls+" times");
		for (int i = 0; i < numberOfPolls; i++) {
			System.out.print(pq2.poll()+" ");
		}
		
		
		//in conclusion, PriorityQueue utilize compareTo method to compare values before insertion.
		//It doesn't compare every value in the queue. It uses a tree-based data structure call "heap" to minimize the comparisons required
		//The difference between a linkedlist queue is that linkedlist is straight up "first in first out"
		//while PriorityQueue is max or min priority first out, the data got inserted is automatically organized with "heap"
		
		System.out.println();
		System.out.println();
		System.out.println(sum(1,2));
		System.out.println(sum(4,5));
		System.out.println(sum(7,6));
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}

}
