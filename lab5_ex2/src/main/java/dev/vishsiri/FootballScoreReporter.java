package dev.vishsiri;
import java.util.Scanner;
public class FootballScoreReporter {
    public static void main(String[] args) {
        LiveScoreBean liveScoreBean = new LiveScoreBean();

        Subscriber subscriber1 = new Subscriber("");
        Subscriber subscriber2 = new Subscriber("");

        liveScoreBean.addPropertyChangeListener(subscriber1);
        liveScoreBean.addPropertyChangeListener(subscriber2);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Score: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            liveScoreBean.setScoreLine(input);
        }

        scanner.close();
    }
}