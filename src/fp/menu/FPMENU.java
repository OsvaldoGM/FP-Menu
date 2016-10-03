/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.menu;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class FPMENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("La opción elegida es : " +menu());
    }
 public static int menu (){
     int opcion;
     Scanner entrada = new Scanner (System.in);
     do{
        System.out.println("**** Cálculo d areas ****");
        System.out.println("**** Menú: ****");
        System.out.println("Introduzca la opción deseada: ");
        System.out.println("1. Área de cuadrados. ");
        System.out.println("2. Área de círuclos. ");
        System.out.println("3. Área de triángulos. ");
        System.out.println("0. Salir ");
        opcion = entrada.nextInt();
    }while(opcion<0 || opcion>=4);
     return opcion;
 }
 public static float CalculaAreas(int o){
     float area;
     switch (o){
         case 1:
             area = areaCuadrado();
             break;
         case 2:
             area = areaCirculo();
             break;
         case 3:
             area = areaTriangulo();
             break;
         default:
             area = mensajeSalida();
             
     }
     return area;
 }
}
