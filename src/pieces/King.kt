package pieces

import Board

class King(
    color: String,
    position: Pair<Int, Int>,
    symbol: Char,
    inPlay: Boolean) : Piece(color, position, symbol, inPlay) {


    override fun isValidMove(currentPosition: Pair<Int, Int>, futurePosition: Pair<Int, Int>, board: Board): Boolean {
        return true
    }

    override fun isValidCapture(currentPosition: Pair<Int, Int>, futurePosition: Pair<Int, Int>, board: Board): Boolean {
        return true
    }

    // check if the rook is in a valid position to castle, check if the king is in a valid position to castle, this might be a function
    // that I implement in piece or board, I may also do it for a pawn reaching the other end
    // , (bad programming Ik, but it may be the least confusing
    fun isValidCastle(currentPosition: Pair<Int, Int>, futurePosition: Pair<Int, Int>, board: Board): Boolean {
        return true
    }
}