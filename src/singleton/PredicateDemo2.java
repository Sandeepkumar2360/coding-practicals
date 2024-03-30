package singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class PredicateDemo2 {
	public static void main(String [] arr) {
		List<Integer> list = Arrays.asList(new Integer[]{10,20,30,40,1,39,13,17,19,22,77,55,67,44,23,90,89});
		Predicate<Integer> p1 =  i -> i%3==0;
		Predicate<Integer> p2 =  i -> i%5==0;
		System.out.println("Divisble BY 3");
		for (Integer i: list ) {
			if (p1.test(i)){
				System.out.println(i);
			}

		}

		System.out.println("Divisble BY 5");
		for (Integer i: list ) {
			if (p2.test(i)){
				System.out.println(i);
			}

		}

		System.out.println("Divisble BY 5 and 3");
		for (Integer i: list ) {
			if (p1.and(p2).test(i)){
				System.out.println(i);
			}

		}

		System.out.println("Divisble BY 5 OR 3");
		for (Integer i: list ) {
			if (p1.or(p2).test(i)){
				System.out.println(i);
			}

		}

		System.out.println("not Divisble BY  3");
		for (Integer i: list ) {
			if (p1.negate().test(i)){
				System.out.println(i);
			}

		}


		List<Integer> collect = list.stream().filter(p1).collect(Collectors.toList());
		System.out.println("Divisible by 3"+ collect);

		collect = list.stream().filter(p1).filter(p2).collect(Collectors.toList());
		System.out.println("Divisible by 3 and 5"+ collect);
	}
	
	
}