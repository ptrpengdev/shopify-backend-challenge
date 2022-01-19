package shopify.challenge.shengwei.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Entity
@Table(name = "inventory", uniqueConstraints = {
		@UniqueConstraint(name = "UniqueProdNameAndLocation", columnNames = { "product_name", "location" }) })
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull
	@Column(name = "product_name")
	private String prodName;

	@NotNull
	@Column(name = "product_type")
	private String prodType;

	@Column(name = "description")
	private String prodDesc;

	@NotNull
	@JoinColumn(name = "location")
	@ManyToOne
	private Location location;

	@Column(name = "quantity")
	@Min(value = 0, message = "Value should be in 0 to 99999")
	@Max(value = 99999, message = "Value should be in 0 to 99999")
	@PositiveOrZero
	private Integer quantity;

	@Column(name = "updated_dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDt;

	@Column(name = "created_dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDt;

	public Inventory() {
		super();
	}

	public Inventory(@NotNull String prodName, @NotNull String prodType, String prodDesc, @NotNull Location location,
			@Size(min = 0, max = 99999) Integer quantity, Date updateDt, @NotNull Date createdDt) {
		super();
		this.prodName = prodName;
		this.prodType = prodType;
		this.prodDesc = prodDesc;
		this.location = location;
		this.quantity = quantity;
		this.updateDt = updateDt;
		this.createdDt = createdDt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdType() {
		return prodType;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}

	public Date getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

}
