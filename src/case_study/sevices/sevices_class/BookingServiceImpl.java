package case_study.sevices.sevices_class;

import case_study.model.InfoBooking;
import case_study.model.person.Customer;
import case_study.sevices.util.InputCustomer;
import case_study.sevices.util.WrtieAndReadFile;

import java.io.IOException;
import java.util.*;

public class BookingServiceImpl {
    public static Set<InfoBooking> treeSet = new TreeSet<>();
    public Customer bookingCustomer() throws IOException {
        InputCustomer inputCustomer = new InputCustomer();
        String checkId;
        Scanner scanner = new Scanner(System.in);
        checkId = scanner.nextLine();
        for (Customer customer : WrtieAndReadFile.readFile("src\\case_study\\model\\data_customer.csv")) {
            if (customer.getId().equals(checkId)) {
                return customer;
            }
        }
        return inputCustomer.addCustomer();
    }

    public void booking() throws IOException {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.display();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        facilityService.display();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Mã phòng");
//        String id = scanner.nextLine();
//        System.out.println("Ngày bắt đầu");
//        String dateBegin = scanner.nextLine();
//        System.out.println("Ngày kết thúc");
//        String dateEnd = scanner.nextLine();
//        System.out.println("Mã khách hàng");
//        String idCustomer = scanner.nextLine();
//        System.out.println("Tên dịch vụ");
//        String nameService = scanner.nextLine();
//        InfoBooking infoBooking = new InfoBooking(id,dateBegin,dateEnd,idCustomer,nameService);
//        treeSet.add(infoBooking);
    }

}
