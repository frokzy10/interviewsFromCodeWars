package TotalAmountPoints;

//Our football team has finished the championship.
//Our team's match results are recorded in a collection of strings.
//Each match is represented by a string in the format "x:y", where x is our team's score and y is our opponents score.
//For example: ["3:1", "2:2", "0:1", ...]
//Points are awarded for each match as follows:
//if x > y: 3 points (win)
//if x < y: 0 points (loss)
//if x = y: 1 point (tie)

public class TotalAmountPoints {
    public static void main(String[] args) {
        String[] points = {"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"};

        System.out.println(points(points));
    }
    public static int points(String[] games) {
        int points = 0;

        for (String game : games) {
            String[] splitRes = game.split(":");
            int teamPoints = Integer.parseInt(splitRes[0]);
            int oppositeTeam = Integer.parseInt(splitRes[1]);
            if (teamPoints > oppositeTeam) {
                points += 3;
            } else if (oppositeTeam == teamPoints) {
                points += 1;
            }
        }

        return points;
    }
}
