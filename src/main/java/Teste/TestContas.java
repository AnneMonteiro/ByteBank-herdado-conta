package Teste;

import Modelo.ContaCorrente;
import Modelo.ContaPoupanca;
import Modelo.SaldoInsuficienteException;

public class TestContas {

    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);

        System.out.println("CONTA CORRENTE: " +cc.getSaldo());
        System.out.println("CONTA POUPANÇA: " +cp.getSaldo());

    }
}
