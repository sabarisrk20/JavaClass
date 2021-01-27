package basic_pgm_day3;

public class MainClass {
	public static void main(String[] args) {
		FunctionClass fs = new FunctionClass();
		fs.setName("Sabari");
		System.out.println(fs.getName());
	}
}

class FunctionClass {
	String name;

	public void setName(String stdName) {
		this.name = stdName;
	}

	public String getName() {
		return (this.name);
	}
}
