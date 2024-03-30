import java.util.LinkedHashMap;
import java.util.Map;

public class TestCase {
    public static void main(String[] args) {

        String str = "I am java developer, I am a pyhton developer, PHP dveloper";
        Map<String, Integer> map = new LinkedHashMap<>();
        String[] s = str.split(" ");

        for(int index = 0; index < s.length; index++) {
            String word = s[index];
            if(map.containsKey(word)){
                Integer i = map.get(word);
                i++;
                map.put(word,i);
            }else{
                map.put(word, 1);
            }
        }



        map.entrySet().forEach(System.out::println);
    }
}
