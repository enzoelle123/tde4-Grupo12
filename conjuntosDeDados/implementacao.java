import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class implementacao {

    public static int[] readFile(String nomeArquivo) {
        List<Integer> dados = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] valores = linha.split(",");
                for (String valor : valores) {
                    try {
                        dados.add(Integer.parseInt(valor.trim()));
                    } catch (NumberFormatException e) {

                    }
                }
            }
            System.out.println("Leitura do arquivo concluída.");
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return dados.stream().mapToInt(i -> i).toArray();
    }

    public static void testSort(int[] dados, String tipoAlgoritmo) {
        long tempoInicio = System.nanoTime();

        switch (tipoAlgoritmo) {
            case "Bubble Sort":
                bubbleSort(dados);
                break;
            case "Insertion Sort":
                insertionSort(dados);
                break;
            case "Quick Sort":
                quickSort(dados, 0, dados.length - 1);
                break;
            default:
                System.out.println("Algoritmo desconhecido.");
                return;
        }

        long tempoFim = System.nanoTime();
        System.out.println(tipoAlgoritmo + " - Tempo de execução: " + (tempoFim - tempoInicio) + " ns");
    }

    public static void bubbleSort(int[] dados) {
        for (int i = 0; i < dados.length - 1; i++) {
            for (int j = 0; j < dados.length - i - 1; j++) {
                if (dados[j] > dados[j + 1]) {
                    int temp = dados[j];
                    dados[j] = dados[j + 1];
                    dados[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] dados) {
        for (int i = 1; i < dados.length; i++) {
            int chave = dados[i];
            int j = i - 1;
            while (j >= 0 && dados[j] > chave) {
                dados[j + 1] = dados[j];
                j = j - 1;
            }
            dados[j + 1] = chave;
        }
    }

    public static void quickSort(int[] dados, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particionar(dados, inicio, fim);
            quickSort(dados, inicio, pivo - 1);
            quickSort(dados, pivo + 1, fim);
        }
    }

    public static int particionar(int[] dados, int inicio, int fim) {
        int pivo = dados[fim];
        int i = (inicio - 1);
        for (int j = inicio; j < fim; j++) {
            if (dados[j] <= pivo) {
                i++;
                int temp = dados[i];
                dados[i] = dados[j];
                dados[j] = temp;
            }
        }
        int temp = dados[i + 1];
        dados[i + 1] = dados[fim];
        dados[fim] = temp;
        return i + 1;
    }
}
