import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Wine {
    private String nameOfVine;
    private String brandOfVine;
    private String countryProduce;
    private String description;
    private String dateCreate;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private LocalDate dateOfSpill;

    public Wine() {
    }

    public Wine(String nameOfVine, String brandOfVine, String countryProduce, String description, String dateCreate) {
        this.nameOfVine = nameOfVine;
        this.brandOfVine = brandOfVine;
        this.countryProduce = countryProduce;
        this.description = description;
        setDateOfSpill(dateCreate);
    }

    public void setNameOfVine(String nameOfVine) {
        this.nameOfVine = nameOfVine;
    }
    public String getNameOfVine() {
        return nameOfVine;
    }

    public String getBrandOfVine() {
        return brandOfVine;
    }

    public void setBrandOfVine(String brandOfVine) {
        this.brandOfVine = brandOfVine;
    }

    public String getCountryProduce() {
        return countryProduce;
    }

    public void setCountryProduce(String countryProduce) {
        this.countryProduce = countryProduce;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public LocalDate getDateOfSpill() {
        return dateOfSpill;
    }

    public void setDateOfSpill(String dateCreate) {
        this.dateCreate = dateCreate;
        this.dateOfSpill = LocalDate.parse(dateCreate, formatter);
    }

    @Override
    public String toString() {
        return "Wine{" +
                "nameOfVine='" + nameOfVine + '\'' +
                ", brandOfVine='" + brandOfVine + '\'' +
                ", countryProduce='" + countryProduce + '\'' +
                ", description='" + description + '\'' +
                ", dateOfSpill=" + dateOfSpill +
                '}';
    }
}
