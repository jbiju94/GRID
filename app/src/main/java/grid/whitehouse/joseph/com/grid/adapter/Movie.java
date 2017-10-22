package grid.whitehouse.joseph.com.grid.adapter;

/**
 * Created by I328228 on 10/19/2017.
 */

public class Movie {
    private String name;
    private String category;
    private float rating;
    private int thumbnail;

    public Movie() {

    }

    public Movie(String name, String category, float rating, int thumbnail) {
        this.name = name;
        this.category = category;
        this.rating = rating;
        this.thumbnail = thumbnail;
    }

    //========== GETTERS ====================
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public float getRating() {
        return rating;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    //=========== SETTERS ====================
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
