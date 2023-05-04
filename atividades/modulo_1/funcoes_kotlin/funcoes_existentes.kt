import java.math.BigDecimal
import java.math.RoundingMode


fun main(){
    //String
    val nome = "Fulano"
    val tamanhoNome = nome.count() //Tamanho da string
    println("tamanhoNome: $tamanhoNome")
    val splitNome = nome.split("") //Separa o nome em caracteres
    println("splitNome: $splitNome")
    val dropLastNome = nome.dropLast(4) // Remove as 4 últimas letras
    println("dropLastNome: $dropLastNome")
    val dropNome = nome.drop(4) //Remove as 4 primeiras letras do nome
    println("dropNome: $dropNome")
    val containsNome = nome.contains("o") // Verifica se contem a letra "o" na palavra
    println("containsNome: $containsNome")

    //Array
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sumOfArray = array.sumOf { it }
    println("sumOfArray: $sumOfArray")
    val reverseArray = array.reversedArray()
    println("reverseArray: ${arrayToString(reverseArray)}")
    val sortArray = array.sortedArray()
    println("sortArray: ${arrayToString(sortArray)}")

    //BigDecimal
    val bigdecimal = BigDecimal("2")
    val powBigDecimal = bigdecimal.pow(3)
    println("powBigDecimal: $powBigDecimal")
    val divideBigDecimal = bigdecimal.divide(BigDecimal("3"), 8, RoundingMode.HALF_UP)
    println("divideBigDecimal: $divideBigDecimal")
}

fun arrayToString(array: Array<Int>) = array.fold(""){acc,i -> "$acc $i"}