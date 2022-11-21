package exercise2;

import java.util.Scanner;

public class CompanyTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Company company = new Company();
        company.add(createEmployee(input));
        company.add(createEmployee(input));

        company.showEmployees();
        System.out.println("Suma wypłat: " + company.totalSalaries());

        company.remove(0);

        company.showEmployees();
        System.out.println("Suma wypłat: " + company.totalSalaries());

        company.add(createEmployee(input));
        company.showEmployees();
        System.out.println("Suma wypłat: " + company.totalSalaries());

    }

    private static Employee createEmployee(Scanner input){
        System.out.println("Podaj imię");
        String firstName = input.nextLine();
        System.out.println("Podaj nazwisko");
        String lastName = input.nextLine();
        System.out.println("Podaj wypłatę");
        double salary = input.nextDouble();
        input.nextLine();
        return new Employee(firstName, lastName, salary);
    }
}
