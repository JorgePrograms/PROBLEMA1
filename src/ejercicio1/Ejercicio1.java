package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {


    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int horasextras,totalhoras;
        float pagoporhora=40,sueldohorasextra=0;

    System.out.println("Ingrese horas trabajadas ");
    totalhoras=entrada.nextInt();
    if(totalhoras>40){
        horasextras=totalhoras-40;
        if(horasextras<=8){
            sueldohorasextra=horasextras*2.0f*pagoporhora;
        }
        else{
            sueldohorasextra=8*2.0f*pagoporhora+3.0f*pagoporhora*(horasextras-8);
        }
    }
    else{
        System.out.println("no hay horas extras");
    }
        System.out.println("el sueldo de horas extras es: "+sueldohorasextra);
        }
    }