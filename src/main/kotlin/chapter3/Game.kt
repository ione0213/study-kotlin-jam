package chapter3

fun main() {
    val  options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun printResult(userChoice: String, gameChoice: String) {
    val result : String = if(userChoice == gameChoice) "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")) "You win!"
    else "You lose!"
    println("You chose $userChoice. I chose $gameChoice. $result")

}

fun getGameChoice(optionParam : Array<String>) = optionParam [ (Math.random() * optionParam.size).toInt()]

fun getUserChoice(optionParam : Array<String>) : String{
    var isValidChoice = false
    var userChoice = ""
    while(!isValidChoice){
        print("Please enter one of the following :")
        for(item in optionParam) print(" $item")
        println(".")

        val userInput = readLine()
        if(userInput != null && userInput in optionParam){
            isValidChoice = true
            userChoice = userInput
        }

        if(!isValidChoice) println("You must enter a valid choice.")
    }

    return userChoice
}