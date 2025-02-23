import Pieces.*

class Player(private val name: String="NO-NAME", private var color: String="BLANK", private var wins: Int=0, private var losses: Int=0, private var text_color: String="\\033[33;1") {

    fun playerTurn() {
        println("$name, its your turn now!")
    }

    fun loser() {
        println("$name, you lost and you suck.")
        losses++
    }

    fun winner() {
        println("$name, you won and you're awesome!")
        wins++
    }

    override fun toString(): String {
        return super.toString() + "\n" + name + "\nWins: " + wins + "\nlosses: " + losses
    }
}