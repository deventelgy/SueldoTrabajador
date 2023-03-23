import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sp = new Scanner(System.in);
        System.out.println("\nIngrese su nombre completo: ");
        String name = sp.nextLine();

        System.out.println("Ingrese las horas trabajadas: ");
        int horas = sp.nextInt();

        System.out.println("Ingrese el salario por horas: ");
        int salarioHora=sp.nextInt();

        System.out.println("Ingrese el impuesto por Ley: ");
        double impuestoLey = sp.nextDouble();

        int sueldoBruto=horas*salarioHora;
        double dstoImpuesto=sueldoBruto*(impuestoLey)/100;
        double sueldoNet=sueldoBruto-dstoImpuesto;

        System.out.println("Nombre: "+name);
        System.out.println("El Sueldo Bruto es: "+sueldoBruto);
        System.out.println("Descuento es : "+dstoImpuesto);
        System.out.println("El sueldo Neto es: "+sueldoNet);
    }
}