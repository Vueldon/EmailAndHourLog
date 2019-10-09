import UserPack.User;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vueld
 */
public class Main 
{
    public static void main(String[] args)
    {
        User user1 = new User("t@g.com", "T", "asdf", 8);
        System.out.println("Info");
        System.out.println("Email: " + user1.getEmail());
        System.out.println("Username: " + user1.getUserName());
        System.out.println("Password: " + user1.getPassword());
        System.out.println("Daily Logged-On Hours: " + user1.getDailyLoggedOnHours());
        System.out.println("Yearly Logged-On Hours: " + user1.calculateYearlyLoggedOnHours());
    }
}
