import Pieces.Piece

class Board {
    private val rows: Int = 8
    private val cols: Int = 8
    private var board: Array<Array<Piece?>> = Array(rows) { Array(cols) { null } }

    fun initializeBoard() {
        for (i in 0..<rows) {
            for (j in 0..<cols) {
                if ((j + i) % 2 == 1) {
                    val piece: Piece = Piece("\u001b[0m", Pair(i, j), '#')
                    board[i][j]=piece
                } else {
                    val piece: Piece = Piece("\u001B[31m", Pair(i, j), '#')
                    board[i][j]=piece
                }
            }
        }
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
