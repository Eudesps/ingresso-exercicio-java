package models;

// valor, nome do filme e informar se é dublado ou legendado
public class Ingresso {
    private double valorDoIngresso;
    private String nomeDoFilme;
    private boolean isDublado;

    public double getValorDoIngresso() {
        return valorDoIngresso;
    }

    public void setValorDoIngresso(double valorDoIngresso) {
        this.valorDoIngresso = valorDoIngresso;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public boolean isDublado() {
        return isDublado;
    }

    public void setDublado(boolean dublado) {
        isDublado = dublado;
    }
}
