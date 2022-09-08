package nguyentientho.techmasterndcjavacore14.buoi5.vie;

public class NhanVien extends CanBo {
    private String task;
    public NhanVien(String name, int age, String gender, String address, String task) {
        super(name, age, gender, address);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Nhan vien {" +
                "cong viec ='" + task + '\'' +
                ", ten ='" + ten + '\'' +
                ", tuoi =" + tuoi +
                ", gioi tinh ='" + gioiTinh + '\'' +
                ", dia chi ='" + diaChi + '\'' +
                '}';
    }
}
