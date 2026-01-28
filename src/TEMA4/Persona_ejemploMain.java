package TEMA4;

public class Persona_ejemploMain {

    public static void main(String[] args) {
        Persona_ejemplo persona = new Persona_ejemplo();
        persona.nombre = "Noah";
        persona.edad = 19;
        persona.saludar();
        persona.presentarme();
        persona.saludarA("Dani");
        Persona_ejemplo.showInfo();
    }
}

