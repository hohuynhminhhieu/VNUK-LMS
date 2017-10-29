package vnuk.edu.vn.cse15.vnuk_lms.DataStructure;

/**
 * Created by ngocb on 10/28/2017.
 */

public class Student_Info {
    private int idUser;
    private String fullname;
    private String classname;
    private String linkAvatar;

    public Student_Info() {
    }

    public Student_Info(int idUser, String fullname, String classname, String linkAvatar) {
        this.idUser = idUser;
        this.fullname = fullname;
        this.classname = classname;
        this.linkAvatar = linkAvatar;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getLinkAvatar() {
        return linkAvatar;
    }

    public void setLinkAvatar(String linkAvatar) {
        this.linkAvatar = linkAvatar;
    }
}
