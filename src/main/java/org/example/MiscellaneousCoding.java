package org.example;

public class MiscellaneousCoding {
    public static void main(String[] args) {
        //System.out.println("World is the \"Flower\" of the Universe");

        /*
        int num1 = 7;
        int num2 = 69;
        int num3 = 3;
        if (num1>num2&&num1>num3){
            System.out.println("The largest number is: "+num1);
        }
        else if(num2>num1&&num2>num3){
            System.out.println("The largest number is: "+num2);
        }
        else {
            System.out.println("The largest number is: "+num3);
        }
        */


        //===================================================================================================
        //Grading in a class
      /*  int number = 600;
        if (number >= 90 && number <= 100) {
            System.out.println("Grade A");
        } else if (number >= 80 && number <= 89) {
            System.out.println("Grade B");
        } else if (number >= 70 && number <= 79) {
            System.out.println("Grade C");
        } else if (number >= 60 && number <= 69) {
            System.out.println("Grade D");
        } else if (number > 100) {
            System.out.println("Number cannot be more than 100!");
        } else {
            System.out.println("Fail");
        }
        */

        //===================================================================================================
        //if salary is more than 10000 print higher salary, else print lower salary, and salary cannot be more than 50000 and less than 3000.
      /*  int sal = 90000;
        if (sal > 3000 && sal < 50000) {
            if (sal > 10000) {
                System.out.println("Higher salary");
            } else {
                System.out.println("Lower salary");
            }
        } else {
            System.out.println("Invalid salary range");
        }
       */


        //===================================================================================================
        //Write a program to check whether entered character is lowercase ( a to z ) or uppercase ( A to Z ).
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);
        if (ch>='a'&&ch<='z'){
            System.out.println("The character entered is lowercase.");
        }
        else if (ch>='A'&&ch<='Z'){
            System.out.println("The character entered is Uppercase");
        }
        else {
            System.out.println("This is not a letter character!");
        }
         */


        //===================================================================================================
        //Take input of age of 3 people by user and determine oldest and youngest among them.
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age of person 1: ");
        int age1 = scanner.nextInt();
        System.out.println("Enter age of person 2: ");
        int age2 = scanner.nextInt();
        System.out.println("Enter age of person 3: ");
        int age3 = scanner.nextInt();
        int oldest = age1;
        if (age2>oldest){
            oldest=age2;
        }
        if (age3>oldest){
            oldest=age3;
        }
        int youngest = age1;
        if (age2<youngest){
            youngest=age2;
        }
        if (age3<youngest){
            youngest=age3;
        }
        System.out.println("Oldest person's age: "+oldest);
        System.out.println("Youngest person's age: "+youngest);
       */

        //===================================================================================================
        //A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
        //Ask user for their salary and year of service and print the net bonus amount.
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();
        double bonus = 0.0;
        if (yearsOfService>5){
            bonus=salary*0.05;
        }
        System.out.println("Your net bonus amount is: $"+bonus);
        */

        //===================================================================================================
        //printing even number starting point 1
       /* for (int i=1;i<=10;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
        */

        //===================================================================================================
        //printing even number starting point 1, and then add their summation
       /* int sum = 0;
        for (int i=1;i<=10;i++){
            if (i%2==0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
        */

        //===================================================================================================
        //get summation of 1 to 100, and print only till 3000
       /* int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            if (sum > 3000) {
                break;
            }
        }
        System.out.println(sum);
        */

        //===================================================================================================
        //get starting point from user and ending point, and then print out numbers only those number that are divisible by 3
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the starting number: ");
        int input1 = scanner.nextInt();
        System.out.println("Please enter ending number: ");
        int input2 = scanner.nextInt();
        for (int i = input1;i<=input2;i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
        */

        //===================================================================================================
        //calculator program in a loop
        /*Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter your first whole number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter your second whole number: ");
            int num2 = scanner.nextInt();
            System.out.println("Choose an operation: \n1. Addition (+)\n2. Subtraction (-)\n3. Multiplication (*)\n4. Division (/)\n5. Exit the program");
            int choice = scanner.nextInt();
            int result = 0;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        return;
                    }
                    break;
                case 5:
                    System.out.println("Thanks for using the calculator!");
                    exit = true;
                    continue;
                default:
                    System.out.println("Invalid Entry!");
            }
            System.out.println("The result from 2 given numbers: " + result);
        }
         */

        //===================================================================================================
      /*  for (int i = 1;i<=8;i++){
            for (int j=1;j<=8;j++){
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i<=8;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
       */

        //===================================================================================================
        //adding array numbers
       /* int[] num = {2,5,4,1,9,7};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum +num[i];
        }
        System.out.println(sum);
        */

        //===================================================================================================
        //finding largest number from array
       /* int[] num = {2,5,44,1,7,10};
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>max){
                max= num[i];
            }
        }
        System.out.println(max);
        */

        //===================================================================================================
        //print the all odd numbers from the array
       /* int[] num = {2,5,44,1,7,10};
        for (int i = 0; i < num.length; i++) {
            if (num[i]%2==1){
                System.out.println(num[i]);
            }
        }
        */

        //===================================================================================================
        //print n number of odd numbers using scanner
      /* Scanner scanner = new Scanner(System.in);
        System.out.println("How many odd numbers do you want? ");
        int n = scanner.nextInt();
        int  count = 0; //This line initializes a variable count to 0. This variable will be used to keep track of how many odd numbers have been printed so far
        int numbers = 1; //This line initializes a variable numbers to 1. This variable represents the current number being evaluated to determine if it's odd.
        while (count<n){
            if(numbers%2!=0) { //This line checks if the current number (numbers) is odd. The % operator calculates the remainder when numbers is divided by 2. If the remainder is not 0, it means numbers is odd.
                System.out.println(numbers);
                count++;
            }
            numbers++;
        }
       */

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("How many odd numbers do you want? ");
        int totalOdd = scanner.nextInt();
        int i = 0;
        int count = 0;
        do{
            if (i%2==1){
                System.out.println(i);
                count++;
            }
            i++;
        }while (count<totalOdd);
         */

        //===================================================================================================
        //print the count of 2 from the given array
        /*  int[] nums = {2,3,43,2,4,6,5,55,2,49,2};
        int count = 0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==2){
                count++;
            }
        }
        System.out.println("The count of 2 is: "+count);
         */

        //===================================================================================================
        //find out if there are two 2 together in the array
     /*   int[] nums = {2,3,43,2,4,6,5,55,2,2};
        int count = 0;
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]==2&&nums[i+1]==2){
                count++;
            }
        }
        System.out.println("The number of count 2 together is: "+count);
      */

        //===================================================================================================
      /*  int bigNum = returnLargerNum(23, 54);
        System.out.println(bigNum - 5);
    }

    public static int returnLargerNum(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
       */

        //===================================================================================================
        //create a method which will take 2 int[] params and print which array contain more numbers
       /* int[] number1 = {2,3,5,77,65,45,6,5};
        int[] number2 = {54,5,67,3,7};
        returnLargerArray(number1,number2);
    }
    public static void returnLargerArray(int[] num1, int[] num2){
        if (num1.length>num2.length){
            System.out.println("number1 is larger array");
        }
        else {
            System.out.println("number2 is the larger array");
        }
    }
        */

        //===================================================================================================
        ////get the sum of the values of the array and stop the loop when sum's value >50, and print the index where it's stopped
       /* int[] arr = {2, 9, 8, 6, 25, 7, 5, 3, 9};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum > 50) {
                System.out.println("Index: " + i + ", Summation more than 50: " + sum);
                break;
            }
        }
        */

        //===================================================================================================
        //print how many characters in a given array of string
       /* String[] countries = {"Bangladesh", "USA","France","England","Iceland"};
        int countCharacter = 0;
        for (String country:countries){
            countCharacter = countCharacter+country.length();
        }
        System.out.println(countCharacter);
        */

        //===================================================================================================
        //print how many lower case 'a' in a given array of string
      /*  String[] countries = {"Bangladesh", "USA","France","India","Italy"};
        int countLowerCase = 0;
        for (int i=0;i<countries.length;i++){
            String country = countries[i];
            for (int j=0;j<country.length();j++){
                if (country.charAt(j)=='a'){
                    countLowerCase++;
                }
            }
        }
        System.out.println(countLowerCase);
       */

        //===================================================================================================
        //print country name which has the highest length in a given array of string
      /*  String[] countries = {"Bangladesh", "USA","France","India","Italy"};
        String largestLength = "";
        for (int i=0;i<countries.length;i++){
            String country = countries[i];
            if (country.length()>largestLength.length()){
                largestLength=country;
            }
        }
        System.out.println(largestLength);
       */

        /*
         //print country name which has the highest length in a given array of string
        String[] countries = {"Bangladesh", "USA", "France", "India", "Italy"};
        int max = 0;
        int index = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].length() > max) {
                max = countries[i].length();
                index = i;
            }
        }
        System.out.println(countries[index]);
         */

        //===================================================================================================
        //Leap year
       /* int count = 0;
        for (int year = 1911; year <= 2024; year++) {
            if (year % 4 == 0) {
                count++;
                System.out.println(count+". Leap Year: "+year);
            }
        }
        System.out.println("The number of leap years between 1911 and 2024: "+count);
        */

        //===================================================================================================
        //Get the starting point and ending point of a loop from the console. Print all the numbers  from the starting and ending point
        // which can be divisible by 3(you don't need to show more than 5 numbers)
      /*  Scanner scanner = new Scanner(System.in);
        int start;
        int end;
        System.out.print("Enter the starting point: ");
        start = scanner.nextInt();
        System.out.print("Enter the ending point: ");
        end = scanner.nextInt();
        int count = 0;
        System.out.println("Numbers divisible by 3 between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
       */

        //===================================================================================================
        //Get 2 numbers from the console (program must make sure numbers are within 50 and 100) then tell which number is bigger.
      /*  Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        while (true) {
            System.out.print("Enter the first number between 50 and 100: ");
            num1 = scanner.nextInt();
            if (num1 >= 50 && num1 <= 100) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number between 50 and 100.");
            }
        }
        while (true) {
            System.out.print("Enter the second number between 50 and 100: ");
            num2 = scanner.nextInt();
            if (num2 >= 50 && num2 <= 100) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number between 50 and 100.");
            }
        }
        if (num1 > num2) {
            System.out.println("The first number " + num1 + " is bigger than the second number " + num2);
        } else if (num2 > num1) {
            System.out.println("The second number " + num2 + " is bigger than the first number " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }
       */

        //===================================================================================================









    }
}
