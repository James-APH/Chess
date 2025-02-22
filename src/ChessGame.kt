/*
 * Initializing white and black players with dependency injection
 * I will create the board, and piece sets in the constructor
 */
class ChessGame() {

}

//class ChessGame(private var white: Player = Player(), private var black: Player = Player()) {
//    private var gameLogic: GameLogic = GameLogic()
//    private var board: Board = Board()
//    fun play() {
//        println("Would you like to play this game of chess? [y/n]")
//        var playGameAnswer: String = readln()
//        while (playGameAnswer.lowercase() != "n" && playGameAnswer.uppercase() != "no") {
//            var turn: String = "white"
//            while (gameLogic.isWinner(board) != true ) {
//                print(board.toString())
//                if (turn == "white") {
//                    white.playerTurn(board.getPieceList())
//
//                    turn = "black"
//                } else {
//                    black.playerTurn(board.getPieceList())
//                    turn = "white"
//                }
//                board.update(white, black)
//            }
//            var winner: String = gameLogic.getWinner()
//            if (winner == "black") {
//                black.winner()
//                white.loser()
//            } else if (winner == "white") {
//                white.winner()
//                black.loser()
//            }
//            println("Would you like to play again? [y/n]")
//            playGameAnswer = readln()
//        }
//        println("BYE!!!")
//    }
//}