package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Anderson"

    var cpf: String = "123.123.123-11"
    private set
}

fun main() {
    val anderson = Pessoa()

    println(anderson.nome)
    println(anderson.cpf)
}