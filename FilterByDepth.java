
/**
 * Write a description of FilterByDepth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import edu.duke.*;
public class FilterByDepth {
    public ArrayList<QuakeEntry> filterByDepth(ArrayList<QuakeEntry> quakeData,double minDepth,double maxDepth){
        ArrayList<QuakeEntry> answer = new ArrayList<QuakeEntry>();
        for(QuakeEntry qe:quakeData){
            if(qe.getDepth() > minDepth && qe.getDepth() < maxDepth){
                answer.add(qe);
            }
        }
        return answer;
    }
    
    public void quakesOfDepth(){
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/nov20quakedata.atom";
        ArrayList<QuakeEntry> list1 = parser.read(source);
        System.out.println("# quakes read: " + list1.size());
        ArrayList<QuakeEntry> listOut=filterByDepth(list1,-4000.0,-2000.0);
        for(QuakeEntry qe:listOut){
            System.out.println(qe);            
        }
        System.out.println("# quakes found: " + listOut.size());
    }
}
