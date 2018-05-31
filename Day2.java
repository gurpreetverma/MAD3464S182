/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author gurpreet
 */
public class Day2 {
    public static void main(String[] args) 
    {
     int n=10;
     String province ="ON";
     if(n % 2 == 0)
       {
         System.out.println("even");
        }
     else
       {
         System.out.println("Odd");
        }
     
      char pass = 'A';
     switch(pass)
           {
         case 'A':
             System.out.println("Adult pass : valid pass");
             break;
         case 'S':
             System.out.println("Student pass :valid pass");
             break;
         case 'O':
             System.out.println("senior citizen :valid pass");
             break;
             default:
             System.out.println("Not valid");
            }
      char pass1 = 'H';
      switch(pass1)
          {
         case 'G':
         case 'H':
         case 'I':
            System.out.println("valid pass");
         default:
             System.out.println("invalid pass");
             break;
            }
     
     switch(10+20)
          {
         case 10:
             System.out.println("value is 10" );
             break;
         case 20:
             System.out.println("value is 20");
             break;
         case 30:
             System.out.println("value is 30");
             break;
             default:
             System.out.println("Not valid");
            }
     switch(province)
           {
         case "ON":
             System.out.println("Ontario");
             break;
         case "NV":
             System.out.println("nova scotia");
             break;
         case "AB":
             System.out.println("Alberta");
             break;
         default:
             System.out.println("Not valid Province");
            }
     n =20;
     while(n>10)
       {
        System.out.println("n:"+n);
        n--;    
        }
     do
        { 
         System.out.println("n:"+n);
         n--;
         }
     while(n>10);
     
     int i;
     for(i=0;i<5; i++)
       {
         System.out.println("i:"+i);
        }
     
     for(int k=1;k<=5; k++)
       {
           if (k==3){
               continue;
               
            }
           else{
               System.out.println("i:"+i++);
           }
           }
     for (int g=1; g<=5;g++)
     {
         for(int j=1; j<=g;j++)
         {System.out.print("* ");}
     
     System.out.println("");
           
        }
     for (int g=1; g<=5;g++)
     {
         for(int space =5;space>g ; space--)
         {
             System.out.print(" ");}
         
         for(int j=1; j<=g;j++)
         {System.out.print("* ");}
     
     System.out.println("");
           
        }
  for (int m=5; m>=1;m--)
     {
         for(int space =5;space>m ; space--)
         {
             System.out.print(" ");}
         
         for(int j=1; j<=m;j++)
         {System.out.print("* ");}
     
     System.out.println("");
           
        }
    }
    
  }  

    
