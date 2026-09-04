class ComLeiteExtra extends BebidaDecorator {
    public ComLeiteExtra(Bebida bebida) { super(bebida); }

    public String getDescricao() { return bebidaBase.getDescricao() + " + Leite Extra"; }
    public double getPreco() { return bebidaBase.getPreco() + 1.50; }
}
