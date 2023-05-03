class MutableStack<E>(vararg items: E) {              // 1
    //o parâmetro <E> é chamado de generic type parameter

    private val elements = items.toMutableList() //converte para um lista mutável
  
    fun push(element: E) = elements.add(element)        // 2
  
    fun peek(): E = elements.last()                     // 3
  
    fun pop(): E = elements.removeAt(elements.size - 1)
  
    fun isEmpty() = elements.isEmpty()
  
    fun size() = elements.size
  
    override fun toString() = "MutableStack(${elements.joinToString()})"
  }
  
  fun main() {
    val stack = MutableStack(0.62, 3.14, 2.7)
    stack.push(9.87)
    println(stack)
  
    println("peek(): ${stack.peek()}")
    println(stack)
  
    for (i in 1..stack.size()) {
      println("pop(): ${stack.pop()}")
      println(stack)
    }
  }