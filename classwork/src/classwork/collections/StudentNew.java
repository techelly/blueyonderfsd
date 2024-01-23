package classwork.collections;

public class StudentNew implements Comparable<StudentNew>{
	private Integer studentId;
	private String studentName;
	private Double marks;
	private Integer age;
	
	
	public StudentNew() {
		// TODO Auto-generated constructor stub
	}

	public StudentNew(Integer studentId, String studentName, Double marks, Integer age) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		this.age = age;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentNew [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", age="
				+ age + "]";
	}

	@Override
	public int compareTo(StudentNew o) {
		if(o.getAge()==this.getAge()) {
			return 0;
		}else if(o.getAge() < this.getAge()) {
			return 1;
		}else {
			return -1;
		}
	}

	

}
