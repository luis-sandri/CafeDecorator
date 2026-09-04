abstract class BebidaDecorator implements Bebida {
    protected Bebida bebidaBase;

    public BebidaDecorator(Bebida bebida) {
        this.bebidaBase = bebida;
    }
}
