package view

import Main.s
import model.Node
import model.blackTree
import model.loadAI
import model.whiteTree

class Console {
    var head: Node

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
            val newNode = head.getNode(input1)
            if(newNode != null) {
                head = newNode
            }
            else {
                break
            }
        } while (head.nodes.isNotEmpty())
        println("Hasta aquí le podemos ayudar, hasta luego")
    }
}