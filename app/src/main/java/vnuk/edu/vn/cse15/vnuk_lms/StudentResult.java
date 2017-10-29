package vnuk.edu.vn.cse15.vnuk_lms;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import vnuk.edu.vn.cse15.vnuk_lms.DataStructure.StudentMark;
import vnuk.edu.vn.cse15.vnuk_lms.DataStructure.StudentMarkDetail;


/**
 * Created by ngocb on 10/29/2017.
 */

public class StudentResult extends AppCompatActivity{

    ListView listView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_result);

        listView = (ListView) findViewById(R.id.ls_semester);

        ArrayList<String> courseAndTotalMarkArrayList = new ArrayList<>();

        for(StudentMark studentMark : DataTemp.studentMarkArrayList){
            courseAndTotalMarkArrayList.add(studentMark.getNameCourse() + " | " + studentMark.getTotalMarks());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, courseAndTotalMarkArrayList);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                FirebaseDatabase.getInstance().getReference().child("root").child("student-mark-details").child("student" + "-" + DataTemp.currentUser.getId()).child("student-mark-detail" + "-" + DataTemp.studentMarkArrayList.get(position).getId()).addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        DataTemp.studentMarkDetail = dataSnapshot.getValue(StudentMarkDetail.class);

                        Intent intent = new Intent(StudentResult.this, DetailStudyResultMark.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });
    }
}
