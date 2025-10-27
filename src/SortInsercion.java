public class SortInsercion {

    public SortInsercion(){
    }

    public void sortAscendente(int[] numeros, boolean pasos){
        for (int i = 1; i < numeros.length; i++) {
            int j = i-1;
            int aux = numeros[i];

            if (pasos) {
                System.out.println("i: " + i + " ,j: " + j + " ,aux:" + aux );
            }

            while (j >= 0 && numeros[j] > aux) {
                if(pasos)
                    System.out.println("Compara aux: " + aux + " con numeros[" + j + "]: " + numeros[j]);

                numeros[j+1] = numeros[j];
                if (pasos) 
                    printArray(numeros);
            
                j--;
                if (pasos) 
                    System.out.println("Mueve numeros[ " + (j+1) + "] a numeros [" + (j+2) + "]");
            }

            numeros[j+1] = aux;
            if (pasos) {
                System.out.println("Inserta aux: " + aux + " en la posicion " + (j+1));
                System.out.print("Estado Actual: ");
                printArray(numeros);
            }
        }
    }

    public void sortDescendente(int[] numeros, boolean pasos){
        for (int i = 1; i < numeros.length; i++) {
            int j = i-1;
            int aux = numeros[i];

            if (pasos) {
                System.out.println("i: " + i + " ,j: " + j + " ,aux:" + aux );
            }

            while (j >= 0 && numeros[j] < aux) {
                if(pasos)
                    System.out.println("Compara aux: " + aux + " con numeros[" + j + "]: " + numeros[j]);

                numeros[j+1] = numeros[j];
                if (pasos) 
                    printArray(numeros);
            
                j--;
                if (pasos) 
                    System.out.println("Mueve numeros[ " + (j+1) + "] a numeros [" + (j+2) + "]");
            }

            numeros[j+1] = aux;
            if (pasos) {
                System.out.println("Inserta aux: " + aux + " en la posicion " + (j+1));
                System.out.print("Estado Actual: ");
                printArray(numeros);
            }
        }
    }

    public void sortPersonasByName(Persona[] personas, boolean pasos){
        for (int i = 1; i < personas.length; i++) {
            int j = i-1;
            Persona aux = personas[i];

            if (pasos) {
                System.out.println("i: " + i + " ,j: " + j + " ,aux:" + aux );
            }

            while (j >= 0 && personas[j].getName().compareTo(aux.getName())>0) {
                if(pasos)
                    System.out.println("Compara aux: " + aux + " con personas[" + j + "]: " + personas[j]);

                personas[j+1] = personas[j];
                if (pasos) 
                    printArrayPersonas(personas);
            
                j--;
                if (pasos) 
                    System.out.println("Mueve personas[ " + (j+1) + "] a personas [" + (j+2) + "]");
            }

            personas[j+1] = aux;
            if (pasos) {
                System.out.println("Inserta aux: " + aux + " en la posicion " + (j+1));
                System.out.print("Estado Actual: ");
                printArrayPersonas(personas);
            }
        }

    }

    public void sortPersonasByAge(Persona[] personas){
        for (int i = 1; i < personas.length; i++) {
            int j = i-1;
            Persona aux = personas[i];
            while (j >= 0 && aux.getAge() < personas[j].getAge()) {
                personas[j+1] = personas[j];
                j--;
                
            }
            personas[j+1] = aux;
        }

    }


    public void printArray(int[] numeros){
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {

            if (i == numeros.length-1) {
                System.out.print(numeros[i]);
            } else {
                System.out.print(numeros[i]+",");
            }
        }
        System.out.println("]");
    }

    public void printArray(String[] nombres){
        System.out.print("[");
        for (int i = 0; i < nombres.length; i++) {

            if (i == nombres.length-1) {
                System.out.print(nombres[i]);
            } else {
                System.out.print(nombres[i]+",");
            }
        }
        System.out.println("]");
    }

    public void printArrayPersonas(Persona[] personas){
       for (int i = 0; i < personas.length; i++) {
        System.out.println("Nombre: " + personas[i].getName() + ", Edad: " + personas[i].getAge());
       }
    }
}
