package histograma;

import java.util.Scanner;

public class DialogoEntrada {
    
    public Object[] execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Buenas introduce el tamaño del array: ");
        Object[] valores = new Object[scanner.nextInt()];
        
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Introduce valor " + i + " : ");
            valores[i] = scanner.next();
        }
        return valores;
    }
}
