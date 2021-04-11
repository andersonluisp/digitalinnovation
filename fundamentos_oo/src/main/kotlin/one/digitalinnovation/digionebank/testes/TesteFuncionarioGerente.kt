package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente(nome = "Maria do Carmo", cpf = "123.123.123-12", salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}
