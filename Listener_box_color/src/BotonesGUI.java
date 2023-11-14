import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BotonesGUI implements ActionListener {
    // Variables para la ventana y los componentes
    private JFrame ventana;
    private JPanel panelBotones, panelRectangulo;
    private JButton botonAmarillo, botonAzul, botonRojo, botonVerde, botonBlanco,
                    botonNegro, botonCeleste, botonNaranja, botonRosado, botonCafe;
    private JLabel etiquetaRectangulo;
    private Color colorFondo = Color.WHITE;

    // Constructor para crear la ventana y los componentes
    public BotonesGUI() {
        // Crear la ventana
        ventana = new JFrame("Botones GUI");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);

        // Crear el panel de botones con un GridLayout de 2x5
        panelBotones = new JPanel(new GridLayout(5, 2, 2, 2));

        // Crear los botones con nombres y agregarlos al panel de botones
        botonAmarillo = new JButton("Amarillo");
        botonAmarillo.addActionListener(this);
        panelBotones.add(botonAmarillo);

        botonAzul = new JButton("Azul");
        botonAzul.addActionListener(this);
        panelBotones.add(botonAzul);

        botonRojo = new JButton("Rojo");
        botonRojo.addActionListener(this);
        panelBotones.add(botonRojo);

        botonVerde = new JButton("Verde");
        botonVerde.addActionListener(this);
        panelBotones.add(botonVerde);

        botonBlanco = new JButton("Blanco");
        botonBlanco.addActionListener(this);
        panelBotones.add(botonBlanco);

        botonNegro = new JButton("Negro");
        botonNegro.addActionListener(this);
        panelBotones.add(botonNegro);

        botonCeleste = new JButton("Celeste");
        botonCeleste.addActionListener(this);
        panelBotones.add(botonCeleste);

        botonNaranja = new JButton("Naranja");
        botonNaranja.addActionListener(this);
        panelBotones.add(botonNaranja);

        botonRosado = new JButton("Rosado");
        botonRosado.addActionListener(this);
        panelBotones.add(botonRosado);

        botonCafe = new JButton("Café");
        botonCafe.addActionListener(this);
        panelBotones.add(botonCafe);

        // Crear el panel del rectángulo con una etiqueta dentro y agregarlo a la ventana
        panelRectangulo = new JPanel(new BorderLayout());
        etiquetaRectangulo = new JLabel("Rectángulo");
        etiquetaRectangulo.setHorizontalAlignment(JLabel.CENTER);
        etiquetaRectangulo.setVerticalAlignment(JLabel.CENTER);
        panelRectangulo.add(etiquetaRectangulo, BorderLayout.CENTER);
        panelRectangulo.setBackground(colorFondo);
        ventana.add(panelRectangulo, BorderLayout.EAST);

        // Agregar el panel de botones a la ventana
        ventana.add(panelBotones, BorderLayout.CENTER);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }

    // Método para cambiar el color de fondo del rectángulo
    private void cambiarColor(Color color) {
        colorFondo = color;
        panelRectangulo.setBackground(colorFondo);
    }

    // Método para manejar los eventos de los botones
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == botonAmarillo) {
            cambiarColor(Color.YELLOW);
        } else if (source == botonAzul) {
            cambiarColor(Color.BLUE);
        } else if (source == botonRojo) {
            cambiarColor(Color.RED);
        } else if (source == botonVerde) {
            cambiarColor(Color.GREEN);
        } else if (source == botonBlanco) {
            cambiarColor(Color.WHITE);
        } else if (source == botonNegro) {
            cambiarColor(Color.BLACK);
        } else if (source == botonCeleste) {
            cambiarColor(new Color(0, 255, 255));  // Color celeste personalizado
        } else if (source == botonNaranja) {
            cambiarColor(Color.ORANGE);
        } else if (source == botonRosado) {
            cambiarColor(Color.PINK);
        } else if (source == botonCafe) {
            cambiarColor(new Color(139, 69, 19));  // Color café personalizado
        }
    }

    
}
   
