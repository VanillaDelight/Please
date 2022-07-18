package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Lotto {

	public static void main(String[] args) {
		ArrayList bno = new ArrayList();
		
		for (int i = 0; i < 6; i++) {
			int lotto = (int)(Math.random()*45) + 1;
			if (bno.contains(lotto)) {
				i--;
				continue;
			} else {
				bno.add(lotto);
			}
		}
		
		for (int i = 0; i < bno.size(); i++) {
			System.out.print(bno.get(i) + "    ");
		}
	}

}
