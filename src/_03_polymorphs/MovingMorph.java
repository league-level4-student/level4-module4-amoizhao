package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph {
	MovingMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
	}

	@Override
	public void update() {
		Random random = new Random();
		int move = random.nextInt(50) - 25;
		boolean direction = random.nextBoolean();

		if (x < 875 && x > 25 && y < 575 && y > 25) {
			if (direction) {
				x += move;
			} else {
				y += move;
			}
		} else {
			if (direction) {
				x -= move;
				if (x < 0) {
					x += 30;
				} else if (x > 900) {
					x -= 30;
				}
			} else {
				y -= move;
				if (y < 0) {
					y += 30;
				} else if (y > 600) {
					y -= 30;
				}
			}
		}
	}
}
