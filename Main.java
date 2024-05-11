public class Main {
    public static void main(String[] args) {
        BarcoCrucero crucero1 = new BarcoCrucero(43, 200);
        BarcoPortaAviones portaAviones1 = new BarcoPortaAviones(66, 100);
        BarcoPesquero pesquero1 = new BarcoPesquero(22, 69, 33);

        crucero1.alarma();
        crucero1.mensajeSocorro("AIUDAA");
        System.out.println(" ");
        portaAviones1.alarma();
        portaAviones1.mensajeSocorro("AIUDAA");
        System.out.println(" ");
        pesquero1.alarma();
        pesquero1.mensajeSocorro("AIUDAA");

    }
}