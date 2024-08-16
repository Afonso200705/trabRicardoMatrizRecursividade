public class Main {

    public static void main(String[] args) {


        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Mostra a matriz na tela usando a função recursiva
        System.out.println("Matriz Gerada:");
        MatrizRecursiva.exibirMatriz(matriz, 0, 0);
    }
}