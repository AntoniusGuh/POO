package ex1;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("ex1.Funcionario", 18.0f, 150);
        Lider l1 = new Lider("ex1.Lider", 24.0f, 150);
        Gerente g1 = new Gerente("ex1.Gerente", 32.0f, 150);

        System.out.println("Salário do " + f1.getNome() + ": R$" + f1.salario());
        System.out.println("Salário d0 " + l1.getNome() + ": R$" + l1.salario());
        System.out.println("Salário do " + g1.getNome() + ": R$" + g1.salario());
    }
}