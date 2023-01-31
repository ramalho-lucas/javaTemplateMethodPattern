public class Efetivo extends Funcionario{
    private  double salarioBase;
    private double desconto;
    private  double bonificacao;

    public Efetivo(String nome, String sobrenome, String numeroConta, String localDeposito, double salarioBase, double desconto, double bonificacao) {
        super(nome, sobrenome, numeroConta, localDeposito);
        this.salarioBase = salarioBase;
        this.desconto = desconto;
        this.bonificacao = bonificacao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase+bonificacao-desconto;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }


}
