package ru.job4j.task;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pro on 01.06.2017.
 */
public class BankTest {
    /**
     * Test to add user.
     */
    @Test
    public void whenAddUserThenUserExistInMap() {
        Bank bank = new Bank();
        bank.addUser(new User("Stas", 323456));
        Map<User, List<Account>> expected = new HashMap<>();
        expected.put(new User("Stas", 323456), new ArrayList<Account>());
        assertThat(bank.getUsers(), is(expected));
    }

    /**
     * Test to delete user.
     */
    @Test
    public void whenDeleteUserTHenHeDeletedFromMap() {
        Bank bank = new Bank();
        bank.addUser(new User("Stas", 323456));
        bank.addUser(new User("Stas2", 3234563));
        bank.deleteUser(new User("Stas2", 3234563));
        Map<User, List<Account>> expected = new HashMap<>();
        expected.put(new User("Stas", 323456), new ArrayList<Account>());
        assertThat(bank.getUsers(), is(expected));
    }
    /**
     * Test to add account to user.
     */
    @Test
    public void whenAddAccountUserThenAccountComparedWithUser() {
        Bank bank = new Bank();
        bank.addUser(new User("Stas", 323456));
        bank.addAccountToUser(new User("Stas", 323456), new Account(1, 1000));
        Map<User, List<Account>> expected = new HashMap<>();
        expected.put(new User("Stas", 323456), new ArrayList<Account>(Arrays.asList(new Account(1, 1000))));
        assertThat(bank.getUserAccounts(new User("Stas", 323456)), is(expected.get(new User("Stas", 323456))));
    }
    /**
     * Test to delete account from user.
     */
    @Test
    public void whenDeleteAccountFromUserThenAccountDeletedFromUser() {
        Bank bank = new Bank();
        bank.addUser(new User("Stas", 323456));
        bank.addAccountToUser(new User("Stas", 323456), new Account(1, 1000));
        bank.addAccountToUser(new User("Stas", 323456), new Account(2, 10000));
        bank.deleteAccountFromUser(new User("Stas", 323456), new Account(2, 10000));
        Map<User, List<Account>> expected = new HashMap<>();
        expected.put(new User("Stas", 323456), new ArrayList<Account>(Arrays.asList(new Account(1, 1000))));
        assertThat(bank.getUserAccounts(new User("Stas", 323456)), is(expected.get(new User("Stas", 323456))));
    }
    /**
     * Test to transfer money from user to user.
     */
    @Test
    public void whenTransferMoneyFromUserThenAnotherUserReceiveMoney() {
        Bank bank = new Bank();
        User user1 = new User("Stas", 323456);
        User user2 = new User("Stas2", 323453);
        Account account1 = new Account(1, 1000);
        Account account2 = new Account(1, 2000);
        bank.addUser(user1);
        bank.addUser(user2);
        bank.addAccountToUser(user1, account1);
        bank.addAccountToUser(user2, account2);
        bank.transferMoney(user1, account1, user2, account2, 500);
        Map<User, List<Account>> expected = new HashMap<>();
        expected.put(new User("Stas", 323456), new ArrayList<Account>(Arrays.asList(new Account(1, 500))));
        expected.put(new User("Stas2", 323453), new ArrayList<Account>(Arrays.asList(new Account(1, 2500))));
        assertThat(bank.getUsers(), is(expected));
    }
}
