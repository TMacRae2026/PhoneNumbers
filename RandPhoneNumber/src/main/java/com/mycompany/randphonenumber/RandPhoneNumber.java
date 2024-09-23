/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randphonenumber;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TMacRae2026
 */
public class RandPhoneNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("type 'p' to generate a phone number. Type 'q' to quit");
        
        while(true) {
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("p")) {
                for (int i = 0; i <= 9; i++) {
                    if (i == 0) {
                        System.out.print(rand.nextInt(7) + 1);
                    } else if (i >= 2) {
                        System.out.print(rand.nextInt(7));
                    } else {
                        System.out.print(rand.nextInt(9));
                    }

                    if (i == 2 || i == 5) {
                        System.out.print("-");
                    }
                }
                System.out.print("\n");
            } else if (input.equalsIgnoreCase("q")) {
                break;
            }
        }
        
    }

    
}
    
        


