package maiko26.movieapi;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
public class Movie {

    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviews;

    public Movie(String imdbId, String title, String releaseDate, String trailerLink, String poster, List<String> backdrops, List<String> genres) {
        this.imdbId = imdbId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.backdrops = backdrops;
        this.genres = genres;
    }

    public Movie(ObjectId id, String imdbId, String title, String releaseDate, String trailerLink, String poster, List<String> genres, List<String> backdrops, List<Review> reviews) {
        this.id = id;
        this.imdbId = imdbId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.genres = genres;
        this.backdrops = backdrops;
        this.reviews = reviews;
    }

    public Movie() {
    }

    public ObjectId getId() {
        return this.id;
    }

    public String getImdbId() {
        return this.imdbId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getReleaseDate() {
        return this.releaseDate;
    }

    public String getTrailerLink() {
        return this.trailerLink;
    }

    public String getPoster() {
        return this.poster;
    }

    public List<String> getGenres() {
        return this.genres;
    }

    public List<String> getBackdrops() {
        return this.backdrops;
    }

    public List<Review> getReviews() {
        return this.reviews;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public void setBackdrops(List<String> backdrops) {
        this.backdrops = backdrops;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Movie)) return false;
        final Movie other = (Movie) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$imdbId = this.getImdbId();
        final Object other$imdbId = other.getImdbId();
        if (this$imdbId == null ? other$imdbId != null : !this$imdbId.equals(other$imdbId)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$releaseDate = this.getReleaseDate();
        final Object other$releaseDate = other.getReleaseDate();
        if (this$releaseDate == null ? other$releaseDate != null : !this$releaseDate.equals(other$releaseDate))
            return false;
        final Object this$trailerLink = this.getTrailerLink();
        final Object other$trailerLink = other.getTrailerLink();
        if (this$trailerLink == null ? other$trailerLink != null : !this$trailerLink.equals(other$trailerLink))
            return false;
        final Object this$poster = this.getPoster();
        final Object other$poster = other.getPoster();
        if (this$poster == null ? other$poster != null : !this$poster.equals(other$poster)) return false;
        final Object this$genres = this.getGenres();
        final Object other$genres = other.getGenres();
        if (this$genres == null ? other$genres != null : !this$genres.equals(other$genres)) return false;
        final Object this$backdrops = this.getBackdrops();
        final Object other$backdrops = other.getBackdrops();
        if (this$backdrops == null ? other$backdrops != null : !this$backdrops.equals(other$backdrops)) return false;
        final Object this$reviews = this.getReviews();
        final Object other$reviews = other.getReviews();
        if (this$reviews == null ? other$reviews != null : !this$reviews.equals(other$reviews)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Movie;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $imdbId = this.getImdbId();
        result = result * PRIME + ($imdbId == null ? 43 : $imdbId.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $releaseDate = this.getReleaseDate();
        result = result * PRIME + ($releaseDate == null ? 43 : $releaseDate.hashCode());
        final Object $trailerLink = this.getTrailerLink();
        result = result * PRIME + ($trailerLink == null ? 43 : $trailerLink.hashCode());
        final Object $poster = this.getPoster();
        result = result * PRIME + ($poster == null ? 43 : $poster.hashCode());
        final Object $genres = this.getGenres();
        result = result * PRIME + ($genres == null ? 43 : $genres.hashCode());
        final Object $backdrops = this.getBackdrops();
        result = result * PRIME + ($backdrops == null ? 43 : $backdrops.hashCode());
        final Object $reviews = this.getReviews();
        result = result * PRIME + ($reviews == null ? 43 : $reviews.hashCode());
        return result;
    }

    public String toString() {
        return "Movie(id=" + this.getId() + ", imdbId=" + this.getImdbId() + ", title=" + this.getTitle() + ", releaseDate=" + this.getReleaseDate() + ", trailerLink=" + this.getTrailerLink() + ", poster=" + this.getPoster() + ", genres=" + this.getGenres() + ", backdrops=" + this.getBackdrops() + ", reviews=" + this.getReviews() + ")";
    }
}
