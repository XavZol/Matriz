import java.util.Scanner;
import javax.swing.JOptionPane;

/* Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y de cada columna. */
public class Matriz {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas,nCol, sumaFilas, sumaCol;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));

        matriz = new int[nFilas][nCol];

        System.out.println("Digite la matriz");
        for(int i=0; i<nFilas; i++) {
            for(int j=0; j<nCol; j++) {
                System.out.print("Matriz["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nla matriz es: ");
        for(int i=0; i<nFilas; i++) {
            for(int j=0; j<nCol; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        // SUMA de las filas 
        for(int i=0; i<nFilas; i++) {
            sumaFilas = 0;
            for(int j=0; j<nCol; j++) {
                sumaFilas += matriz[i][j];
            }
            System.out.print("\nLa suma de la fila["+i+"] es: "+sumaFilas);
        }
        System.out.println("");
        // SUMA de las columnas
        for(int j=0; j<nCol; j++) {
            sumaCol = 0;
            for(int i=0; i<nFilas; i++) {
                sumaCol += matriz[i][j];
            }
            System.out.print("\nLa suma de la columna["+j+"] es: "+sumaCol);
        }
        System.out.print("");
    }
}
