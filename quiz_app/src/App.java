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
        System.out.println("Hello, World!");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What's Your Name:");

        String username = myScanner.nextLine();
        System.out.println("Good day," + username + " - please choose your topic!");

        System.out.println("A. Geography Geeks");
        System.out.println("B. Tech Tidbits");
        System.out.println("C. Riddles");
        System.out.println("D. Movie Madness");
        System.out.print("Choose Topic: ");

        String choice = myScanner.next();
        // String category;

        switch (choice.toLowerCase()) {
            case "a":
                System.out.println("------------------------------------------------");
                String category = "Geography Geeks";
                System.out.println(
                        "Welcome to " + category + " where your knowledge will be tested. Are you ready? " + username);
                break;

            default:
                break;
        }

    }
}
