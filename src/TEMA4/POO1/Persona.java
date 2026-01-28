package TEMA4.POO1;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String DNI;
    int edad;

    private String nombre2;
    private String apellido12;
    private String apellido22;
    private String DNI2;
    int edad2;

    public static final int edadDefecto = 0;
    public static final int mayorDeEdad = 18;
    public static final int retiretAge = 65;

    public Persona() {
        nombre = "Bielle";
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

    public String getnombre2(){
        return nombre2;
    }

    public String getApellido12(){
        return apellido12;
    }

    public String getApellido22(){
        return apellido22;
    }

    public int getedad2(){
        return edad2;
    }

    public String getDNI2(){
        return DNI2;
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

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setDNI2(String DNI2){
        this.DNI2 = DNI2;
    }

    public void setApellido12(String apellido12){
        this.apellido12 = apellido12;
    }

    public void setApellido22(String apellido22){
        this.apellido22 = apellido22;
    }

    public void setEdad2(int edad2){
        if (edad2>=0 && edad2<=100){
            this.edad2 = edad2;
        }else {
            this.edad2=edadDefecto;
        }
    }



    public int ageDifference(int edad, int edad2){
        if (edad2 > edad) {
            System.out.println("diferencia de edad ente la edad 1 y 2: " + edad + " - " + edad2 + " = " + ageDifference(edad, edad2));
            return edad - edad2;
        }else {
            System.out.println("diferencia de edad ente la edad 1 y 2: " + edad + " - " + edad2 + " = " + ageDifference(edad, edad2));
            return  edad2 - edad;
        }
    }

    public boolean isAdult(int edad){
        return edad >= mayorDeEdad;
    }

    public boolean isRetired(int edad){
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

    public void print(){
        System.out.println("\n Nombre: " + nombre + "\n Apellidos: " + apellido1 + " " + apellido2 + "\n Edad: " + edad + " años.\n");

        System.out.println("Es adulto? " );
        if(isAdult(edad)){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
        System.out.println("Es jubilado? " );
        if (isRetired(edad)){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
}
