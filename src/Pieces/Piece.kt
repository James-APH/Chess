package Pieces

open class Piece(private val color: String, private var position: Pair<Int, Int>, private var symbol: Char) {
    constructor(color: String, symbol: Char) : this(color, Pair(0,0), symbol) {

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

    override fun toString(): String {
        return "$color$symbol"
    }
}