package com.example.demo.spotify.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="homepage")
public class HomePageEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	public HomePageEntity(int id, String language, String favorites, String recentlyplayed, String hits,
			String bestof_artist) {
		super();
		this.id = id;
		this.language = language;
		this.favorites = favorites;
		this.recentlyplayed = recentlyplayed;
		this.hits = hits;
		this.bestof_artist = bestof_artist;
	}
	public HomePageEntity() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getFavorites() {
		return favorites;
	}
	public void setFavorites(String favorites) {
		this.favorites = favorites;
	}
	public String getRecentlyplayed() {
		return recentlyplayed;
	}
	public void setRecentlyplayed(String recentlyplayed) {
		this.recentlyplayed = recentlyplayed;
	}
	public String getHits() {
		return hits;
	}
	public void setHits(String hits) {
		this.hits = hits;
	}
	public String getBestof_artist() {
		return bestof_artist;
	}
	public void setBestof_artist(String bestof_artist) {
		this.bestof_artist = bestof_artist;
	}
	@Column(name="language")
	private String language;
	@Column(name="favorites")
	private String favorites;
	@Column(name="recentlyplayed")
	private String recentlyplayed;
	@Column(name="hits")
	private String hits;
	@Column(name="bestof_artist")
	private String bestof_artist;

	
}
