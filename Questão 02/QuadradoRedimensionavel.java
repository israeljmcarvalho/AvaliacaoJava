/*
Implemente uma classe `QuadradoRedimensionavel`, que é _subclasse_ de 
`Quadrado` e implementa a interface `Redimensionavel`. 
Essa classe deve _implementar_  um construtor que recebe o valor de 
`lado` e o transmite para o construtor da __superclasse__.
*/
public class QuadradoRedimensionavel extends Quadrado implements Redimensionavel {
    
    //Construtor
    public QuadradoRedimensionavel (double ladoInformado){
        super(ladoInformado); //super refere-se a classe pai
    }


    void redimensionar(int percentual){ //Como o exercício apresenta uma interface chamada redimensionar, precisa-se implementar esse método na classe

    }

}
