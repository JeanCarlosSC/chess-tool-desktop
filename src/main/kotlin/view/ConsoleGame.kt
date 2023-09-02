package view

import Main.s
import model.Move
import model.blackTree
import model.loadAI
import model.whiteTree

class ConsoleGame {
    private var head: Move

    init {
        loadAI()
        println("Type team (w/b)")
        val input = s.nextLine()
        head = if (input == "w") {
            whiteTree
        }
        else {
            blackTree
        }
        do {
            println(head.toString())
            print("$ ")
            val input1 = s.nextLine()
            val newMove = head.getMove(input1)
            if(newMove != null) {
                head = newMove
            }
            else {
                break
            }
        } while (head.moves.isNotEmpty())
        println("Hasta aquí le podemos ayudar, hasta luego")
    }
}