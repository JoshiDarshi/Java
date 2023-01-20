package oops;

public class multilevel1 {
void study() {
	System.out.println("Darshi is doing study");
}
}
class student extends multilevel1{
	void school() {
		System.out.println("School student studing");
	}
}
class tuition extends student{
	void coaching() {
		System.out.println("coaching student studing");
	}
public static void main(String[] args) {
	tuition t1 = new tuition();
	t1.study();
	t1.coaching();
	t1.school();
}
}
