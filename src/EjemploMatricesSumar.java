public class EjemploMatricesSumar {
    public static void main(String[] args) {
        int[][]a,b,c;

        a= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        b= new int[][]{{10,20,30},{40,50,60},{70,80,90}};
        c= new int[3][3];

        for (int i=0; i <a.length; i++) {
            for (int j=0; j < a[i].length; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++){
                System.out.print("[" + c[i][j] + "]");
            }
            System.out.println();
        }

    }
}
