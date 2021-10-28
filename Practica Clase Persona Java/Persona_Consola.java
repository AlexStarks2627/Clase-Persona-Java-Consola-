import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;
 
public class Persona_Consola {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        sc.useDelimiter("\n");
        sc.useLocale(Locale.US);
         
        System.out.println("Introduce el nombre");
        String nombre = sc.next();
 
        System.out.println("Introduce la edad");
        int edad = sc.nextInt();
 
        System.out.println("Introduce el sexo");
        char sexo = sc.next().charAt(0);
 
        System.out.println("Introduce el peso");
        double peso = sc.nextDouble();
 
        System.out.println("Introduce la altura");
        double altura = sc.nextDouble();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

        System.out.println("Persona1");
        MuestraMensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        System.out.println(persona1.toString());
    }
 
    public static void MuestraMensajePeso(Persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case Persona.PESO_IDEAL:
                System.out.println("La persona esta en su peso ideal");
                break;
            case Persona.PESO_MINIMO:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Persona.SOBRE_PESO:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }
 
    public static void MuestraMayorDeEdad(Persona p) {
 
        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
 
}