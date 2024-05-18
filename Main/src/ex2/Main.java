package ex2;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso dos objetos para desenhar retângulos

        Retangulo retangulo1 = new BordasArredondadas("Texto");
        retangulo1.desenhar();

        Retangulo retangulo2 = new LinhasDuplas("Texto");
        retangulo2.desenhar();

        Retangulo retangulo3 = new AsciiArt("Texto");
        retangulo3.desenhar();
    }
}

