/* (b)
Implemente uma classe `Truco` que contém como atributos dois 
`Jogadores, um `Baralho`, uma `cartaVirada` do tipo `Carta`. 
Sua classe deve ter um construtor padrão que inicializa cada um 
desses atributos (basicamente faz `new` neles). 

Deve ter um método privado `embaralharCartas()` que chama o método 
- `embaralha()` do `Baralho`, 
- um método privado `distribuirMaos()`, 
que deve distribuir três cartas do baralho para cada jogador 
(lembre-se do método `receberCarta` de `Jogador`). 
Você também deve implementar um método `inicializaManilha()`, 
que põe uma carta na meso (distribui uma carta do baralho e atribui a 
`cartaVirada`). 

Esses métodos que você implementar, 
vão complementar a classe truco. 
Para sua referência, segue o método `jogar()`, 
que implementa a lógica básica do início do jogo:
*/
public class Truco {

    //Atributos
    private Jogador j1;
    private Jogador j2;
    private Baralho baralho;
    private Carta cartaVirada;

    //Construtor Padrão
    public Truco(){
        this.j1 = new Jogador();
        this.j2 = new Jogador();
        this.baralho = new Baralho();
        //Não precisa inicializar o atributo cartaVirada pois na classe 
    }

    private void imprimeMesa() {
        System.out.println("Apenas um placeholder para a impressão de mesa.");
        System.out.println("Você não precisa implementar esse método.");
    }

    public void embaralhaCartas (){ //Deve ter um método privado `embaralharCartas()
        baralho.embaralhar(); //que chama o método `embaralha()` do `Baralho`
    }

    public void distribuirMaos(){
        for (int i = 0; i < 3 ; i++) {
            this.j1.receberCarta(baralho.distribuir()); //(lembre-se do método `receberCarta` de `Jogador`)
            this.j2.receberCarta(baralho.distribuir()); //(lembre-se do método `receberCarta` de `Jogador`)
        }
    }

    public void inicializaManilha(){ //Você também deve implementar um método `inicializaManilha()`, 
        this.cartaVirada = baralho.distribuir(); //que põe uma carta na meso (distribui uma carta do baralho e atribui a cartaVirada`)
    }

    public void jogar() {
        embaralhaCartas();
        distribuiMaos();
        inicializaManilha();
        imprimeMesa();
    }    

    
}

