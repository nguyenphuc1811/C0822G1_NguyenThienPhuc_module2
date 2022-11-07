package case_study.model;

import java.util.Date;

public class InfoBooking {
    private String idBooking;
    private String dateBegin;
    private String dateEnd;
    private String idCustomer;
    private String nameService;

    public InfoBooking(String idBooking, String dateBegin, String dateEnd, String idCustomer, String nameService) {
        this.idBooking = idBooking;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(String dateBegin) {
        this.dateBegin = dateBegin;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
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

}
