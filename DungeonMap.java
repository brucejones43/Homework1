
public class DungeonMap {
	private String[][] room;
	private Player player;
	private int playerXPosition;
	private int playerYPosition;
	private final String WALL_MAP_POSITION = "*";
	private final String EMPTY_MAP_POSITION = " ";
	private final String PAST_MAP_POSITION = "#";
	public String PLAYER_MAP_POSITION = "P";
	public void GameMap(int rows, int columns) {
		playerXPosition = 1;
		playerYPosition = 1;
		generateMap(rows, columns);
	}
	public void generateMap(int rows, int columns) {
		room = new String[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if ((i == 0) || (j == 0) || (i == rows - 1) || (j == columns - 1)) {
					room[i][j] = WALL_MAP_POSITION;
					
				} 
				else {
					room[i][j] = EMPTY_MAP_POSITION;
				}
			}
		}
	}
	public void print() {
		putPlayerPositionOnMap();
		for (int i = 0; i < room.length; i++) {
			printRow(i);
			
		}
		clearPlayerPositionOnMap();
	}
	private void printRow(int rowIndex){
		String[] row = room[rowIndex];
		for (String s : row) {
			System.out.printf("%s ", s);
		}
		System.out.println();
	}
	private void putPlayerPositionOnMap() {
		putOnMap(PLAYER_MAP_POSITION);
	}
	private void clearPlayerPositionOnMap() {
	putOnMap(PAST_MAP_POSITION);
	}
	private void putOnMap(String whatToPut) {
		room[playerYPosition][playerXPosition] = whatToPut;
	}
	public void movePlayerUp(){
		boolean willMoveBeInBounds = (playerYPosition - 1) > 0;
		if (willMoveBeInBounds) {playerYPosition--;
		}
		else{
			System.out.println("Cannot move up.");
		}
	}
	public void movePlayerDown(){
		boolean willMoveBeInBounds = (playerYPosition + 1) < (room.length - 1);
		if (willMoveBeInBounds) {
			playerYPosition++;
		}
		else{
			System.out.println("Cannot move down.");
		}
	}
	public void movePlayerLeft(){
		boolean willMoveBeInBounds = (playerXPosition - 1) > 0;
		if (willMoveBeInBounds) {
			playerXPosition--;
		}
		else{
			System.out.println("Cannot move left.");
		}
	}
	public void movePlayerRight(){
		boolean willMoveBeInBounds = (playerXPosition + 1) < (room[playerYPosition].length - 1);
		if (willMoveBeInBounds) {
			playerXPosition++;
		}
		else
		{
			System.out.println("Cannot move right.");
		}
	}
	public String getPLAYER_MAP_POSITION() {
		return PLAYER_MAP_POSITION;
	}
	public void setPLAYER_MAP_POSITION(String PLAYER_MAP_POSITION) {		
		this.PLAYER_MAP_POSITION = PLAYER_MAP_POSITION;
	}
}

