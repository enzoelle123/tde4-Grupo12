import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] aleatorio100 = implementacao.readFile("ConjuntosDeDados/aleatorio_100.csv");
        int[] aleatorio1000 = implementacao.readFile("ConjuntosDeDados/aleatorio_1000.csv");
        int[] aleatorio10000 = implementacao.readFile("ConjuntosDeDados/aleatorio_10000.csv");

        int[] crescente100 = implementacao.readFile("ConjuntosDeDados/crescente_100.csv");
        int[] crescente1000 = implementacao.readFile("ConjuntosDeDados/crescente_1000.csv");
        int[] crescente10000 = implementacao.readFile("ConjuntosDeDados/crescente_10000.csv");

        int[] decrescente100 = implementacao.readFile("ConjuntosDeDados/decrescente_100.csv");
        int[] decrescente1000 = implementacao.readFile("ConjuntosDeDados/decrescente_1000.csv");
        int[] decrescente10000 = implementacao.readFile("ConjuntosDeDados/decrescente_10000.csv");

        System.out.println("========== DADOS ALEATÓRIOS ==========");
        System.out.println("Bubble Sort em Aleatório 100:");
        implementacao.testSort(aleatorio100, "Bubble Sort");
        System.out.println("Bubble Sort em Aleatório 1000:");
        implementacao.testSort(aleatorio1000, "Bubble Sort");
        System.out.println("Bubble Sort em Aleatório 10000:");
        implementacao.testSort(aleatorio10000, "Bubble Sort");

        System.out.println("Insertion Sort em Aleatório 100:");
        implementacao.testSort(aleatorio100, "Insertion Sort");
        System.out.println("Insertion Sort em Aleatório 1000:");
        implementacao.testSort(aleatorio1000, "Insertion Sort");
        System.out.println("Insertion Sort em Aleatório 10000:");
        implementacao.testSort(aleatorio10000, "Insertion Sort");

        System.out.println("Quick Sort em Aleatório 100:");
        implementacao.testSort(aleatorio100, "Quick Sort");
        System.out.println("Quick Sort em Aleatório 1000:");
        implementacao.testSort(aleatorio1000, "Quick Sort");
        System.out.println("Quick Sort em Aleatório 10000:");
        implementacao.testSort(aleatorio10000, "Quick Sort");

        System.out.println("\n========== DADOS EM ORDEM CRESCENTE ==========");
        System.out.println("Bubble Sort em Crescente 100:");
        implementacao.testSort(crescente100, "Bubble Sort");
        System.out.println("Bubble Sort em Crescente 1000:");
        implementacao.testSort(crescente1000, "Bubble Sort");
        System.out.println("Bubble Sort em Crescente 10000:");
        implementacao.testSort(crescente10000, "Bubble Sort");

        System.out.println("Insertion Sort em Crescente 100:");
        implementacao.testSort(crescente100, "Insertion Sort");
        System.out.println("Insertion Sort em Crescente 1000:");
        implementacao.testSort(crescente1000, "Insertion Sort");
        System.out.println("Insertion Sort em Crescente 10000:");
        implementacao.testSort(crescente10000, "Insertion Sort");

        System.out.println("Quick Sort em Crescente 100:");
        implementacao.testSort(crescente100, "Quick Sort");
        System.out.println("Quick Sort em Crescente 1000:");
        implementacao.testSort(crescente1000, "Quick Sort");
        System.out.println("Quick Sort em Crescente 10000:");
        implementacao.testSort(crescente10000, "Quick Sort");

        System.out.println("\n========== DADOS EM ORDEM DECRESCENTE ==========");
        System.out.println("Bubble Sort em Decrescente 100:");
        implementacao.testSort(decrescente100, "Bubble Sort");
        System.out.println("Bubble Sort em Decrescente 1000:");
        implementacao.testSort(decrescente1000, "Bubble Sort");
        System.out.println("Bubble Sort em Decrescente 10000:");
        implementacao.testSort(decrescente10000, "Bubble Sort");

        System.out.println("Insertion Sort em Decrescente 100:");
        implementacao.testSort(decrescente100, "Insertion Sort");
        System.out.println("Insertion Sort em Decrescente 1000:");
        implementacao.testSort(decrescente1000, "Insertion Sort");
        System.out.println("Insertion Sort em Decrescente 10000:");
        implementacao.testSort(decrescente10000, "Insertion Sort");

        System.out.println("Quick Sort em Decrescente 100:");
        implementacao.testSort(decrescente100, "Quick Sort");
        System.out.println("Quick Sort em Decrescente 1000:");
        implementacao.testSort(decrescente1000, "Quick Sort");
        System.out.println("Quick Sort em Decrescente 10000:");
        implementacao.testSort(decrescente10000, "Quick Sort");
    }
}
