
/**
 * Ranking Teachers
 *
 * @Julia Zhu, Christina Bencin, Kristina Martininez
 * 
 * @2021-09-20
 */
public class Teachers
{
    
    private String name; 
    private int ranking;
    private String comment;
    
    /**
    * The constructo initializes value for item name, quanity, and price
    * @param nm the name of the teacher
    * @param rk the ranking for that teacher
    * @param cmt is the comment with the teacher
    */
   
    public Teachers(String nm, int rk, String cmt)
    {
        // initialise instance variables
        name = nm;
        ranking = rk;
        comment = cmt;
        
    }
    
    /**
     * Returns the review of the teacher
     */
    
    public String toString()
    {
        return name + ": " + ranking +"/10 " + "beacuse " 
        + comment;
    }
    
    public String getName(){
        return name; 
    }
}
