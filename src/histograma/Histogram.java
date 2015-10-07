package histograma;

import java.util.HashMap;
import java.util.Set;

public class Histogram<T> {
    private final HashMap <T,Integer> map = new HashMap<>(); 
    
    public Integer get (T key){
        return map.get(key);
    }
    
    public Integer increment(T key) {
        return map.containsKey(key) ? map.replace(key, map.get(key)+1) : map.put(key,1);
    }
    
    public Set<T> keySet(){
        return map.keySet();
    }
    
}
