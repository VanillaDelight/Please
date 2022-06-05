package com.ezen.ex01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueEx611 {

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<String>();
		// <String> 이거는 스트링만 넣을 수 있게 만드는것
		que.offer("box");
		que.offer("toy");
		que.offer("robot");
		
		System.out.println(que);
		System.out.println(que.peek());
		System.out.println(que);
		System.out.println(que.poll());
		System.out.println(que);
		System.out.println(que.poll());
		System.out.println(que);
		System.out.println(que.poll());
		System.out.println(que);
		System.out.println(que.poll());
		
	}

}
