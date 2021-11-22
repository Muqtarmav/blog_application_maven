package data.Repository;

import data.models.User;

import java.util.List;

public interface UserRepository {

    User save (User user);

    User findUserById(String id);

    void delete (String id);

    void delete (User user);

    List<User> findAll();
}
