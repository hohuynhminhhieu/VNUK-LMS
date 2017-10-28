package vnuk.edu.vn.cse15.vnuk_lms;

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

import vnuk.edu.vn.cse15.vnuk_lms.DataStructure.User;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edtUsername, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //GenerateDummyData generateDummyData = new GenerateDummyData();
        //generateDummyData.GenerateUserArrayList(10);

        edtUsername = (EditText) findViewById(R.id.std_id);
        edtPassword = (EditText) findViewById(R.id.std_pass);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase.getInstance().getReference().child("root").child("users").child(edtUsername.getText().toString() + "-" + edtPassword.getText().toString()).addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String text = "";

                        if(dataSnapshot.exists()){
                            if(dataSnapshot.getValue(User.class).getAccess() == 0){
                                text = "Đăng nhập thành công student!";
                            }else{
                                text = "Đăng nhập thành công teacher";
                            }
                        }else{
                            text = "Đăng nhập thất bại";
                        }

                        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });
    }
}
