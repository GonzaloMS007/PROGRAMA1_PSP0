package P1;
import java.util.Scanner;
/**
@author Gonzalo Martinez Silverio
**/
public class ProgramaPSP0{
    static double media, varianza, desviacion;
    static int nVeces;
    public void MediaYDesviacionEstandar() {
        System.out.println("INSTITUTO TECNOLOGICO SUPERIOR DE ALAMO TEMAPACHE");
        System.out.println("PSP PROCESO PERSONAL DEL SOFTWARE || PROGRAMA: 01");
        System.out.println("DOCENTE: DR. TANIA TURRUBIATES LOPEZ");
        System.out.println("PERIODO ESCOLAR: AGOSTO 2023 - ENERO 2024");
        System.out.println("ALUMNO: GONZALO MARTINEZ SILVERIO || 202Z0029");   
        System.out.println("||  GRUPO: 7S1A  ||");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n¿Cuantos numeros desea calcular?");
            nVeces = sc.nextInt();
        //Array para almacenar los valores
        double numeros [] = new double[nVeces];
        for (int i = 0; i<nVeces; i++){
            System.out.println("Ingrese el numero: ");
             numeros[i] = sc.nextDouble();
        }
        //calculo de la media
        double suma = 0;
        for (double i: numeros){
            suma = suma + i;
        }
        media = suma / nVeces;
        System.out.println("La media es: " + media);
        //calculo de la varianza
        double sumatoria;
        for (int i=0; i<nVeces; i++){
            sumatoria = Math.pow(numeros[i] - media, 2);          
            varianza = varianza + sumatoria;            
        }
        varianza = varianza / (nVeces-1);
        //calculo de la desvacion estandar
        desviacion = Math.sqrt(varianza);
        double redondeo = Math.rint(desviacion*100)/100;
        System.out.println("LA DESVIACION ESTANDAR ES: " + redondeo);
    }
    public static void main(String[] args) {

        ProgramaPSP0 PSP0 = new ProgramaPSP0();
            PSP0.MediaYDesviacionEstandar();
    }
}



