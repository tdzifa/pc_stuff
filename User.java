import java.util.Vector;

public class User {

  private String userName;

  private String password;

  private String emailAdd;

  private String firstName;

  private String lastName;

  private String description;

  private List usersFollowed;

  private List usersFollowing;

  private Tag tags;

  private Service service;

  private Organisation university;

  private Organisation company;

  private Theme theme;

    /**
   * 
   * @element-type Tag
   */
  public Vector  myTag;
    /**
   * 
   * @element-type Service
   */
  public Vector  myService;
    public Vector  myUser;
    public Vector  myUser;
    public Vector  myOrganisation;
    /**
   * 
   * @element-type Organisation
   */
  public Vector  myOrganisation;
    public Theme active theme;
    /**
   * 
   * @element-type Theme
   */
  public Vector  creator;

  public void followUser() {
  }

  public void unfollowUser() {
  }

}