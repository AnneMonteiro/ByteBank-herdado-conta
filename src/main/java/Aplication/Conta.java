package Aplication;

public abstract class Conta {
     protected double saldo;
     private int agencia;
     private int numero;
     private Cliente titular;

     private static int total=0;


     public Conta(int agencia, int numero){
         total++;
         System.out.println("O total de contas é "+total);
         this.agencia = agencia;
         this.numero = numero;
         this.saldo = 0;
         System.out.println("estou criando uma conta " +this.numero+  " Agencia: " +this.agencia);
     }

    public abstract void deposita(double valor);

     public boolean saca(double valor){
        if (this.saldo>=valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
     }

     public boolean transfere(double valor, Conta destino){
        if (this.saca(valor)){
            destino.deposita(valor);
            return true;
        }else{
            return false;
        }

     }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia >=0){
            System.out.println("nao pode valor menor ou igual a 0 ");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0){
            System.out.println("nao pode numero <= 0");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }
}



