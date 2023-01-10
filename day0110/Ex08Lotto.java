package day0110;

import java.util.Random;

public class Ex08Lotto {
    public static void main(String[] args) {
        Random random = new Random();
        int num1, num2, num3, num4, num5, num6;

        num1 = random.nextInt(45) + 1;

        int temp = random.nextInt(45) + 1;
        while(num1 == temp){
            temp = random.nextInt(45) + 1;
        }
        if(num1 < temp){
            num2 = temp;
        }else{
            num2 = num1;
            num1 = temp;
        }

        temp = random.nextInt(45)+1;
        while(num1==temp || num2 == temp){
            temp = random.nextInt(45)+1;
        }
        if(num2 < temp){
            num3 = temp;
        }else if(num1<temp){
            num3 = num2;
            num2 = temp;
        }else{
            num3 = num2;
            num2 = num1;
            num1 = temp;
        }

        temp = random.nextInt(45)+1;
        while(num1==temp || num2 == temp || num3 == temp){
            temp = random.nextInt(45)+1;
        }
        if(num3<temp) {
            num4 = temp;
        }else if(num2 < temp){
            num4 = num3;
            num3 = temp;
        }else if(num1<temp){
            num4 = num3;
            num3 = num2;
            num2 = temp;
        }else{
            num4 = num3;
            num3 = num2;
            num2 = num1;
            num1 = temp;
        }

        temp = random.nextInt(45)+1;
        while(num1==temp || num2 == temp || num3 == temp || num4 == temp){
            temp = random.nextInt(45)+1;
        }
        if(num4<temp) {
            num5 = temp;
        }else if(num3<temp) {
            num5 = num4;
            num4 = temp;
        }else if(num2 < temp){
            num5 = num4;
            num4 = num3;
            num3 = temp;
        }else if(num1<temp){
            num5 = num4;
            num4 = num3;
            num3 = num2;
            num2 = temp;
        }else{
            num5 = num4;
            num4 = num3;
            num3 = num2;
            num2 = num1;
            num1 = temp;
        }

        temp = random.nextInt(45)+1;
        while(num1==temp || num2 == temp || num3 == temp || num4 == temp || num5 == temp){
            temp = random.nextInt(45)+1;
        }
        if(num5<temp) {
            num6 = temp;
        }else if(num4<temp) {
            num6 = num5;
            num5 = temp;
        }else if(num3<temp) {
            num6 = num5;
            num5 = num4;
            num4 = temp;
        }else if(num2 < temp){
            num6 = num5;
            num5 = num4;
            num4 = num3;
            num3 = temp;
        }else if(num1<temp){
            num6 = num5;
            num5 = num4;
            num4 = num3;
            num3 = num2;
            num2 = temp;
        }else{
            num6 = num5;
            num5 = num4;
            num4 = num3;
            num3 = num2;
            num2 = num1;
            num1 = temp;
        }
        System.out.printf("%d %d %d %d %d %d\n",num1,num2,num3,num4,num5,num6);
    }
}
