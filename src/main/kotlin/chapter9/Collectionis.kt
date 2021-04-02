package chapter9

data class Recipe(var name: String)

fun main() {
//    val mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
    var mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
    println("mShoppingList original : $mShoppingList")
    val extraShopping = listOf("Cookie", "Sugar", "Eggs")
    mShoppingList.addAll(extraShopping)
    println("mShoppingList items added: $mShoppingList")
    if (mShoppingList.contains("Tea")) {
        mShoppingList.set(mShoppingList.indexOf("Tea"), "Coffee")
    }
    mShoppingList.sort()
    println("mShoppingList sorted : $mShoppingList")
    mShoppingList.reverse()
    println("mShoppingList reversed : $mShoppingList")

    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet : $mShoppingSet")
    val moreShopping = setOf("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items added : $mShoppingSet")
    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList new version : $mShoppingList")

    val list = listOf(Duck(), Duck(17))
    val set = setOf(Duck(), Duck(17))
    println(set)

    var pets: MutableList<String> = mutableListOf()

    val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Quinoa Salad")
    val r3 = Recipe("Thai Curry")
    val r4 = Recipe("Jambalaya")
    val r5 = Recipe("Sausage Rolls")
    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    println("mRecipeMap original: $mRecipeMap")
    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)
    println("mRecipeMap updated: $mRecipeMap")
    if(mRecipeMap.containsKey("Recipe1")) {
        println("Recipe1 is ${mRecipeMap.getValue("Recipe1")}")
        println(mRecipeMap.entries)
    }

}

class Duck(val size: Int = 17) {
//    override fun equals(other: Any?): Boolean {
//        return true
//    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other is Duck && size == other.size) return true
        return false
    }

    override fun hashCode(): Int {
        return 7
    }
}

