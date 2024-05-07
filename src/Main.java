import java.util.ArrayList;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    ArrayList<Movie> movies = new ArrayList<>();
    System.out.println(movies.isEmpty());
    System.out.println(movies.size());

    movies.add(new Movie("Movie 1", 2023, "Fantasy", 8));
    movies.add(new Movie("Movie 2", 2022, "Fiction", 9));
    movies.add(new Movie("Movie 3", 2021, "Horror", 10));

    System.out.println(movies.size());
    for (Movie temp : movies)
      System.out.println(temp);

    System.out.println("After removing");
    movies.remove(1);
    for (Movie temp : movies){
      System.out.println(temp);
  }
    System.out.println("After updating:");
    movies.set(0, new Movie("Zero Movie", 2000, "Happy", 7));
    for(Movie temp: movies)
      System.out.println(temp);



    System.out.println("After incrementing");

    for (Movie temp : movies) {
      temp.setRating(temp.getRating() + 1);
      System.out.println(temp);
    }

  }
}