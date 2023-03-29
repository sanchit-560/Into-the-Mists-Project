import java.util.*;
public class Runner {

    public static void main(String[] args) {
        /* 
        You are free to edit any of the code in this main method.
        You can use this to test individual components of your code, for example
        creating your own tile and grid and testing printing it to the terminal
        when you hit run. The test cases will not check anything in here! They
        will just test your Tile and Grid classes and the methods you have written
        in those classes.
        */
        System.out.println("To test your code, edit the Runner class!");
        // For example, you can create your own tiles to test their functions.
         Tile tile = new Tile(1, 3);
         System.out.println(tile.getXPosition());
         System.out.println(tile.getYPosition());
         tile.addItemToTile("Player");
         tile.addItemToTile("Exit");
         System.out.println(tile.isItemOnTile("Player"));
         System.out.println(tile.isItemOnTile("Exit"));
         System.out.println(tile.toString());
         System.out.println(tile.toString());

        // Or create your own grid to test its methods.
        Grid grid = new Grid(3, 6);
        grid.getTileAtPosition(1, 2).addItemToTile("Player");
        grid.getTileAtPosition(2, 0).addItemToTile("Exit");
        grid.getTileAtPosition(1,3).addItemToTile("Obstacle");
        grid.printGrid();
        System.out.println("^ REMOVE THIS EMPTY LINE ^");


    }

}
