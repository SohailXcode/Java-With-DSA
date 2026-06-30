package com.sohail;

public class StrassenDemo {

    public static void main(String[] args) {

        int a=1,b=2,c=3,d=4;
        int e=5,f=6,g=7,h=8;

        int M1=(a+d)*(e+h);//65
        int M2=(c+d)*e;
        int M3=a*(f-h);
        int M4=d*(g-e);
        int M5=(a+b)*h;
        int M6=(c-a)*(e+f);
        int M7=(b-d)*(g+h);

        int C11=M1+M4-M5+M7;
        int C12=M3+M5;
        int C21=M2+M4;
        int C22=M1-M2+M3+M6;

        System.out.println(C11+" "+C12);
        System.out.println(C21+" "+C22);
    }
}
