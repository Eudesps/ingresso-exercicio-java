package models;

public class IngressoMeiaEntrada extends Ingresso{
    public IngressoMeiaEntrada(double valorDoIngresso, String nomeDoFilme, boolean isDublado) {
        super(valorDoIngresso, nomeDoFilme, isDublado);
    }

    @Override
    void setValorDoIngresso(double valorDoIngresso) {
        this.valorDoIngresso = valorDoIngresso / 2;
    }
}
