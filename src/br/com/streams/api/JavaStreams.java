package br.com.streams.api;
import java.time.chrono.MinguoChronology;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaStreams {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 5, 7, 8, 9);

		String collect = lista.stream()
	 // Map<Boolean, List<Integer>> mapa = lista.stream()
				
				// .skip(1)  opera��o intermedi�ria, poder� ser feito v�rias vezes antes de fechar o Stream.
				// .limit(4) // limita at� o index
				// .distinct() //equals hashcode - difere os elementos repetidos.
				// .filter(e -> e % 2 == 0) 
				// .map(e -> e * 3) // mantem os elementos e cria uma nova lista a partir da lista original.
				// .count();
				// .min(Comparator.naturalOrder());
				// .max(Comparator.naturalOrder());
				// .forEach(e -> System.out.println(e));
				// .collect(Collectors.toList()); - toList - criar� uma lista da lista original
				// .collect(Collectors.groupingBy(e -> e % 2 == 0))
				.map(e -> String.valueOf(e))
				.collect(Collectors.joining(","));

		System.out.println(collect);
	}
}
