package edu.guilford;

import java.util.Random;

public class Player {
    
    // Player class for a soccer team
    
        private String name;
        private int age;
        private int goalsScored;
        private int assists;
    
        // Constructor that sets random values for attributes
        public Player() {
            Random rand = new Random();
            this.name = "Player" + rand.nextInt(100);
            this.age = 18 + rand.nextInt(23 - 18 + 1); // Random age between 18 and 23
            this.goalsScored = rand.nextInt(21);       // Random goals between 0 and 20
            this.assists = rand.nextInt(11);           // Random assists between 0 and 10
        }
    
        // Constructor that accepts values for all attributes
        public Player(String name, int age, int goalsScored, int assists) {
            this.name = name;
            this.age = age;
            this.goalsScored = goalsScored;
            this.assists = assists;
        }
    
        // Getters and setters for all attributes
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public int getAge() {
            return age;
        }
    
        public void setAge(int age) {
            this.age = age;
        }
    
        public int getGoalsScored() {
            return goalsScored;
        }
    
        public void setGoalsScored(int goalsScored) {
            this.goalsScored = goalsScored;
        }
    
        public int getAssists() {
            return assists;
        }
    
        public void setAssists(int assists) {
            this.assists = assists;
        }
    
        // Helper method: Calculates total contribution (goals + assists)
        public int totalContribution() {
            return goalsScored + assists;
        }
    
        // toString method for displaying player information
        @Override
        public String toString() {
            return "Name: " + name + ", Age: " + age + ", Goals: " + goalsScored + ", Assists: " + assists;
    }
    
}
