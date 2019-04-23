package cn.hdu.fragmentTax.model.request;

public class EditTutorCoerRequ {
    private String stuId;
    private String tutor;
    private String counsellor;

    public EditTutorCoerRequ() {
    }

    public EditTutorCoerRequ(String stuId, String tutor, String counsellor) {
        this.stuId = stuId;
        this.tutor = tutor;
        this.counsellor = counsellor;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(String counsellor) {
        this.counsellor = counsellor;
    }
}