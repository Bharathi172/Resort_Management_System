package resort.User;

import java.util.ArrayList;
import resort.User.User;

/**
 *
 * @author arvin
 */
public class UserDirectory {
    private ArrayList<User> users;
    
    public UserDirectory() {
        this.users = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    
    public User addPersons(){
        User person = new User();
        users.add(person);
        return person;
    }
    
    public User getUserById(String userId) {
        
        User selectedUser = new User();
        for(User user : users) {
            if(user.getUserId().equals(userId)) {
                selectedUser = user;
                break;
            }
        }
        return selectedUser;
    }
    
    public ArrayList<User> getUsersByRole(String userRole) {
        
        ArrayList<User> selectedUsers = new ArrayList<User>();
        for(User user : users) {
            if(user.getUserRole().equals(userRole)) {
                selectedUsers.add(user);
            }
        }
        return selectedUsers;
    }
    
    public void updateUser (User user) {
        User newUser = new User();
        
        int position = 0;
        for (int iter = 0; iter < users.size(); iter++) {
            if((users.get(iter).getUserId()).equals(user.getUserId())) {
                position = iter;
                break;
            }
        }
        
        newUser.setUserId(user.getUserId());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setUserName(user.getUserName());
        newUser.setUserPassword(user.getUserPassword());
        newUser.setUserRole(user.getUserRole());
        newUser.setUserAddress(user.getUserAddress());
        newUser.setUserPhoneNumber(user.getUserPhoneNumber());
        newUser.setUserEmail(user.getUserEmail());
        newUser.setUserAge(user.getUserAge());
        
        users.set(position, newUser);
    }
    public void printUsersByRole(String userRole) {
        ArrayList<User> selectedUsers = getUsersByRole(userRole);

        if (!selectedUsers.isEmpty()) {
            System.out.println("List of Users for Role: " + userRole);

            for (User user : selectedUsers) {
                printUserInfo(user);
                System.out.println("--------------------");
            }
        } else {
            System.out.println("No users found for role: " + userRole);
        }
    }

    public void deleteAndPrintUserList(String userIdToDelete, String userRole) {
        User userToDelete = getUserById(userIdToDelete);

        if (userToDelete != null && userToDelete.getUserRole().equals(userRole)) {
            users.remove(userToDelete);
            System.out.println("User with ID " + userIdToDelete + " and Role " + userRole + " deleted successfully.");
        } else {
            System.out.println("User with ID " + userIdToDelete + " and Role " + userRole + " not found.");
        }

        // Print the updated list
        printUserList();
    }
    
    public void printUserList() {
    if (!users.isEmpty()) {
        System.out.println("List of Users:");

        for (User user : users) {
            printUserInfo(user);
            System.out.println("--------------------");
        }
    } else {
        System.out.println("No users found.");
    }
}


    private void printUserInfo(User user) {
        System.out.println("User ID: " + user.getUserId());
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("User Name: " + user.getUserName());
        System.out.println("Role Type: " + user.getUserRole());
        System.out.println("Age: " + user.getUserAge());
        System.out.println("Address: " + user.getUserAddress());
        System.out.println("Phone Number: " + user.getUserPhoneNumber());
        System.out.println("Email Address: " + user.getUserEmail());
    }
}
