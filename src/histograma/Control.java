package histograma;

class Control {

    void execute() {
        Histogram<Object> histogram = CalculaHistogram.computeHisto(new DialogoEntrada().execute());
        new DisplayHistograma().execute(histogram);
    }

    
}
