/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskofgraphic;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class TaskofGraphic {

    /**
     * @param args the command line arguments
     */
    public static String method(double x1,double y1,double x2, double y2){
    double M=(y2-y1)/(x2-x1);
    if(M<1){return "1"+" "+M;}
    else if(M==1){return "1"+" "+"1";
}
    else{
            return 1/M+" "+"1";
            }
 }
    
    public static void DDA(double x1, double y1,double x2, double y2, final String method){
   double xp=x1;
   double yp=y1;
   
       
        System.out.println("   xp     yp     "+" Xp+1      yp+1  "+"  theRoundof(Xp+1,yp+1)");
        for (int i = 0; i < Math.max(Math.max(x1, x2)-Math.min(x1, x2),Math.max(y1, y2)-Math.min(y1, y2)); i++) {
            System.out.print("   "+ xp+"   "+yp+"      ");
         xp=xp+Double.parseDouble(method.split(" ")[0]);  
          yp=yp+Double.parseDouble(method.split(" ")[1]);
  
        System.out.println(xp+"        "+yp+"    "+"          ("+Math.round(xp)+","+Math.round(yp)+")   ");
        
    
        }
         
    
    
    }
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
Scanner input=new Scanner(System.in);
        System.out.println("Enter the Start Point");
 String startpoint=input.next();
        System.out.println("Enter the End point");
 String endpoint=input.next();
 double x1=Double.parseDouble(startpoint.substring(startpoint.indexOf('(')+1, startpoint.indexOf(',')));
 double y1=Double.parseDouble(startpoint.substring(startpoint.indexOf(',')+1, startpoint.indexOf(')')));
 double x2=Double.parseDouble(endpoint.substring(endpoint.indexOf('(')+1, endpoint.indexOf(',')));
 double y2=Double.parseDouble(endpoint.substring(endpoint.indexOf(',')+1, endpoint.indexOf(')')));
       
        DDA(x1, y1, x2, y2, method(x1, y1, x2, y2));

    }
    
}
