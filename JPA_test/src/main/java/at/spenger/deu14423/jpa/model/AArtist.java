package at.spenger.deu14423.jpa.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the a_artists database table.
 * 
 */
@Entity
@Table(name="a_artists")
@NamedQuery(name="AArtist.findAll", query="SELECT a FROM AArtist a")
public class AArtist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	
	private Integer bakaID;

	private String circle;

	private Timestamp createdDate;

	private Byte fan;

	private String homepage;

	private Timestamp modifiedDate;

	private String name;

	private String pixiv;

	private String tumblr;

	private String twitter;

	//bi-directional many-to-one association to MManga
	@OneToMany(mappedBy="AArtist1")
	private List<MManga> MMangas1;

	//bi-directional many-to-one association to MManga
	@OneToMany(mappedBy="AArtist2")
	private List<MManga> MMangas2;

	public AArtist() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getBakaID() {
		return this.bakaID;
	}

	public void setBakaID(Integer bakaID) {
		this.bakaID = bakaID;
	}

	public String getCircle() {
		return this.circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public byte getFan() {
		return this.fan;
	}

	public void setFan(byte fan) {
		this.fan = fan;
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

	public String getPixiv() {
		return this.pixiv;
	}

	public void setPixiv(String pixiv) {
		this.pixiv = pixiv;
	}

	public String getTumblr() {
		return this.tumblr;
	}

	public void setTumblr(String tumblr) {
		this.tumblr = tumblr;
	}

	public String getTwitter() {
		return this.twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public List<MManga> getMMangas1() {
		return this.MMangas1;
	}

	public void setMMangas1(List<MManga> MMangas1) {
		this.MMangas1 = MMangas1;
	}

	public MManga addMMangas1(MManga MMangas1) {
		getMMangas1().add(MMangas1);
		MMangas1.setAArtist1(this);

		return MMangas1;
	}

	public MManga removeMMangas1(MManga MMangas1) {
		getMMangas1().remove(MMangas1);
		MMangas1.setAArtist1(null);

		return MMangas1;
	}

	public List<MManga> getMMangas2() {
		return this.MMangas2;
	}

	public void setMMangas2(List<MManga> MMangas2) {
		this.MMangas2 = MMangas2;
	}

	public MManga addMMangas2(MManga MMangas2) {
		getMMangas2().add(MMangas2);
		MMangas2.setAArtist2(this);

		return MMangas2;
	}

	public MManga removeMMangas2(MManga MMangas2) {
		getMMangas2().remove(MMangas2);
		MMangas2.setAArtist2(null);

		return MMangas2;
	}

	@Override
	public String toString()
	{
		return "AArtist [id=" + id + ", bakaID=" + bakaID + ", circle=" + circle + ", createdDate=" + createdDate
				+ ", fan=" + fan + ", homepage=" + homepage + ", modifiedDate=" + modifiedDate + ", name=" + name
				+ ", pixiv=" + pixiv + ", tumblr=" + tumblr + ", twitter=" + twitter + "]";
	}
}