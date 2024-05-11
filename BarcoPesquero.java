public class BarcoPesquero implements IBarcos{
    private int mEslora;
    private int potencia;
    private int nPescadores;

    public BarcoPesquero(int mEslora, int potencia, int nPescadores){
        this.mEslora = mEslora;
        this.potencia = potencia;
        this.nPescadores = nPescadores;
        System.out.println("Se creo un Crucero con " + mEslora + "m de eslora y " + potencia + " de potencia y " + nPescadores + " numero de pescadores");
    }

    @Override
    public void alarma(){
        System.out.println("Mensaje desde Barco Pesquero");
    }

    @Override
    public void mensajeSocorro(String mensaje){
        alarma();
        System.out.println(mensaje);
    }
}
