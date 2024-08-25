package model

val tree = Move("", 0)

fun loadAI() {
    tree.add(
        Move("e4", BOOK, "King's Pawn Opening").add(
            Move("c5", BOOK, "Sicilian Defense").add(
                Move("Bc4", BOOK, "Bowdler Attack").add(
                    Move("e6", BOOK, "Last book move").add(
                        Move("Nf3", BEST).add(
                            Move("d5", EXCELLENT).add(
                                Move("exd5", EXCELLENT).add(
                                    Move("exd5", BEST).add(
                                        Move("Bb3", EXCELLENT).add(
                                            Move("b5", INACCURACY),
                                            Move("Nc6", BEST)
                                        )
                                    )
                                )
                            )
                        )
                    )
                ),
                Move("Nf3", BOOK).add(
                    Move("d5", INACCURACY),
                    Move("d6", BOOK).add(
                        Move("Nc3", BOOK).add(
                            Move("Nf6", BOOK).add(
                                Move("d4", BOOK).add(
                                    Move("cxd4", BOOK).add(
                                        Move("Qxd4", BOOK).add(
                                            Move("Nc6", BOOK, "Last book move").add(
                                                Move("Qd3", GOOD).add(
                                                    Move("Qb6", INACCURACY).add(
                                                        Move("Be2", BEST).add(
                                                            Move("Be6", MISTAKE).add(
                                                                Move("O-O", BEST).add(
                                                                    Move("Nb4", BEST).add(
                                                                        Move("Qd1", BEST).add(
                                                                            Move("Nc6", GOOD).add(
                                                                                Move("Nd5", EXCELLENT).add(
                                                                                    Move("Qd8", BEST).add(
                                                                                        Move("c4", BEST).add(
                                                                                            Move("Nxe4", GOOD).add(
                                                                                                Move("Re1", BEST),
                                                                                                Move("Nd4", INACCURACY)
                                                                                            )
                                                                                        )
                                                                                    )
                                                                                )
                                                                            )
                                                                        )
                                                                    )
                                                                )
                                                            )
                                                        )
                                                    )
                                                )
                                            )
                                        )
                                    )
                                )
                            )
                        )
                    )
                ),
                Move("e5", GOOD).add(
                    Move("Nc6", EXCELLENT).add(
                        Move("Nf3", BEST).add(
                            Move("d6", EXCELLENT).add(
                                Move("Bb5", BEST),
                                Move("d4", INACCURACY)
                            )
                        )
                    )
                )
            ),
            Move("d5", BOOK, "Scandinavian Defense").add(
                Move("e5", BOOK, "Last book move").add(
                    Move("d4", EXCELLENT).add(
                        Move("Nf3", BEST).add(
                            Move("Nc6", BEST).add(
                                Move("b3", GOOD).add(
                                    Move("Qd5", GOOD).add(
                                        Move("Bc4", BEST),
                                        Move("Bb2", MISTAKE)
                                    )
                                )
                            )
                        )
                    )
                ),
                Move("exd5", BEST),
                Move("Nc3", BOOK).add(
                    Move("d4", BOOK).add(
                        Move("Nce2", BOOK).add(
                            Move("e5", BOOK, "Last book move").add(
                                Move("f4", EXCELLENT).add(
                                    Move("Nf6", BEST).add(
                                        Move("g3", GOOD).add(
                                            Move("Nc6", GOOD).add(
                                                Move("c3", MISTAKE).add(
                                                    Move("Nxe4", GREAT).add(
                                                        Move("Bg2", GOOD).add(
                                                            Move("Bf5", INACCURACY),
                                                            Move("Nc5", BEST)
                                                        )
                                                    )
                                                )
                                            )
                                        )
                                    )
                                )
                            )
                        )
                    )
                ),
                Move("Qf3", INACCURACY).add(
                    Move("dxe4", BEST),
                    Move("Nf6", INACCURACY).add(
                        Move("e5", BEST),
                        Move("Nc3", INACCURACY).add(
                            Move("d4", BEST).add(
                                Move("Nce2", GOOD).add(
                                    Move("e5", BEST).add(
                                        Move("c3", GOOD).add(
                                            Move("c5", EXCELLENT)
                                        ),
                                        Move("Ng3", BEST)
                                    )
                                ),
                                Move("Nd5", BEST)
                            )
                        )
                    )
                )
            ),
            Move("e5", BOOK).add(
                Move("Bc4", BOOK, "Bishop's opening").add(
                    Move("Nf6", BOOK).add(
                        Move("Nc3", BOOK).add(
                            Move("Nc6", BOOK).add(
                                Move("Nf3", BOOK).add(
                                    Move("a6", GOOD),
                                    Move("Nxe4", BEST)
                                )
                            )
                        )
                    ),
                    Move("Nc6", BOOK).add(
                        Move("Nf3", BEST),
                        Move("Qh5", GOOD)
                    ),
                    Move("Qh4", GOOD).add(
                        Move("Nf3", GOOD),
                        Move("Qe2", BEST)
                    )
                ),
                Move("Nc3", BOOK).add(
                    Move("Nc6", BOOK).add(
                        Move("Nf3", BOOK).add(
                            Move("Nf6", BOOK).add(
                                Move("Bc4", BOOK).add(
                                    Move("Nxe4", BEST)
                                )
                            )
                        )
                    )
                ),
                Move("Nf3", BOOK).add(
                    Move("Nc6", BOOK).add(
                        Move("Bc4", BOOK, "Last book move").add(
                            Move("h6", GOOD).add(
                                Move("d4", BEST).add(
                                    Move("Bd6", INACCURACY).add(
                                        Move("dxe5", BEST),
                                        Move("d5", INACCURACY)
                                    )
                                )
                            )
                        )
                    ),
                    Move("d5", GOOD).add(
                        Move("exd5", BEST),
                        Move("Nc3", INACCURACY)
                    ),
                    Move("d6", BOOK, "Philidor's defense").add(
                        Move("d4", BOOK).add(
                            Move("Bg4", INACCURACY),
                            Move("exd4", BOOK).add(
                                Move("Qxd4", BOOK).add(
                                    Move("Nc6", BOOK, "Last book move").add(
                                        Move("Bb5", BEST),
                                        Move("Qd1", EXCELLENT).add(
                                            Move("Nf6", EXCELLENT).add(
                                                Move("Bd3", BEST),
                                                Move("e5", MISTAKE)
                                            )
                                        )
                                    )
                                )
                            )
                        )
                    )
                ),
                Move("Qh5", GOOD).add(
                    Move("Bb4", BLUNDER).add(
                        Move("Qxe5+", BEST)
                    )
                )
            ),
            Move("e6", BOOK, "The French defense").add(
                Move("d4", BOOK).add(
                    Move("d5", BOOK).add(
                        Move("Nc3", BOOK).add(
                            Move("dxe4", BOOK).add(
                                Move("Nxe4", BOOK, "Last book move").add(
                                    Move("Bb4+", INACCURACY).add(
                                        Move("c3", BEST).add(
                                            Move("Be7", BEST).add(
                                                Move("Nf3", EXCELLENT).add(
                                                    Move("Nf6", BEST).add(
                                                        Move("Qd3", GOOD).add(
                                                            Move("Nxe4", EXCELLENT).add(
                                                                Move("Qxe4", BEST).add(
                                                                    Move("O-O", INACCURACY).add(
                                                                        Move("bd3", BEST),
                                                                        Move("Ng5", BLUNDER)
                                                                    )
                                                                )
                                                            )
                                                        )
                                                    )
                                                )
                                            )
                                        )
                                    )
                                )
                            )
                        )
                    ),
                    Move("Qh4", MISTAKE).add(
                        Move("Nc3", BEST).add(
                            Move("Bb4", BEST).add(
                                Move("Bd3", BEST).add(
                                    Move("Nc6", BEST).add(
                                        Move("Nf3", BEST).add(
                                            Move("Qg4", INACCURACY).add(
                                                Move("O-O", GOOD).add(
                                                    Move("Nge7", MISTAKE).add(
                                                        Move("Ne2", BEST).add(
                                                            Move("O-O", INACCURACY).add(
                                                                Move("c3", GOOD).add(
                                                                    Move("Bd6", GOOD).add(
                                                                        Move("e5", BEST).add(
                                                                            Move("f5", EXCELLENT).add(
                                                                                Move("exd6", BEST).add(
                                                                                    Move("cxd6", BEST).add(
                                                                                        Move("Nf4", EXCELLENT).add(
                                                                                            Move("g5", EXCELLENT).add(
                                                                                                Move("h3", BEST).add(
                                                                                                    Move("Qxf4", BEST).add(
                                                                                                        Move("Bxf4", BEST).add(
                                                                                                            Move("gxf4", BEST).add(
                                                                                                                Move("Qd2", EXCELLENT).add(
                                                                                                                    Move("Nd5", EXCELLENT).add(
                                                                                                                        Move("c4", BEST).add(
                                                                                                                            Move("Ndb4", EXCELLENT).add(
                                                                                                                                Move("Be2", BEST).add(
                                                                                                                                    Move("e5", EXCELLENT).add(
                                                                                                                                        Move("d5", EXCELLENT).add(
                                                                                                                                            Move("a5", EXCELLENT).add(
                                                                                                                                                Move("dxc6", BEST).add(
                                                                                                                                                    Move("dxc6", EXCELLENT).add(
                                                                                                                                                        Move("Qxd6", BEST).add(
                                                                                                                                                            Move("e4", EXCELLENT).add(
                                                                                                                                                                Move("Ng5", BEST).add(
                                                                                                                                                                    Move("Nc2", GOOD).add(
                                                                                                                                                                        Move("Qe7", BEST).add(
                                                                                                                                                                            Move("Rd8", INACCURACY).add(
                                                                                                                                                                                Move("Qxh7+", BEST).add(
                                                                                                                                                                                    Move("Kf8", FORCED).add(
                                                                                                                                                                                        Move("Qf7#", BEST)
                                                                                                                                                                                    )
                                                                                                                                                                                )
                                                                                                                                                                            )
                                                                                                                                                                        )
                                                                                                                                                                    )
                                                                                                                                                                )
                                                                                                                                                            )
                                                                                                                                                        )
                                                                                                                                                    )
                                                                                                                                                )
                                                                                                                                            )
                                                                                                                                        )
                                                                                                                                    )
                                                                                                                                )
                                                                                                                            )
                                                                                                                        )
                                                                                                                    )
                                                                                                                )
                                                                                                            )
                                                                                                        )
                                                                                                    )
                                                                                                )
                                                                                            )
                                                                                        )
                                                                                    )
                                                                                )
                                                                            )
                                                                        )
                                                                    )
                                                                )
                                                            )
                                                        )
                                                    )
                                                )
                                            )
                                        )
                                    )
                                )
                            )
                        )
                    )
                )
            ),
            Move("Nc6", BOOK, "Nimzowitsch Defense").add(
                Move("Bc4", GOOD),
                Move("d4", BEST)
            )
        ),
        Move("d4", BOOK, "Queen's Pawn Opening").add(
            Move("d5", BOOK).add(
                Move("c4", BOOK).add(
                    Move("Nf6", BOOK).add(
                        Move("cxd5", BOOK).add(
                            Move("Nxd5", BOOK).add(
                                Move("Nc3", BOOK).add(
                                    Move("Nc6", BOOK, "Last book move").add(
                                        Move("Nf3", BEST)
                                    )
                                )
                            )
                        )
                    )
                )
            ),
            Move("Nc6", BOOK, "Mikėnas Defense").add(
                Move("d5", BOOK).add(
                    Move("Ne5", BOOK, "Last book move").add(
                        Move("Bf4", GOOD).add(
                            Move("d6", EXCELLENT).add(
                                Move("e4", BEST).add(
                                    Move("Nf6", BEST).add(
                                        Move("Nc3", BEST)
                                    )
                                )
                            )
                        )
                    )
                )
            )
        ),
        Move("Nc3", BOOK).add(
            Move("d5", BEST),
            Move("Nc6", GOOD)
        ),
        Move("Nf3", BOOK, "Réti Opening")
    )
}
