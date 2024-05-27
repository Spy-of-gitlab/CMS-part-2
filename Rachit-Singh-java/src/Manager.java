import RAScompetitor.CompetitorList;
import RAScompetitor.RAScompetitor;


public class Manager {
    private String name;

    // Constructor
    public Manager(String name) {
        this.name = name;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void manageCompetitors(CompetitorList competitorList) {
        for (RAScompetitor competitor : competitorList.getCompetitors()) {
            System.out.println("Managing competitor: " + competitor.getName());
            // Additional management logic here
        }
    }

    // Example usage
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe");
        CompetitorList competitorList = new CompetitorList();
        competitorList.loadFromCSV("RunCompetitor.csv");
        manager.manageCompetitors(competitorList);
    }
}
