package com.prog.collections;

import java.util.HashMap;
import java.util.Map;

public class MapAdForProg {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Ram");
		map.put(212, "Australia");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
