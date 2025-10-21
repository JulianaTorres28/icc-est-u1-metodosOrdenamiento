public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros= {10, 0, -5, 5, 15, 2};

        System.out.println("Estudiante: Juliana Torres");

        SortBubble sortBubble = new SortBubble();
        SortSeleccion sortSeleccion = new SortSeleccion();

        //Burbuja

        // System.out.println("Array Original: ");
        // sortBubble.printArray(numeros);
        // System.out.println("Ordenado Ascendentemente: ");
        // sortBubble.sortAscendente(numeros);
        // sortBubble.printArray(numeros);
        // System.out.println("Ordenado Descendentemente: ");
        // sortBubble.sortDescendente(numeros);
        // sortBubble.printArray(numeros);

        //Seleccion
        System.out.println("Array Original: ");
        sortBubble.printArray(numeros);
        System.out.println("Arreglo Ordenado Ascendentemente con Selección: ");
        sortSeleccion.sortAscendente(numeros);
        sortSeleccion.printArray(numeros);
        System.out.println("Arreglo Ordenado Descendetnemente con Selección: ");
        sortSeleccion.sortDescendente(numeros);
        sortSeleccion.printArray(numeros);      
    }
}
