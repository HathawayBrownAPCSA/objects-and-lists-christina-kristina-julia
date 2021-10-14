
/**
 * Write a description of class Invoice here.
 *
 * @author Julia Zhu
 * @version 2021-09-23
 */
import java.util.ArrayList;

public class Invoice
{
    ArrayList<Teachers> reviewList;
    public Invoice(){
        reviewList = new ArrayList<Teachers>();
    } 
    
    public void addReview (Teachers i)
    {
        reviewList.add(i);
    }
    
    public Teachers findTeacher(String name)
    {
        
        for (int i = 0; i < reviewList.size(); i++){
            Teachers currentTeacher = reviewList.get(i);
            if (currentTeacher.getName().equals(name))
            {
                return currentTeacher;
            }
        }
        System.out.println(name + " is not in the list of reviews");
        return null;
    }
    
    public void printInvoice()
    {
        System.out.println(reviewList);
        System.out.println("\n\n");
            
        for(Teachers it: reviewList)
        {   
            System.out.println(it);
        }
            
        System.out.println("\n" + reviewList.size() + " teacher reviews.");
        }
    
}
