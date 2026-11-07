public class ImageGen {

    int[] gerarImagens(int tamanho){
        int[] vetor = new int[20];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        return vetor;
    }


    void imprimirVetor(int[] vetor){
        for (int i : vetor) {
            System.out.println(i + " ");
        }
        System.out.println();
    }


    void bubbleSort(int[] vetor) {
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + i; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
    }

    void InsertionSort(int[] vetor){
        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+i] = aux;
        }
    }
}