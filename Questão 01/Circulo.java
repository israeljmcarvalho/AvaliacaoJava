/**
* Uma classe que mantém as informações sobre um círculo.
*/
public class Circulo
{
    // Os campos.
    private double raio = 1.0;
    private String cor = "vermelho";
    
    // Construtores
    public Circulo() { }
    public Circulo(double raio) {
        this.raio = raio;
    }

    /* (a)
    Adicione à classe um _construtor_ que permita criar um `Circulo` com 
    dois marâmetros: um `double` para o `raio` e um `String` para `cor`. 
    Use a assinatura abaixo como base:
    */
    public Circulo(double raioDigitado, String corDigitado) {
        this.raio = raioDigitado;
        this.cor = corDigitado;
    }

    // Métodos de acesso
    public double getRaio() {
        return raio;
    }

    /* (c)
    Um aluno escreveu o seguinte código para a classe `Circulo`:
    */
    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", cor=" + cor + "]";
    }
    // O que a palavra `@Override` indica? Por que ela foi colocada neste método da classe?
    // Resposta: @Override é um comando da linguagem java que indica que o método imediatamente após a palavra "@Override" não está sendo executado exatamente da forma 
    //que foi escrito na classe pai (neste caso a classe Object) mas sim de acordo com o que o programador escrever no corpo do método.
}