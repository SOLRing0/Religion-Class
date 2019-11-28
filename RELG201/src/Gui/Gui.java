package Gui;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;

public class Gui {
    private final JPanel gui = new JPanel();
    private JPanel pictures = new JPanel(new GridLayout(1, 3));

    public Gui() throws IOException {
        initializeGui();
    }

    public void initializeGui() {
        gui.setBorder(new EmptyBorder(5,5,5,5));
        JButton jb1 = new JButton();
        JButton jb2 = new JButton();
        JButton jb3 = new JButton();
        jb1.setBorder(BorderFactory.createEmptyBorder());
        jb2.setBorder(BorderFactory.createEmptyBorder());
        jb3.setBorder(BorderFactory.createEmptyBorder());
        try {
            File imageloc = new File("Resources/scene1.png");
            Image img = ImageIO.read(imageloc);
            img = img.getScaledInstance(600,1400,java.awt.Image.SCALE_SMOOTH);
            jb1.setIcon(new ImageIcon(img));
            jb1.addMouseListener(jb1MouseAdapter());
            File imageloc2 = new File("Resources/scene2.png");
            Image img2 = ImageIO.read(imageloc2);
            img2 = img2.getScaledInstance(600,1400,java.awt.Image.SCALE_SMOOTH);
            jb2.setIcon(new ImageIcon(img2));
            jb2.addMouseListener(jb2MouseAdapter());
            File imageloc3 = new File("Resources/scene3.png");
            Image img3 = ImageIO.read(imageloc3);
            img3 = img3.getScaledInstance(600,1400,java.awt.Image.SCALE_SMOOTH);
            jb3.setIcon(new ImageIcon(img3));
            jb3.addMouseListener(jb3MouseAdapter());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        pictures.add(jb1);
        pictures.add(jb2);
        pictures.add(jb3);
        gui.add(pictures);

    }

    private MouseAdapter jb1MouseAdapter() {
        return new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                // open the sound file as a Java input stream
                String jb1File = "Resources/media.io_A02___03_Exodus______ENGKJVO1DA - Part2.wav";
                InputStream in = null;
                try {
                    in = new FileInputStream(jb1File);
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                // create an audiostream from the inputstream
                AudioStream audioStream = null;
                try {
                    audioStream = new AudioStream(in);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                // play the audio clip with the audioplayer class
                AudioPlayer.player.start(audioStream);
            }
        };
    }

    private MouseAdapter jb3MouseAdapter() {
        return new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                // open the sound file as a Java input stream
                String jb3File = "Resources/media.io_A02___03_Exodus______ENGKJVO1DA - Part3.wav";
                InputStream in = null;
                try {
                    in = new FileInputStream(jb3File);
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                // create an audiostream from the inputstream
                AudioStream audioStream = null;
                try {
                    audioStream = new AudioStream(in);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                // play the audio clip with the audioplayer class
                AudioPlayer.player.start(audioStream);
            }
        };
    }

    private MouseAdapter jb2MouseAdapter() {
        return new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                // open the sound file as a Java input stream
                String jb2File = "Resources/media.io_A02___03_Exodus______ENGKJVO1DA - Part1.wav";
                InputStream in = null;
                try {
                    in = new FileInputStream(jb2File);
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                // create an audiostream from the inputstream
                AudioStream audioStream = null;
                try {
                    audioStream = new AudioStream(in);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                // play the audio clip with the audioplayer class
                AudioPlayer.player.start(audioStream);
            }
        };
    }

    public JPanel getGui() {
        return gui;
    }
}

