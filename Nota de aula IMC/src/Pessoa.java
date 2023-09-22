public class Pessoa {

    private Double altura;
    private Double peso;

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getAltura() {
        return altura;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double getPeso() {
        return peso;
    }
    public Double getIMC() {
        return peso / (altura * 2);
    }
}
