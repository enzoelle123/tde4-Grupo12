import java.io.*;
import java.util.*;

public class implementacao {

    // Algoritmo Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Troca de elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Algoritmo Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Algoritmo Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);  // Ordenar a parte esquerda
            quickSort(arr, pi + 1, high); // Ordenar a parte direita
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Troca
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Troca o pivot para sua posição correta
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static int[] readFile(String filename) throws IOException {
        // Ajuste o caminho para garantir que ele acesse o arquivo corretamente
        String filePath = System.getProperty("user.dir") + File.separator + filename; // Caminho relativo com base no diretório atual

        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("Arquivo não encontrado: " + file.getAbsolutePath());
            return new int[0]; // Retorna um array vazio caso o arquivo não seja encontrado
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<Integer> data = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            for (String value : values) {
                try {
                    data.add(Integer.parseInt(value.trim()));
                } catch (NumberFormatException e) {
                    // Ignora valores não numéricos
                }
            }
        }
        reader.close();
        return data.stream().mapToInt(i -> i).toArray();
    }

    // Função para medir e exibir o tempo de execução
    public static void testSort(int[] data, String algorithm) {
        int[] copy = Arrays.copyOf(data, data.length);
        long startTime = System.nanoTime();
        if (algorithm.equals("Bubble Sort")) {
            bubbleSort(copy);
        } else if (algorithm.equals("Insertion Sort")) {
            insertionSort(copy);
        } else if (algorithm.equals("Quick Sort")) {
            quickSort(copy, 0, copy.length - 1);
        }
        long endTime = System.nanoTime();
        System.out.println(algorithm + " levou " + (endTime - startTime) + " nanosegundos");
    }
}
