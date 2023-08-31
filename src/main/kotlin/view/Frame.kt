package view

import java.awt.Color
import javax.swing.JFrame
import javax.swing.JPanel


class Frame {
    init {
        val ventana = JFrame("Chess AI")
        ventana.setSize(1280, 720)
        ventana.setLocationRelativeTo(null)
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        //ventana.getContentPane().setBackground(Color.RED);
        //ventana.getContentPane().setBackground(Color.RED);
        ventana.contentPane.setBackground(Color(48, 46, 43))
        ventana.layout = null

        //primero cargar componentes antes de mostrar para mostrar todo actualizado

        //primero cargar componentes antes de mostrar para mostrar todo actualizado
        val nav = JPanel()
        nav.setBackground(Color(38, 36, 34))
        nav.setBounds(0, 0, 220, 720)
        ventana.add(nav)

        val tablero = JPanel()
        tablero.setBackground(Color(199, 205, 205))
        tablero.setBounds(310, 96, 512, 512)
        tablero.setLayout(null)
        ventana.add(tablero)

        for (j in 0..7) {
            for (i in 0..7) {
                if (i % 2 != j % 2) {
                    val casilla = JPanel()
                    casilla.setBounds(i * 64, 64 * j, 64, 64)
                    casilla.setBackground(Color(104, 94, 90))
                    tablero.add(casilla)
                }
            }
        }

        val movimientos = JPanel()
        movimientos.setBackground(Color(38, 36, 34))
        movimientos.setBounds(880, 16, 370, 650)
        movimientos.setLayout(null)
        ventana.add(movimientos)

        ventana.isVisible = true
    }
}