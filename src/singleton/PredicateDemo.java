package singleton;

import java.util.function.*;
import java.util.*;
import java.util.stream.Collectors;

class PredicateDemo {
	public static void main(String [] arr) {
		Predicate<Integer> p = b -> b%2 == 0;
		System.out.println("29 "+p.test(29));
		System.out.println("20 "+p.test(20));
		List<Integer> list =  new ArrayList();
		list.add(10);
		list.add(15);
		list.add(13);
		list.add(1);
		list.add(40);
		
		System.out.println("Before"+ list);
		
	/*	for(int i=0; i<list.size(); i++){
			int num = list.get(i);
			if( num % 2 != 0){
				list.remove(new Integer(num));
				i--;
			}
		}
		*/
		List<Integer> collect = list.stream().filter(b -> b % 2 == 0).collect(Collectors.toList());


		System.out.println("After"+ collect);
	}
	
	
}