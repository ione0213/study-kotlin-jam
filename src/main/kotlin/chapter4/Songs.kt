package chapter4

class Song(val title: String, val artist: String) {
    fun  play() {
        println("Playing the song $title by $artist")
    }
    fun stop() {
        println("Stopped playing $title")
    }
}

fun main() {
    val songOne = Song("The Mesopotamians", "They Might Be Giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song("Make Me Smile", "Steve Marley")
    songTwo.play()
    songTwo.stop()
    songThree.play()
}