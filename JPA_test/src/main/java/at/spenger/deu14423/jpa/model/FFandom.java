package at.spenger.deu14423.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the f_fandoms database table.
 * 
 */
@Entity
@Table(name="f_fandoms")
@NamedQuery(name="FFandom.findAll", query="SELECT f FROM FFandom f")
public class FFandom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private Timestamp createdDate;

	private Timestamp modifiedDate;

	private String name;

	//bi-directional many-to-one association to DDoujinshi
	@OneToMany(mappedBy="FFandom")
	private List<DDoujinshi> DDoujinshis;

	public FFandom() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
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

	public List<DDoujinshi> getDDoujinshis() {
		return this.DDoujinshis;
	}

	public void setDDoujinshis(List<DDoujinshi> DDoujinshis) {
		this.DDoujinshis = DDoujinshis;
	}

	public DDoujinshi addDDoujinshi(DDoujinshi DDoujinshi) {
		getDDoujinshis().add(DDoujinshi);
		DDoujinshi.setFFandom(this);

		return DDoujinshi;
	}

	public DDoujinshi removeDDoujinshi(DDoujinshi DDoujinshi) {
		getDDoujinshis().remove(DDoujinshi);
		DDoujinshi.setFFandom(null);

		return DDoujinshi;
	}

}