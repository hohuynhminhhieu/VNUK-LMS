package vnuk.edu.vn.cse15.vnuk_lms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import vnuk.edu.vn.cse15.vnuk_lms.DataStructure.StudentMark;
import vnuk.edu.vn.cse15.vnuk_lms.DataStructure.User;

public class StudentHomepage extends AppCompatActivity implements View.OnClickListener {

    Button btnWatchMark;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_homepage);

        btnWatchMark = (Button) findViewById(R.id.btn_diem);
        btnWatchMark.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_diem:{
                FirebaseDatabase.getInstance().getReference().child("root").child("student-marks").child("student" + "-" + DataTemp.currentUser.getId()).addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        DataTemp.studentMarkArrayList.clear();
                        for(DataSnapshot ds : dataSnapshot.getChildren()){
                            DataTemp.studentMarkArrayList.add(ds.getValue(StudentMark.class));
                        }

                        Intent intent = new Intent(StudentHomepage.this, StudentResult.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });


            }
            break;
        }
    }
}
