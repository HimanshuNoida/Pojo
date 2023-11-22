package fake_practising_Api;

import java.util.List;

public class DataDetails {

	private String status;
	private List<data> data;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<data> getData() {
		return data;
	}

	public void setData(List<data> data) {
		this.data = data;
	}

}
