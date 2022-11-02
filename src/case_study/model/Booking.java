package case_study.model;

import java.util.Date;
import java.util.Scanner;

public class Booking {
    private String idBooking;
    private Date dateBegin;
    private Date dateEnd;
    private String idCustomer;
    private String nameService;

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }
    public void booking(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mã phòng");
        System.out.println("Ngày bắt đầu");
        System.out.println("Ngày kết thúc");
        System.out.println("Mã khách hàng");
        System.out.println("Tên dịch vụ");
    }
}
