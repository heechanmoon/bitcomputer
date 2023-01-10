package day0110;

import java.util.Scanner;

public class Ex03Emp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee info = inputInfo(scanner);
        printInfo(info);
        scanner.close();
    }

    public static Employee inputInfo(Scanner scanner){
        Employee employee = new Employee();
        System.out.println("번호 : ");
        employee.id = scanner.nextInt();
        System.out.println("이름 : ");
        employee.name = scanner.next();
        System.out.println("직급 : ");
        employee.grade = scanner.next();
        System.out.println("소속 부서 : ");
        employee.team = scanner.next();
        System.out.println("연봉 : ");
        employee.yearMoney = scanner.nextInt();

        return employee;
    }

    public static void printInfo(Employee employee){
        System.out.printf("번호 : %d\n",employee.id);
        System.out.printf("이름 : %s\n",employee.name);
        System.out.printf("직급 : %s\n",employee.grade);
        System.out.printf("소속 부서 : %s\n",employee.team);
        System.out.printf("연봉 : %d\n",employee.yearMoney);
    }
}
