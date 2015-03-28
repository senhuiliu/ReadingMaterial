/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public class Textbooks {
      int numberOfPages;
   String namesOfPrimaryCharacters;
   Textbooks()
   {
       numberOfPages=0;
       namesOfPrimaryCharacters="";
   }
   void setnumberOfPages(int num)
   {
       this.numberOfPages=num;
   }
   void setnamesOfPrimaryCharacters(String names)
   {
       this.namesOfPrimaryCharacters=names;
   }
   int getnumberOfPages()
   {
       return numberOfPages;
   }
   String getnamesOfPrimaryCharacters()
   {
       return namesOfPrimaryCharacters;
   }
}
