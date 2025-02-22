package Pieces

class Pawn(
    color: String,
    position: Pair<Int, Int>,
    symbol: Char,
    inPlay: Boolean) : Piece(color, position, symbol) {
    private var firstMove: Boolean = true

    override fun isValid(currentPosition: Pair<Int, Int>, futurePosition: Pair<Int, Int>): Boolean {
        if (firstMove) {
            return true
        } else {
            return true
        }
        return false
    }
}