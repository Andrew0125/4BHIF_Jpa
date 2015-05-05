package at.spenger.deu14423.jpa.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the m_mangas database table.
 * 
 */
@Entity
@Table(name="m_mangas")
@NamedQuery(name="MManga.findAll", query="SELECT m FROM MManga m")
public class MManga implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String abgespeichert;

	private String alternativTitel;

	@Column(name="baka_id")
	private Integer bakaId;

	@Column(name="baka_watch")
	private Byte bakaWatch;

	private String beschreibung;

	private Integer chapters;

	private Integer chaptersGescannt;

	private Byte covers;

	private Timestamp createdDate;

	private Byte empfehlenswert;

	private Integer erscheinungsjahr;

	private Byte fangirly;

	private String gelesen;

	@Column(name="habe_scanlation")
	private Byte habeScanlation;

	@Column(name="hauptperson_geschlecht")
	private String hauptpersonGeschlecht;

	private Byte inEcht;

	private String kommentar;

	private String lesestatus;

	@Column(name="letztes_scanlationdatum")
	private Timestamp letztesScanlationdatum;

	@Column(name="madokami_watch")
	private Byte madokamiWatch;

	private Timestamp modifiedDate;

	@Column(name="ordentlich_benannt")
	private Byte ordentlichBenannt;

	private Byte raw;

	@Column(name="scanlation_komplett")
	private Byte scanlationKomplett;

	private String titel;

	private Integer volumes;

	//bi-directional one-to-one association to DDoujinshi
	@OneToOne(mappedBy="MManga")
	private DDoujinshi DDoujinshi;

	//bi-directional many-to-one association to LLesetage
	@OneToMany(mappedBy="MManga")
	private List<LLesetage> LLesetages;

	//bi-directional many-to-many association to GGenre
	@ManyToMany
	@JoinTable(
		name="m_g_mangas_have_genres"
		, joinColumns={
			@JoinColumn(name="m_manga")
			}
		, inverseJoinColumns={
			@JoinColumn(name="g_genre")
			}
		)
	private List<GGenre> GGenres;

	//bi-directional many-to-one association to AArtist
	@ManyToOne
	@JoinColumn(name="a_zeichner")
	private AArtist AArtist1;

	//bi-directional many-to-one association to AArtist
	@ManyToOne
	@JoinColumn(name="a_autor")
	private AArtist AArtist2;

	//bi-directional many-to-one association to DDemographic
	@ManyToOne
	@JoinColumn(name="d_demographic")
	private DDemographic DDemographic;

	//bi-directional many-to-one association to KbKurzbeschreibung
	@ManyToOne
	@JoinColumn(name="kb_kurzbeschreibung")
	private KbKurzbeschreibung kbKurzbeschreibungBean;

	//bi-directional many-to-one association to Ss_scanlationStatus
	@ManyToOne
	@JoinColumn(name="ss_scanlationStatus")
	private Ss_scanlationStatus ssScanlationStatus;

	//bi-directional many-to-many association to MgMagazine
	@ManyToMany
	@JoinTable(
		name="m_mg_mangas_have_magazines"
		, joinColumns={
			@JoinColumn(name="m_manga")
			}
		, inverseJoinColumns={
			@JoinColumn(name="mg_magazine")
			}
		)
	private List<MgMagazine> mgMagazines;

	//bi-directional many-to-many association to Sg_scanlationGroup
	@ManyToMany(mappedBy="MMangas")
	private List<Sg_scanlationGroup> sgScanlationGroups;

	//bi-directional many-to-many association to TTag
	@ManyToMany(mappedBy="MMangas")
	private List<TTag> TTags;

	//bi-directional one-to-one association to RRating
	@OneToOne(mappedBy="MManga")
	private RRating RRating;

	public MManga() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAbgespeichert() {
		return this.abgespeichert;
	}

	public void setAbgespeichert(String abgespeichert) {
		this.abgespeichert = abgespeichert;
	}

	public String getAlternativTitel() {
		return this.alternativTitel;
	}

	public void setAlternativTitel(String alternativTitel) {
		this.alternativTitel = alternativTitel;
	}

	public Integer getBakaId() {
		return this.bakaId;
	}

	public void setBakaId(int bakaId) {
		this.bakaId = bakaId;
	}

	public Byte getBakaWatch() {
		return this.bakaWatch;
	}

	public void setBakaWatch(byte bakaWatch) {
		this.bakaWatch = bakaWatch;
	}

	public String getBeschreibung() {
		return this.beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public Integer getChapters() {
		return this.chapters;
	}

	public void setChapters(int chapters) {
		this.chapters = chapters;
	}

	public Integer getChaptersGescannt() {
		return this.chaptersGescannt;
	}

	public void setChaptersGescannt(int chaptersGescannt) {
		this.chaptersGescannt = chaptersGescannt;
	}

	public Byte getCovers() {
		return this.covers;
	}

	public void setCovers(byte covers) {
		this.covers = covers;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Byte getEmpfehlenswert() {
		return this.empfehlenswert;
	}

	public void setEmpfehlenswert(byte empfehlenswert) {
		this.empfehlenswert = empfehlenswert;
	}

	public Integer getErscheinungsjahr() {
		return this.erscheinungsjahr;
	}

	public void setErscheinungsjahr(int erscheinungsjahr) {
		this.erscheinungsjahr = erscheinungsjahr;
	}

	public Byte getFangirly() {
		return this.fangirly;
	}

	public void setFangirly(byte fangirly) {
		this.fangirly = fangirly;
	}

	public String getGelesen() {
		return this.gelesen;
	}

	public void setGelesen(String gelesen) {
		this.gelesen = gelesen;
	}

	public Byte getHabeScanlation() {
		return this.habeScanlation;
	}

	public void setHabeScanlation(byte habeScanlation) {
		this.habeScanlation = habeScanlation;
	}

	public String getHauptpersonGeschlecht() {
		return this.hauptpersonGeschlecht;
	}

	public void setHauptpersonGeschlecht(String hauptpersonGeschlecht) {
		this.hauptpersonGeschlecht = hauptpersonGeschlecht;
	}

	public Byte getInEcht() {
		return this.inEcht;
	}

	public void setInEcht(byte inEcht) {
		this.inEcht = inEcht;
	}

	public String getKommentar() {
		return this.kommentar;
	}

	public void setKommentar(String kommentar) {
		this.kommentar = kommentar;
	}

	public String getLesestatus() {
		return this.lesestatus;
	}

	public void setLesestatus(String lesestatus) {
		this.lesestatus = lesestatus;
	}

	public Timestamp getLetztesScanlationdatum() {
		return this.letztesScanlationdatum;
	}

	public void setLetztesScanlationdatum(Timestamp letztesScanlationdatum) {
		this.letztesScanlationdatum = letztesScanlationdatum;
	}

	public Byte getMadokamiWatch() {
		return this.madokamiWatch;
	}

	public void setMadokamiWatch(byte madokamiWatch) {
		this.madokamiWatch = madokamiWatch;
	}

	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Byte getOrdentlichBenannt() {
		return this.ordentlichBenannt;
	}

	public void setOrdentlichBenannt(byte ordentlichBenannt) {
		this.ordentlichBenannt = ordentlichBenannt;
	}

	public Byte getRaw() {
		return this.raw;
	}

	public void setRaw(byte raw) {
		this.raw = raw;
	}

	public Byte getScanlationKomplett() {
		return this.scanlationKomplett;
	}

	public void setScanlationKomplett(byte scanlationKomplett) {
		this.scanlationKomplett = scanlationKomplett;
	}

	public String getTitel() {
		return this.titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public Integer getVolumes() {
		return this.volumes;
	}

	public void setVolumes(int volumes) {
		this.volumes = volumes;
	}

	public DDoujinshi getDDoujinshi() {
		return this.DDoujinshi;
	}

	public void setDDoujinshi(DDoujinshi DDoujinshi) {
		this.DDoujinshi = DDoujinshi;
	}

	public List<LLesetage> getLLesetages() {
		return this.LLesetages;
	}

	public void setLLesetages(List<LLesetage> LLesetages) {
		this.LLesetages = LLesetages;
	}

	public LLesetage addLLesetage(LLesetage LLesetage) {
		getLLesetages().add(LLesetage);
		LLesetage.setMManga(this);

		return LLesetage;
	}

	public LLesetage removeLLesetage(LLesetage LLesetage) {
		getLLesetages().remove(LLesetage);
		LLesetage.setMManga(null);

		return LLesetage;
	}

	public List<GGenre> getGGenres() {
		return this.GGenres;
	}

	public void setGGenres(List<GGenre> GGenres) {
		this.GGenres = GGenres;
	}

	public AArtist getAArtist1() {
		return this.AArtist1;
	}

	public void setAArtist1(AArtist AArtist1) {
		this.AArtist1 = AArtist1;
	}

	public AArtist getAArtist2() {
		return this.AArtist2;
	}

	public void setAArtist2(AArtist AArtist2) {
		this.AArtist2 = AArtist2;
	}

	public DDemographic getDDemographic() {
		return this.DDemographic;
	}

	public void setDDemographic(DDemographic DDemographic) {
		this.DDemographic = DDemographic;
	}

	public KbKurzbeschreibung getKbKurzbeschreibungBean() {
		return this.kbKurzbeschreibungBean;
	}

	public void setKbKurzbeschreibungBean(KbKurzbeschreibung kbKurzbeschreibungBean) {
		this.kbKurzbeschreibungBean = kbKurzbeschreibungBean;
	}

	public Ss_scanlationStatus getSsScanlationStatus() {
		return this.ssScanlationStatus;
	}

	public void setSsScanlationStatus(Ss_scanlationStatus ssScanlationStatus) {
		this.ssScanlationStatus = ssScanlationStatus;
	}

	public List<MgMagazine> getMgMagazines() {
		return this.mgMagazines;
	}

	public void setMgMagazines(List<MgMagazine> mgMagazines) {
		this.mgMagazines = mgMagazines;
	}

	public List<Sg_scanlationGroup> getSgScanlationGroups() {
		return this.sgScanlationGroups;
	}

	public void setSgScanlationGroups(List<Sg_scanlationGroup> sgScanlationGroups) {
		this.sgScanlationGroups = sgScanlationGroups;
	}

	public List<TTag> getTTags() {
		return this.TTags;
	}

	public void setTTags(List<TTag> TTags) {
		this.TTags = TTags;
	}

	public RRating getRRating() {
		return this.RRating;
	}

	public void setRRating(RRating RRating) {
		this.RRating = RRating;
	}

}