package Enigma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Enigma en;
        
        String userInSt;
        int userIn;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        Scanner sc = new Scanner(System.in);
        char x, y;
        do {
            System.out.println("Enter 1 to make an Enigma I and 2 to make an Enigma 2:");
            userIn = sc.nextInt();
            if(userIn < 1 || userIn > 2) {
                System.out.println("invalis input: try again");
            }
        } while(userIn < 1 || userIn > 2);
        if(userIn == 1) {
            
            //create rotor 1
            do {
                System.out.println("Enter a number 1 through 5 to create rotor 1:");
                a = sc.nextInt();
                if(a < 1 || a > 5) {
                    System.out.println("invalis input: try again");
                }
            } while(a < 1 || a > 5);
            
            //create rotor 2
            do {
                System.out.println("Enter a number 1 through 5 to create rotor 2:");
                b = sc.nextInt();
                if(b < 1 || b > 5) {
                    System.out.println("invalis input: try again");
                }
            } while(b < 1 || b > 5);
            
            //create rotor 3
            do {
                System.out.println("Enter a number 1 through 5 to create rotor 3:");
                c = sc.nextInt();
                if(c < 1 || c > 5) {
                    System.out.println("invalis input: try again");
                }
            } while(c < 1 || c > 5);
            
            //create reflector
            do {
                System.out.println("Enter a number 1 through 5 to create the reflector:");
                d = sc.nextInt();
                if(d < 1 || d > 3) {
                    System.out.println("invalis input: try again");
                }
            } while(d < 1 || d > 2);

        }
        else {
            if(userIn == 2) {
                
            }
        }
        en = new Enigma(a,b,c,d);
        //plugboard
         
        
        System.out.println("PlugBoard: enter two letter to swap them in the plugboard. Do not enter the same letter twice. For example, do not enter ab then ag. Swap ab back before trying to swap ag. Enter '@' to finish");
        userInSt = sc.next();
        while(userInSt.length() == 2) {
            userInSt = sc.next();
            userInSt = userInSt.toUpperCase();
            c = 0;
            x = userInSt.charAt(0);
            a = x - 65;
            y = userInSt.charAt(1);
            b = y - 65;
            c = en.plugBoard(a, b);
            if(c == 1) {
                System.out.println("Those letters are already swapped: choose different letters.");
            }
            if(c == -1) {
                System.out.println("Invalid input: please try again.");
            }
        }
       
        System.out.println("Enter letter to encrypt or enter '@' to leave");
        x = ' ';
        while(x != '@') {
            userInSt = sc.next();
            userInSt = userInSt.toUpperCase();
            x = userInSt.charAt(0);
            if(x != '@') {
                System.out.println(en.encode(x));
            }
        }
    }
}
