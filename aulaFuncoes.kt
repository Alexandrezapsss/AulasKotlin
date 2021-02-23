fun exibir(name:String, idade:Int){
    println("Olá $name a sua idade é $idade anos ")
}
fun nota(nota1:Double, nota2:Double){
    var media=(nota1+nota2/2)
    println("A suas notas são: Primeira Prova $nota1 e Segunda Prova $nota2")
    println("A sua media é $media")
}
fun main(){
    exibir("Alexandre", 27)
    nota(7.00, 5.58)
}