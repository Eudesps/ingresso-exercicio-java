import models.IngressoFamilia;
import models.IngressoMeiaEntrada;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IngressoMeiaEntrada meiaEntrada = new IngressoMeiaEntrada(50, "Interesterlar", true);
        System.out.println(meiaEntrada.getValorDoIngresso());

        IngressoFamilia ingressoFamilia = new IngressoFamilia(40, "O túmulo de vagalumes", false, 4);
        System.out.println(ingressoFamilia.getValorDoIngresso());
    }
}