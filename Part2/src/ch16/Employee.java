package ch16;

public class Employee {
    //16.여러인스턴스에서 공용으로 사용하는 변수를 선언하자 - static변수

    private static int serialNum =1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public static int getSerialNum() {
        int i=0; //함수 내부에 선언된 지역변수 사용상관x 함수호출될때 만들어져서 함수 끝나면 없어질 변수
        //지역변수

        // employeeName = "Lee"; 오류. getSerialNum 메서드가 불려질 시점에 employeeName이 없을 수도 있기때문
        // 인스턴스변수

        // static 메서드 안에서는 인스턴스 변수, 일반 멤버변수 사용불가

        return serialNum;
        //static 변수
    }

    public Employee(){
        serialNum++; //한명이 생길때마다 사번 ++
        employeeId = serialNum;
    }

    public int getEmployeeId() {
        // serialNum = 1000; 일반 메서드안에서는 static 변수 사용 문제되지 않음
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
