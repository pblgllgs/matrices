public class EjemploMatricesTransponerMatrices {
    public static void main(String[] args) {
        int [][]a,b;
        a = new int [8][4];
        b = new int [4][8];

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                a[i][j] = i+j*3;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[i].length; j++){
                b[i][j] = a[j][i];
            }
        }
        System.out.println("Matriz transpuesta");
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[i].length; j++){
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
