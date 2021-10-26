public class MatricesStringTamanoVariable {
    public static void main(String[] args) {

        String [][] nombres = new String[3][];

        nombres[0]= new String[]{"pablo"};
        nombres[1] = new String[]{"gallegos","flores"};
        nombres[2] = new String[]{"alonzo","sanhueza","gallegos"};

        for( int i= 0;i<nombres.length;i++){
            System.out.println("el largo del arreglo en la posicion "+i+ " es de: "+nombres[i].length);
        }

    }
}
