public class EmployeeWageCal{
	public static void main(String[] args)
		{
			System.out.println("Welcome to employeeWageCalculating problem");
			int IS_FULL_TIME = 1;
			double EmpCheck = Math.floor(Math.random()*10)%2;
			if(EmpCheck == IS_FULL_TIME)
				System.out.println("Employee is present");
			else
				System.out.println("Employee is absent");
		}
}
