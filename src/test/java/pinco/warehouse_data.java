package pinco;

import java.time.OffsetDateTime;
import java.util.List;

public class warehouse_data {
	private String _id;
	private String pincode;
	private Expressbeess Expressbees;
	
	public Expressbeess getExpressbees() {
		return Expressbees;
	}

	public void setExpressbees(Expressbeess expressbees) {
		Expressbees = expressbees;
	}
	private OffsetDateTime created_at;
	private OffsetDateTime updated_at;
	private Long delivery_charge;
	private Boolean enabled;
	private List<payment_methods> paymentmethods;
	private long return_charge;
	private warehouse warehouse;
	private DTDC DTDC;
	private Selloship Selloship;
	private long codCharge;
	private String minimum_order_value;
	private String handling_charge;
	public DTDC getDTDC() {
		return DTDC;
	}

	public void setDTDC(DTDC dTDC) {
		DTDC = dTDC;
	}



	



	public String getMinimum_order_value() {
		return minimum_order_value;
	}

	public void setMinimum_order_value(String minimum_order_value) {
		this.minimum_order_value = minimum_order_value;
	}


	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}





	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public OffsetDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(OffsetDateTime created_at) {
		this.created_at = created_at;
	}

	public OffsetDateTime getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(OffsetDateTime updated_at) {
		this.updated_at = updated_at;
	}

	public Long getDelivery_charge() {
		return delivery_charge;
	}

	public void setDelivery_charge(Long delivery_charge) {
		this.delivery_charge = delivery_charge;
	}

	public List<payment_methods> getPaymentmethods() {
		return paymentmethods;
	}

	public void setPaymentmethods(List<payment_methods> paymentmethods) {
		this.paymentmethods = paymentmethods;
	}

	public warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(warehouse warehouse) {
		this.warehouse = warehouse;
	}

	

	public long getReturn_charge() {
		return return_charge;
	}

	public void setReturn_charge(long return_charge) {
		this.return_charge = return_charge;
	}

	public String getHandling_charge() {
		return handling_charge;
	}

	public void setHandling_charge(String handling_charge) {
		this.handling_charge = handling_charge;
	}

	public Selloship getSelloship() {
		return Selloship;
	}

	public void setSelloship(Selloship selloship) {
		Selloship = selloship;
	}

	public long getCodCharge() {
		return codCharge;
	}

	public void setCodCharge(long codCharge) {
		this.codCharge = codCharge;
	}

	/*
	 * private Dtdc Expressbees;
	 * 
	 * 
	 * 
	 * 
	 * private warehouse warehouse;
	 * 
	 * private Dtdc dtdc;
	 * 
	 * 
	 * 
	 * private String minimum_order_value;
	 */

}
