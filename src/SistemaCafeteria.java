public class SistemaCafeteria {
    public static void main(String[] args) {
        System.out.println("--- PREPARANDO PEDIDOS ---\n");

        // Pedido 1: Café expresso com chocolate quente (Usando o chocolate extra)
        Bebida pedido1 = new CafeExpresso();
        pedido1 = new ComChocolateExtra(pedido1);
        imprimirResumo(pedido1);

        // Pedido 2: Café com leite com dupla quantidade de leite (2x o decorator de leite)
        Bebida pedido2 = new CafeComLeite();
        pedido2 = new ComLeiteExtra(pedido2);
        pedido2 = new ComLeiteExtra(pedido2);
        imprimirResumo(pedido2);

        // Pedido 3: Cappuccino com leite extra e uma dose de expresso
        Bebida pedido3 = new Cappuccino();
        pedido3 = new ComLeiteExtra(pedido3);
        pedido3 = new ComDoseExpresso(pedido3);
        imprimirResumo(pedido3);
    }

    private static void imprimirResumo(Bebida bebida) {
        System.out.println("Item: " + bebida.getDescricao());
        System.out.printf("Total: R$ %.2f\n", bebida.getPreco());
        System.out.println("------------------------------------------------");
    }
}