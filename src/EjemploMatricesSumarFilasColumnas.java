public class EjemploMatricesSumarFilasColumnas {
    public static void main(String[] args) {
        int[][]a;

        int filas = 0;
        int columnas = 0;

        a= new int[][]{ {1,2,3},
                        {4,5,6},
                        {7,8,9}};

        for (int i=0; i <a.length; i++) {
            filas = 0;
            columnas = 0;
            for (int j=0; j < a[i].length; j++){
                filas += a[i][j];
                columnas +=a[j][i];
            }
            System.out.println("total filas: " +filas);
            System.out.println("total columnas: "+ columnas);
        }

    }
}
