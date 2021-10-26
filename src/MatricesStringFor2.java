public class MatricesStringFor2 {
    public static void main(String[] args) {

        String[][] nombres =    {   {"pablo","antonio","rafael"},
                                    {"gallegos","gonzalez","flores"},
                                    {"alonzo","sanhueza","gallegos"}    };

        for (String[] fila : nombres) {
            for (String columna : fila) {
                System.out.println(" " + columna + " ");
            }
        }

    }
}
