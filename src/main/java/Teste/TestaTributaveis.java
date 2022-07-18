package Teste;

import Modelo.CalculadorImposto;
import Modelo.ContaCorrente;
import Modelo.SeguroDeVida;

public class TestaTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorImposto calc = new CalculadorImposto();
        calc.registra (cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());
    }
}
