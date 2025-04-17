+9*-/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3_graphic;

/**
 *
 * @author ACER
 */
import java.beans.beancontext.BeanContext;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
public class Task3_graphic extends Application{

    /**
     * @param args the command line arguments
     */
    
    
     public static double Pk(double x,double pk,double y){
   
        if(x==0){
    pk =1-y;
    
    }else{
        if(pk<0){
        
        pk=pk+(2*x)+1;
        }
        else{
        pk=pk-(2*y)+(2*x)+1;
        }
        
        }
    return pk;
    }
    public static double[] x_Y(double x, double y, double pk){
    double []a=new double[2];
        if(pk<0){
    x=x+1;
    
    }
    else{
    x=x+1;
    y=y-1;
   }a[0]=x;
   a[1]=y;   
    return a;
    } 
      public static String [] points(double x, double y ,double pk){
      String []a=new String[2];
          String Point_x=""+x;
          String point_y=""+y;
        
          while(x<y){
              pk=Pk(x, pk, y);
      x =x_Y(x, y, pk)[0];
       y =x_Y(x, y, pk)[1];
      
      Point_x+=" "+x;
      point_y+=" "+y;
      
      } 
          
      String point_xend=Point_x;
      String point_yend=point_y;
      
          
          for (int j = Point_x.split(" ").length-2; j >-1; j--) {
              point_xend+=" "+point_y.split(" ")[j];
              
              point_yend+=" "+Point_x.split(" ")[j];
     }
         a[0]=point_xend;
      a[1]=point_yend;
      return a;
      }
      public static String [] Quarter_1to_anther_Quarter (int i ,String x_first_Quarter , String y_first_Quater){
        
         
          String []a=new String[2];
          String x_Quater="";
          String y_Quater="";
          
          for (int j = 0; j < x_first_Quarter.split(" ").length; j++) {
              if(i==1){
              
                  x_Quater+=" "+x_first_Quarter.split(" ")[j];
                  y_Quater+=" "+y_first_Quater.split(" ")[j];
                  
                  
              }else if(i==2){
               x_Quater+=" "+(0-Double.parseDouble(x_first_Quarter.split(" ")[j]));
                  y_Quater+=" "+y_first_Quater.split(" ")[j];
              
              }
          
              else if(i==3){
                   x_Quater+=" "+(0-Double.parseDouble(x_first_Quarter.split(" ")[j]));
                  y_Quater+=" "+(0-Double.parseDouble(y_first_Quater.split(" ")[j]));
                  
                  }else if(i==4){
                  
               x_Quater+=" "+x_first_Quarter.split(" ")[j];

               y_Quater+=" "+(0-Double.parseDouble(y_first_Quater.split(" ")[j]));
  }
              else{
              
                  System.err.println("There is not Quarter is called ("+i+")");
              }
          }
      
      a[0]=x_Quater.substring(1);
      a[1]=y_Quater.substring(1);
      return  a;
      
      }
        public static double[]  arr(String s ,String s2,String s3, String s4){
        double []a=new double[(s.split(" ").length)*4];
       int x=s.split(" ").length;
       int y1=0,y2=0,y3=0,y4=0; 
        for (int i = 0; i < s.split(" ").length; i++) {
               
                a[i]=Double.parseDouble(s.split(" ")[y1++]);
                
                
                }        
               for (int i = s.split(" ").length; i <(x*2); i++) {
                
                a[i]=Double.parseDouble(s2.split(" ")[y2++]);
                y1++;
                    
                }
               for (int i = (x*2); i <(x*3); i++) {
              
                
                a[i]=Double.parseDouble(s3.split(" ")[y3++]);
                
                    
                }
               for (int i = (x*3); i <(x*4); i++) {
                
              
                a[i]=Double.parseDouble(s4.split(" ")[y4++]);
                
                 }
               
               
               
               
        
        
        return a;
        }

   
        
        
      
    public void start(Stage primaryStage ) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Raduis of Circle Which you want draw (R):");
        double R=input.nextDouble();
        String []first_Quarter=Quarter_1to_anther_Quarter(1, points(0, R, 0)[0], points(0, R, 0)[1]);
        String []Second_Quarter=Quarter_1to_anther_Quarter(2, points(0, R, 0)[0], points(0, R, 0)[1]); 
         String []third_Quarter=Quarter_1to_anther_Quarter(3, points(0, R, 0)[0], points(0, R, 0)[1]);
         String []forth_Quarter=Quarter_1to_anther_Quarter(4, points(0, R, 0)[0], points(0, R, 0)[1]);
      
         
         System.out.println("The First Quarter&&  "+"The Second Quarter&&  "+"The Third Quarter  &&"+"The Forth Quarter");
         for (int i = 0; i < first_Quarter[0].split(" ").length; i++) {
       System.out.print("     ("+Math.round(Double.parseDouble(first_Quarter[0].split(" ")[i]))+","+Math.round(Double.parseDouble(first_Quarter[1].split(" ")[i]))+")          ");
       System.out.print("     ("+Math.round(Double.parseDouble(Second_Quarter[0].split(" ")[i]))+","+Math.round(Double.parseDouble(Second_Quarter[1].split(" ")[i]))+")          ");
       System.out.print("     ("+Math.round(Double.parseDouble(third_Quarter[0].split(" ")[i]))+","+Math.round(Double.parseDouble(third_Quarter[1].split(" ")[i]))+")           ");
       System.out.print("     ("+Math.round(Double.parseDouble(forth_Quarter[0].split(" ")[i]))+","+Math.round(Double.parseDouble(forth_Quarter[1].split(" ")[i]))+")\n");
       
         
         
         }
        String s=points(0, R, 0)[0];
       String s2=Quarter_1to_anther_Quarter(2, points(0, R, 0)[0], points(0, R, 0)[1])[0];
String s3=Quarter_1to_anther_Quarter(3, points(0, R, 0)[0], points(0, R, 0)[1])[0];
String s4=Quarter_1to_anther_Quarter(1, points(0, R, 0)[0], points(0, R, 0)[1])[0];
        double[] xValues =arr(s,s2,s3,s4);
 s=points(0, R, 0)[1];
        s2=Quarter_1to_anther_Quarter(2, points(0, R, 0)[0], points(0, R, 0)[1])[1];
 s3=Quarter_1to_anther_Quarter(3, points(0, R, 0)[0], points(0, R, 0)[1])[1];
 s4=Quarter_1to_anther_Quarter(4, points(0, R, 0)[0], points(0, R, 0)[1])[1];
        
        
        double[] yValues = arr(s, s2, s3, s4); 

        primaryStage.setTitle("Circle Plot");

        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();

        final ScatterChart<Number, Number> scatterChart =
                new ScatterChart<>(xAxis, yAxis);
        xAxis.setLabel("X");
        yAxis.setLabel("Y");
        scatterChart.setTitle("Circle");

        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        for (int i = 0; i < xValues.length; i++) {
            series.getData().add(new XYChart.Data<>(xValues[i], yValues[i]));
        }

        scatterChart.getData().add(series);

        Scene scene = new Scene(scatterChart, 2000, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        BeanContext factory=ne
    launch(args);
    
    }
    
}
