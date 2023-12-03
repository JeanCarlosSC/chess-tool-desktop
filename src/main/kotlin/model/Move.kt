package model

// Move types
const val FORCED = 0
const val BLUNDER = 1
const val MISS = 2
const val MISTAKE = 3
const val INACCURACY = 4
const val BOOK = 5
const val GOOD = 6
const val EXCELLENT = 7
const val BEST = 8
const val GREAT = 9
const val BRILLIANT = 10

class Move (
        private val position: String,
        private val type : Int
) {

    val moves = mutableListOf<Move>()

    override fun toString(): String {
        var str = ""
        for (move in moves) {
            str += " • ${move.position} ${move.getType()}"
        }
        return str
    }

    fun add(vararg moveList: Move): Move {
        for (move in moveList) {
            moves.add(move)
        }
        return this
    }

    fun getMove(position: String?): Move? {
        for (move in moves) {
            if (move.position == position) {
                return move
            }
        }
        return null
    }

    private fun getType(): String {
        return when(type) {
            BLUNDER -> "Blunder"
            MISS -> "Miss"
            MISTAKE -> "Mistake"
            INACCURACY -> "Inaccuracy"
            BOOK -> "Book"
            GOOD -> "Good"
            EXCELLENT -> "Excellent"
            BEST -> "Best"
            GREAT -> "Great"
            BRILLIANT -> "Brilliant"
            else -> "Unknown"
        }
    }
}