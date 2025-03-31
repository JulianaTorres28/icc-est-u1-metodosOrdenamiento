public class MetodoBurbuja {
    public int[] ordenar(int[] arreglo, boolean ascendente, boolean conPasos) {
        int n = arreglo.length;
        int comparaciones = 0;
        int cambios = 0;
        
        System.out.println("Metodo Burbuja");
        System.out.print("Arreglo original-> ");
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparaciones++;
                
                boolean debeIntercambiar;
                if (ascendente) {
                    debeIntercambiar = arreglo[j] > arreglo[j + 1];
                } else {
                    debeIntercambiar = arreglo[j] < arreglo[j + 1];
                }
                
                if (conPasos) {
                    System.out.println("Comparación " + comparaciones + ": " + arreglo[j] + (ascendente ? " > " : " < ") + arreglo[j + 1]);
                }
                
                if (debeIntercambiar) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    cambios++;
                    
                    if (conPasos) {
                        System.out.println("Intercambio: " + arreglo[j] + " <-> " + arreglo[j + 1]);
                        System.out.print("Estado actual -> ");
                        for (int valor : arreglo) {
                            System.out.print(valor + " ");
                        }
                        System.out.println();
                    }
                }
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