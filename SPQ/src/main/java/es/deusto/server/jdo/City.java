package es.deusto.server.jdo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.jdo.annotations.Join;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable

public class City implements Serializable {

	/**
	 * User implements Serializable to be transferred to the RMI client
	 */
	private static final long serialVersionUID = 1L;
	@PrimaryKey
<<<<<<< HEAD
	String nameCity = "";
	String codPostal = "";
=======
	String nameCity = null;
	String codP = null;
	String codPostal = null;
	Province province = null;
>>>>>>> branch 'master' of https://github.com/jb25/spq

	@Persistent(mappedBy = "city", dependentElement = "true")
	@Join
	List<Restaurant> restaurants = new ArrayList<Restaurant>();

<<<<<<< HEAD
	public City(){}
	public City( String nameCity, String codPostal, List<Restaurant> restaurants) {
=======
	public City(String nameCity, String codP, String codPostal, List<Restaurant> restaurants) {
>>>>>>> branch 'master' of https://github.com/jb25/spq
		super();
		this.nameCity = nameCity;
		this.codPostal = codPostal;
		this.restaurants = restaurants;
	}

	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "";
=======
		return "City [nameCity=" + nameCity + ", codP=" + codP + ", codPostal=" + codPostal + ", restaurants="
				+ restaurants + "]";
>>>>>>> branch 'master' of https://github.com/jb25/spq
	}

}
