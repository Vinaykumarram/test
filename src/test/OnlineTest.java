package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OnlineTest {


  public static Map<String,Integer> processData(ArrayList<String> votes) {
   
    Map<String,Integer> map =
        new HashMap<String, Integer>();
for (String str : votes)
{
if (map.keySet().contains(str))
    map.put(str, map.get(str) + 1);
else
    map.put(str, 1);
}

int maxValueInMap = 0;
String winner = "";

Map<String,Integer> retVal = new HashMap<String,Integer>();
for (Map.Entry<String,Integer> entry : map.entrySet())
{
    String key  = entry.getKey();
    Integer val = entry.getValue();
    if (val > maxValueInMap)
    {
        maxValueInMap = val;
        retVal.put(key, val);
    }
    
    else if (val == maxValueInMap &&
        winner.compareTo(key) > 0)
      retVal.put(key, val);
}

return retVal;
}

public static void main (String[] args) {
    ArrayList<String> inputData = new ArrayList<String>();
    String line;
    try {
        Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
        while(in.hasNextLine())
            inputData.add(in.nextLine());
        Map<String,Integer> retVal = processData(inputData);
        PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        for(Map.Entry<String,Integer> e: retVal.entrySet())
            output.println(e.getKey() + ": " + e.getValue());
        output.close();
    } catch (IOException e) {
        System.out.println("IO error in input.txt or output.txt");
    }
}
  

}
