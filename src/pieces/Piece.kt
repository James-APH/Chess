package pieces

import Board

open class Piece(
    protected var color: String = "\u001b[0m",
    private var position: Pair<Int, Int> = Pair(0, 0),
    private var symbol: Char = '#',
    private var inPlay: Boolean = true) {
    private val reset: String = "\u001b[0m"

    // really only need one function to swap pieces around, and that can be handled in the board class,
    // but we do need alot of logic for valid moves, so it is easier to separate the logic into various functions.
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