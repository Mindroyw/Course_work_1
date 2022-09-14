public class Main {
    public static void main(String[] args) {
        Employee[] employeeBook = new Employee[10];
        employeeBook[0] = new Employee("Дмитрий", "Петренко", "Юрьевич", "Первый отдел", 40000);
        employeeBook[1] = new Employee("Виктор", "Резнов", "Драгович", "Второй отдел", 50000);
        employeeBook[2] = new Employee("Лев", "Кравченко", "Викторович", "Третий отдел", 70000);

        getListOfEmployees(employeeBook);
        System.out.println("-----Расходы на зарплату в месяц-----\n" + calcSalaryAmountPerMonth(employeeBook));
        System.out.println("-----Сотрудник с минимальной зарплатой-----\n" + getEmployeeWithMinSalary(employeeBook));
        System.out.println("-----Сотрудник с максимальной зарплатой-----\n" + getEmployeeWithMaxSalary(employeeBook));
        System.out.println("-----Средняя зарплата------\n" + calcAverageSalary(employeeBook));
        printFullNameOfEmployees(employeeBook);
    }

    public static void getListOfEmployees(Employee[] listOfEmployees) {
        System.out.println("-----Сотрудники-----");
        for (Employee employee : listOfEmployees) {
            System.out.println(employee);
        }
        System.out.println("----------------");
    }

    public static int calcSalaryAmountPerMonth(Employee[] listOfEmployees) {
        int sum = 0;
        for (Employee employee : listOfEmployees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeWithMinSalary(Employee[] listOfEmployees) {
        Employee employeeWithMinSalary = listOfEmployees[0];
        for (Employee listOfEmployee : listOfEmployees) {
            if (listOfEmployee != null) {
                if (listOfEmployee.getSalary() < employeeWithMinSalary.getSalary()) {
                    employeeWithMinSalary = listOfEmployee;
                }
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee getEmployeeWithMaxSalary(Employee[] listOfEmployees) {
        Employee employeeWithMaxSalary = listOfEmployees[0];
        for (Employee listOfEmployee : listOfEmployees) {
            if (listOfEmployee != null) {
                if (listOfEmployee.getSalary() > employeeWithMaxSalary.getSalary()) {
                    employeeWithMaxSalary = listOfEmployee;
                }
            }
        }
        return employeeWithMaxSalary;
    }

    public static int calcAverageSalary(Employee[] listOfEmployees) {
        int numberOfEmployees = 0;
        for (Employee employee : listOfEmployees) {
            if (employee != null) {
                numberOfEmployees++;
            }
        }
        return calcSalaryAmountPerMonth(listOfEmployees) / numberOfEmployees;
    }

    public static void printFullNameOfEmployees(Employee[] listOfEmployees) {
        System.out.println("-----Полные имена-----");
        for (Employee employee : listOfEmployees) {
            if (employee != null) {
                System.out.printf("%S %S %S\n", employee.getLastName(), employee.getFirstName(), employee.getMiddleName());
            }
        }
    }
}