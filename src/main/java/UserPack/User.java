package UserPack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vueld
 */
public class User 
{
    private String email;
    private String userName;
    private String password;
    private float dailyLoggedOnHours;
    
    public User(String email, String userName, String password, float dailyLoggedOnHours)
    {
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.dailyLoggedOnHours = dailyLoggedOnHours;
    }
    
    public User()
    {
        email = "";
        userName = "";
        password = "";
        dailyLoggedOnHours = 0;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public void setDailyLoggedOnHours(float hours)
    {
        dailyLoggedOnHours = hours;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getUserName()
    {
        return userName;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public float getDailyLoggedOnHours()
    {
        return dailyLoggedOnHours;
    }
    
    public float calculateYearlyLoggedOnHours()
    {
        float yearlyLoggedOnHours = dailyLoggedOnHours * 365;
        return yearlyLoggedOnHours;
    }
}
