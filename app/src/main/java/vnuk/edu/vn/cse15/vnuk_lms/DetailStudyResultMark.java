package vnuk.edu.vn.cse15.vnuk_lms;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by ngocb on 10/29/2017.
 */

public class DetailStudyResultMark  extends AppCompatActivity {

    ListView listView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_study_result_mark);

        listView = (ListView) findViewById(R.id.detail_mark);

        ArrayList<String> studentMarkDetailStringArrayList = new ArrayList<>();

        studentMarkDetailStringArrayList.add("CC : " + DataTemp.studentMarkDetail.getCCMark());
        studentMarkDetailStringArrayList.add("BT : " + DataTemp.studentMarkDetail.getBTMark());
        studentMarkDetailStringArrayList.add("DA : " + DataTemp.studentMarkDetail.getDAMark());
        studentMarkDetailStringArrayList.add("GK : " + DataTemp.studentMarkDetail.getGKMark());
        studentMarkDetailStringArrayList.add("CK : " + DataTemp.studentMarkDetail.getCKMark());
        studentMarkDetailStringArrayList.add("LA : " + DataTemp.studentMarkDetail.getLAMark());
        studentMarkDetailStringArrayList.add("GW1 : " + DataTemp.studentMarkDetail.getGW1Mark());
        studentMarkDetailStringArrayList.add("GW2 : " + DataTemp.studentMarkDetail.getGW2Mark());
        studentMarkDetailStringArrayList.add("GW3 : " + DataTemp.studentMarkDetail.getGW3Mark());
        studentMarkDetailStringArrayList.add("AT : " + DataTemp.studentMarkDetail.getATMark());
        studentMarkDetailStringArrayList.add("FE : " + DataTemp.studentMarkDetail.getFEMark());
        studentMarkDetailStringArrayList.add("Pr : " + DataTemp.studentMarkDetail.getPrMark());
        studentMarkDetailStringArrayList.add("PA : " + DataTemp.studentMarkDetail.getPAMark());
        studentMarkDetailStringArrayList.add("Qz : " + DataTemp.studentMarkDetail.getQzMark());
        studentMarkDetailStringArrayList.add("RP : " + DataTemp.studentMarkDetail.getRPMark());
        studentMarkDetailStringArrayList.add("ME : " + DataTemp.studentMarkDetail.getMEMark());
        studentMarkDetailStringArrayList.add("PA2 : " + DataTemp.studentMarkDetail.getPA2Mark());
        studentMarkDetailStringArrayList.add("GD : " + DataTemp.studentMarkDetail.getGDMark());
        studentMarkDetailStringArrayList.add("SE : " + DataTemp.studentMarkDetail.getSEMark());
        studentMarkDetailStringArrayList.add("PRA : " + DataTemp.studentMarkDetail.getPRAMark());
        studentMarkDetailStringArrayList.add("T10 : " + DataTemp.studentMarkDetail.getGPA10Mark());
        studentMarkDetailStringArrayList.add("Điểm chữ : " + DataTemp.studentMarkDetail.getRange());

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, studentMarkDetailStringArrayList);

        listView.setAdapter(adapter);
    }
}






















