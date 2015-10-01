package histograma;

import java.util.HashMap;
import java.util.Map;

public class Histograma {
    private final Valores vector;
    private final Map <Object,Object> map; 
    
    public Histograma(Valores vector) {
        this.vector = vector;
        map = new HashMap<>();
    }
    
    public void contar(){
        for (Object clave : vector.getVector()) {
            if ( map.containsKey(clave)){
                map.replace(clave, (int)map.get(clave)+1);
            } else {
                map.put(clave, 1);
            }
        }
    }

    public Map<Object, Object> getMap() {
        return map;
    }

    
}
