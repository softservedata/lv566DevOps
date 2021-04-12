package com.softserve.edu.buildapp;

import com.softserve.edu.build.IUser;
import com.softserve.edu.build.User;
import com.softserve.edu.build.UserRepository;
import com.softserve.edu.build.UserRepositorySingleton;

public class Appl {

    public static void main(String[] args) {
        /*-
        // 1. Classic
        User user = new User("firstname_1", "lastname_1", "login_1",
                "password_1", "email_1", "address_1", "phone_1");
        System.out.println("user.getFirstname() = " + user.getFirstname());
        */
        /*-
        // 2. Default Constructor. Use setters
        User user = new User();
        user.setFirstname("firstname_2");
        user.setLastname("lastname_2");
        user.setLogin("login_2");
        user.setPassword("password_2");
        user.setEmail("email_2");
        user.setAddress("address_2");
        user.setPhone("phone_2");
        System.out.println("user.getFirstname() = " + user.getFirstname());
        */
        /*-
        // 3. Use Static Factory
        User user = User.get();
        user.setFirstname("firstname_3");
        user.setLastname("lastname_3");
        user.setLogin("login_3");
        user.setPassword("password_3");
        user.setEmail("email_3");
        user.setAddress("address_3");
        user.setPhone("phone_3");
        System.out.println("user.getFirstname() = " + user.getFirstname());
        */
        /*-
        // 4. Use Fluent Interface
        User user = User.get()
            .setFirstname("firstname_4")
            .setLastname("lastname_4")
            .setLogin("login_4")
            .setPassword("password_4")
            .setEmail("email_4")
            .setAddress("address_4")
            .setPhone("phone_4");
        System.out.println("user.getFirstname() = " + user.getFirstname());
        */
        /*-
        // 5. Add Builder
        User user = User.get()
                .setFirstname("firstname_5")
                .setLastname("lastname_5")
                .setLogin("login_5")
                .setPassword("password_5")
                .setEmail("email_5")
                .setAddress("address_5")
                .setPhone("phone_5")
                .build();
        System.out.println("user.getFirstname() = " + user.getFirstname());
        // code
        System.out.println("user.getFirstname() = " + user.setFirstname("ss"));
        System.out.println("user.getFirstname() = " + user.getFirstname());
        */
        /*-
        // 6. Dependency Inversion
        IUser user = User.get()
                .setFirstname("firstname_6")
                .setLastname("lastname_6")
                .setLogin("login_6")
                .setPassword("password_6")
                .setEmail("email_6")
                .setAddress("address_6")
                .setPhone("phone_6")
                .build();
        System.out.println("user.getFirstname() = " + user.getFirstname());
        // code
        //System.out.println("user.getFirstname() = " + user.setFirstname("ss")); // Compile Error
        System.out.println("user.getFirstname() = " + ((User) user).setFirstname("ss")); // Code Smell
        System.out.println("user.getFirstname() = " + user.getFirstname());
        */
        /*-
        // 7. Add Repository
        IUser user = UserRepository.getValid();
        System.out.println("user.getFirstname() = " + user.getFirstname());
        */
        //
        // 8. Add Singleton
        IUser user = UserRepositorySingleton.get().getValid();
        System.out.println("user.getFirstname() = " + user.getFirstname());
    }

}
