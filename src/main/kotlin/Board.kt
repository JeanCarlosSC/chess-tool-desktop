import java.awt.Color
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField

class Board: JFrame() {
    private val ai = AI()

    private var turn = 0 // turn % 2 == 0 -> white's turn

    private val lTurn = JLabel()
    private val lOptions = JLabel()
    private val tfPlay = JTextField()

    init {
        loadComponents()
        loadProperties()
    }
    fun loadComponents() {
        val btWhite = JButton("Play as white")
        val btBlack = JButton("Play as black")

        btWhite.setBounds(320, 224, 128, 32)
        btWhite.addActionListener {
            remove(btWhite)
            remove(btBlack)
            loadInterface()
            runAsWhite()
        }
        add(btWhite)

        btBlack.setBounds(320, 352, 128, 32)
        btBlack.addActionListener {
            remove(btWhite)
            remove(btBlack)
            loadInterface()
            runAsBlack()
        }
        add(btBlack)
    }

    private fun loadInterface() {
        drawCells()

        lTurn.setBounds(600, 60, 200, 32)
        add(lTurn)

        val lOptionsText = JLabel("Options")
        lOptionsText.setBounds(600, 100, 200, 32)
        add(lOptionsText)

        lOptions.setBounds(600, 140, 200, 32)
        add(lOptions)

        tfPlay.setBounds(600, 540, 150, 32)
        tfPlay.addActionListener {
            nextTurn()
            tfPlay.text = ""
        }
        add(tfPlay)

        updateUI()
    }

    private fun nextTurn() {
        ai.play(turn, tfPlay.text)
        turn++
        updateUI()
    }

    private fun runAsWhite() {
        ai.setPlayer(0)
        updateUI()
    }

    private fun runAsBlack() {
        ai.setPlayer(1)
        updateUI()
    }

    private fun updateUI() {
        lTurn.text = if(turn % 2 == 0) "White's turn" else "Black's turn"
        lOptions.text = ai.getOptions(turn)
        repaint()
    }

    fun drawCells() {
        for(i in 0 until 8) {
            val lCoordinateY = JLabel(
                when(i) {
                    0 -> "A"
                    1 -> "B"
                    2 -> "C"
                    3 -> "D"
                    4 -> "E"
                    5 -> "F"
                    6 -> "G"
                    else -> "H"
                }
            )
            lCoordinateY.setBounds(32, 64+i*64, 64, 64)
            add(lCoordinateY)

            val lCoordinateX = JLabel("${i+1}")
            lCoordinateX.setBounds(88+i*64, 578, 64, 64)
            add(lCoordinateX)

            for(j in 0 until 8) {
                val pCell = JPanel()
                pCell.setBounds(64 + i*64, 64 + j*64, 64, 64)
                pCell.background = if ((i+j) % 2 == 0) Color.WHITE else Color.GREEN
                add(pCell)
            }
        }
    }

    private fun loadProperties() {
        setSize(1000, 680)
        setLocationRelativeTo(null)
        layout = null
        isVisible = true
        defaultCloseOperation = EXIT_ON_CLOSE
    }
}
