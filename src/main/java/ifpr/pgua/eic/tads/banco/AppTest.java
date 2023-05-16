package ifpr.pgua.eic.tads.banco;

import java.security.Permissions;

import ifpr.pgua.eic.tads.banco.entidades.ContaCorrente;
import ifpr.pgua.eic.tads.banco.entidades.ContaPoupanca;
import ifpr.pgua.eic.tads.banco.entidades.Pessoa;

public class AppTest {
    public static void main(String[] args) {
        Pessoa ze = new Pessoa("Zé", "123", 13, 1000);
        Pessoa chico = new Pessoa("Chico", "723", 18, 2000);

        ContaPoupanca poupanca = new ContaPoupanca("123", "34498", ze, 100, 0.05);
        ContaCorrente corrente = new ContaCorrente("900", "345", chico, 800, 7000);

    }
}
