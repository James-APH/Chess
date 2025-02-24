package pieces

import Board

open class Piece(
    protected var color: String = "\u001b[0m",
    private var position: Pair<Int, Int> = Pair(0, 0),
    private var symbol: Char = '#') {
    private val reset: String = "\u001b[0m"
    private var inPlay: Boolean = true

    open fun isValidMove(currentPosition: Pair<Int, Int>, futurePosition: Pair<Int, Int>, board: Board): Boolean {
        return true
    }

    open fun isValidCapture(currentPosition: Pair<Int, Int>, futurePosition: Pair<Int, Int>, board: Board): Boolean {
        return true
    }

    open fun setPosition(position: Pair<Int, Int>) {
        this.position = position
    }

    open fun getPosition(): Pair<Int, Int> {
        return position
    }

    fun getSymbol(): Char {
        return symbol
    }

    fun kill() {
        inPlay=false
    }

    override fun toString(): String {
        return "$color$symbol$reset"
    }
}