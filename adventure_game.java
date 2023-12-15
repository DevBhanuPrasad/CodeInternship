import java.util.Scanner;

public class adventure_game {

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        System.out.println("Welcome to the Extended Text Adventure Game!");
        System.out.println("You wake up in a mystical realm surrounded by magical creatures. Your quest is to find the legendary Crystal of Destiny.");
        System.out.println("You have three paths ahead: 'forest', 'cave', or 'river'. Choose wisely!");

        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine().toLowerCase();

        switch (userChoice) {
            case "forest":
                forestPath();
                break;
            case "cave":
                cavePath();
                break;
            case "river":
                riverPath();
                break;
            default:
                System.out.println("Invalid input. Please choose 'forest', 'cave', or 'river'.");
                startGame();
        }
    }

    public static void forestPath() {
        System.out.println("You enter a dense enchanted forest. As you proceed, you encounter a talking tree and a magical potion.");
        System.out.println("Do you want to 'talk to the tree' or 'drink the potion'?");
        
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine().toLowerCase();

        switch (userChoice) {
            case "talk to the tree":
                System.out.println("The tree shares ancient wisdom with you. It advises you to continue your journey. You find a hidden path deeper into the forest.");
                hiddenPath();
                break;
            case "drink the potion":
                System.out.println("You drink the potion and gain the ability to communicate with animals. A helpful bird guides you to the next stage of your quest.");
                mountainPath();
                break;
            default:
                System.out.println("Invalid input. Please choose 'talk to the tree' or 'drink the potion'.");
                forestPath();
        }
    }

    public static void cavePath() {
        System.out.println("You enter a dark cave filled with mysterious echoes. There are two tunnels: 'left' and 'right'.");
        System.out.println("Which tunnel do you want to take?");
        
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine().toLowerCase();

        switch (userChoice) {
            case "left":
                System.out.println("The left tunnel leads you to a hidden chamber with a treasure chest. Congratulations! You found a valuable gem.");
                endGame();
                break;
            case "right":
                System.out.println("The right tunnel leads you to a swarm of bats. Startled, you run back to the entrance. Choose another path.");
                startGame();
                break;
            default:
                System.out.println("Invalid input. Please choose 'left' or 'right'.");
                cavePath();
        }
    }

    public static void riverPath() {
        System.out.println("You arrive at the edge of a magical river. There's a boat and a bridge nearby.");
        System.out.println("Do you want to 'take the boat' or 'cross the bridge'?");
        
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine().toLowerCase();

        switch (userChoice) {
            case "take the boat":
                System.out.println("You sail across the river and encounter a friendly water spirit. It grants you protection for the rest of your journey.");
                mountainPath();
                break;
            case "cross the bridge":
                System.out.println("As you cross the bridge, a mischievous troll demands a toll. What will you do?");
                System.out.println("'Pay the toll' or 'try to pass without paying'?");
                handleTrollDecision();
                break;
            default:
                System.out.println("Invalid input. Please choose 'take the boat' or 'cross the bridge'.");
                riverPath();
        }
    }

    public static void hiddenPath() {
        System.out.println("You follow the hidden path and come across a magical portal. It offers to transport you to a distant land.");
        System.out.println("Do you want to 'enter the portal' or 'continue through the forest'?");
        
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine().toLowerCase();

        switch (userChoice) {
            case "enter the portal":
                System.out.println("The portal transports you to an ancient library where you gain knowledge about the Crystal of Destiny's location.");
                mountainPath();
                break;
            case "continue through the forest":
                System.out.println("You traverse deeper into the forest and encounter a group of friendly elves. They share a secret shortcut to the next stage of your quest.");
                desertPath();
                break;
            default:
                System.out.println("Invalid input. Please choose 'enter the portal' or 'continue through the forest'.");
                hiddenPath();
        }
    }

    public static void mountainPath() {
        System.out.println("You arrive at the foot of a majestic mountain. There are two paths: 'climb the mountain' or 'explore the caves'.");
        System.out.println("Which path will you take?");
        
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine().toLowerCase();

        switch (userChoice) {
            case "climb the mountain":
                System.out.println("You climb the mountain and reach a high peak. From there, you spot the Crystal of Destiny in the distance.");
                grandPrize();
                break;
            case "explore the caves":
                System.out.println("You enter a cave system within the mountain. Inside, you find a magical artifact that enhances your abilities.");
                desertPath();
                break;
            default:
                System.out.println("Invalid input. Please choose 'climb the mountain' or 'explore the caves'.");
                mountainPath();
        }
    }

    public static void desertPath() {
        System.out.println("You enter a vast desert with scorching heat. There are two paths: 'follow the oasis' or 'cross the dunes'.");
        System.out.println("Which path will you choose?");
        
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine().toLowerCase();

        switch (userChoice) {
            case "follow the oasis":
                System.out.println("You follow the oasis and encounter a wise desert sage. The sage shares clues about the Crystal of Destiny's hidden location.");
                volcanoPath();
                break;
            case "cross the dunes":
                System.out.println("As you cross the dunes, a sandstorm approaches. You find shelter and discover an ancient treasure buried beneath the sand.");
                grandPrize();
                break;
            default:
                System.out.println("Invalid input. Please choose 'follow the oasis' or 'cross the dunes'.");
                desertPath();
        }
    }

    public static void volcanoPath() {
        System.out.println("You reach the base of a smoldering volcano. There's a treacherous lava river and a rocky path to the summit.");
        System.out.println("Do you want to 'cross the lava river' or 'climb the rocky path'?");
        
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine().toLowerCase();

        switch (userChoice) {
            case "cross the lava river":
                System.out.println("You bravely cross the lava river using a magical bridge. At the summit, you find the Crystal of Destiny.");
                grandPrize();
                break;
            case "climb the rocky path":
                System.out.println("As you climb the rocky path, the volcano erupts. You narrowly escape, but the Crystal of Destiny is now hidden in the molten rocks.");
                endGame();
                break;
            default:
                System.out.println("Invalid input. Please choose 'cross the lava river' or 'climb the rocky path'.");
                volcanoPath();
        }
    }

    public static void grandPrize() {
        System.out.println("Congratulations! You have successfully obtained the Crystal of Destiny!");
        System.out.println("As a reward, you are granted one wish. What do you wish for?");
        
        Scanner scanner = new Scanner(System.in);
        String userWish = scanner.nextLine();

        System.out.println("Your wish has been granted. Thank you for playing the Extended Text Adventure Game!");
        System.exit(0);
    }

    public static void handleTrollDecision() {
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine().toLowerCase();

        switch (userChoice) {
            case "pay the toll":
                System.out.println("You pay the troll's toll and proceed safely. The troll wishes you good luck on your quest.");
                desertPath();
                break;
            case "try to pass without paying":
                System.out.println("The troll becomes angry and blocks your path. You are forced to go back. Choose another path.");
                startGame();
                break;
            default:
                System.out.println("Invalid input. Please choose 'pay the toll' or 'try to pass without paying'.");
                handleTrollDecision();
        }
    }

    public static void endGame() {
        System.out.println("Game over! Thank you for playing the Extended Text Adventure Game.");
        System.exit(0);
    }
}
