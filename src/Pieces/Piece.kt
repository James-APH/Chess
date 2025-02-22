package Pieces

open class Piece(
    private var color: String = "\u001b[0m",
    private var position: Pair<Int, Int> = Pair(0, 0),
    private var symbol: Char = '#',
    private var inPlay: Boolean = true) {
    private val reset: String = "\u001b[0m"

    fun isValid(currentPosition: Pair<Int, Int>, futurePosition: Pair<Int, Int>): Boolean {
        return true
    }

    fun setPosition(position: Pair<Int, Int>) {
        this.position = position
    }

    fun getPosition(): Pair<Int, Int> {
        return position
    }

    fun getSymbol(): Char {
        return symbol
    }

    fun kill() {
        inPlay=false
    }

    override fun toString(): String {
        return "$color$symbol"
    }
}