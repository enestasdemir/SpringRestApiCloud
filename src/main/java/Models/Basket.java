package Models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the basket database table.
 * 
 */
@Entity
@NamedQuery(name="Basket.findAll", query="SELECT b FROM Basket b")
public class Basket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int basketid;

	private int baskerproductcount;

	private int basketcustomerid;

	@Temporal(TemporalType.TIMESTAMP)
	private Date basketdate;

	private int basketproductcount;

	private int basketproductid;

	public Basket() {
	}

	public int getBasketid() {
		return this.basketid;
	}

	public void setBasketid(int basketid) {
		this.basketid = basketid;
	}

	public int getBaskerproductcount() {
		return this.baskerproductcount;
	}

	public void setBaskerproductcount(int baskerproductcount) {
		this.baskerproductcount = baskerproductcount;
	}

	public int getBasketcustomerid() {
		return this.basketcustomerid;
	}

	public void setBasketcustomerid(int basketcustomerid) {
		this.basketcustomerid = basketcustomerid;
	}

	public Date getBasketdate() {
		return this.basketdate;
	}

	public void setBasketdate(Date basketdate) {
		this.basketdate = basketdate;
	}

	public int getBasketproductcount() {
		return this.basketproductcount;
	}

	public void setBasketproductcount(int basketproductcount) {
		this.basketproductcount = basketproductcount;
	}

	public int getBasketproductid() {
		return this.basketproductid;
	}

	public void setBasketproductid(int basketproductid) {
		this.basketproductid = basketproductid;
	}

}