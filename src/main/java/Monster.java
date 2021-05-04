import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

public class Monster {

    String imageFile;
    String monsterName;
    String caption;
    String description;
    Double price;
    Integer scariness;


    public Monster(String imageFile, String monsterName, String caption, String description, Double price, Integer scariness) {
        this.imageFile = imageFile;
        this.monsterName = monsterName;
        this.caption = caption;
        this.description = description;
        this.price = price;
        this.scariness = scariness;
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getScariness() {
        return scariness;
    }

    public void setScariness(Integer scariness) {
        this.scariness = scariness;
    }
}
