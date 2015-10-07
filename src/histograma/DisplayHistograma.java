package histograma;

public class DisplayHistograma {
    public void execute(Histogram contador) {
        for (Object clave : contador.keySet()) {
            System.out.println(clave.toString()+ ": " + contador.get(clave));
        }
    
    }
}
