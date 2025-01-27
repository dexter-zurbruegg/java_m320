package V2;
public class Main {
    public static void main(String[] args) {
        Team team = new Team("FC TBZ");

        Player goalkeeper = new Goalkeeper("Tim");
        Player defender = new Defender("Timo");
        Player midfielder = new Midfielder("Tom");
        Player striker = new Striker("Timon");

        team.addPlayer(goalkeeper);
        team.addPlayer(defender);
        team.addPlayer(midfielder);
        team.addPlayer(striker);

        team.play();
    }
}
