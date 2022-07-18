package Teste;

import Modelo.Conta;
import Modelo.ContaCorrente;
import Modelo.SaldoInsuficienteException;

public class TestSaca {

    public static void main(String[] args) {

        Conta conta = new ContaCorrente(123,321);
        conta.deposita(200.0);
        try {
            conta.saca(210.0);
        }catch (SaldoInsuficienteException ex){
            System.out.println("Saldo Insuficiente " + ex.getMessage());
        }
        System.out.println(conta.getSaldo());


    }
}
