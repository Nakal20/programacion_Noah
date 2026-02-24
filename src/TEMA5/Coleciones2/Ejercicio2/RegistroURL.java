package Tema5.Coleciones2.Ejercicio2;

public class RegistroURL {

    private String clave;
    private String url;

    public RegistroURL() {
    }

    public RegistroURL(String clave, String url) {
        this.clave = clave;
        this.url = url;
    }

    public String getClave() {
        return clave;
    }

    public String getUrl() {
        return url;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Clave: " + clave +
                " | URL corta: https://acortar.link/" + clave +
                " | URL original: " + url;
    }
}
