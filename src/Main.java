import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        //System.out.println("This is a test again");
//        int studentAge = 15;
//        double studentGPA = 3.45;
//        //char studentFirstInitial = 'K';
//        char studentLastInitial = 'H';
//        boolean hasPerfectAttendance = true;
//        String studentName = "Kayla";
//        char studentFirstInitial = studentName.charAt(0);
//
//
////        System.out.println(studentAge);
//        System.out.println(studentName + " " +  studentAge);
//        System.out.println(studentFirstInitial);



//        System.out.println("Pick a number between 1 to 10");
//        Scanner scanner = new Scanner(System.in);
//
//        int inputtedNum = scanner.nextInt();
//
//        if (inputtedNum < 5) {
//            System.out.println("Enjoy the good luck a friend brings you");
//        } else {
//            System.out.println("Your shoe selection will make you a very happy today");
//        }


        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat) {
            System.out.println("Playing a song");
            String userInput = input.next();
            String updatedText = userInput.toUpperCase();


            if (userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("playing next song");




    }
}
