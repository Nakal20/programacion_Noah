package TEMA4.POO1;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String DNI;
    int edad;

    public static final int edadDefecto = 0;
    public static final int mayorDeEdad = 18;
    public static final int retiretAge = 65;

    public Persona() {
        this.nombre = "Bielle";
        apellido1 = "martinez";
        apellido2 = " martinez";
        edad = edadDefecto;
    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //constructor con todo
    public Persona(String nombre, int  edad, String apellido1, String apellido2 ) {
        this.nombre = nombre;
        apellido1 = "martinez";
        apellido2 = " martinez";
        edad = edadDefecto;
    }

    public String getnombre(){
        return nombre;
    }

    public String getApellido1(){
        return apellido1;
    }

    public String getApellido2(){
        return apellido2;
    }

    public int getedad(){
        return edad;
    }

    public String getDNI(){
        return DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI){
        this.DNI = DNI;
    }

    public void setEdad(int edad){
        if (edad>=0 && edad<=100){
            this.edad = edad;
        }else {
           this.edad=edadDefecto;
        }
    }

    public void setApellido1(String apellido1){
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2){
        this.apellido2 = apellido2;
    }

    public int ageDifference(Persona p1){
        if (p1.edad > this.edad) {
            System.out.println("diferencia de edad ente la edad 1 y 2: " + edad + " - " + p1.edad + " = " + ageDifference(p1));
            return edad - p1.edad;
        }else {
            System.out.println("diferencia de edad ente la edad 1 y 2: " + edad + " - " + p1.edad + " = " + ageDifference(p1));
            return p1.edad - edad;
        }
    }

    public boolean isAdult(){
        return this.edad >= mayorDeEdad;
    }

    public boolean isRetired(){
        return edad > retiretAge;
    }

    public static String checkDNI(){

        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        Scanner in = new Scanner(System.in);
        System.out.println("dime los numeros del DNI:");
        int numeroDNI = in.nextInt();
        System.out.println("dime la letra del DNI:");
        char letraDNI = in.next().toUpperCase().charAt(0);
        int resto = numeroDNI % 23;

        if (letras[resto] == letraDNI) {
            return  "El DNI es correcto";
        } else {
            return  "El DNI es incorrecto. La letra debería ser: " + letras[resto];
        }

    }

    //toString
    //igual que el print, pero devuelve un String

    public String toString(){
        String resul="";
        resul = resul + "\n Nombre: " + nombre + "\n Apellidos: " + apellido1 + " " + apellido2 + "\n Edad: " + edad + " años.\n";
        resul = resul +  "Es adulto? ";
        if(isAdult()){
            resul = resul + "SI";
        }else{
            resul = resul + "NO";
        }
        resul = resul + "Es jubilado? " ;
        if (isRetired()){
            resul = resul + "SI";
        }else{
            resul = resul + "NO";
        }
        return resul;
    }


    public void print(){
        System.out.println("\n Nombre: " + nombre + "\n Apellidos: " + apellido1 + " " + apellido2 + "\n Edad: " + edad + " años.\n");

        System.out.println("Es adulto? " );
        if(isAdult()){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
        System.out.println("Es jubilado? " );
        if (isRetired()){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
}
