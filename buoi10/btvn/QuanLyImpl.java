package vn.com.t3h.buoi10.btvn;

import java.util.*;
import java.util.stream.Collectors;

public class QuanLyImpl implements IQuanLy {


    private List<NhanVien> danhSachnNhanVien = new ArrayList<NhanVien>();

    @Override
    public void khoiTaoNhanVienMacDinh() {
        danhSachnNhanVien.add(new NhanVienVanPhong("NV001", "Nguyen Van A", 30, 5000000, 20));
        danhSachnNhanVien.add(new KySu("KS002", "Tran Thi B", 28, 7000000, "Công Nghệ Thông Tin"));
        danhSachnNhanVien.add(new QuanLy("Ql003", "Le Quang C", 35, 10000000, 1.5));
    }

    @Override
    public void themNhanVien() {
        System.out.println("Chọn nhân viên để thêm: ");
        System.out.println("1. Nhân viên văn phòng");
        System.out.println("2. Kỹ Sư");
        System.out.println("2. Quản Lý");
        NhanVien nhanVien = null;
        int typeNhanVien = new Scanner(System.in).nextInt();
        boolean kiemTra = false;
        while (!kiemTra) {
            try {
                if (typeNhanVien == 1) {
                    nhanVien = new NhanVienVanPhong();
                } else if (typeNhanVien == 2) {
                    nhanVien = new KySu();
                } else if (typeNhanVien == 3) {
                    nhanVien = new QuanLy();
                } else {
                    System.out.println("Vui lòng nhập lại lựa chọn");
                }
                if (nhanVien != null) {
                    nhanVien.nhapThongTin();
                    for (NhanVien nv : danhSachnNhanVien) {
                        if (nv.getMaNV().equals(nhanVien.getMaNV())) {
                            throw new EmployeeException("mã nhân viên đã tồn tại " + nv.getMaNV());
                        }
                    }
                    danhSachnNhanVien.add(nhanVien);
                    System.out.println("Thêm Nhân vin thành công");
                    kiemTra = true;
                }
            } catch (EmployeeException e) {
                System.out.println("Lỗi: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }

    @Override
    public void hienThiDanhSach() {
        for (NhanVien nhanVien : danhSachnNhanVien) {
            System.out.println(nhanVien.toString());
        }
    }

    @Override
    public double tinhTongLuong() {
        double tong = 0;
        for (NhanVien nv : danhSachnNhanVien) {
            tong += nv.tinhLuong();
        }
        return tong;
    }

    @Override
    public void timLuongCaoNhat() {
        //Collections.max() được sử dụng để tìm giá trị lớn nhất trong một tập hợp
        NhanVien nhanVienLuongCaoNhat = Collections.max(danhSachnNhanVien,Comparator.comparing(NhanVien::tinhLuong));
        System.out.println(nhanVienLuongCaoNhat.toString());
    }

    @Override
    public void timTheoMaNV(String maNV) {
        boolean kiemTra = false;
        for (NhanVien nhanVien : danhSachnNhanVien) {
            if (nhanVien.getMaNV().equals(maNV)) {
                System.out.println(nhanVien.toString());
                kiemTra = true;
                break;
            }
        }
        if (!kiemTra) {
            System.out.println("không tìm thấy nhân viên có mã nhân viên: " + maNV);
        }
    }

    @Override
    public void sapXepTheoLuongGiamDan() {
        Collections.sort(danhSachnNhanVien,new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return  Double.compare(o2.tinhLuong(),o1.tinhLuong());
            }
        });
        for (NhanVien nv : danhSachnNhanVien) {
            System.out.println(nv.toString());
        }
    }
}
