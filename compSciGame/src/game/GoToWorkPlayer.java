package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.peer.MouseInfoPeer;

public class GoToWorkPlayer  implements KeyListener{

	private int hp;
	private int x;
	private int y;
	private int w;
	private int h;
	
	
	GoToWorkPlayer(){
	hp = 100;
	x = 1000;
	y = 500;
	w = 50;
	h = 50;	
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, w, h);
		
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
