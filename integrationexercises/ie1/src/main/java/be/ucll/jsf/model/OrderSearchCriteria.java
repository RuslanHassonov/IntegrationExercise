package be.ucll.jsf.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.math.BigDecimal;

@ManagedBean
@SessionScoped
public class OrderSearchCriteria implements Serializable {

	private static final long serialVersionUID = 1L;

	private BigDecimal minAmount;
	private BigDecimal maxAmount;
	private Integer numberOfProducts;
	private Boolean delivered;
	private String productName;
	private String email;

	public boolean hasPriceRange() {
		return minAmount != null || maxAmount != null;
	}

	public boolean isWithinRange(BigDecimal price) {
		boolean inRange = true;

		if ((minAmount != null ? price.compareTo(minAmount) : 1) < 0) {
			inRange = false;
		}
		if ((maxAmount != null ? price.compareTo(maxAmount) : -1) > 0) {
			inRange = false;
		}
		return inRange;
	}

	public void clear(){
		minAmount = null;
		maxAmount = null;
		numberOfProducts = null;
		delivered = null;
		productName = null;
		email = null;
	}

	public BigDecimal getMinAmount() {
		return minAmount;
	}

	public void setMinAmount(BigDecimal minAmount) {
		this.minAmount = minAmount;
	}

	public BigDecimal getMaxAmount() {
		return maxAmount;
	}

	public void setMaxAmount(BigDecimal maxAmount) {
		this.maxAmount = maxAmount;
	}

	public Integer getNumberOfProducts() {
		return numberOfProducts;
	}

	public void setNumberOfProducts(Integer numberOfProducts) {
		this.numberOfProducts = numberOfProducts;
	}

	public Boolean getDelivered() {
		return delivered;
	}

	public void setDelivered(Boolean delivered) {
		this.delivered = delivered;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
