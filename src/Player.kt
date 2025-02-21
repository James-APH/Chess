class Player(private val name: String, private var color: String, private var wins: Int=0,private var losses: Int=0) {
    constructor(name: String, color: String) : this(name, color, 0, 0) {
        if (color != "WHITE" && color != "BLACK") {
            this.color = "BLANK"
        }
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