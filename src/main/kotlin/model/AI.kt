package model

val tree = Move("")

fun loadAI() {
    tree.add(listOf(
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
        )),
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
            Move("e5", BOOK).add(listOf(
                // Last book move
                Move("Nf3", BOOK).add(listOf(
                    Move("Nc6", BOOK).add(listOf(
                        // Last book move
                        Move("Bc4", BOOK).add(listOf(
                            Move("h6", GOOD).add(listOf(
                                Move("d4", BEST).add(listOf(
                                    Move("Bd6", INACCURACY).add(listOf(
                                        Move("dxe5", BEST),
                                        Move("d5", INACCURACY)
                                    ))
                                ))
                            ))
                        ))
                    )),
                    Move("d5", GOOD).add(listOf(
                        Move("exd5", BEST),
                        Move("Nc3", INACCURACY)
                    ))
                )),
                Move("Qh5", GOOD).add(listOf(
                    Move("Bb4", BLUNDER).add(listOf(
                        Move("Qxe5+", BEST)
                    ))
                ))
            )),
            // The French defense
            Move("e6", BOOK).add(listOf(
                Move("d4", BOOK).add(listOf(
                    Move("d5", BOOK).add(listOf(
                        Move("Nc3", BOOK).add(listOf(
                            Move("dxe4", BOOK).add(listOf(
                                // Last book move
                                Move("Nxe4", BOOK).add(listOf(
                                    Move("Bb4+", INACCURACY).add(listOf(
                                        Move("c3", BEST).add(listOf(
                                            Move("Be7", BEST).add(listOf(
                                                Move("Nf3", EXCELLENT).add(listOf(
                                                    Move("Nf6", BEST).add(listOf(
                                                        Move("Qd3", GOOD).add(listOf(
                                                            Move("Nxe4", EXCELLENT).add(listOf(
                                                                Move("Qxe4", BEST).add(listOf(
                                                                    Move("O-O", INACCURACY).add(listOf(
                                                                        Move("bd3", BEST),
                                                                        Move("Ng5", BLUNDER)
                                                                    ))
                                                                ))
                                                            ))
                                                        ))
                                                    ))
                                                ))
                                            ))
                                        ))
                                    ))
                                ))
                            ))
                        ))
                    ))
                ))
            )),
            Move("d5", BOOK).add(listOf(
                // Last book move
                Move("e5", BOOK).add(listOf(
                    Move("d4", EXCELLENT).add(listOf(
                        Move("Nf3", BEST).add(listOf(
                            Move("Nc6", BEST).add(listOf(
                                Move("b3", GOOD).add(listOf(
                                    Move("Qd5", GOOD).add(listOf(
                                        Move("Bc4", BEST),
                                        Move("Bb2", MISTAKE)
                                    ))
                                ))
                            ))
                        ))
                    ))
                ))
            ))
        )),
        Move("Nc3", BOOK).add(listOf(
            Move("d5", BEST),
            Move("Nc6", GOOD)
        )),
        // Réti Opening
        Move("Nf3", BOOK)
    ))
}
