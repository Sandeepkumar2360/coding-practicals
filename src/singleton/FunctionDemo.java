package singleton;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class FunctionDemo {
	public static void main(String [] arr) {
		List<Integer> list = Arrays.asList(new Integer[]{10,20,30,40,1,39,13,17,19,22,77,55,67,44,23,90,89});
		Function<Integer, Integer> square = i -> i*i;
		Function<Integer, Integer> sum =  i -> i+i+i;

		System.out.println("Square of 2 is "+square.apply(2));

		System.out.println("Sum of 2 is "+sum.apply(2));


		System.out.println("first calculate 2x3 and than square of the result(2x3) is "+sum.andThen(square).apply(2));

		System.out.println("first calculate square of 2  and than add the result 3 times"+sum.compose(square).apply(2));



	}
	
	
}