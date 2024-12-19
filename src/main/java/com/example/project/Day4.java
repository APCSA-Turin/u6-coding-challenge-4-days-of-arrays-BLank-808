package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute

String name;
private int distancetravelled;
private int runtime;
private int resttime;
private int speed;
private int secs=0;
private int totaltime;
        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name=name;
            runtime=runDuration;
            resttime=restDuration;
            this.speed=speed;
            totaltime=(runDuration+restDuration);
        }

        public int getDistanceTraveled(){ // this method is required
            
            return distancetravelled;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            if (secs<runtime){
            distancetravelled+=speed;}
            if(secs>=(runtime+resttime)){
                secs=0;
            }
            secs++;
        }

        public String getName(){
         return name;
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        Reindeer best= reindeers[0];
        for (int a=0;  a < reindeers.length; a++) {
            for (int index = 0; index < time; index++) {
                reindeers[a].simulateSecond();
            }
            if (Math.max(reindeers[a].getDistanceTraveled(), best.getDistanceTraveled())==reindeers[a].getDistanceTraveled()){
                best=reindeers[a];
            }
        }
        return best.getName();
    }

    
    public static void main(String[] args) { // for testing purposed

    }

 
}



