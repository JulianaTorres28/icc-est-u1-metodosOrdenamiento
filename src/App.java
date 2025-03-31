import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        // Instanciación de los métodos de ordenamiento
        MetodoBurbuja burbuja = new MetodoBurbuja();
        MetodoSeleccion seleccion = new MetodoSeleccion();
        MetodoInsercion insercion = new MetodoInsercion();
        MetodoBurbujaMejorado burbujaMejorado = new MetodoBurbujaMejorado();
        
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        // Bucle principal del menú
        while (continuar) {
            // Arreglo de ejemplo para ordenar
            int[] arreglo = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8};
            mostrarMenu();
            int opcion = obtenerOpcion(scanner);

            if (opcion == 5) {
                System.out.println("\n¡Gracias por participar! Saliendo...");
                break;
            }

            boolean mostrarPasos = obtenerConfirmacion(scanner, "¿Deseas ver los pasos?");
            String orden = obtenerOrden(scanner);
            boolean ascendente = orden.equalsIgnoreCase("A");

            ejecutarOrdenamiento(opcion, arreglo, burbuja, seleccion, insercion, burbujaMejorado, mostrarPasos, ascendente);
        }
        scanner.close();
    }

    // Mostrar el menú de opciones
    private static void mostrarMenu() {
        System.out.println("\n--------------------------------------------------");
        System.out.println("Selecciona el método de ordenamiento:");
        System.out.println("<<<<< [1] Burbuja >>>>>");
        System.out.println("<<<<< [2] Selección >>>>>");
        System.out.println("<<<<< [3] Inserción >>>>>");
        System.out.println("<<<<< [4] Burbuja Mejorado >>>>>");
        System.out.println("<<<<< [5] Salir >>>>>");

        System.out.println("--------------------------------------------------");
    }

    private static int obtenerOpcion(Scanner scanner) {
        int opcion;
        do {
            System.out.print("Ingresa la opción (1-5): ");
            opcion = scanner.nextInt();
            if (opcion < 1 || opcion > 5) {
                System.out.println("Opción incorrecta. Inténtalo de nuevo.");
            }
        } while (opcion < 1 || opcion > 5);
        return opcion;
    }

    private static boolean obtenerConfirmacion(Scanner scanner, String mensaje) {
        String respuesta;
        do {
            System.out.print(mensaje + " (true/false): ");
            respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("true") && !respuesta.equalsIgnoreCase("false")) {
                System.out.println("Entrada no válida. Debes ingresar 'true' o 'false'.");
            }
        } while (!respuesta.equalsIgnoreCase("true") && !respuesta.equalsIgnoreCase("false"));
        return Boolean.parseBoolean(respuesta);
    }

    private static String obtenerOrden(Scanner scanner) {
        String orden;
        do {
            System.out.print("¿Ordenar ascendentemente (A) o descendentemente (D)? ");
            orden = scanner.next();
            if (!orden.equalsIgnoreCase("A") && !orden.equalsIgnoreCase("D")) {
                System.out.println("Entrada no válida. Debes ingresar 'A' o 'D'.");
            }
        } while (!orden.equalsIgnoreCase("A") && !orden.equalsIgnoreCase("D"));
        return orden;
    }

    private static void ejecutarOrdenamiento(int opcion, int[] arreglo, MetodoBurbuja burbuja,
                                          MetodoSeleccion seleccion, MetodoInsercion insercion,
                                          MetodoBurbujaMejorado burbujaMejorado, boolean mostrarPasos,
                                          boolean ascendente) {
    int[] resultados;

    switch (opcion) {
        case 1:
            System.out.println("Método de Burbuja:");
            resultados = burbuja.ordenar(arreglo.clone(), ascendente, mostrarPasos);
            break;
        case 2:
            System.out.println("Método de Selección:");
            resultados = seleccion.ordenar(arreglo.clone(), ascendente, mostrarPasos);
            break;
        case 3:
            System.out.println("Método de Inserción:");
            resultados = insercion.ordenar(arreglo.clone(), ascendente, mostrarPasos);
            break;
        case 4:
            System.out.println("Método de Burbuja Mejorado:");
            resultados = burbujaMejorado.ordenar(arreglo.clone(), ascendente, mostrarPasos);
            break;
        default:
            throw new IllegalStateException("Opción no válida");
    }

    System.out.println("\nArreglo ordenado " + (ascendente ? "ascendentemente" : "descendentemente") + ": ");
    imprimirArreglo(arreglo);
    System.out.println("Comparaciones totales: " + resultados[0]);
    System.out.println("Cambios totales: " + resultados[1]);
    System.out.println("--------------------------------------------------");
}


    private static void imprimirArreglo(int[] arreglo) {
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}