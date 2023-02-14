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
        addToBlack(listOf("e5", "e4", "Nf3", "Nc6", "Bc4", "Bc5", "c3", "Nf6", "d4", "exd4", "cxd4", "Bb4+", "Bd2", "Bxd2+", "Nbxd2", "d5"))
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