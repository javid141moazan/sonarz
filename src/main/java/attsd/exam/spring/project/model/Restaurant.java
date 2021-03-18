package attsd.exam.spring.project.model;


import java.math.BigInteger;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Restaurant {
	
	@Id @GeneratedValue
	private BigInteger id;
	private String name;
	private int averagePrice;
	
	public Restaurant() {
	}

	public Restaurant(BigInteger id, String name, int averagePrice) {
		this.id = id;
		this.name = name;
		this.averagePrice = averagePrice;
	}

	public BigInteger getId() {
			return id;
	}

	public String getName() {
		return name;
	}

	public int getAveragePrice() {
		return averagePrice;
	}
	
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", averagePrice=" + averagePrice + "]";
	}

	
}
