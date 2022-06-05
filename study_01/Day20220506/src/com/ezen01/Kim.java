package com.ezen01;

import java.util.ArrayList;

public class Kim {
    public static int getSurvivingIndex(int n, int k) {
    	ArrayList<Integer> a = new ArrayList<>();
    	for (int i = 0; i < n; i++) {
    		a.add(i + 1);
    	}
    	int i = 0;
    	do {
    		i = i + k - 1;
    		if (i >= a.size()) {
    			do {
    				i = i - a.size();
    			}while (i >= a.size());
    		}
    		System.out.println(a.get(i) + "번 군사가 죽습니다.");
    		a.remove(i);
    	} while (a.size() != 1);
    	return a.get(0);
    }

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(127, 7) + "번 자리에 서있으면 됩니다.");
    }
}