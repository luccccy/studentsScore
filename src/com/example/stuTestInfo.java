package com.example;
import java.util.*;

public class stuTestInfo {
    String testNam;
    ArrayList<String> names;
    ArrayList<Integer> scores;

    public  stuTestInfo(String testName) {
        this.testNam = testName;
        names = new ArrayList<>();
        scores = new ArrayList<>();
    }

    public void addNames(String name) {
        names.add(name);
    }

    public String getName(int i) {
        return names.get(i);
    }

    public void addScores(int score) {
        scores.add(score);
    }

    public int getScore(int i) {
        return scores.get(i);
    }

    public double calAverage(ArrayList<Integer> stuScores) {
        double sum = 0;
        double averageScore = 0;
        for(int score : stuScores) {
            sum += score;
        }
        averageScore = sum / stuScores.size();
        System.out.println("Students average score is " + averageScore);
        return averageScore;
    }







    public void pushInfo() {
        while(true) {
      Scanner nameOfStu = new Scanner(System.in);
      Scanner scoreOfStu = new Scanner(System.in);

          System.out.println("Input student's name: ");
          String stuName = scoreOfStu.nextLine();
          addNames(stuName);
          System.out.println(names);
          System.out.println("========================");
          System.out.println("Input student's score: ");
          int stuScore = scoreOfStu.nextInt();
          addScores(stuScore);
          System.out.println(scores);
          System.out.println("========================");
          calAverage(scores);
      }

    }


}
