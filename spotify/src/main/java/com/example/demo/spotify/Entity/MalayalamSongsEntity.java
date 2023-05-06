package com.example.demo.spotify.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mallusong")
public class MalluSongEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	public MalluSongEntity(int id, String songname, String artistname, String moviename, String singername,
			String lyricist) {
		super();
		this.id = id;
		this.songname = songname;
		this.artistname = artistname;
		this.moviename = moviename;
		this.singername = singername;
		this.lyricist = lyricist;
	}
	public MalluSongEntity() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongname() {
		return songname;
	}
	public void setSongname(String songname) {
		this.songname = songname;
	}
	public String getArtistname() {
		return artistname;
	}
	public void setArtistname(String artistname) {
		this.artistname = artistname;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getSingername() {
		return singername;
	}
	public void setSingername(String singername) {
		this.singername = singername;
	}
	public String getLyricist() {
		return lyricist;
	}
	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}
	@Column(name="songname")
	private String songname;
	@Column(name="artistname")
	private String artistname;
	@Column(name="moviename")
	private String moviename;
	@Column(name="singername")
	private String singername;
	@Column(name="lyricist")
	private String lyricist;
}