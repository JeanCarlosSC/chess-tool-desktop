package model

val tree = Move("", 0)

fun loadAI() {
    tree.add(listOf(
        // King's Pawn Opening
        Move("e4", BOOK).add(listOf(
            // Sicilian Defense
            Move("c5", BOOK).add(listOf(
                Move("Nf3", BOOK).add(listOf(
                    Move("d6", BOOK).add(listOf(
                        Move("Nc3", BOOK).add(listOf(
                            Move("Nf6", BOOK).add(listOf(
                                Move("d4", BOOK).add(listOf(
                                    Move("cxd4", BOOK).add(listOf(
                                        Move("Qxd4", BOOK).add(listOf(
                                            // Last book move
                                            Move("Nc6", BOOK).add(listOf(
                                                Move("Qd3", GOOD).add(listOf(
                                                    Move("Qb6", INACCURACY).add(listOf(
                                                        Move("Be2", BEST).add(listOf(
                                                            Move("Be6", MISTAKE).add(listOf(
                                                                Move("O-O", BEST).add(listOf(
                                                                    Move("Nb4", BEST).add(listOf(
                                                                        Move("Qd1", BEST).add(listOf(
                                                                            Move("Nc6", GOOD).add(listOf(
                                                                                Move("Nd5", EXCELLENT).add(listOf(
                                                                                    Move("Qd8", BEST).add(listOf(
                                                                                        Move("c4", BEST).add(listOf(
                                                                                            Move("Nxe4", GOOD).add(listOf(
                                                                                                Move("Re1", BEST),
                                                                                                Move("Nd4", INACCURACY)
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
                                    ))
                                ))
                            ))
                        ))
                    ))
                )),
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
                    )),
                    // Philidor's defense
                    Move("d6", BOOK).add(listOf(
                        Move("d4", BOOK).add(listOf(
                            Move("exd4", BOOK).add(listOf(
                                Move("Qxd4", BOOK).add(listOf(
                                    // Last book move
                                    Move("Nc6", BOOK).add(listOf(
                                        Move("Bb5", BEST),
                                        Move("Qd1", EXCELLENT).add(listOf(
                                            Move("Nf6", EXCELLENT).add(listOf(
                                                Move("Bd3", BEST),
                                                Move("e5", MISTAKE)
                                            ))
                                        ))
                                    ))
                                ))
                            ))
                        ))
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
                    )),
                    Move("Qh4", MISTAKE).add(listOf(
                        Move("Nc3", BEST).add(listOf(
                            Move("Bb4", BEST).add(listOf(
                                Move("Bd3", BEST).add(listOf(
                                    Move("Nc6", BEST).add(listOf(
                                        Move("Nf3", BEST).add(listOf(
                                            Move("Qg4", INACCURACY).add(listOf(
                                                Move("O-O", GOOD).add(listOf(
                                                    Move("Nge7", MISTAKE).add(listOf(
                                                        Move("Ne2", BEST).add(listOf(
                                                            Move("O-O", INACCURACY).add(listOf(
                                                                Move("c3", GOOD).add(listOf(
                                                                    Move("Bd6", GOOD).add(listOf(
                                                                        Move("e5", BEST).add(listOf(
                                                                            Move("f5", EXCELLENT).add(listOf(
                                                                                Move("exd6", BEST).add(listOf(
                                                                                    Move("cxd6", BEST).add(listOf(
                                                                                        Move("Nf4", EXCELLENT).add(listOf(
                                                                                            Move("g5", EXCELLENT).add(listOf(
                                                                                                Move("h3", BEST).add(listOf(
                                                                                                    Move("Qxf4", BEST).add(listOf(
                                                                                                        Move("Bxf4", BEST).add(listOf(
                                                                                                            Move("gxf4", BEST).add(listOf(
                                                                                                                Move("Qd2", EXCELLENT).add(listOf(
                                                                                                                    Move("Nd5", EXCELLENT).add(listOf(
                                                                                                                        Move("c4", BEST).add(listOf(
                                                                                                                            Move("Ndb4", EXCELLENT).add(listOf(
                                                                                                                                Move("Be2", BEST).add(listOf(
                                                                                                                                    Move("e5", EXCELLENT).add(listOf(
                                                                                                                                        Move("d5", EXCELLENT).add(listOf(
                                                                                                                                            Move("a5", EXCELLENT).add(listOf(
                                                                                                                                                Move("dxc6", BEST).add(listOf(
                                                                                                                                                    Move("dxc6", EXCELLENT).add(listOf(
                                                                                                                                                        Move("Qxd6", BEST).add(listOf(
                                                                                                                                                            Move("e4", EXCELLENT).add(listOf(
                                                                                                                                                                Move("Ng5", BEST).add(listOf(
                                                                                                                                                                    Move("Nc2", GOOD).add(listOf(
                                                                                                                                                                        Move("Qe7", BEST).add(listOf(
                                                                                                                                                                            Move("Rd8", INACCURACY).add(listOf(
                                                                                                                                                                                Move("Qxh7+", BEST).add(listOf(
                                                                                                                                                                                    Move("Kf8", FORCED).add(listOf(
                                                                                                                                                                                        Move("Qf7#", BEST)
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
        Move("Nc3", BOOK).add(listOf(
            Move("d5", BEST),
            Move("Nc6", GOOD)
        )),
        // Réti Opening
        Move("Nf3", BOOK)
    ))
}
