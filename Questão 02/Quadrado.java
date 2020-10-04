/* (a)
Implemente uma classe `Quadrado`, que possui um atributo `lado` de tipo `double`. 
Implemente um construtor que preenche o atributo `lado`. 
Faça com que essa classe __implemente__ a interface `Geometria`.
*/

public class Quadrado implements Geometria{

    private double lado;

    //Construtor Padrão
    public Quadrado() {
        this.lado = 8;
    }

    //Construtor Alternativo

    public Quadrado (double parametroInformado) { // parametroInformado virá do construtor da classa filha
        this.lado=parametroInformado;
    }


    public double getPerimetro(){
        return this.lado *4;
    }

    public double getArea() {
        return this.lado * this.lado;
    }    

}
