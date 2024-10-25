package use_case.login;

import entity.User;

/**
 * DAO for the Login Use Case.
 */
public interface LoginUserDataAccessInterface {

    /**
     * Checks if the given username exists.
     * @param username the username to look for
     * @return true if a user with the given username exists; false otherwise
     */
    boolean existsByName(String username);

    /**
     * Saves the user.
     * @param user the user to save
     */
    void save(User user);

    /**
     * Returns the user with the given username.
     * @param username the username to look up
     * @return the user with the given username
     */
    User get(String username);

    /**
     * Method to set the user to a certain value.
     * @param name name to be passed in
     */
    void setCurrentUser(String name);

    /**
     * Method to get the user.
     * @return string to be returned
     */
    String getCurrentUser();
}
