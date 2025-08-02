public class Compra implements Comparable<Compra> {
    private double valor;
    private String descripcion;

    //Constructor de la compra
    public Compra(double valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    //Getters para los valores de la compra
    public double getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //toString de los valores de la compra
    @Override
    public String toString() {
        return "Compra: valor=" + valor +
                ", descripcion='" + descripcion;
    }

    // Método para comparar compras basado en el valor
    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
    }
}
