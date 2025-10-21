from sortSelection import SortSelection

def main():
    numeros = [5, 2, 9, 1, 5, 6]
    print("Estudiante: Juliana Torres")

    print("Original: ", numeros)

    selection = SortSelection()
    selection.sort_ascendente(numeros)
    print("Ordenado As: ", numeros)
    selection.sort_descendente(numeros)
    print("Ordenado Des: ", numeros)

if __name__ == "__main__":
    main()
