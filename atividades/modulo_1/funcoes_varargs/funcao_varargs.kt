fun main() {
    fun printAll(vararg messages: String) {                            // 1
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")                 // 2

    fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "                                          // 4
    )

    fun log(vararg entries: String) {   
        printAll(*entries)                                             // 5
        //ao chamar outra função dentro da log (que é outra função), é necessário colocar o operador * no vararg
    }
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}