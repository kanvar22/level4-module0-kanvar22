package _04_Maze_Maker;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;


public class MazeMaker{
	
	private static int width;
	private static int height;
	private static Maze maze;
	
	private static Random randGen = new Random();
	private static Stack<Cell> uncheckedCells = new Stack<Cell>();
	
	
	public static Maze generateMaze(int w, int h){
		width = w;
		height = h;
		maze = new Maze(width, height);
		
		Object array;
		//4. select a random cell to start
		int a = new Random().nextInt();
		//a.nextInt(width);
		int b = new Random().nextInt();
		//b.nextInt(height);
				
		//5. call selectNextPath method with the randomly selected cell
		
Cell cell1 = maze.getCell(a, b);
	selectNextPath(cell1);
		
		return maze;
	}

	static int add (int x, int y) {
		return x + y;
	}
	
	//6. Complete the selectNextPathMethod
	private static void selectNextPath(Cell currentCell) {
		int a = new Random().nextInt();
		
		int b = new Random().nextInt();
		//A. mark cell as visited
		currentCell.setBeenVisited(true);
		//B. check for unvisited neighbors, using the cell
		ArrayList<Cell> unvisitedNeighbors = getUnvisitedNeighbors(currentCell);
		//C. if has unvisited neighbors,
		if (unvisitedNeighbors.isEmpty()) {
			Cell cell3 = maze.getCell(a, b);
			uncheckedCells.push(cell3);
			
		}
			//C1. select one at random.
			
			//C2. push it to the stack
		
			//C3. remove the wall between the two cells

			//C4. make the new cell the current cell and mark it as visited
		
			//C5. call the selectNextPath method with the current cell
			
			
		//D. if all neighbors are visited
		
			//D1. if the stack is not empty
			
				// D1a. pop a cell from the stack
		
				// D1b. make that the current cell
		
				// D1c. call the selectNextPath method with the current cell
				
			
		
	}

	//7. Complete the remove walls method.
	//   This method will check if c1 and c2 are adjacent.
	//   If they are, the walls between them are removed.
	private static void removeWalls(Cell c1, Cell c2) {
		
	}
	
	//8. Complete the getUnvisitedNeighbors method
	//   Any unvisited neighbor of the passed in cell gets added
	//   to the ArrayList
	private static ArrayList<Cell> getUnvisitedNeighbors(Cell c) {
		return null;
	}
}
