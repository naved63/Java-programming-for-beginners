//happy hacktober fest
// java pattern printing programs
// This code print a rectangle box.
// hacktoberfest 2022 accpected 
// y AXIS = length of rectangle box.
// x AXIS = width of rectangle box.
// happy hacktober fest

// code look iike this.

// whan y AXIS is 4 and x AXIS 5.
// ******
// ******
// ******
// ******

import java.util.*;
public class Rectangle{
    public static void main (String args []){
        System.out.println("ENTER y AXIS VALUE");
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        System.out.println("ENTER x AXIS VALUE");
        int m = sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1; j<=m;j++){
            System.out.print("*");
        }
        System.out.println();
    }sc.close();
}
}
// happy hacktoberfest 
