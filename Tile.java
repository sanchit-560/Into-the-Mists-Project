// You don't have to use an array list, but it may be useful.
import java.util.ArrayList; 

public class Tile {
    private static final String HIDDEN_SYMBOL = "~";
    private static final String PLAYER_ON_EXIT_TILE_SYMBOL = "O";
    private static final String PLAYER_TILE_SYMBOL = "P";
    private static final String EXIT_TILE_SYMBOL = "X";
    private static final String OBSTACLE_TILE_SYMBOL = "#";
    private static final String UNKNOWN_ITEM_SYMBOL = "?";
    private static final String EMPTY_TILE_SYMBOL = " ";
    // DON'T TOUCH ANY OF THESE SYMBOL DECLARATIONS
    // You should use them in your Tile's toString method.
    
    private int position_x;
    private int position_y;
    private boolean is_visible = false;
    private ArrayList<String> items;

    public Tile(int x, int y) {
        this.position_x = x;
        this.position_y = y;
        this.is_visible = true;
        this.items = new ArrayList<>();
    }

    public int getXPosition(){
        return this.position_x;
    }

     public int getYPosition(){
        return this.position_y;
    }
    
    public boolean getVisibility(){

        return this.is_visible;
    }

    public void setVisibility(boolean visibility){
        this.is_visible=visibility;
    }

    public void addItemToTile(String item){
       boolean it_contains = items.contains(item);
        if(it_contains==false){
            this.items.add(item);
        }
       
 }

    public void removeItemFromTile(String item){
         boolean it_contains = items.contains(item);
         if(it_contains==true){
             items.remove(item);
         }
    }

    public boolean isItemOnTile(String item){
         boolean it_contains = items.contains(item);
          if(it_contains==true){
              it_contains = true;
              return it_contains;
          }
          else{
              it_contains = false;
              return it_contains;
          }
    }

    public String toString(){

    if(this.is_visible==true){
        if(items.contains("Player") && items.contains("Exit")){
               return PLAYER_ON_EXIT_TILE_SYMBOL;
           }
        else if(items.contains("Player")){
               return PLAYER_TILE_SYMBOL;
           }
        else if(items.contains("Exit")){
                return EXIT_TILE_SYMBOL;
           }
        else if(items.contains("Obstacle")){
                return OBSTACLE_TILE_SYMBOL;
           }
        else if(items.contains("Exit")){
                return EXIT_TILE_SYMBOL;
           }
        else if(items.isEmpty()==true){
            return EMPTY_TILE_SYMBOL;
        }

        else{
            return UNKNOWN_ITEM_SYMBOL;
        }

    }       

      else{
            return HIDDEN_SYMBOL;
        }

    }

}
