import java.util.Collection;

// Maintains a network of movies and customers
// All methods should return an empty collection, -1, or null on failure, as appropriate
public interface SocialMovies {

    // Defines a movie ID to title mapping in the system
    void addMovie(int movieId, String title);

    // Returns the title of the given movie
    String lookupMovie(int movieId);

    // Defines a customer ID to name mapping in the system
    void addCustomer(int customerId, String name);

    // Returns the name of the given customer
    String lookupCustomer(int customerId);


    // Record that a movie was "liked" by the given customer
    void addLikedMovie(int customerId, int movieId);

    // Record that a movies has been watched by the given customer
    void addWatchedMovie(int customerId, int movieId);

    // Associate two customers as being friends
    void addFriend(int customerId1, int customerId2);


    // Returns the IDs of movies that:
    // - Have not been watched by the given customer
    // - Have been "liked" by at least one of the given customer's friends
    Collection<Integer> getRecommendationsFromFriends(int customerId);

    // Returns the IDs of customers that have at least <minimumCommonFriends> in common
    // with the given customer
    Collection<Integer> getFriendRecommendations(int customerId, int minimumCommonFriends);
}
