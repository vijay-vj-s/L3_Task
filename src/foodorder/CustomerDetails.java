package foodorder;

public class CustomerDetails {
    private static int count=1;
    private  int userId;
    private String name;
    private  long phone_no;
    private String password;
    CustomerDetails(){
        userId=count++;
    }
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public long getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(long phone_no) {
        this.phone_no = phone_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "userId=" + userId +
                ", name= '" + name + '\'' +
                ", phone_no=" + phone_no +
                ", password='" + password + '\'' +
                '}';
    }
}
