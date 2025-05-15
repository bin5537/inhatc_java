package week11;

public class GameEx {
	public static void main(String[] args) {
		// 다형성 구현
		Game[] game = new Game[3];
		game[0] = new LOL("롤", "13.0");
		game[1] = new Tetris("테트리스", "12.5");
		game[2] = new SuperMario("슈퍼마리오", "15.1");
		
		for (int i=0; i<game.length; i++) {
			game[i].start();
			game[i].gameDesc();
			System.out.println("");
		}
	}
}
