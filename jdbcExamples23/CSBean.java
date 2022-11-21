package mysql._00_util.model;

import java.io.Serializable;

public class CSBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CoffeeBean cb = new CoffeeBean();
	SupplierBean sb = new SupplierBean();

	public CSBean(CoffeeBean cb, SupplierBean sb) {
		super();
		this.cb = cb;
		this.sb = sb;
	}

	public CSBean() {
		super();
	}

	public CoffeeBean getCb() {
		return cb;
	}

	public void setCb(CoffeeBean cb) {
		this.cb = cb;
	}

	public SupplierBean getSb() {
		return sb;
	}

	public void setSb(SupplierBean sb) {
		this.sb = sb;
	}

}
