package vnuk.edu.vn.cse15.vnuk_lms.DataStructure;

/**
 * Created by ngocb on 10/29/2017.
 */

// /root/student-mark-details/student-[idStudent]/student-mark-detail-[idStudentMark];

public class StudentMarkDetail {
    private int idStudent;
    private int idStudentMark;
    private int credit; // số TC
    private float CCMark;
    private float BTMark;
    private float DAMark;
    private float GKMark;
    private float CKMark;
    private float LAMark;
    private float GW1Mark;
    private float GW2Mark;
    private float GW3Mark;
    private float ATMark;
    private float FEMark;
    private float PrMark;
    private float PAMark;
    private float QzMark;
    private float RPMark;
    private float MEMark;
    private float PA2Mark;
    private float GDMark;
    private float SEMark;
    private float PRAMark;
    private float GPA10Mark;
    private String range;

    public StudentMarkDetail() {
    }

    public StudentMarkDetail(int idStudent,int idStudentMark, int credit, float CCMark, float BTMark, float DAMark, float GKMark, float CKMark, float LAMark, float GW1Mark, float GW2Mark, float GW3Mark, float ATMark, float FEMark, float prMark, float PAMark, float qzMark, float RPMark, float MEMark, float PA2Mark, float GDMark, float SEMark, float PRAMark, float GPA10Mark, String range) {
        this.idStudent = idStudent;
        this.idStudentMark = idStudentMark;
        this.credit = credit;
        this.CCMark = CCMark;
        this.BTMark = BTMark;
        this.DAMark = DAMark;
        this.GKMark = GKMark;
        this.CKMark = CKMark;
        this.LAMark = LAMark;
        this.GW1Mark = GW1Mark;
        this.GW2Mark = GW2Mark;
        this.GW3Mark = GW3Mark;
        this.ATMark = ATMark;
        this.FEMark = FEMark;
        PrMark = prMark;
        this.PAMark = PAMark;
        QzMark = qzMark;
        this.RPMark = RPMark;
        this.MEMark = MEMark;
        this.PA2Mark = PA2Mark;
        this.GDMark = GDMark;
        this.SEMark = SEMark;
        this.PRAMark = PRAMark;
        this.GPA10Mark = GPA10Mark;
        this.range = range;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getIdStudentMark() {
        return idStudentMark;
    }

    public void setIdStudentMark(int idStudentMark) {
        this.idStudentMark = idStudentMark;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public float getCCMark() {
        return CCMark;
    }

    public void setCCMark(float CCMark) {
        this.CCMark = CCMark;
    }

    public float getBTMark() {
        return BTMark;
    }

    public void setBTMark(float BTMark) {
        this.BTMark = BTMark;
    }

    public float getDAMark() {
        return DAMark;
    }

    public void setDAMark(float DAMark) {
        this.DAMark = DAMark;
    }

    public float getGKMark() {
        return GKMark;
    }

    public void setGKMark(float GKMark) {
        this.GKMark = GKMark;
    }

    public float getCKMark() {
        return CKMark;
    }

    public void setCKMark(float CKMark) {
        this.CKMark = CKMark;
    }

    public float getLAMark() {
        return LAMark;
    }

    public void setLAMark(float LAMark) {
        this.LAMark = LAMark;
    }

    public float getGW1Mark() {
        return GW1Mark;
    }

    public void setGW1Mark(float GW1Mark) {
        this.GW1Mark = GW1Mark;
    }

    public float getGW2Mark() {
        return GW2Mark;
    }

    public void setGW2Mark(float GW2Mark) {
        this.GW2Mark = GW2Mark;
    }

    public float getGW3Mark() {
        return GW3Mark;
    }

    public void setGW3Mark(float GW3Mark) {
        this.GW3Mark = GW3Mark;
    }

    public float getATMark() {
        return ATMark;
    }

    public void setATMark(float ATMark) {
        this.ATMark = ATMark;
    }

    public float getFEMark() {
        return FEMark;
    }

    public void setFEMark(float FEMark) {
        this.FEMark = FEMark;
    }

    public float getPrMark() {
        return PrMark;
    }

    public void setPrMark(float prMark) {
        PrMark = prMark;
    }

    public float getPAMark() {
        return PAMark;
    }

    public void setPAMark(float PAMark) {
        this.PAMark = PAMark;
    }

    public float getQzMark() {
        return QzMark;
    }

    public void setQzMark(float qzMark) {
        QzMark = qzMark;
    }

    public float getRPMark() {
        return RPMark;
    }

    public void setRPMark(float RPMark) {
        this.RPMark = RPMark;
    }

    public float getMEMark() {
        return MEMark;
    }

    public void setMEMark(float MEMark) {
        this.MEMark = MEMark;
    }

    public float getPA2Mark() {
        return PA2Mark;
    }

    public void setPA2Mark(float PA2Mark) {
        this.PA2Mark = PA2Mark;
    }

    public float getGDMark() {
        return GDMark;
    }

    public void setGDMark(float GDMark) {
        this.GDMark = GDMark;
    }

    public float getSEMark() {
        return SEMark;
    }

    public void setSEMark(float SEMark) {
        this.SEMark = SEMark;
    }

    public float getPRAMark() {
        return PRAMark;
    }

    public void setPRAMark(float PRAMark) {
        this.PRAMark = PRAMark;
    }

    public float getGPA10Mark() {
        return GPA10Mark;
    }

    public void setGPA10Mark(float GPA10Mark) {
        this.GPA10Mark = GPA10Mark;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }
}
