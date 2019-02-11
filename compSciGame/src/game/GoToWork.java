package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GoToWork extends JPanel implements KeyListener, ActionListener{
	JFrame frame = new JFrame();
	private final int HEIGHT = 1080;
	private final int WIDTH = 1920;
	GoToWorkPlayer player = new GoToWorkPlayer();

	
	public static void main(String[] args) {
		GoToWork gtw = new GoToWork();
		gtw.run();
		
	} 
	
	
	public void run() {
	frame.setSize(WIDTH, HEIGHT);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.addKeyListener(this);
	
	}
	
	//why isn't this being called...
	public void paintComponent(Graphics g) {
		//super.paintComponent(g);
		//drawGameState(g);
		g.setColor(Color.RED);
		g.fillRect(1000, 500, 50, 100);
		System.out.println("Gamer Time");
		
	}
	
	public void drawGameState(Graphics g) {
		player.draw(g);
	
		
	}


	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	}

