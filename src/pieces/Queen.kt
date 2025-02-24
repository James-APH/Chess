package pieces

import Board

class Queen(
    color: String,
    position: Pair<Int, Int>,
    symbol: Char,
    inPlay: Boolean) : Piece(color, position, symbol) {


    override fun isValidMove(currentPosition: Pair<Int, Int>, futurePosition: Pair<Int, Int>, board: Board): Boolean {
        return true
    }

    override fun isValidCapture(currentPosition: Pair<Int, Int>, futurePosition: Pair<Int, Int>, board: Board): Boolean {
        return true
    }
}