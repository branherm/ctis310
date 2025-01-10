package edu.guilford;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Instantiate one object with values for all attributes
        Player starPlayer = new Player("Lionel Messi", 35, 30, 20);

        // Create an ArrayList to store Player objects
        ArrayList<Player> team = new ArrayList<>();

        // Add the first object to the ArrayList
        team.add(starPlayer);

        // Instantiate at least five more Player objects with random values and add them to the ArrayList
        for (int i = 0; i < 5; i++) {
            team.add(new Player());
        }

        // Print out all elements of the ArrayList
        System.out.println("Team Roster:");
        for (Player player : team) {
            System.out.println(player);
        }

        // Analyze total contributions of all players
        int totalGoals = 0;
        int totalAssists = 0;
        for (Player player : team) {
            totalGoals += player.getGoalsScored();
            totalAssists += player.getAssists();
        }

        System.out.println("\nTeam Analysis:");
        System.out.println("Total Goals Scored by Team: " + totalGoals);
        System.out.println("Total Assists by Team: " + totalAssists);
        System.out.println("Total Contributions by Team: " + (totalGoals + totalAssists));
    }
}
    
