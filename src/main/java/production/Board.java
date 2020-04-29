package production;

import java.util.ArrayList;
import java.util.List;

public class Board {


	List<ISquare> boardPositions;
	List<Player> playerList;
	
	
	public int getCurrentPosition(ISquare square) {
		return 0;
	}
	
	public void setupNumberOfPlayers() {
		playerList = new ArrayList<Player>();
	}
	
	public void setupBoardPositions() {
		boardPositions = new ArrayList<ISquare>();
		
		boardPositions.add(new GoSquare());
	}
	
	/* Getters & Setters */
	public List<ISquare> getBoardPositions() {
		return boardPositions;
	}

	public void setBoardPositions(List<ISquare> boardPositions) {
		this.boardPositions = boardPositions;
	}

	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	
	
}
