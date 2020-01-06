package entity;

public enum UserTaskStatus {
    ACTIVE(1),FINISHED(0);
    private int  status;
    UserTaskStatus(int i) {
        this.status=i;
    }

    public int getStatus() {
        return status;
    }
}
