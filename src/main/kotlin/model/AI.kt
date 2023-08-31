package model

class Node (public val movement: String) {
    val nodes = mutableListOf<Node>()

    override fun toString(): String {
        var str = ""
        for (i in nodes) {
            str += i.movement+ " - "
        }
        return str
    }

    fun add(listOf: List<String>) {
        for (node in nodes) {
            if (node.movement == listOf[0]) {
                if(listOf.size>1) {
                    node.add(listOf.subList(1, listOf.lastIndex))
                }
                return
            }
        }
        if(listOf.isNotEmpty()) {
            val node = Node(listOf[0])
            if (listOf.size > 1) {
                node.add(listOf.subList(1, listOf.lastIndex))
            }
            nodes.add(node)
        }
    }

    fun getNode(movement: String?): Node? {
        for (node in nodes) {
            if (node.movement == movement) {
                return node
            }
        }
        return null
    }
}

val whiteTree = Node("")
val blackTree = Node("")

fun loadAI() {
    whiteTree.add(listOf("e4", "e5", "d4", "Qh4", "Nf3"))
    whiteTree.add(listOf("e4", "e5", "Nc3", "c6", "Nf3", "h6", "Nxe5", "Qf6", "d4", "Bb4", "Bc4", "Rh7", "Bxf7+", "Ke7",
            "Qh5", "Bxc3+", "Bxc3", "g6", "Bxg6", "Rg7", "g4"))
    whiteTree.add(listOf("e4", "e5", "Nf3", "Nc6", "Bc4", "Bc5", "c3", "Nf6", "Qe2", "kg4", "h3"))
    whiteTree.add(listOf("e4", "e5", "Nf3", "Nc6", "Bc4", "Nd4", "Nxe5", "Qg5", "Bxf7+"))
    whiteTree.add(listOf("e4", "e5", "Nf3", "Nc6", "Bc4", "Nf6", "Nc3", "Bc5", "d3", "d6", "O-O", "Bg4", "h3"))
    whiteTree.add(listOf("e4", "e5", "Nf3", "Nc6", "Bc4", "h6", "Nc3", "d6", "d3", "Nf6", "O-O", "Be7", "Nd5", "O-O",
            "Nxe7+", "Nxe7", "d4", "Nxe4", "dxe5", "dxe5", "Nxe5", "Qxd1", "Rxd1", "Be6", "Bxe6", "fxe6", "f3", "Nd6", "c4", "Nf7", "Bf4"))
    whiteTree.add(listOf("e4", "e5", "Nf3", "Nc6", "d4", "exd4", "Nxd4", "Nxd4", "Qxd4", "b6", "Nc3"))
    whiteTree.add(listOf("e4", "e5", "Nf3", "Nc6", "d4", "exd4", "Nxd4", "Nxd4", "Qxd4", "Nf6", "e5"))
    whiteTree.add(listOf("e4", "e5", "Nf3", "Nc6", "d4", "f6", "d5", "Nd4", "Nxd4", "exd4", "Qxd4"))
    whiteTree.add(listOf("e4", "e5", "Nf3", "Nf6", "d4", "exd4", "Qxd4", "Qe7", "Nc3"))

    blackTree.add(listOf("e4", "e5", "Nf3", "Nc6", "Bc4", "Bc5", "c3", "Nf6", "d4", "exd4", "cxd4", "Bb4+", "Bd2",
            "Bxd2+", "Nbxd2", "d5"))
    blackTree.add(listOf("c4","e5","g3","Nf6", "Nc3", "d5", "cxd5", "Nxd5", "Bg2", "c6", "Nxd5", "cxd5", "e3",
            "Bc5", "Qh5", "Nc6"))
}