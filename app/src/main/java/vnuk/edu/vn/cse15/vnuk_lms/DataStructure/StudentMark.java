package vnuk.edu.vn.cse15.vnuk_lms.DataStructure;

/**
 * Created by ngocb on 10/29/2017.
 */

// /root/student-marks/student-[idStudent]/student-mark-[id]

public class StudentMark {
     private int id;
     private int idStudent;
     private int idCourse;
     private String nameCourse;
     private float totalMarks;

    public StudentMark() {
    }

    public StudentMark(int id, int idStudent, int idCourse, String nameCourse, float totalMarks) {
        this.id = id;
        this.idStudent = idStudent;
        this.idCourse = idCourse;
        this.nameCourse = nameCourse;
        this.totalMarks = totalMarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }
}
