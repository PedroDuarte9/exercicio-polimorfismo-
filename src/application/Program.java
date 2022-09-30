package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> emp = new ArrayList<>();

        System.out.println("Digite a quantidade de funcionário: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("Outsourced (y/n) ?");
            char opc = sc.next().charAt(0);
                if(opc == 'y') {
                    System.out.println("Digite o nome do funcionário: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    System.out.println("Digite a quantidade de horas trabalhadas: ");
                    int hours = sc.nextInt();

                    System.out.println("Digite o valor da Hora que é pago: ");
                    double valuePerHour = sc.nextDouble();

                    System.out.println("Digite o valor do Adicional: ");
                    double additionalCharger = sc.nextDouble();

                    emp.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharger ));
                }
                else{
                    System.out.println("Digite o nome do funcionário: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    System.out.println("Digite a quantidade de horas trabalhadas: ");
                    int hours = sc.nextInt();

                    System.out.println("Digite o valor da Hora que é pago: ");
                    double valuePerHour = sc.nextDouble();
                    emp.add(new Employee(name, hours, valuePerHour));
                }
        }




        for (Employee e : emp ) {
            System.out.println(emp);
        }


        sc.close();

    }
}
