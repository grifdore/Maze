/*
The maze class simply defines a Level. It is only used by the Level class, 
and contains a map and a star count.
*/
public class Maze{
    public final String[][] maze;
    public final int stars;

    public Maze(String[][] mazeIn, int starsIn){
        maze = mazeIn;
        stars = starsIn;
    }
}