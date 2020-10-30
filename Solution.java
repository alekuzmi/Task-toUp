package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        toUp( string );

    }
    public static  void toUp (String string) {
        String word;
        StringTokenizer st = new StringTokenizer(string, " \t\n\r,.");
        while (st.hasMoreTokens()) {
            word =st.nextToken();
            System.out.print( Character.toUpperCase(word.charAt( 0 )) );
            for (int i=1; i<word.length(); i++) {
                System.out.print( word.charAt( i ) );
            }
            System.out.print( " " );
        }

    }
}
