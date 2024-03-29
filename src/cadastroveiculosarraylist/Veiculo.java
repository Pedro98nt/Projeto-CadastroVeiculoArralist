package cadastroveiculosarraylist;

public class Veiculo {
    private int codigo;
    private String modelo;
    private String marca;
    private double preco;

    public Veiculo() {
    }

    public Veiculo(int codigo, String modelo, String marca, double preco) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
