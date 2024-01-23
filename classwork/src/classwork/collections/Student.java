package classwork.collections;

import java.util.Objects;

public class Student {
	private Integer stuId;
	private String stuName;
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(stuId, stuName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(stuId, other.stuId) && Objects.equals(stuName, other.stuName);
	}
	
	

}
