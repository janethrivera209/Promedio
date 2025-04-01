import javax.swing.JOptionPane;
public class Matriz{
    public static void main(String[] args) {
      int [][] calificacion = new int [6][5]; //matriz
      String[] encabezado ={"                         U1","U2","U3","U4","U5","P"} ;
      for (int n=0; n<6;n++){
            System.out.print(encabezado[n]+"  ");
         }
            System.out.print("    ");
       String[] materias = {"\nCalculo.Dif","Matemat.Dis","Fundame.Pro"
               ,"Fundame.Inv","Quimica.sis","Desarro.Sus"};
         int[] sumas = new int[6];

           System.out.print("      ");
          {
        for (int i = 0; i < 6; i++) {
            System.out.print(materias[i] + "              ");
            for (int n = 0; n < 5; n++) {
                calificacion[i][n] = Byte.parseByte(JOptionPane.showInputDialog("Coloca la"
                        + " calificacion de la materia por unidad"));
                System.out.print(calificacion[i][n] + "   ");
                sumas[i] +=calificacion[i][n];
            }
            sumas[i] /= 5;
            System.out.println(sumas[i]);
        }
        
        double r = 0;
        for (double suma : sumas) {
            r += suma;
        }
        double mn = r / 6;
        System.out.println("TU PROMEDIO FINAL ES DE UN TOTAL DE:              " + mn);
    }
}
}