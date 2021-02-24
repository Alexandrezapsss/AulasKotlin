//Construtores
class Casa(var cor: String, var vagas:Int) {
    /*Propriedades ou atributos sem construtor pois se pode colocar direto na Classe
    var cor: String= ""
    var vagas: Int = 0 */
    //Para usar o construtor temos de usar o comando "init" ele inicia uma ação nesse caso armazenar.
    init{
        this.cor = cor
        this.vagas = vagas 
    }
    //Metodo
    fun detalhesDaCasa(){
        println("A casa tem a cor: $cor e possui $vagas vagas na garagem")
    }
}
fun main(args: Array<String>){
    /*
    //Abaixo Objeto Casa Criado sem Construtor.
    val casa1 = Casa()
    casa1.cor="amarelo"
    casa1.vagas=2 */
    //Abaixo criado com Construtor
    val casa1 = Casa("Amarelo", 2)    
    casa1.detalhesDaCasa()
    val casa2 = Casa("Azul", 4)
    casa2.detalhesDaCasa()
    
}
