package SecondClass;

public class EncapsulationRegister {

	class Register{
		private String name,email,password;
		private int age; 
		private long phone; 
		private double height; 
		private char gender;
		 
		public String getName() {
		return name;
		}
		public void setName(String name) {
		this.name = name;
		}
		public String getEmail() {
		return email;
		}
		public void setEmail(String email) {
		this.email = email;
		}
		public String getPassword() {
		return password;
		}
		public void setPassword(String password) {
		this.password = password;
		}
		public int getAge() {
		return age;
		}
		public void setAge(int age) {
		this.age = age;
		}
		public long getPhone() {
		return phone;
		}
		public void setPhone(long phone) {
		this.phone = phone;
		}
		public double getHight() {
		return height;
		}
		public void setHight(double height) {
		this.height = height;
		}
		public char getGender() {
		return gender;
		}
		public void setGender(char gender) {
		this.gender = gender;
		}
		}

}
