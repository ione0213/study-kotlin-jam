package chapter5.animanls


//interface
interface Roamable {
    fun roam()
}
//open class Animal {
abstract class Animal : Roamable {
//    open val image = ""
    abstract val image : String
//    open val food = ""
    abstract val food : String
//    open val habitat = ""
    abstract val habitat : String
    open val hunger = 10

//    open fun makeNoise() {
//        println("The Animal is making a noise")
//    }
    abstract fun makeNoise()

//    open fun eat() {
//        println("The Animal is eating")
//    }
     abstract fun eat()

//    open fun roam() {
    override fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }
}

class Hippo :  Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The hippo is eating $food")
    }
}

abstract class Canine : Animal() {
    override fun roam() {
        println("The Canine is roaming")
    }
}

class Wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hoooooowl!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }

}

class Vehicle : Roamable {
    override fun roam() {
        println("The Vehicle is roaming")
    }

}

class Vet {
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
}

fun main() {
    val animal = arrayOf(Hippo(), Wolf())
    for (item in animal){
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables) {
        item.roam()
        if (item is Animal) {
            item.eat()
        }
    }
}