package chapter2

import kotlin.reflect.KFunction0

fun main() {
    fun example(a: String): String = a
    println(example("RRR"))

    for(x in 1 .. 10){
        println(x)
    }

    //for loop : array and withIndex
    var tempIntArray = arrayOf(1, 2, 3)
    for((index, item) in tempIntArray.withIndex()){
        println("$index : $item")

    }

    //passing function
    fun example2(egFun: () -> (Unit)) {
        egFun()
//        egFun.invoke()
    }

    fun toUse() {
        println("Hi")
    }

//    example2(::toUse)
    example2 { toUse() }

    //Lambda practice
    val ex : (String) -> String ={it}
    println("Lambda : ${ex("Hello Lambda")}")

    val ex2 : (String) -> Unit = { println(it)}
    ex2("Lambda and it")

    var ex3 :(String, Int) -> Unit = {eg1, eg2 -> println(eg1)}
    ex3("HHH", 1)


    //vararg
    fun example3(vararg xs: Int) : Int{
        return xs.sum()
    }
    println(example3(1,2,22,2,34))

    fun example4(a: String, vararg xs : Int) {
        println("$a ${xs.sum()}")
    }
    example4("The sum is : ", 1,2,3,4,3,1,2,23,33)

}