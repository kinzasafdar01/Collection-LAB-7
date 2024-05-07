public class Movie {
    String Title;
    int year;
    String Genre;
    int Rating;


    public Movie(String Title, int year, String Genre, int Rating) {
        this.Title = Title;
        this.year = year;
        this.Genre = Genre;
        this.Rating = Rating;
    }

    public void setTitle(String title) {
        Title = title;
    }
    public String getTitle(){
        return Title;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }
    public String getGenre(){
        return Genre;

    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }
    public int getRating(){
        return Rating;
    }

    @Override
    public String toString() {
        return String.format("Title: %s | Year:%d | Genre:%s | Rating:%d |", Title, year, Genre, Rating);

    }
    @Override
    public boolean equals(Object o){
        Movie temp=(Movie) o;
        return temp.Title.equals(this.Title) && temp.year==this.year && temp.Genre.equals(this.Genre) && temp.Rating==this.Rating;
    }
}
