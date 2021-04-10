package one.digitalinnovation.digionebank

class Pessoa {
    val nome: String = "Anderson"
    val cpf: String = "123.123.123-11"
}

fun main() {
    val anderson = Pessoa()
    println(anderson.nome)
    println(anderson.cpf)
    println("Teste")
}