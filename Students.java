package Week3.Day1;

public class Students {

	//creating methods
			public void getStudentInfo(int id)
			{
				System.out.println("Studnet ID is - " + id);
			}
			
			public void getStudentInfo(String name, int id)
			{
				System.out.println("Studnet Name is - "+ name +   "Studnet id is" +id);
			}
			
			public void getStudentInfo(String email, int phone)
			{
				System.out.println("Studnet emailid - "+email +   "Studnet phone number is"+phone);
			}
			
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students stu = new Students();
		stu.getStudentInfo(1234);
		stu.getStudentInfo("Ram", 345345);
		stu.getStudentInfo("kram15@gmail.com", 1234);
		

	}

}
