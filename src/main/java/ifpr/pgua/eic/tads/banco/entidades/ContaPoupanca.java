package ifpr.pgua.eic.tads.banco.entidades;

public class ContaPoupanca extends Conta {
    private double rendimento;
    private double txRendimento;

    public ContaPoupanca(String agencia, String numero, Pessoa cliente, double saldo,
            double txRendimento) {
        super(agencia, numero, cliente, saldo);
        this.txRendimento = txRendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public double getTxRendimento() {
        return txRendimento;
    }

    public void setTxRendimento(double txRendimento) {
        this.txRendimento = txRendimento;
    }

}
