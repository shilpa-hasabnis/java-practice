package prj;

public class Employee implements Comparable<Employee>{

	private int empId;
	private String empName;
	private int empAssetId;
	private String empAsset;

	public Employee(int empId, String empName, int empAssetId, String empAsset) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAssetId = empAssetId;
		this.empAsset = empAsset;
	}

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAssetId() {
		return empAssetId;
	}

	public void setEmpAssetId(int empAssetId) {
		this.empAssetId = empAssetId;
	}

	public String getEmpAsset() {
		return empAsset;
	}

	public void setEmpAsset(String empAsset) {
		this.empAsset = empAsset;
	}

	@Override
	public int compareTo(Employee o) {
        return (this.getEmpId() - o.getEmpId());
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAssetId=" + empAssetId + ", empAsset="
				+ empAsset + "]";
	}

	


}
