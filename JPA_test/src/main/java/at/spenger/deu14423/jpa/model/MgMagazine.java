package at.spenger.deu14423.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the mg_magazines database table.
 * 
 */
@Entity
@Table(name="mg_magazines")
@NamedQuery(name="MgMagazine.findAll", query="SELECT m FROM MgMagazine m")
public class MgMagazine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="baka_id")
	private int bakaId;

	private Timestamp createdDate;

	private String homepage;

	private Timestamp modifiedDate;

	private String name;

	private String publisher;

	//bi-directional many-to-many association to MManga
	@ManyToMany(mappedBy="mgMagazines")
	private List<MManga> MMangas;

	public MgMagazine() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBakaId() {
		return this.bakaId;
	}

	public void setBakaId(int bakaId) {
		this.bakaId = bakaId;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getHomepage() {
		return this.homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public List<MManga> getMMangas() {
		return this.MMangas;
	}

	public void setMMangas(List<MManga> MMangas) {
		this.MMangas = MMangas;
	}

}