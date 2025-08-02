import java.util.ArrayList;
import java.util.List;

// Clase TarjetaDeCredito que representa una tarjeta de crédito con un límite y saldo inicial y permite realizar compras con un límite específico.
public class TarjetaDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompras;

    //Constructor de la tarjeta de crédito
    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    //Lógica para agregar una compra
    public boolean lanzarCompra(Compra compra){
        if(this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaDeCompras.add(compra);
            return true;
        }
        return false;
    }

    //Getters para los valores de la tarjeta de crédito y la lista de compras
    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }
}
