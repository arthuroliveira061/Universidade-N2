public class Teste {
    public static void main(String[] args) {
        // Criando objetos das subclasses com as notas AV1 e AV2
        ProvaUCB provaUCB = new ProvaUCB(9.0, 7.5);
        ProvaFafifo provaFafifo = new ProvaFafifo(5.5, 5.5);

        // Chamando o método aprovado e exibindo o resultado
        System.out.println("Aluno na UCB aprovado: " + provaUCB.aprovado());
        System.out.println("Aluno na Fafifo aprovado: " + provaFafifo.aprovado());
    }
}