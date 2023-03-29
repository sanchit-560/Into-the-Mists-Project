// You don't have to use an array list but it might be useful
import java.util.ArrayList; 

public class Grid {
    private static final String GRID_CORNER_SYMBOL = "+";
    private static final String GRID_HORIZONTAL_SYMBOL = "-";
    private static final String GRID_VERTICAL_SYMBOL = "|"; 
    // DON'T TOUCH ANY OF THESE SYMBOL DECLARATIONS
    // You should use them in your Grid's printGrid method.
    private int grid_height;
    private int grid_width;
    private ArrayList<Tile> objects = new ArrayList<>();

    public Grid(int width, int height){
        this.grid_height = height;
        this.grid_width = width;
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                objects.add(new Tile(i,j));
            }
        }
    }
    public int getGridWidth(){
        return this.grid_width;
    }
    public int getGridHeight(){
        return this.grid_height;
    }
    public Tile getTileAtPosition(int x, int y){
        for(int i=0;i<objects.size();i++){
            if(objects.get(i).getXPosition()==x && objects.get(i).getYPosition()==y){
                return objects.get(i);
            }
        }
       return null;
    }
    public Tile getPlayerTile(){
        for(int i=0;i<objects.size();i++){
            if(objects.get(i).isItemOnTile("Player")){
                return objects.get(i);
            }
           
        }
        return null;
    }
    public void printGrid(){
        
         for(int i=0;i<=getGridHeight();i++){
             int counter=0;
             for(int z=0;z<=getGridWidth();z++){
                 System.out.print(GRID_CORNER_SYMBOL);
                 if(counter==getGridWidth()){
                    break;
                 }
                 System.out.print(GRID_HORIZONTAL_SYMBOL);
                 counter++;
             }
              System.out.println();

             for(int j=0;j<=getGridWidth();j++){
                 if(i<getGridHeight()){
                      System.out.print(GRID_VERTICAL_SYMBOL);
         }
         
          if(i<=getGridHeight()){
              if(getTileAtPosition(j,i)!=null){
                  System.out.print(getTileAtPosition(j,i).toString()); 
              }  
         }
      }
      if(i<getGridHeight()){
    System.out.println(); 
      }
     }
    }

}
