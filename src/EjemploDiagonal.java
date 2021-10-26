public class EjemploDiagonal {
    public static void main(String[] args) {

        int [][] matriz = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i == j) {
                    matriz[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print("["+matriz[i][j] +"]");
            }
            System.out.println();
        }
        System.out.println("marco");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i ==0 || j==0 || i== matriz.length-1 || j ==matriz.length-1) {
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print("["+matriz[i][j] +"]");
            }
            System.out.println();
        }

    }
}
