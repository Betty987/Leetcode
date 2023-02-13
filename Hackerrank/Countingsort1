import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        in.nextLine();  // not used
        System.out.println( outputString( count( convertToInts( in.nextLine().split( " " ) ) ) ) );
    }
    
    public static int[] count( int[] ar ) {
        int[] count = new int[100];
        for( int nbr : ar ) {
            count[nbr] += 1;
        }
        return count;
    }
    
    private static String outputString( int[] ar ) {
        StringJoiner joiner = new StringJoiner( " " );
        for( Integer value : ar ) {
            joiner.add( value.toString() );
        }
        return joiner.toString();
    }
    
    private static int[] convertToInts( String[] values ) {
        int[] parsed = new int[values.length];
        for( int i = 0; i < values.length; i++ ) {
            parsed[i] = Integer.valueOf( values[i] );
        }
        return parsed;
    }
}
