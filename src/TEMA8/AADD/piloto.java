package TEMA8.AADD;

public class piloto {
    int driverid;
    String code;
    String forename;
    String surname;
    String dob;
    String nationality;
    int constructorid;
    String url;

    public piloto() {

    }
    public piloto(int driverid,  String code, String forename, String surname, String dob, String nationality, int constructorid) {
        this.driverid = driverid;
        this.code = code;
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        this.nationality = nationality;
        this.constructorid = constructorid;

    }

    public int getDriverid() {
        return driverid;
    }

    public void setDriverid(int driverid) {
        this.driverid = driverid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getConstructorid() {
        return constructorid;
    }

    public void setConstructorid(int constructorid) {
        this.constructorid = constructorid;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "piloto{" +
                "driverid=" + driverid +
                ", code='" + code + '\'' +
                ", forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", dob='" + dob + '\'' +
                ", nationality='" + nationality + '\'' +
                ", constructorid=" + constructorid +
                ", url='" + url + '\'' +
                '}';
    }
}
