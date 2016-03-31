package fabe0940.gfx.core;

import fabe0940.gfx.core.World;
import fabe0940.gfx.math.Point2;
import java.awt.Graphics;
import java.util.List;
import java.util.LinkedList;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Frame extends JComponent {
	private JFrame frame;
	private Point2 position;
	private Point2 size;
	private World world;

	public Frame(Point2 p, Point2 s, World w) {
		position = p;
		size = s;
		world = w;

		/* Initialize JFrame */
		frame = new JFrame("CS324 Homework 4 - fabe0940");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds((int) position.getX(), (int) position.getY(),
			(int) size.getX(), (int) size.getY());
		frame.getContentPane().add(this);
		frame.setVisible(true);

		return;
	}

	public void paintComponent(Graphics g) {
		world.draw(g);

		return;
	}
}
