package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList group = new UserList();
        group.addUser("user1","user1pass");
        group.addUser("user2","user2pass");
        group.addUser("user3","user3pass");
        // TODO: find one of them
        User found = group.findUserByUsername("user2");
        // TODO: assert that UserList found User
        String expected = "user2";
        String actual = found.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList group = new UserList();
        group.addUser("user1","user1pass");
        group.addUser("user2","user2pass");
        group.addUser("user3","user3pass");
        // TODO: change password of one user
        boolean actual = group.changePassword("user1","user1pass","change1pass");
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList group = new UserList();
        group.addUser("user1","user1pass");
        group.addUser("user2","user2pass");
        group.addUser("user3","user3pass");
        // TODO: call login() with correct username and password
        User login = group.login("user1", "user1pass");
        // TODO: assert that User object is found
        String expected = "user1";
        String actual = login.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList group = new UserList();
        group.addUser("user1","user1pass");
        group.addUser("user2","user2pass");
        group.addUser("user3","user3pass");
        // TODO: call login() with incorrect username or incorrect password
        User login = group.login("user1", "user2pass");
        // TODO: assert that the method return null
        assertNull(login);
    }

}