fun main(){
    //Para Criar uma Array usar o chamada "arrayOF(...)"
    var names= arrayOf("Alexandre", "Beatriz", "Carlos")
    //Para Criar uma Array para valores inteiros ou float, usar a chamada "intArrayOf(...)"
    var numbers= intArrayOf(1,2,3)
    
    //Como a Array foi atribuida a uma variavel tipo "var", ela pode ser alterada
    
    names[1]="Patricia"
  
    
    println(names[1])//Beatriz foi substituida pela Patricia
    println(numbers[1])
    
    
    
}