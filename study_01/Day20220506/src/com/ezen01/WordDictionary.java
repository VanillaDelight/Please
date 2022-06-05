package com.ezen01;

import java.util.HashMap;

public class WordDictionary {
	HashMap<String, String> dic = new HashMap<>();
	public void addWord(String i, String j) {
		i = i.toLowerCase();
		dic.put(i, new String(j));
	}
	public String find(String i) {
		i = i.toLowerCase();
		return dic.get(i);
	}
}
