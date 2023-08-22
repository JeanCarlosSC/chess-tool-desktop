class AI {
    private val whiteRecord: MutableList<List<String>> = mutableListOf()
    private val blackRecord: MutableList<List<String>> = mutableListOf()
    private var options: MutableList<List<String>> = mutableListOf()
    private var player = 0

    init {
        loadRecord()
    }

    fun setPlayer(i: Int) {
        player = i
        options = if(i==0) whiteRecord.toMutableList() else blackRecord.toMutableList()
    }

    private fun loadRecord() {
        addToBlack(listOf("e4", "e5", "Nf3", "Nc6", "Bc4", "Bc5", "c3", "Nf6", "d4", "exd4", "cxd4", "Bb4+", "Bd2", "Bxd2+", "Nbxd2", "d5"))

        addToWhite(listOf("e4", "e5", "d4", "Qh4", "Nf3"))
        addToWhite(listOf("e4", "e5", "Nc3", "c6", "Nf3", "h6", "Nxe5", "Qf6", "d4", "Bb4", "Bc4", "Rh7", "Bxf7+", "Ke7", "Qh5", "Bxc3+", "Bxc3", "g6", "Bxg6", "Rg7", "g4"))
        addToWhite(listOf("e4", "e5", "Nf3", "Nc6", "Bc4", "Bc5", "c3", "Nf6", "Qe2", "kg4", "h3"))
        addToWhite(listOf("e4", "e5", "Nf3", "Nc6", "Bc4", "Nd4", "Nxe5", "Qg5", "Bxf7+"))
        addToWhite(listOf("e4", "e5", "Nf3", "Nc6", "Bc4", "Nf6", "Nc3", "Bc5", "d3", "d6", "O-O", "Bg4", "h3"))
        addToWhite(listOf("e4", "e5", "Nf3", "Nc6", "Bc4", "h6", "Nc3", "d6", "d3", "Nf6", "O-O", "Be7", "Nd5", "O-O", "Nxe7+", "Nxe7", "d4", "Nxe4", "dxe5", "dxe5", "Nxe5", "Qxd1", "Rxd1", "Be6", "Bxe6", "fxe6", "f3", "Nd6", "c4", "Nf7", "Bf4"))
        addToWhite(listOf("e4", "e5", "Nf3", "Nc6", "d4", "exd4", "Nxd4", "Nxd4", "Qxd4", "b6", "Nc3"))
        addToWhite(listOf("e4", "e5", "Nf3", "Nc6", "d4", "exd4", "Nxd4", "Nxd4", "Qxd4", "Nf6", "e5"))
        addToWhite(listOf("e4", "e5", "Nf3", "Nc6", "d4", "f6", "d5", "Nd4", "Nxd4", "exd4", "Qxd4"))
        addToWhite(listOf("e4", "e5", "Nf3", "Nf6", "d4", "exd4", "Qxd4", "Qe7", "Nc3"))

    }

    private fun addToBlack(list: List<String>) {
        blackRecord.add(list)
    }

    private fun addToWhite(list: List<String>) {
        whiteRecord.add(list)
    }

    fun getOptions(turn: Int): String {
        val itr = options.iterator()
        while (itr.hasNext()) {
            val curr = itr.next()

            if (curr.size < turn+1) {        // remove values
                itr.remove()
            }
        }
        var text = ""
        for (option in options) {
            text += "${option[turn]}; "
        }
        if(text == "") {
            text = "Improvising time dude!"
        }
        return text
    }

    fun play(turn: Int, text: String?) {
        val itr = options.iterator()
        while (itr.hasNext()) {
            val curr = itr.next()

            if (curr[turn] != text) {        // remove values
                itr.remove()
            }
        }
    }
}