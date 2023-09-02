package model

// Move types
const val UNKNOWN = 0
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
        private val type : Int = UNKNOWN
) {

    val moves = mutableListOf<Move>()

    override fun toString(): String {
        var str = ""
        for (move in moves) {
            str += " • ${move.position} ${move.getType()}"
        }
        return str
    }

    fun add(listOf: List<Any>): Move {
        for (move in moves) {
            if ((listOf[0] is String && move.position == listOf[0] as String) ||
                    (listOf[0] is Move && move.position == (listOf[0] as Move).position)) {
                if(listOf.size>1) {
                    move.add(listOf.subList(1, listOf.lastIndex))
                }
                return this
            }
        }

        if(listOf.isNotEmpty()) {
            val move = if(listOf[0] is String) {
                Move(listOf[0] as String)
            }
            else {
                listOf[0] as Move
            }

            if (listOf.size > 1) {
                move.add(listOf.subList(1, listOf.lastIndex+1))
            }
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