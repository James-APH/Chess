import Pieces.*

/*
    private var color: String = "\u001b[0m",
    private var position: Pair<Int, Int> = Pair(0, 0),
    private var symbol: Char = '#') {
    private val reset: String = "\u001b[0m"
    private var inPlay: Boolean = true
 */

class Player(private val name: String="NO-NAME", private var color: String="BLANK", private var wins: Int=0, private var losses: Int=0, private var text_color: String="\\033[33;1") {
    private var pawnRow: Int = 0
    private var kingRow: Int = 0
    private var pieceSet= setOf<Piece>()
    constructor(color: String) : this() {
        if (color=="yellow") {
            pawnRow = 1
            kingRow = 0
        } else {
            pawnRow = 6
            kingRow = 7
        }
        pieceSet = setOf<Piece>(
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
            King(color, Pair(kingRow,3), 'K', true),
            Queen(color, Pair(kingRow, 4), 'R', true),
            Bishop(color, Pair(kingRow, 5), 'B', true),
            Knight(color, Pair(kingRow, 6), 'R', true),
            Rook(color, Pair(kingRow, 7), 'R', true),
        )
    }


    private var gameLogic: GameLogic = GameLogic()
    constructor(name: String, color: String) : this(name, color, 0, 0) {
        if (color != "WHITE" && color != "BLACK") {
            this.color = "BLANK"
        }
    }

    fun playerTurn() {
        println("$name, its your turn now!")
    }

    fun loser() {
        println("$name, you lost and you suck.")
        losses++
    }

    fun winner() {
        println("$name, you won and you're awesome!")
        wins++
    }

    override fun toString(): String {
        return super.toString() + "\n" + name + "\nWins: " + wins + "\nlosses: " + losses
    }
}