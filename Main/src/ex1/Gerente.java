package ex1;

class Gerente extends Funcionario {
    private static final float bonusGerente = 0.05f;

    public Gerente(String nome, float valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    @Override
    public float salario() {
        float salarioBase = super.salario();
        return salarioBase + (salarioBase * bonusGerente);
    }
}