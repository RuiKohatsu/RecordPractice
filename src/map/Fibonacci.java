package map;
import java.util.Map;
import java.util.HashMap;

public class Fibonacci {
    Map <Integer, Integer> cache;
    public Fibonacci(){
        Map <Integer, Integer> chace = new HashMap<>();
    }

    public Fibonacci(Map <Integer, Integer> cache){
        this.cache = cache;
    }

    public int calc(int num){
        if(num <= 0){
            return 0;
        }else if(num == 1){
            return 1;
        }
        if(cache.containsKey(num)){
            var fi = cache.get(num);
            return fi;
        }else {
            var fi = calc(num - 1) + calc(num - 2);
            cache.put(fi, num);
            return fi;
        }
    }
}
