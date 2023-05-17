package homew;

public class Person {
    String fio;
    String tel1;
    String tel2;
    String tel3;

    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getTel3() {
        return tel3;
    }

    public void setTel3(String tel3) {
        this.tel3 = tel3;
    }
    Person(String fio, String tel1, String tel2, String tel3){
        this.fio = fio;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.tel3 = tel3;
    }
}
