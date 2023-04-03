package com.ani.shopping.user;

public class UserController {

    public void createNewUser(int id, String name) {
        int sts = UsersDb.addNewUser(id, name);
        if (sts == UsersDb.NO_MORE_SPACE) {
            System.out.println("\n ❌ There is no more space ");
        } else if (sts == UsersDb.USER_ALREADY_EXISTS) {
            System.out.println("\n ❌ User Already Exists ");
        } else {
            System.out.println("\n ✅ User Successfully Created ");
        }
        System.out.println("\n\n\n");
    }

    public void listAllUsers() {
        User[] users = UsersDb.listUsers();
        for (User user : users) {
            if (user != null) {
                System.out.println("\n 👉 Id " + user.getId() + " Name " + user.getName());
            }
        }
        System.out.println("\n\n\n");
    }

    public double totalCartPrice() {
        return 0;
    }
}