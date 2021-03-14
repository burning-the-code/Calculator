package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Code for Principal
      System.out.println("Tell me about the amount of money you took in loan");
       Scanner Pricipal= new Scanner(System.in);
       String prnc= Pricipal.nextLine();
       String nmbr_prnc =prnc.replaceAll("[^0-9 .]","");
       System.out.println("Ok"+ "\n"+ "Pricipal in rupee= "+nmbr_prnc+ "/-"+"\n");


       //Code for Interest Rate
        System.out.println("now tell me the  \"Interest Rate\", they charged you..");
        Scanner rate= new Scanner(System.in);
        String rt= rate.nextLine();
        String nmbr_rt= rt.replaceAll("[^0-9 .]","");
        System.out.println("ok"+ "\n" +"Interest Rate= "+nmbr_rt+"%"+"\n");

        //Code for Time
        System.out.println("For how many years you have taken loan of Rs. " + nmbr_prnc + "?");
        Scanner time=new Scanner(System.in);
        String tm = time.nextLine();
        String nmbr_tm=tm.replaceAll("[^0-9 .]","");
        System.out.println("Ok...Time Period = "+ nmbr_tm);

Float flt_prnc= Float.parseFloat(nmbr_prnc);
Float flt_rate= Float.parseFloat(nmbr_rt);
Float flt_time= Float.parseFloat(nmbr_tm);

float rate_operation = 1+ (flt_rate/100);
        double rate_operation_expo = Math.pow(rate_operation,flt_time);
double Amount= rate_operation_expo * flt_prnc;
double CI= Amount-flt_prnc;
System.out.println("\n You have to pay Rupees  " + Math.round(Amount)+"/-"+" , after "+ nmbr_tm+ " years" +"\n"+ "that is an interest (extra money) of "+ CI);





    }
}
