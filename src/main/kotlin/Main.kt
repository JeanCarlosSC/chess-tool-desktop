import java.awt.Color
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel

fun main(){
    Board();
}

class Board: JFrame() {
    init {
        loadComponents()
        loadProperties()
    }
    fun loadComponents() {
        val btWhite = JButton("Play as white")
        val btBlack = JButton("Play as black")

        btWhite.setBounds(256, 224, 128, 32)
        btWhite.addActionListener {
            remove(btWhite)
            remove(btBlack)
            drawCells()
            addPieces()
            repaint()
        }
        add(btWhite)

        btBlack.setBounds(256, 352, 128, 32)
        add(btBlack)
    }

    fun addPieces() {
        
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

    fun loadProperties() {
        setSize(660, 680)
        setLocationRelativeTo(null)
        layout = null
        isVisible = true
        defaultCloseOperation = EXIT_ON_CLOSE
    }
}