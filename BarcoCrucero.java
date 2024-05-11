public class BarcoCrucero implements  IBarcos{
    private int mEslora;
    private int nCamasOcupadas;

    public BarcoCrucero(int mEslora, int nCamasOcupadas){
        this.mEslora = mEslora;
        this.nCamasOcupadas = nCamasOcupadas;
        System.out.println("Se creo un Crucero con " + mEslora + "m de eslora y " + nCamasOcupadas + " camas ocupadas");
    }


    @Override
    public void alarma(){
        System.out.println("Mensaje desde Barco Crucero");
    }

    @Override
    public void mensajeSocorro(String mensaje){
        alarma();
        System.out.println(mensaje);
    }
}
