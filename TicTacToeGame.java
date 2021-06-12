import java.util.*;
import java.util.Arrays;
class TicTacToeGame{
char [] board=new char[10];
public void Game(){
	Arrays.fill(board, ' ');
}
	public static void main(String args[]){
		TicTacToeGame T=new TicTacToeGame();
		T.Game();
	}
}