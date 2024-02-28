package Test;

//author DAVIUS1

import data.UserDAO;
import domain.User;
import java.util.List;


public class TestManagement {
    public static void main(String[] args) {
        UserDAO userDao = new UserDAO();
        
//        List<User> users = userDao.select();
//        for(User user: users){
//            System.out.println("user = " + user);
//        }
        
//        Insertando un nuevo objeto de tipo User
//        User userNew = new User("anonimo.anonimo", "123");
//        userDao.insert(userNew);

        //Modificar un objeto de usuario existente
        User userUpdate = new User(4, "nombre.apellido", "654");
        userDao.update(userUpdate);

        //Eliminar un registro
//        User userDelete = new User(6);
//        userDao.delete(userDelete);

        //Listado de personas
//        users = userDao.select();
        List<User> users = userDao.select();
        for(User user: users){
            System.out.println("user = " + users);
        }
    }
  
}
