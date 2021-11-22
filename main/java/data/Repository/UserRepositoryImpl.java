package data.Repository;

import data.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{

    ArrayList<User> users = new ArrayList<>();


    @Override
    public User save(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User findUserById(String id) {
       for (User user : users){
           if ( user.getId().equalsIgnoreCase(id))
               return user;
       }
        return null;
    }

    @Override
    public void delete(String id) {
        User user = findUserById(id);

        delete(user);
    }

    @Override
    public void delete(User user) {
        users.remove(user);

    }

    @Override
    public List<User> findAll() {
        return users;
    }
}
