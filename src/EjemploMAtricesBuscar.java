public class EjemploMAtricesBuscar {
    public static void main(String[] args) {

        int [][] matriz = { {35,90,3,1978},
                            {15,2020,10,5},
                            {677,127,32767,1999} };

        int numero = 2020;
        boolean encontrado = false;
        String mensaje = "";

        ciclo:
        for (int i =0; i<matriz.length;i++){
            for (int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] == numero){
                    mensaje = "Numero encontrado en la fila: "+(i+1)+", columna: "+(j+1);
                    encontrado = true;
                    break ciclo;
                }
            }
        }

        if (encontrado){
            System.out.println(mensaje);
        }else{
            System.out.println("No fue encontrado");
        }

    }
}
