public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros= {10, 0, -5, 5, 15, 2};

        System.out.println("Estudiante: Juliana Torres");

        SortBubble sortBubble = new SortBubble();
        SortSeleccion sortSeleccion = new SortSeleccion();
        SortInsercion sortInsercion = new SortInsercion();

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
        // System.out.println("Array Original: ");
        // sortSeleccion.printArray(numeros);
        // System.out.println("Arreglo Ordenado Ascendentemente con Selección: ");
        // sortSeleccion.sortAscendente(numeros);
        // sortSeleccion.printArray(numeros);
        // System.out.println("Arreglo Ordenado Descendetnemente con Selección: ");
        // sortSeleccion.sortDescendente(numeros);
        // sortSeleccion.printArray(numeros);  
        
        //Insercion
        // System.out.println("Array Original");
        // sortInsercion.printArray(numeros);
        // System.out.println("Arreglo Ordenado Ascendentemente con Insercion: ");   
        // sortInsercion.sortAscendente(numeros, false);  
        // sortInsercion.printArray(numeros);
        // System.out.println("Arreglo Ordenado Descendentemnete con Insercion: ");   
        // sortInsercion.sortDescendente(numeros, false);  
        // sortInsercion.printArray(numeros);

        // String[] nombres = {"Pedro", "Ana", "Maria", "Luis", "Juan"};
        // System.out.println("Array de Nombre Original: ");
        // sortInsercion.printArray(nombres);
        // sortInsercion.sortByName(nombres, false);
        // System.out.println("Ordenado por Nombre: ");
        // sortInsercion.printArray(nombres);

        Persona[] personas = new Persona[]{
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28),
        };

        System.out.println("Array de Personas Original: ");
        sortInsercion.printArrayPersonas(personas);
        System.out.println("\nOrdenado por Edad de Personas: ");
        sortInsercion.sortPersonasByAge(personas);
        sortInsercion.printArrayPersonas(personas);

        // System.out.println("Array de Personas Original: ");
        // sortInsercion.printArrayPersonas(personas);
        // System.out.println("\nOrdenado por Nombre de Personas: ");
        // sortInsercion.sortPersonasByName(personas, false);
        // sortInsercion.printArrayPersonas(personas);
    }
}
