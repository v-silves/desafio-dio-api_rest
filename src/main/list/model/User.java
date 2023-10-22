package list.model;

import jakarta.persistence.*;

import list.model.Lista

@Entity(name = "tb_user")
  public class User {
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = cascadeType.ALL)
    private Balance balance;

    @OneToOne(cascade = cascadeType.ALL)
    private List<Products> products;

    public String getId() {
      return id;
    }
    public void setId(String id) {
      this.id = id;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public Account getAccount() {
      return account;
    }
    public void setAccount(Account account) {
      this.account = account;
    }
    public Double getBalance() {
      return balance;
    }
    public void setBalance(Double balance) {
      this.balance = balance;
    }
    public List<Products> getProducts() {
      return products;
    }
    public void setProducts(List<Products> products) {
      this.products = products;
    }
}
