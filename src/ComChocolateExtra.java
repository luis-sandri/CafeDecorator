class ComChocolateExtra extends BebidaDecorator {
    public ComChocolateExtra(Bebida bebida) { super(bebida); }

    public String getDescricao() { return bebidaBase.getDescricao() + " + Chocolate Extra"; }
    public double getPreco() { return bebidaBase.getPreco() + 2.50; }
}