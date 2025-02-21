class Player(private val name: String="NO-NAME", private var color: String="BLANK", private var wins: Int=0,private var losses: Int=0) {
    private var gameLogic: GameLogic = GameLogic()
    constructor(name: String, color: String) : this(name, color, 0, 0) {
        if (color != "WHITE" && color != "BLACK") {
            this.color = "BLANK"
        }
    }

    fun playerTurn() {
        println("$name, its your turn now!")

    }


    fun move() {
        // useless for now, need to figure out how I'll store the game state
    }

    fun increment_losses() {
        losses++
    }

    fun increment_wins() {
        wins++
    }

    override fun toString(): String {
        return super.toString() + "\n" + name + "\nWins: " + wins + "\nlosses: " + losses
    }
}