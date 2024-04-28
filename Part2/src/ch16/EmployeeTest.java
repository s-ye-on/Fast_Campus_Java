package ch16;

public class EmployeeTest {
    public static void main(String args[]){



        Employee employeeLee = new Employee(); //기본 생성자
        employeeLee.setEmployeeName("이순신");


        //인스턴스 생성과 무관하게 바로 호출할 수 있음 클래스이름.메서드 써서
        System.out.println(Employee.getSerialNum());

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeLee.getEmployeeName() + "님의 사번은" + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "님의 사번은" + employeeKim.getEmployeeId());


    }
}
