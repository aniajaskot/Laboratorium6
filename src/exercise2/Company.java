package exercise2;

class Company {
    private Employee[] employees = new Employee[10];

    void add(Employee emp){
        for(int i = 0; i < employees.length; i++){
            if(employees[i] == null){
                employees[i] = emp;
                break;
            }
        }
    }
    Employee get(int index){
        return employees[index];
    }
    boolean remove(int index){
        if(employees[index] != null){
            employees[index] = null;
            return true;
        }
        return false;
    }

    double totalSalaries(){
        double totalSalary = 0;
        for(Employee employee : employees){
            if(employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    void showEmployees(){
        for(Employee employee : employees){
            if(employee != null) {
                System.out.println(employee.getInfo());
            }
        }
    }
}
