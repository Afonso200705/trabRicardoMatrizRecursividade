public class MatrizRecursiva {

    // Função recursiva para exibir os elementos da matriz
    public static void exibirMatriz(int[][] matriz, int linha, int coluna) {
        if (linha >= matriz.length) {
            return; // todas as linhas foram exibidas
        }
        if (coluna >= matriz[0].length) {
            System.out.println();
            exibirMatriz(matriz, linha + 1, 0); // Vai para a próxima linha
            return;
        }
        System.out.print(matriz[linha][coluna] + " ");
        exibirMatriz(matriz, linha, coluna + 1); // Vai para o próximo elemento na mesma linha
    }
}