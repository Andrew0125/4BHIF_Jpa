package at.spenger.deu14423.jpa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the r_ratings database table.
 * 
 */
@Entity
@Table(name="r_ratings")
@NamedQuery(name="RRating.findAll", query="SELECT r FROM RRating r")
public class RRating implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="m_manga")
	private int mManga;

	private BigDecimal anspruchsvoll;

	private BigDecimal antagonist;

	private BigDecimal artBackground;

	private BigDecimal artCharacter;

	private BigDecimal artDetails;

	private BigDecimal artOverall;

	private BigDecimal characterExpression;

	private BigDecimal characterInteraction;

	private BigDecimal comedicMoments;

	private Timestamp createdDate;

	private BigDecimal design;

	private BigDecimal drama;

	private BigDecimal enjoyment;

	private BigDecimal extravaganz;

	private BigDecimal fangirly;

	private BigDecimal mainCharacter;

	private BigDecimal memorability;

	private Timestamp modifiedDate;

	private BigDecimal pacing;

	private BigDecimal paneling;

	private BigDecimal sideCharacter;

	private BigDecimal storyEnding;

	private BigDecimal storyOverall;

	private BigDecimal storyPremise;

	//bi-directional one-to-one association to MManga
	@OneToOne
	@JoinColumn(name="m_manga")
	private MManga MManga;

	public RRating() {
	}

	public int getMMangaID() {
		return this.mManga;
	}

	public void setMManga(int mManga) {
		this.mManga = mManga;
	}

	public BigDecimal getAnspruchsvoll() {
		return this.anspruchsvoll;
	}

	public void setAnspruchsvoll(BigDecimal anspruchsvoll) {
		this.anspruchsvoll = anspruchsvoll;
	}

	public BigDecimal getAntagonist() {
		return this.antagonist;
	}

	public void setAntagonist(BigDecimal antagonist) {
		this.antagonist = antagonist;
	}

	public BigDecimal getArtBackground() {
		return this.artBackground;
	}

	public void setArtBackground(BigDecimal artBackground) {
		this.artBackground = artBackground;
	}

	public BigDecimal getArtCharacter() {
		return this.artCharacter;
	}

	public void setArtCharacter(BigDecimal artCharacter) {
		this.artCharacter = artCharacter;
	}

	public BigDecimal getArtDetails() {
		return this.artDetails;
	}

	public void setArtDetails(BigDecimal artDetails) {
		this.artDetails = artDetails;
	}

	public BigDecimal getArtOverall() {
		return this.artOverall;
	}

	public void setArtOverall(BigDecimal artOverall) {
		this.artOverall = artOverall;
	}

	public BigDecimal getCharacterExpression() {
		return this.characterExpression;
	}

	public void setCharacterExpression(BigDecimal characterExpression) {
		this.characterExpression = characterExpression;
	}

	public BigDecimal getCharacterInteraction() {
		return this.characterInteraction;
	}

	public void setCharacterInteraction(BigDecimal characterInteraction) {
		this.characterInteraction = characterInteraction;
	}

	public BigDecimal getComedicMoments() {
		return this.comedicMoments;
	}

	public void setComedicMoments(BigDecimal comedicMoments) {
		this.comedicMoments = comedicMoments;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public BigDecimal getDesign() {
		return this.design;
	}

	public void setDesign(BigDecimal design) {
		this.design = design;
	}

	public BigDecimal getDrama() {
		return this.drama;
	}

	public void setDrama(BigDecimal drama) {
		this.drama = drama;
	}

	public BigDecimal getEnjoyment() {
		return this.enjoyment;
	}

	public void setEnjoyment(BigDecimal enjoyment) {
		this.enjoyment = enjoyment;
	}

	public BigDecimal getExtravaganz() {
		return this.extravaganz;
	}

	public void setExtravaganz(BigDecimal extravaganz) {
		this.extravaganz = extravaganz;
	}

	public BigDecimal getFangirly() {
		return this.fangirly;
	}

	public void setFangirly(BigDecimal fangirly) {
		this.fangirly = fangirly;
	}

	public BigDecimal getMainCharacter() {
		return this.mainCharacter;
	}

	public void setMainCharacter(BigDecimal mainCharacter) {
		this.mainCharacter = mainCharacter;
	}

	public BigDecimal getMemorability() {
		return this.memorability;
	}

	public void setMemorability(BigDecimal memorability) {
		this.memorability = memorability;
	}

	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public BigDecimal getPacing() {
		return this.pacing;
	}

	public void setPacing(BigDecimal pacing) {
		this.pacing = pacing;
	}

	public BigDecimal getPaneling() {
		return this.paneling;
	}

	public void setPaneling(BigDecimal paneling) {
		this.paneling = paneling;
	}

	public BigDecimal getSideCharacter() {
		return this.sideCharacter;
	}

	public void setSideCharacter(BigDecimal sideCharacter) {
		this.sideCharacter = sideCharacter;
	}

	public BigDecimal getStoryEnding() {
		return this.storyEnding;
	}

	public void setStoryEnding(BigDecimal storyEnding) {
		this.storyEnding = storyEnding;
	}

	public BigDecimal getStoryOverall() {
		return this.storyOverall;
	}

	public void setStoryOverall(BigDecimal storyOverall) {
		this.storyOverall = storyOverall;
	}

	public BigDecimal getStoryPremise() {
		return this.storyPremise;
	}

	public void setStoryPremise(BigDecimal storyPremise) {
		this.storyPremise = storyPremise;
	}

	public MManga getMManga() {
		return this.MManga;
	}

	public void setMManga(MManga MManga) {
		this.MManga = MManga;
	}

}