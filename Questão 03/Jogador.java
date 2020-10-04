/*
Implemente uma classe `Jogador` que contenha os atributos: `mao`, do tipo `Carta[]` (um vetor de cartas) 
e `indiceMao` do tipo `int`. 




A `mao` deve ter tamanho `3`. 
O `indiceMao` servirá para indicar qual carta da mão foi selecionada.
Essa classe deve ter um construtor padrão (sem receber nenhum parâmetro) que inicializa a `mao` 
(inicializa o vetor) 
e inicializa o valor do `indiceMao` com `0`. 
O jogador também deve ter um método `recebeCarta(Carta c)` 


que insere uma carta no vetor `mao`, na posição `indiceMao`. 
Você deve incrementar `indiceMao` após receber a carta. 
*/
public class Jogador {
    
    //Atributos
    private Carta[] mao; //do tipo `Carta[]` (um vetor de cartas) 
    private int indiceMao; //e `indiceMao` do tipo `int`. 

    //Construtor Padrão
    public  Jogador(){
        this.mao = new Carta[3]; //A `mao` deve ter tamanho `3`.
        this.indiceMao =0; //e inicializa o valor do `indiceMao` com `0`. 
    }

    public void receberCarta(Carta cartaInformada){ //O jogador também deve ter um método `recebeCarta(Carta c)`
        this.mao[this.indiceMao] = cartaInformada; //que insere uma carta no vetor `mao`, na posição `indiceMao`. 
        this.indiceMao ++; //Você deve incrementar `indiceMao` após receber a carta.
    }


   
}

