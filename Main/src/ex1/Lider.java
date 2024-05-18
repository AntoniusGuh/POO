package ex1;

class Lider extends Funcionario {
    private static final float bonusLider = 0.02f;

    public Lider(String nome, float valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    @Override
    public float salario() {
        float salarioBase = super.salario();
        return salarioBase + (salarioBase * bonusLider);
    }
}