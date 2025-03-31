public class MetodoSeleccion {
    public int[] ordenar(int[] arreglo, boolean ascendente, boolean conPasos) {
        int n = arreglo.length;
        int comparaciones = 0;
        int cambios = 0;
        
        System.out.println("Metodo Selección");
        System.out.print("Arreglo original-> ");
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();
        
        for (int i = 0; i < n - 1; i++) {
            int indiceSeleccionado = i;
            
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                
                boolean debeActualizar;
                if (ascendente) {
                    debeActualizar = arreglo[j] < arreglo[indiceSeleccionado];
                } else {
                    debeActualizar = arreglo[j] > arreglo[indiceSeleccionado];
                }
                
                if (conPasos) {
                    System.out.println("Comparación " + comparaciones + ": " + arreglo[j] + (ascendente ? " < " : " > ") + arreglo[indiceSeleccionado]);
                }
                
                if (debeActualizar) {
                    indiceSeleccionado = j;
                    
                    if (conPasos) {
                        System.out.println("Nuevo índice seleccionado: " + indiceSeleccionado + " (valor: " + arreglo[indiceSeleccionado] + ")");
                    }
                }
            }
            
            if (indiceSeleccionado != i) {
                int temp = arreglo[indiceSeleccionado];
                arreglo[indiceSeleccionado] = arreglo[i];
                arreglo[i] = temp;
                cambios++;
                
                if (conPasos) {
                    System.out.println("Intercambio: " + arreglo[i] + " <-> " + arreglo[indiceSeleccionado]);
                    System.out.print("Estado actual -> ");
                    for (int valor : arreglo) {
                        System.out.print(valor + " ");
                    }
                    System.out.println();
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