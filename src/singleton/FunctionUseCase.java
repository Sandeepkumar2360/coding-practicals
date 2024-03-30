package singleton;

import java.util.*;
import java.util.function.Function;

class FunctionUseCase {
	public static void main(String [] arr) {
		Function<String, String> titleCaseEnhancer = i -> Objects.isNull(i) ? "Oh No" :
				i.isEmpty() ? "Moye-Moye" : i.toUpperCase().replaceAll("-", "_");
		System.out.println(titleCaseEnhancer.apply("My-name-Is- ANUj"));
		System.out.println(titleCaseEnhancer.apply(null));
		System.out.println(titleCaseEnhancer.apply(""));




		LinkedHashMap<String, String> map =  new LinkedHashMap<>();
		map.put("payment", "Authorization");
		map.put("auth", "Authentication");

		Function<String, String> aliasEnhancer = value -> Optional.ofNullable(map.get(value)).orElse(value);


		List<String> list =  Arrays.asList(new String[]{"payment", "auth", "Refund", "chargeback", "paymentHandle", "Payment"});
		for (String str:
			 list) {
			System.out.println(aliasEnhancer.apply(str));
		}

	}





}