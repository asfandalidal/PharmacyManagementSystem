
import java.util.Date;
public class Medication {
    private String medicineName;
    private String price;
    private String quantity;
    private Date mfDate;
    private Date expDate;
    private String company;

    public Medication(String medicineName, String price, String quantity, Date mfDate, Date expDate, String company) {
        this.medicineName = medicineName;
        this.price = price;
        this.quantity = quantity;
        this.mfDate = mfDate;
        this.expDate = expDate;
        this.company = company;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Date getMfDate() {
        return mfDate;
    }

    public void setMfDate(Date mfDate) {
        this.mfDate = mfDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
