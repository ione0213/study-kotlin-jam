package chapter9

fun main() {
    val mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
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
}