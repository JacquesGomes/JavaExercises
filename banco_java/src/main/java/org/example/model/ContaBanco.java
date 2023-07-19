package org.example.model;

public class ContaBanco {

    private int numero;
    private String agencia;
    private String cliente;
    private float saldo;

    public ContaBanco(int numero, String agencia, String cliente, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void info(){
        System.out.println("Nome: " + this.cliente);
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Saldo: R$" + this.saldo);

    }

}
