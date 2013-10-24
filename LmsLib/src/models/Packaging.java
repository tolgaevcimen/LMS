package models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
@Entity
@Table(name="Packaging")
public class Packaging implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int Id;
	@ManyToOne
	@JoinColumn(name="basketid")
	@Cascade({CascadeType.SAVE_UPDATE})
	private Basket Basket;
	private Date StartTime;
	private Date EndTime;
	public Packaging(){}
	public Packaging(models.Basket basket, Date startTime, Date endTime) {
		Basket = basket;
		StartTime = startTime;
		EndTime = endTime;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getId() {
		return Id;
	}
	public Basket getBasket() {
		return Basket;
	}
	public void setBasket(Basket basket) {
		Basket = basket;
	}
	public Date getStartTime() {
		return StartTime;
	}
	public void setStartTime(Date startTime) {
		StartTime = startTime;
	}
	public Date getEndTime() {
		return EndTime;
	}
	public void setEndTime(Date endTime) {
		EndTime = endTime;
	}
}
