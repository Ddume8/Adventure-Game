import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int answerOne = 1;
        int answerTwo = 2;

        boolean conversation = true;

        System.out.println("Welcome to my office! I'm Dr. You");
        System.out.println("Today we'll focus a little on your motivation for the Bridge Program at C4Q.");
        while (conversation) {

            while (0 == 0) {
                System.out.println("\n\t How are you feeling today?");
                System.out.println("\t1. Good");
                System.out.println("\t2. Nervous");
                System.out.println("\t3. Stressed");
                String input = in.nextLine();
                if (input.equals("1")) {

                    System.out.println("\t> Great to hear! Hope you've been studying hard! Much of the motivation that comes from a person is within, keep yourself occupied and focus on the goal ahead.");

                    break;
                } else if (input.equals("2")) {

                    if (answerTwo > 0) {
                        System.out.println("Don't be nervous. You have the knowledge to succeed. It might be hard now but the reward at the end is so much more worth it.");
                        break;
                    } else if (input.equals("3")) {
                        System.out.println("Always remember, although you may feel discouraged, remember, the people who are guiding you now once needed guidance themselves.");
                    } else {
                        System.out.println("Invalid command");
                    }
                }
                if (answerOne < 1) {

                    while (!input.equals("1") != !input.equals("2") != !input.equals("3")) {
                        System.out.println("Invalid command");
                        input = in.nextLine();
                    }
                    if (input.equals("1")) {
                        System.out.println("Don't worry! Now we should all remember, they selected you because you have potential! Now go show that potential!");
                    } else if (input.equals("2")) {
                        System.out.println("Confidence is key! You will do just fine.");
                        break;
                    }

                    System.out.println("Before you go, how would you rate your time with Dr. You? Good, alright or indifferent?");
                    Scanner scanner = new Scanner(System.in);

                    input = scanner.next();

                    switch (input) {

                        case ("good"):
                            System.out.println("Glad to hear!");
                            break;
                        case ("alright"):
                            System.out.println("Aw, maybe we can connect at another time.");
                            break;
                        default:
                            System.out.println("Work through your challenges.");
                            break;
                    }
                    System.out.println("Good luck!");
                }
            }
        }
    }
}
