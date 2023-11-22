package pinco;

import java.time.OffsetDateTime;
import java.util.List;

public class Data {

	public String getWarehouse_id() {
		return warehouse_id;
	}

	public void setWarehouse_id(String warehouse_id) {
		this.warehouse_id = warehouse_id;
	}

	public List<warehouse_data> getWarehouse_data() {
		return warehouse_data;
	}

	public void setWarehouse_data(List<warehouse_data> warehouse_data) {
		this.warehouse_data = warehouse_data;
	}

	private String warehouse_id;

	private List<warehouse_data> warehouse_data;
	
}
