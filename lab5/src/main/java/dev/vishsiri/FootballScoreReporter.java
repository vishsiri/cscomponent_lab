package dev.vishsiri;
import java.util.Scanner;

public class FootballScoreReporter {
    public static void main(String[] args) {
        ScoreSource scoreSource = new ScoreSource();

        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();

        scoreSource.addListener(sub1);
        scoreSource.addListener(sub2);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Score: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            scoreSource.setScoreLine(input);
        }

        scanner.close();
    }
}