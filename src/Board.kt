import Pieces.*

class Board() {
    private val rows: Int = 8
    private val cols: Int = 8
    private var yellowPieces = Array<Piece?>(16, init = TODO())
    private var greenPieces = Array<Piece?>(16, init = TODO())
    private var board: Array<Array<Piece?>> = Array(rows) { arrayOfNulls<Piece>(cols) }

    /*
    Constructor function to create the board.
    Fills the Board with empty Pieces, and playable pieces
     */
    init {
        yellowPieces = createPieces("yellow", 0, 1)
        greenPieces = createPieces("green", 6, 7)
        for (i in 0..<this.rows) {
            for (j in 0..<this.cols) {
                if ((j + i) % 2 == 1) {
                    val piece: Piece = Piece("\u001b[0m", Pair(i, j), '#')
                    board[i][j]=piece
                } else {
                    val piece: Piece = Piece("\u001B[31m", Pair(i, j), '#')
                    board[i][j]=piece
                }
            }
        }
        for (piece in this.yellowPieces) {
            if (piece != null) {
                board[piece.getPosition().first][piece.getPosition().second] = piece
            }
        }
        for (piece in this.greenPieces) {
            if (piece != null) {
                board[piece.getPosition().first][piece.getPosition().second] = piece
            }
        }
    }

    /*
    function to create the piece set for each player/color/team
     */
    private fun createPieces(color: String, pawnRow: Int, kingRow: Int): Array<Piece?> {
        return arrayOf(
            Pawn(color, Pair(pawnRow, 0), 'P', true),
            Pawn(color, Pair(pawnRow, 1), 'P', true),
            Pawn(color, Pair(pawnRow, 2), 'P', true),
            Pawn(color, Pair(pawnRow, 3), 'P', true),
            Pawn(color, Pair(pawnRow, 4), 'P', true),
            Pawn(color, Pair(pawnRow, 5), 'P', true),
            Pawn(color, Pair(pawnRow, 6), 'P', true),
            Pawn(color, Pair(pawnRow, 7), 'P', true),
            Rook(color, Pair(kingRow, 0), 'R', true),
            Knight(color, Pair(kingRow, 1), 'H', true),
            Bishop(color, Pair(kingRow, 2), 'B', true),
            King(color, Pair(kingRow, 3), 'K', true),
            Queen(color, Pair(kingRow, 4), 'R', true),
            Bishop(color, Pair(kingRow, 5), 'B', true),
            Knight(color, Pair(kingRow, 6), 'R', true),
            Rook(color, Pair(kingRow, 7), 'R', true),)
    }

    fun updateBoard(position: Pair<Int, Int>, newPosition: Pair<Int, Int>) {
        // move the piece at position[i_1][j_1] to newPosition[i_2][j_2]
        // replace position[i_1][j_1] with a new placeholder piece
    }

    fun displayBoard() {
        print(" ")
        for (i in 1..rows) {
            print(" $i")
        }
        println()
        for (i in 1..rows) {
            print("$i ")
            for (j in 1..cols) {
                print(board[i-1][j-1].toString() + " ")
            }
            println()
        }
    }
}
