package pojo;

import agent.MusicProvider.Genre;

public class Song {

  private final String artist;
  private final String name;
  private final Float avgRating;
  private final float price;
  private final Genre genre;
  
  public Song(String artist, String name, Genre genre, Float avgRating, float price) {
    super();
    this.artist = artist;
    this.name = name;
    this.genre = genre;
    this.avgRating = avgRating == null ? new Float(3) : avgRating;
    this.price = price;
  }
  
  public String getArtist() {
    return this.artist;
  }
  public String getName() {
    return this.name;
  }
  public Float getAvgRating() {
    return this.avgRating;
  }
  public float getPrice() {
    return this.price;
  }
  public Genre getGenre() {
    return this.genre;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.artist == null) ? 0 : this.artist.hashCode());
    result = prime * result + ((this.genre == null) ? 0 : this.genre.hashCode());
    result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
    result = prime * result + Float.floatToIntBits(this.price);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Song other = (Song) obj;
    if (this.artist == null) {
      if (other.artist != null) {
        return false;
      }
    } else if (!this.artist.equals(other.artist)) {
      return false;
    }
    if (this.genre != other.genre) {
      return false;
    }
    if (this.name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!this.name.equals(other.name)) {
      return false;
    }
    if (Float.floatToIntBits(this.price) != Float.floatToIntBits(other.price)) {
      return false;
    }
    return true;
  }

  
}
