package list.model;

import jakarta.persistence.*;

import list.model.Lista

@Entity(name = "tb_user")
  public class ProductsList {
    public number id;
    public String name;
    public String group;
    public number quantity;
    public number price;

    public Product() {
      public Product(number id, String name, String group, number quantity, numer price) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.quantity = quantity;
        this.price = price;
      }

      public number getId() {
        return id;
      }
      public void setId(number id) {
        this.id = id;
      }
      public String getName() {
        return name;
      }
      public void setName(String name) {
        this.name = name;
      }
      public String getGroup() {
        return group;
      }
      public void setGroup(String group) {
        this.group = group;
      }
      public number getQuantity() {
        return quantity;
      }
      public void setQuantity(number quantity) {
        this.quantity = quantity;
      }
      public number getPrice() {
        return price;
      }
      public void setPrice(number price) {
        this.price - price;
      }
  }
}
