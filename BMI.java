import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BMI {

    static String methodOops = "Uh oh! Something went wrong on our end. That's a bit embarassing..."; // <= Error on Timeout

    // Timeout Method
    
    
    static void timeOut() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(methodOops);
        }
    }

    public static void main(String[] args) {
        String name;
        boolean metric;
        boolean firstCheck;
        String weightOrHeight;
        float weight;
        float height;
        double impWeight;
        double impHeight;
        double bmi;

        // Introduction
        Scanner input = new Scanner(System.in);
        System.out.println(
                "Hello! My name is Emi. I will be helping you live a better and healthier life! Lets get to know you. What is your name?");
        name = input.nextLine();
        timeOut();

        // Concatenation and name greet
        System.out.println("What a nice name! Its a pleasure to get to meet you, " + name + "!");
        timeOut();

        // Brief Timeout

        // 1st message
        System.out.println(
                "I understand it can be hard to get started being healthier. However, Im going to make it quick and easy to get started");
        timeOut();

        // checking for Metric or Imperial. Will fork off code for different
        // measurements.
        System.out.println(
                "Lets get started with a simple BMI check. In order to best fit your results. Do you use the Metric system? Please type 'true' or 'false'");
        metric = input.nextBoolean();

        // ==Metric(true)==
        if (metric == true) {
            timeOut();

            System.out.println("Great! Im glad you are still here with me! Moving on...");
            timeOut();

            // Height
            System.out.println("Alright! Im going to need your Height in meters. Please enter your height!");
            height = input.nextFloat();
            timeOut();

            System.out.println("Okay " + name + ", You measure " + height + " Meters.");
            timeOut();

            // Weight
            System.out.println("Okay! Im going to need your weight in kilograms. Please enter your weight!");
            weight = input.nextFloat();
            timeOut();

            // First Check
            System.out.println("Okay " + name + ", You measure " + height + " meters and weigh " + weight
                    + " kilograms. Is this correct?");
            firstCheck = input.nextBoolean();

            if (firstCheck = true) {
                input.nextLine();

            } else {
                timeOut();

                // Choosing what went wrong. Height or weight.
                System.out.println("No worries! We can always go back. Was it your weight or your height?");
                weightOrHeight = input.nextLine();

                // weight
                if (weightOrHeight.equals("weight")) {
                    System.out.println("Ah it was your." + weightOrHeight + "." + "What is your new weight?");
                    weight = input.nextFloat();

                } else {

                    timeOut();

                    // height
                    weightOrHeight.equals("height");
                    System.out.println("Ah it was your." + weightOrHeight + "." + "What is your new height?");
                    height = input.nextFloat();
                    timeOut();

                    // Mistakes have been fixed!
                    System.out.println("Got it! height=" + height + "meters and " + " weight=" + weight + "kilograms");
                }

            }

            // Delay
            System.out.println("Thanks " + name + "! Give me a second while I crunch some numbers.");
            timeOut();
            // Formula for BMI
            bmi = ((weight) / (height * height));

            // BMI returned
            System.out.println("Thanks for waiting! Youre Body Mass Index is: " + bmi + ".");

            // ==Imperial(false)==
        } else {
            System.out.println(
                    "Not to worry! I told my little workers in my computer to adjust their units of measurement. Theres nothing stopping us now!");

            timeOut();

            System.out.println("Great! Im glad you are still here with me! Moving on...");
            timeOut();

            // Height
            System.out.println("Alright! Im going to need your Height in inches. Please enter your height!");
            height = input.nextFloat();
            timeOut();
            System.out.println("Okay " + name + ", You measure " + height + " inches.");

            timeOut();

            // Weight
            System.out.println("Okay! Im going to need your weight in Pounds. Please enter your weight!");
            weight = input.nextFloat();
            timeOut();

            // First Check ===========Replace with Loop===========
            System.out.println("Okay " + name + ", You measure " + height + " inches and weigh " + weight
                    + " pounds. Is this correct?");
            firstCheck = input.nextBoolean();
            if (firstCheck = true) {
                input.nextLine();
            } else {

                timeOut();

                // Choosing what went wrong. Height or weight.
                System.out.println("No worries! We can always go back. Was it your weight or your height?");
                weightOrHeight = input.nextLine();

                // weight
                if (weightOrHeight.equals("weight")) {
                    System.out.println("Ah it was your." + weightOrHeight + "." + "What is your new weight?");
                    weight = input.nextFloat();

                } else {

                    timeOut();

                    // height
                    weightOrHeight.equals("height");
                    System.out.println("Ah it was your." + weightOrHeight + "." + "What is your new height?");
                    height = input.nextFloat();

                    timeOut();

                    // Mistakes have been fixed!
                    System.out.println("Got it! height=" + height + " inches and " + " weight=" + weight + "pounds");

                }

            }

            // Delay
            System.out.println("Thanks " + name + "! Give me a second while I crunch some numbers.");

            timeOut();
            // Formula for BMI

            impHeight = (height / 39.37);
            impWeight = (weight / 2.2046);
            bmi = ((impWeight) / (impHeight * impHeight));

            // BMI returned
            System.out.println("Thanks for waiting! Youre Body Mass Index is: " + bmi + ".");

        }
    }
} 

