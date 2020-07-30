package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import sujetMaisonLabdi.SujetMaison;

class sujetMaisonTest extends TestCase {

	@Test
	void it_should_run_WithInteger() {
		List<Integer> l1 = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			l1.add(i + 1);
		}

		List<List<Integer>> expected1 = new ArrayList<>();
		expected1.add(new ArrayList<Integer>(Arrays.asList((Integer) 1, (Integer) 2)));
		expected1.add(new ArrayList<Integer>(Arrays.asList((Integer) 3, (Integer) 4)));
		expected1.add(new ArrayList<Integer>(Arrays.asList((Integer) 5)));

		assertEquals(expected1, SujetMaison.partition(l1, 2));

	}

	@Test
	void it_should_run_withString() {
		List<String> l1 = new ArrayList<>();
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l1.add("d");
		l1.add("e");

		List<List<String>> expected1 = new ArrayList<>();
		expected1.add(new ArrayList<String>(Arrays.asList((String) "a", (String) "b")));
		expected1.add(new ArrayList<String>(Arrays.asList((String) "c", (String) "d")));
		expected1.add(new ArrayList<String>(Arrays.asList((String) "e")));

		assertEquals(expected1, SujetMaison.partition(l1, 2));

	}

	@Test
	public void it_should_fail() {

		List<Integer> l1 = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			l1.add(i + 1);
		}

		List<List<Integer>> expected1 = new ArrayList<>();
		expected1.add(new ArrayList<Integer>(Arrays.asList((Integer) 1, (Integer) 2)));
		expected1.add(new ArrayList<Integer>(Arrays.asList((Integer) 3, (Integer) 4)));
		expected1.add(new ArrayList<Integer>(Arrays.asList((Integer) 5)));

		assertEquals(expected1, SujetMaison.partition(l1, 3));
	}
}
