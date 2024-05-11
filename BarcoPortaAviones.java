public class BarcoPortaAviones implements IBarcos{

    private int nAviones;
    private int nMarineros;

    public BarcoPortaAviones(int nAviones, int nMarineros) {
        this.nAviones = nAviones;
        this.nMarineros = nMarineros;
        System.out.println("Se creo un Crucero con " + nAviones + " numero de aviones y " + nMarineros + " numero de Marineros");
    }

    @Override
    public void alarma() {
        System.out.println("Mensaje desde Barco Porta Aviones");
    }

    @Override
    public void mensajeSocorro(String mensaje) {
        alarma();
        System.out.println(mensaje);
    }
}
