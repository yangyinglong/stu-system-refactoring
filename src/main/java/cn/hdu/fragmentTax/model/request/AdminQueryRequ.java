package cn.hdu.fragmentTax.model.request;

public class AdminQueryRequ {
    private String userId;
    private Integer state;
    private String[] status;

    public AdminQueryRequ() {
    }

    public AdminQueryRequ(String userId, Integer state, String[] status) {
        this.userId = userId;
        this.state = state;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String[] getStatus() {
        return status;
    }

    public void setStatus(String[] status) {
        this.status = status;
    }
}
