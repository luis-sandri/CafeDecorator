class ComDoseExpresso extends BebidaDecorator {
    public ComDoseExpresso(Bebida bebida) { super(bebida); }

    public String getDescricao() { return bebidaBase.getDescricao() + " + Dose de Expresso"; }
    public double getPreco() { return bebidaBase.getPreco() + 3.00; }
}