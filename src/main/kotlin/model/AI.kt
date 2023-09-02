package model

val whiteTree = Move("")
val blackTree = Move("")

fun loadAI() {
    loadWhiteTree()

    // Other games
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
    whiteTree.add(listOf("e4", "e5", "Nf3", "Nc6", "Bc4", "Nf6", "d4", "d6", "d5", "Nd4", "Nxd4", "exd4", "Qxd4", "c5",
            "Qd1", "Nxe4", "Qe2"))
    whiteTree.add(listOf("e4", "e5", "Nc3", "Nf6", "Bc4", "Bc5", "Nf3", "d6", "Ng5", "Bg4", "Bxf7+"))

    blackTree.add(listOf("e4", "e5", "Nf3", "Nc6", "Bc4", "Bc5", "c3", "Nf6", "d4", "exd4", "cxd4", "Bb4+", "Bd2",
            "Bxd2+", "Nbxd2", "d5"))
    blackTree.add(listOf("c4","e5","g3","Nf6", "Nc3", "d5", "cxd5", "Nxd5", "Bg2", "c6", "Nxd5", "cxd5", "e3",
            "Bc5", "Qh5", "Nc6"))
    blackTree.add(listOf("d4","d5","Bf4","Nf6","Qd3","Nc6","e3","e6","Na3","Bb4+"))
    blackTree.add(listOf("e4", "e5", "Nf3", "Nc6", "Bd3", "d5", "exd5", "Qxd5", "O-O", "Bg4"))
}

fun loadWhiteTree() {
    whiteTree.add(listOf(
        // King's Pawn Opening
        Move("e4", BOOK).add(listOf(
            // Last book move
            Move("e5", BOOK).add(listOf(
                Move("Qh5", GOOD).add(listOf(
                    Move("Bb4", BLUNDER).add(listOf(
                        Move("Qxe5+", BEST)
                    ))
                ))
            ))
        )),
        // Queen's Pawn Opening
        Move("d4", BOOK).add(listOf(
            Move("d5", BOOK).add(listOf(
                Move("c4", BOOK).add(listOf(
                    Move("Nf6", BOOK).add(listOf(
                        Move("cxd5", BOOK).add(listOf(
                            Move("Nxd5", BOOK).add(listOf(
                                Move("Nc3", BOOK).add(listOf(
                                    // Last book move
                                    Move("Nc6", BOOK).add(listOf(
                                        Move("Nf3", BEST)
                                    ))
                                ))
                            ))
                        ))
                    ))
                ))
            )),
            // Mikėnas Defense
            Move("Nc6", BOOK).add(listOf(
                Move("d5", BOOK).add(listOf(
                    // Last book move
                    Move("Ne5", BOOK).add(listOf(
                        Move("Bf4", GOOD).add(listOf(
                            Move("d6", EXCELLENT).add(listOf(
                                Move("e4", BEST).add(listOf(
                                    Move("Nf6", BEST).add(listOf(
                                        Move("Nc3", BEST)
                                    ))
                                ))
                            ))
                        ))
                    ))
                ))
            ))
        ))
    ))
}