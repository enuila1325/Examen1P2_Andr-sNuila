package examen1p2_andresnuila;

public class Mensaje {

    private Persona emisor, receptor;
    private String mensaje;

    public Mensaje() {
    }

    public Mensaje(Persona emisor, Persona receptor, String mensaje) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.mensaje = mensaje;
    }

    public Persona getEmisor() {
        return emisor;
    }

    public void setEmisor(Persona emisor) {
        this.emisor = emisor;
    }

    public Persona getReceptor() {
        return receptor;
    }

    public void setReceptor(Persona receptor) {
        this.receptor = receptor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "emisor=" + emisor + ", receptor=" + receptor + ", mensaje=" + mensaje;
    }

}
