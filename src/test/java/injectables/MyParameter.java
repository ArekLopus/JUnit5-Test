package injectables;

public class MyParameter {
	
	private String info;
	private String anotherInfo;
	
	public MyParameter() {}
	
	public MyParameter(String info, String anotherInfo) {
		super();
		this.info = info;
		this.anotherInfo = anotherInfo;
	}
	

	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getAnotherInfo() {
		return anotherInfo;
	}
	public void setAnotherInfo(String anotherInfo) {
		this.anotherInfo = anotherInfo;
	}
	
	
}