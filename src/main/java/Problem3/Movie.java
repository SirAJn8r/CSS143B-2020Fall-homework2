package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        this.rating = rating;
        this.title = title;
    }

    public Movie(Movie anotherMovie) {
        this.id = anotherMovie.id;
        this.rating = anotherMovie.rating;
        this.title = anotherMovie.title;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj.getClass() != this.getClass())
            return false;
        else
        {
            Movie movieObj = (Movie)(obj);
            if(movieObj.rating != this.rating || movieObj.title != this.title || movieObj.id != this.id)
                return false;
            else
                return true;
        }
    }
}
