package histograma;

public class CalculaHistogram {
    
    public static <T> Histogram <T> computeHisto (T[] vector){
        Histogram <T> histogram = new Histogram<>();
        for (T vector1 : vector) {
            histogram.increment(vector1);
        }
        return histogram;
    }
}
