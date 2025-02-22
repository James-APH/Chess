import Pieces.Piece

class Board {
    private val rows: Int = 8
    private val cols: Int = 8
    private var board: Array<Array<Piece?>> = Array(rows) { Array(cols) { null } }

    fun initializeBoard() {
        for (i in 0..<rows) {
            for (j in 0..<cols) {
                if (j + i % 2 == 1) {
                    val piece: Piece = Piece("temp", "blank", "_", true)
                    board[i][j]=piece
                } else {
                    val piece: Piece = Piece("temp", "blank", "#", true)
                    board[i][j]=piece
                }
            }
        }
    }

    override fun toString(): String {
        return "Board(rows=$rows, cols=$cols)"
    }
    // have a actual board that we can loop through and display
    // have two lists, one for black, and one for white, and let the players manipulate them
    // still need to refine this idea. not completely sure how to track player moves.
    // think I will track the overall board with a 2d array of pieces, need to have a default value for each piece.
}