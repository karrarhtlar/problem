/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem0.solution.karrar.al.saadi.ja;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import static sun.font.GlyphLayout.done;

/**
 *
 * @author SMART
 */


 
public class Problem0SolutionKarrarAlSaadiJa {

    /**
     * @param args the command line arguments
     */

public static int whereIsMyFood(String []fridge,String item) {
 int result=-1;
    for (int i=0;i<fridge.length;i++)
        if(item.compareTo(fridge[i])==0)
            result=i;
return result;
}    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
   Scanner sc=new Scanner(System.in);
    int done=1;
    int postion=-1;
    int coutn=0;   
    String []fridge={"banana","apple","egg","orainge","water"};
       String item;    
        BufferedWriter bw=new BufferedWriter(
                                                                 new FileWriter("C:\\Users\\SMART\\Documents\\NetBeansProjects\\problem0-solution-karrar-al-saadi.ja\\node problem0-solution-karrar-al-saadi.ja.txt"));
       while(done== 1)
    {
        System.out.println("\nwhat is  item you need");
        item=sc.next();
    postion=  whereIsMyFood(fridge, item);
    bw.write("item is "+String.valueOf(item)+"\t postion "+String.valueOf(postion)+"\n");
    System.out.println("item is "+item+"\t postion "+postion+"\n");  
    System.out.println("if you need to continue enter 1\n else enter any thing ");
        done=sc.nextInt();
         }
 bw.close();
    }
    }

