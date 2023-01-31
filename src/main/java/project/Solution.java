package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integerList = new ArrayList<Integer>();
        String line;
        while(true){
            line = reader.readLine();
            if(line.equals("")){
                break;
            }
            try{
                integerList.add(Integer.parseInt(line));
            }catch (NumberFormatException e){
                System.out.println("Wrong data format");
                System.out.println("Try again with integer value");
            }finally{
                System.out.println("||");
            }
        }
        Collections.sort(integerList);
        for(Integer integer : integerList){
            System.out.println("Entered numbers:");
            System.out.println(integer);
        }
    }
}
