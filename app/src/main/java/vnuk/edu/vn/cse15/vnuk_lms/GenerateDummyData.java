package vnuk.edu.vn.cse15.vnuk_lms;

import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Random;

import vnuk.edu.vn.cse15.vnuk_lms.DataStructure.StudentMark;
import vnuk.edu.vn.cse15.vnuk_lms.DataStructure.StudentMarkDetail;
import vnuk.edu.vn.cse15.vnuk_lms.DataStructure.User;

/**
 * Created by ngocb on 10/28/2017.
 */



public class GenerateDummyData {

    private ArrayList<User> userArrayList = new ArrayList<>();

    public GenerateDummyData(){}

    public void GenerateUserArrayList(int numberOfUsers){
        User newUser;

        for(int i = 0; i < numberOfUsers; i++){
            newUser = new User();
            newUser.setId(i);
            newUser.setUsername("username" + i);
            newUser.setPassword("password" + i);
            newUser.setAccess((new Random()).nextInt(2));

            FirebaseDatabase.getInstance().getReference().child("root").child("users").child(newUser.getUsername() + "-" + newUser.getPassword()).setValue(newUser);

            if(newUser.getAccess() == 0){
                for(int j = 0; j < 5; j++) {
                    GenerateStudentMark(j, newUser.getId(), (new Random()).nextInt(10));
                }
            }
        }
    }

    public void GenerateStudentMark(int idStudentMark, int idStudent, int idCourse){
        StudentMark studentMark = new StudentMark();

        studentMark.setId(idStudentMark);
        studentMark.setIdStudent(idStudent);
        studentMark.setIdCourse(idCourse);
        studentMark.setNameCourse("Course " + idCourse);
        studentMark.setTotalMarks((new Random()).nextInt(10));

        FirebaseDatabase.getInstance().getReference().child("root").child("student-marks").child("student" + "-" + idStudent).child("student-mark" + "-" + idStudentMark).setValue(studentMark);

        GenerateStudentMarksDetail(idStudentMark, idStudent);
    }
    public void GenerateStudentMarksDetail(int idStudentMark, int idStudent){
        StudentMarkDetail studentMarkDetail = new StudentMarkDetail();

        String range[] = {"F", "D", "D+", "C", "C+", "B", "B+", "A", "A+"};

        Random random = new Random();

        studentMarkDetail.setIdStudentMark(idStudentMark);
        studentMarkDetail.setCredit(random.nextInt(10));
        studentMarkDetail.setCCMark(random.nextInt(10));
        studentMarkDetail.setBTMark(random.nextInt(10));
        studentMarkDetail.setDAMark(random.nextInt(10));
        studentMarkDetail.setGKMark(random.nextInt(10));
        studentMarkDetail.setCKMark(random.nextInt(10));
        studentMarkDetail.setLAMark(random.nextInt(10));
        studentMarkDetail.setGW1Mark(random.nextInt(10));
        studentMarkDetail.setGW2Mark(random.nextInt(10));
        studentMarkDetail.setGW3Mark(random.nextInt(10));
        studentMarkDetail.setATMark(random.nextInt(10));
        studentMarkDetail.setFEMark(random.nextInt(10));
        studentMarkDetail.setPrMark(random.nextInt(10));
        studentMarkDetail.setPAMark(random.nextInt(10));
        studentMarkDetail.setQzMark(random.nextInt(10));
        studentMarkDetail.setRPMark(random.nextInt(10));
        studentMarkDetail.setMEMark(random.nextInt(10));
        studentMarkDetail.setPA2Mark(random.nextInt(10));
        studentMarkDetail.setGDMark(random.nextInt(10));
        studentMarkDetail.setSEMark(random.nextInt(10));
        studentMarkDetail.setPRAMark(random.nextInt(10));
        studentMarkDetail.setGPA10Mark(random.nextInt(10));
        studentMarkDetail.setRange(range[random.nextInt(9)]);

        FirebaseDatabase.getInstance().getReference().child("root").child("student-mark-details").child("student" + "-" + idStudent).child("student-mark-detail" + "-" + idStudentMark).setValue(studentMarkDetail);

    }
}










