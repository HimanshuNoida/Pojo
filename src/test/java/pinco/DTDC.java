package pinco;

public class DTDC {
	
	private String city;
	private String state;
	private Boolean cod_delivery;
	private Boolean prepaid_delivery;
	private Boolean pickup;
	private String tat;
	private String remark;
	private Double average;
	
	public Double getAverage() {
		return average;
	}
	public void setAverage(Double average) {
		this.average = average;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Boolean getCod_delivery() {
		return cod_delivery;
	}
	public void setCod_delivery(Boolean cod_delivery) {
		this.cod_delivery = cod_delivery;
	}
	public Boolean getPrepaid_delivery() {
		return prepaid_delivery;
	}
	public void setPrepaid_delivery(Boolean prepaid_delivery) {
		this.prepaid_delivery = prepaid_delivery;
	}
	public Boolean getPickup() {
		return pickup;
	}
	public void setPickup(Boolean pickup) {
		this.pickup = pickup;
	}
	public String getTat() {
		return tat;
	}
	public void setTat(String tat) {
		this.tat = tat;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
}
