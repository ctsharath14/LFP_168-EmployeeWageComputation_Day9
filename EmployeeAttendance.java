public class EmployeeAttendance {
    public static void main(String[] args) {
        int empCheck = (int)(Math.random() * 2);
        if (empCheck == 1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
