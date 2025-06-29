package com.gamingroom;

/**
 * Application start-up program for Draw It or Lose It.
 *
 * Refactored and documented by CB~
 */
public class ProgramDriver {

    /**
     * The one-and-only main() method.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        System.out.println("=== Game Application Start ===\n");

        // Get singleton instance of GameService
        GameService service = GameService.getInstance();

        System.out.println(">>> Adding initial game data...\n");

        // Add unique games
        Game game1 = service.addGame("Game #1");
        System.out.println("Added: " + game1);

        Game game2 = service.addGame("Game #2");
        System.out.println("Added: " + game2);

        // Attempt to add a duplicate
        Game gameDuplicate = service.addGame("Game #1");
        System.out.println("Attempted duplicate: " + gameDuplicate);

        System.out.println("\n>>> Testing singleton enforcement...\n");

        // Prove only one instance exists
        SingletonTester tester = new SingletonTester();
        tester.testSingleton();

        System.out.println("\n=== Game Application End ===");
    }
}
