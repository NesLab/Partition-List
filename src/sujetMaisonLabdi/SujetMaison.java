package sujetMaisonLabdi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SujetMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		System.out.println("Tableau initial : " + numbers);
		System.out.println("Resultat : " + partition(numbers, 2));

	}

	public static <Object> List<List<Object>> partition(List<Object> myList, final int N) {
		return new ArrayList<>(IntStream.range(0, myList.size()).boxed()
				.collect(Collectors.groupingBy(e -> e / N, Collectors.mapping(e -> myList.get(e), Collectors.toList())))
				.values());

	}

}
