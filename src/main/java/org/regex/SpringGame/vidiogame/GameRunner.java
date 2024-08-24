package org.regex.SpringGame.vidiogame;

public class GameRunner {
	
	private MarioGame game;
	
	public GameRunner(MarioGame game) {
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The Game we are try to run is: "+game);
		game.down();
		game.up();
		game.left();
		game.right();
	}
	
	
}
