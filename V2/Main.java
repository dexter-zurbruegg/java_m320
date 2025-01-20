package V2;

// Main Class to Test the Implementation
public class FootballTeamDemo {
    public static void main(String[] args) {
        // Create a team
        Team team = new Team("Dream Team");

        // Create players
        Player goalkeeper = new Goalkeeper("John");
        Player defender = new Defender("Alice");
        Player midfielder = new Midfielder("Bob");
        Player striker = new Striker("Eve");

        // Add players to the team
        team.addPlayer(goalkeeper);
        team.addPlayer(defender);
        team.addPlayer(midfielder);
        team.addPlayer(striker);

        // Demonstrate polymorphism
        team.play();
    }
}
