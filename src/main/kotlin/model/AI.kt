package model

val tree = Move("")

fun loadAI() {
    tree.add(listOf(
        // King's Pawn Opening
        Move("e4", BOOK).add(listOf(
            // Last book move
            Move("c5", BOOK).add(listOf(
                Move("e5", GOOD).add(listOf(
                    Move("Nc6", EXCELLENT).add(listOf(
                        Move("Nf3", BEST).add(listOf(
                            Move("d6", EXCELLENT).add(listOf(
                                Move("Bb5", BEST),
                                    Move("d4", INACCURACY)
                            ))
                        ))
                    ))
                ))
            )),
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
