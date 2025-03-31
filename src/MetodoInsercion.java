public class MetodoInsercion {
    public int[] ordenar(int[] arreglo, boolean ascendente, boolean conPasos) {
        int n = arreglo.length;
        int comparaciones = 0;
        int cambios = 0;
        
        System.out.println("Metodo Inserción");
        System.out.print("Arreglo original-> ");
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();
        
        for (int i = 1; i < n; i++) {
            int valorActual = arreglo[i];
            int j = i - 1;
            
            if (conPasos) {
                System.out.println("Insertando valor: " + valorActual + " (posición " + i + ")");
            }
            
            boolean seguirMoviendo;
            while (j >= 0) {
                comparaciones++;
                
                if (ascendente) {
                    seguirMoviendo = arreglo[j] > valorActual;
                } else {
                    seguirMoviendo = arreglo[j] < valorActual;
                }
                
                if (conPasos) {
                    System.out.println("Comparación " + comparaciones + ": " + arreglo[j] + (ascendente ? " > " : " < ") + valorActual);
                }
                
                if (seguirMoviendo) {
                    arreglo[j + 1] = arreglo[j];
                    j--;
                    cambios++;
                    
                    if (conPasos) {
                        System.out.println("Desplazamiento: " + arreglo[j + 1] + " -> posición " + (j + 2));
                    }
                } else {
                    break;
                }
            }
            
            arreglo[j + 1] = valorActual;
            
            if (conPasos) {
                System.out.println("Inserción: " + valorActual + " en posición " + (j + 1));
                System.out.print("Estado actual -> ");
                for (int valor : arreglo) {
                    System.out.print(valor + " ");
                }
                System.out.println();
            }
        }
        
        System.out.println("--FIN DEL METODO--");
        System.out.print("Arreglo ordenado-> ");
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();
        System.out.println("Comparaciones Totales -> " + comparaciones);
        System.out.println("Cambios Totales -> " + cambios);
        
        return new int[] {comparaciones, cambios};
    }
}