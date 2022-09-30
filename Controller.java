/*
Name: David Esterer
Date: 02/08/2022
Assignment: Java Basics
*/

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

class Controller implements ActionListener, MouseListener, KeyListener
{
	View view;
	Model model;
	
	Controller(Model m){
		model = m;
	}
	
	void setView(View v){
		view = v;
	}

	public void actionPerformed(ActionEvent e){
		view.removeButton();
	}
	
	public void mousePressed(MouseEvent e){
	}
	
	public void mouseReleased(MouseEvent e) {    }
	public void mouseEntered(MouseEvent e) {    }
	public void mouseExited(MouseEvent e) {    }
	public void mouseClicked(MouseEvent e) {    }
	
	public void keyPressed(KeyEvent e){
	}

	public void keyReleased(KeyEvent e){
	}

	public void keyTyped(KeyEvent e){
	}

	void update(){
	}
	
}
