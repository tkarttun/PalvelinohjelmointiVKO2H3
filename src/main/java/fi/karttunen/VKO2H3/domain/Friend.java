package fi.karttunen.VKO2H3.domain;

public class Friend {
	private String name;

	public Friend(String name) {
		super();
		this.name = name;
	}

	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}
}