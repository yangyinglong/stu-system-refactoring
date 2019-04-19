package cn.hdu.fragmentTax.model.request;

public class AdminQueryRequ {
    private String userId;
    private String[] status;

    public AdminQueryRequ() {
    }

    public AdminQueryRequ(String userId, String[] status) {
        this.userId = userId;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String[] getStatus() {
        return status;
    }

    public void setStatus(String[] status) {
        this.status = status;
    }
}
