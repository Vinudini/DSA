/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package github;

import PriorityQueueQueue.*;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Vinudini
 */
public class PriorityQueueQueue {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        Queue<Integer> queue = new PriorityQueue<>();

        // Add elements to the queue
        queue.add(30);
        queue.add(10);
        queue.add(20);
        queue.add(40);

        // Display the queue
        System.out.println("Initial PriorityQueue: " + queue);

        // Peek at the head of the queue (lowest element)
        System.out.println("Head element (peek): " + queue.peek());

        // Remove elements (in natural priority order)
        System.out.println("\nPolling elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Removes and returns the head
        }

        // After polling all
        System.out.println("\nQueue after polling all elements: " + queue);
    }
    
}
