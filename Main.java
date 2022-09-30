/*
Name: David Esterer
Date: 02/08/2022
Assignment: Java Basics
*/

import javax.swing.JFrame;
import java.awt.Toolkit;

public class Main extends JFrame
{
	Model model;
	View view;
	Controller controller;
	
	public Main()
	{
		model = new Model();
		controller = new Controller(model);
		view = new View(controller, model);
		view.addMouseListener(controller);
		this.addKeyListener(controller);
		this.setTitle("Photon Laser Tag");
		this.setSize(1000, 1000);
		this.setFocusable(true);
		this.getContentPane().add(view);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void run()
	{
		while(true)
		{
			controller.update();
			model.update();
			view.repaint();
			Toolkit.getDefaultToolkit().sync();
			try{
				Thread.sleep(40);
			} catch(Exception e){
				e.printStackTrace();
				System.exit(1);
			}
		}
	}

	public static void main(String[] args)
	{
		Main g = new Main();
		g.run();
	}
}
