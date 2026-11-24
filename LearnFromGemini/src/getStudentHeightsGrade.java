public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }

    public String getName() {
        return this.name;
    }
}

public static String getTopStudentName(Student[] arr) {
	int maxGrade = arr[0].getGrade();
	String studentName = "";
	for (int i = 1; i < arr.length; i++) {
		if (arr[i].getGrade() > maxGrade) {
			maxGrade = arr[i].getGrade();
			studentName = arr[i].getName();
		}
	}
	return studentName;
	
}