import java.util.*;

// Write your Checker class here.
class Checker implements Comparator<Player> {

    @Override
    public int compare(Player A, Player B) {

        if (A.score == B.score){
            return A.name.compareTo(B.name);

        }else {
            return B.score - A.score;


            /*
             *
             * Returning p2.score - p1.score sorts the Players in descending order according to their scores.
             * The exact value that the compare function returns is not important.
             * It just has to return 0 if scores are equal,
             * a negative (-ve) number - if A should be placed before B when sorting.
             * a positive (+ve) number - if B should be placed before A when sorting.
             *
             * simple dhyan me rakh b-a DESC and A-B ASC bas.
             */

        }
    }

}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class java_comparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);

        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }

    }
}
