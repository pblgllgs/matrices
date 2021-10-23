public class EjemploMatrices {
    public static void main(String[] args) {

        int [] [] numeros = new int[2][4];

        numeros [0][0] = 1;
        numeros [0][1] = 2;
        numeros [0][2] = 3;
        numeros [0][3] = 4;
        numeros [1][0] = 5;
        numeros [1][1] = 6;
        numeros [1][2] = 7;
        numeros [1][3] = 8;

        System.out.println("cantidad de filas: " +numeros.length);
        System.out.println("cantidad de columnas: " +numeros[0].length);

        System.out.println(numeros[0][0]);
        System.out.println(numeros[numeros.length-1][numeros[numeros.length-1].length - 1]);

    }
}
