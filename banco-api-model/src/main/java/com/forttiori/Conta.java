package com.forttiori;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
public class Conta {

    @Id
    private String id;
    @Setter
    private String numero;
    @Setter
    private String agencia;
    @Setter
    private Double saldo;

    public Conta(String numero, String agencia, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public static class ContaBuilder {

        private String numero;
        private String agencia;
        private Double saldo;

        public ContaBuilder numero(String numero) {
            this.numero = numero;
            return this;
        }

        public ContaBuilder agencia(String agencia) {
            this.agencia = agencia;
            return this;
        }

        public ContaBuilder saldo(Double saldo) {
            this.saldo = saldo;
            return this;
        }

        public Conta build(){
            return new Conta(numero, agencia, saldo);
        }
    }



}
