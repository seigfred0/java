import java.util.Scanner;

// import javax.swing.JButton;
// import javax.swing.JFrame;

// class gui {
//     public static void main(String args[]) {
//         JFrame frame = new JFrame("My First GUI");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(300, 300);
//         JButton button = new JButton("Press");
//         frame.getContentPane().add(button);
//         frame.setVisible(true);
//     }
// }

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What's Your Name:");

        String username = myScanner.nextLine();
        System.out.println("Good day," + username + " - please choose your topic!");

        System.out.println("A. Geography Geeks");
        System.out.println("B. Tech Tidbits");
        System.out.println("C. Riddles");
        System.out.println("D. Politics");
        System.out.print("Choose Topic: ");

        String choice = myScanner.next();
        String category = "";

        switch (choice.toLowerCase()) {
            case "a":
                System.out.println("------------------------------------------------");
                category = "Geography Geeks";
                System.out.println(
                        "Welcome to " + category + " where your knowledge will be tested. Are you ready? " + username);

                System.out.println("Yes or No");
                String yesOrNo = myScanner.next();

                if (yesOrNo.equalsIgnoreCase("yes")) {
                    System.out.println("Yes chosen");
                } else {
                    System.out.println("Better luck next time");
                }

                break;
            case "b":
                System.out.println("------------------------------------------------");
                category = "Tech Tidbits";
                System.out.println(
                        "Welcome to " + category + " where your knowledge will be tested. Are you ready? " + username);
                break;
            case "c":
                System.out.println("------------------------------------------------");
                category = "Riddles";
                System.out.println(
                        "Welcome to " + category + " where your knowledge will be tested. Are you ready? " + username);
                break;
            case "d":
                System.out.println("------------------------------------------------");
                category = "Politics";
                System.out.println(
                        "Welcome to " + category + " where your knowledge will be tested. Are you ready? " + username);
                break;

            default:
                System.out.print("Dumb the letter you choose is not in the choices.");
                break;

        }

    }
}