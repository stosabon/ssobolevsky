package ru.job4j.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pro on 01.06.2017.
 */
public class Bank {
    /**
     * HashMap to keep all users and their accounts.
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Getter for users.
     * @return users.
     */
    public Map<User, List<Account>> getUsers() {
        return users;
    }

    /**
     * Method to add user to map.
     * @param user - user
     */
    public void addUser(User user) {
        users.put(user, new ArrayList<Account>());
    }

    /**
     * Method to delete user from map.
     * @param user - user
     */
    public void deleteUser(User user) {
        users.remove(user);
    }

    /**
     * Method to add account to user.
     * @param user - user
     * @param account - account
     */
    public void addAccountToUser(User user, Account account) {
        if (user != null && users.containsKey(user)) {
            users.get(user).add(account);
        } else {
            throw new UserNotFoundException("User Not Found");
        }
    }

    /**
     * Method to delete account to user.
     * @param user - user
     * @param account - account
     */
    public void deleteAccountFromUser(User user, Account account) {
        if (user != null && users.containsKey(user)) {
            users.get(user).remove(account);
        } else {
            throw new UserNotFoundException("User Not Found");
        }
    }

    /**
     * Method to get all accounts of user.
     * @param user  - user
     * @return list of accounts.
     */
    public List<Account> getUserAccounts(User user) {
        return users.get(user);
    }

    /**
     * Method to exchange money between users.
     * @param srcUser - sender user
     * @param srcAccount - sender account
     * @param dstUser - receiver user
     * @param dstAccount - receiver account
     * @param amount - amount of transfer
     * @return successfully or not
     */
    public boolean transferMoney(User srcUser, Account srcAccount, User dstUser, Account dstAccount, double amount) {
        boolean result = false;
        if (users.containsKey(srcUser) && users.get(srcUser).contains(srcAccount)
                && users.containsKey(dstUser) && users.get(dstUser).contains(dstAccount)
                && srcAccount.getValue() >= amount) {
            users.get(srcUser).set(users.get(srcUser).indexOf(srcAccount), new Account(srcAccount.getRequisites(), srcAccount.getValue() - amount));
            users.get(dstUser).set(users.get(dstUser).indexOf(dstAccount), new Account(dstAccount.getRequisites(), dstAccount.getValue() + amount));
        }
        return result;
    }
}
