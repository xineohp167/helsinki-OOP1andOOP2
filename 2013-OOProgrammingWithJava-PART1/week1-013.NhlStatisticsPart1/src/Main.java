
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("");
        
        System.out.println("Top twenty five by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("");
        
        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("");
        
        System.out.println("Statistics for the Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("");
        
        System.out.println("Players for the Anaheim Ducks");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
        System.out.println("");
    }
}
