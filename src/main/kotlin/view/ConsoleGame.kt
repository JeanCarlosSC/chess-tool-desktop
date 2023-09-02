package view

import Main.s
import model.Move
import model.loadAI
import model.tree

class ConsoleGame {
    private var head: Move

    init {
        loadAI()
        head = tree

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
        println("Hasta aquí le puedo ayudar, ¡buena suerte!")
    }
}