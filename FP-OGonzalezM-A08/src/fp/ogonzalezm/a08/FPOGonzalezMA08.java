/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.ogonzalezm.a08;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class FPOGonzalezMA08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarResultado(CalculaAreas (menu()));
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
 public static double CalculaAreas(int o){
     double area;
     switch (o){
         case 1:
             area = areaCuadrado(o);
             break;
         case 2:
             area = areaCirculo(o);
             break;
         case 3:
             area = areaTriangulo(o);
             break;
         default:
             mensajeSalida();
             area = 0;
             
     }
     return area;
 }
 public static double areaCuadrado(int a){
     double area, l;
     l = pedirDatos(a);
     area = l*l;
     System.out.println("El area del cuadrado es: " +a);
     return area;
 }
 public static double areaCirculo(int a){
     double area, r;
     double pi = 3.1416;
     r = pedirDatos(a);
     area = Math.pow(r, 2) * r;
     return area;
 }   
 public static double areaTriangulo(int a){
     double b,h,area;
     b = pedirDatos(a);
     h = pedirDatos(a);
     area = (b*h)/2;
     return area;
 }
 public static void mensajeSalida(){
     System.out.println("Gracias por participar");
 }
public static double pedirDatos(int o){
    double datos;
    switch(o){
        case 1: 
     Scanner entrada = new Scanner (System.in);
     System.out.println("Escriba el lado del cuadrado");
     datos = entrada.nextInt();  
     
        case 2:
     double r;
     entrada = new Scanner (System.in);
     System.out.println("Escriba el radio del circulo");
     r = entrada.nextInt();   
     
        case 3:
        double b,h;
     entrada= new Scanner(System.in);
     System.out.println("Escriba la base del trangulo");
     datos = entrada.nextInt();
     System.out.println("Escriba la altura del triangulo");
     datos = entrada.nextInt();   
        
        default:
            datos = 0;
        
    }
    return datos;
}
public static void muestraResultado (double area){
   
         System.out.println("El area del la fifura es:  " +area);
}
        


   
    
}
