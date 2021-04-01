package chapter8

class Wolf {
    var hunger = 10
    val food = "meet"

    fun eat() {
        println("The Wolf is eating $food")
    }
}

class MyWolf {
    var wolf: Wolf? = Wolf()

    fun myFunction() {
        wolf?.eat()
    }
}

fun getAlphaWold() : Wolf? {
   return Wolf()
}

fun main() {
    var w: Wolf? = Wolf()

    if(w != null) {
        w.eat()
    }

    var x = w?.hunger
    println("The value x is $x")

    var y = w?.hunger ?: -1
    println("The value y is $y")

    var myWolf = MyWolf()
    myWolf?.wolf?.hunger = 8
    println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")

    var myArray = arrayOf("Hi", "Hello", null)
    for (item in myArray) {
        item?.let { println(it)  }
    }

    getAlphaWold()?.let { it.eat() }

    w = null
//    var z = w!!.hunger
}