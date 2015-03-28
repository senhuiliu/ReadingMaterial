/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
//Alogorithm:

//start

//read the type of book
//read number of pages
//read names of important characters

//choose the appropriate book
//update the number of pages and important characters to the local variables
//display the number of pages and importanat characters

//stop




import java.util.Scanner;
public class ReadingDemo
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
      
       int num;
       String names;
      
       System.out.println("Choose a type of book: ");
       System.out.println("1. Novel");
       System.out.println("2. Magazine");
       System.out.println("3. Technical Journals");
       System.out.println("4. Textbooks");
      
       int ch=sc.nextInt();
      
       System.out.println("Enter number of pages:");
       num=sc.nextInt();
       System.out.println("Enter names of important characters:(with spaces)");
       names=sc.next();
       switch(ch)
       {
       case 1: Novel n=new Novel();
               System.out.println("****Novel****");
               n.setnumberOfPages(num);
               n.setnamesOfPrimaryCharacters(names);
               System.out.println("The number of pages are: "+n.getnumberOfPages());
               System.out.println("The important characters are:"+n.getnamesOfPrimaryCharacters());
               break;
              
       case 2: Magazines m=new Magazines();
               System.out.println("****Magazine****");
               m.setnumberOfPages(num);
               m.setnamesOfPrimaryCharacters(names);
               System.out.println("The number of pages are: "+m.getnumberOfPages());
               System.out.println("The important characters are:"+m.getnamesOfPrimaryCharacters());
               break;
       case 3: TechJournals te=new TechJournals();
               System.out.println("****Magazine****");
               te.setnumberOfPages(num);
               te.setnamesOfPrimaryCharacters(names);
               System.out.println("The number of pages are: "+te.getnumberOfPages());
               System.out.println("The important characters are:"+te.getnamesOfPrimaryCharacters());
               break;
       case 4: Textbooks tx=new Textbooks();
               System.out.println("****Magazine****");
               tx.setnumberOfPages(num);
               tx.setnamesOfPrimaryCharacters(names);
               System.out.println("The number of pages are: "+tx.getnumberOfPages());
               System.out.println("The important characters are:"+tx.getnamesOfPrimaryCharacters());
               break;  
       default: System.out.println("Thank you!");
               break;
       }
   }
}
