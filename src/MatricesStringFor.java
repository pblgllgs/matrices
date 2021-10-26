public class MatricesStringFor {
    public static void main(String[] args) {

        String[][] nombres = new String[3][3];

        nombres[0][0]= "pablo";
        nombres[0][1]= "antonio";
        nombres[0][2]= "rafael";
        nombres[1][0]= "gallegos";
        nombres[1][1]= "gonzalez";
        nombres[1][2]= "flores";
        nombres[2][0]= "alonzo";
        nombres[2][1]= "sanhueza";
        nombres[2][2]= "gallegos";


        for (int i = 0; i < nombres.length; i++){
            for (int j = 0; j < nombres[i].length; j++){
                System.out.println(" "+ nombres[i][j]+" ");
            }
        }
        System.out.println();
        for (String[] fila : nombres) {
            for (String columna : fila) {
                System.out.println(" " + columna + " ");
            }
        }

    }
}
