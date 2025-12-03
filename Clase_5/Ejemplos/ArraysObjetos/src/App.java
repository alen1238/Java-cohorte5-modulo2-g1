public class App {
    public static void main(String[] args) throws Exception {
        // Comentario[] comentarios = new Comentario[5];
        // comentarios[0] = new Comentario("Alen1238");
        // System.out.println("autor del comentario en posición 0: " + comentarios[0].getAutor());
        //ejemplo2();
        //ejemplo3();
        ejemplo4();
    }

    public static void ejemplo2() {
        int[][] matrix = {
            {12,56,67},
            {45,78,12},
            {12,67,89}
        };
        int fila = 0;
        int columna = 2;
        matrix[fila][columna] = 99;
        System.out.println("matrix en posición "+ fila + " columbna " + columna + ": " + matrix[fila][columna]);
    }

    public static void ejemplo3(){
        int[] numeros = {1,45,67,45,89};
        int longitud = numeros.length;
        for(int i=0; i < longitud; i++){
            System.out.print(numeros[i] + " ");
        }
    }

    public static void ejemplo4(){
        int[][] matrix = {
            {1,2,3,4,4,5,6},
            {4,5,6,7,5,5},
            {7,8,9,10,3},
            {4,5,6,2,3,5,6,7,8,10}
        };

        for(int i= 0; i < matrix.length; i++){
            for(int j= 0; j < matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // int i= 2; 
        // System.out.println("Matrix.length: " + matrix.length);
        // System.out.println("matrix[i].length: " + matrix[i].length);
    }
}
