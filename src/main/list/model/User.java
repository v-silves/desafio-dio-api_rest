package list.model;

import jakarta.persistence.*;

import list.model.Lista

@Entity(name = "tb_user")
  public class User {
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = cascadeType.ALL)
    private Balance balance;

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
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

    public Balance getBalance() {
      return balance;
    }

    public void setBalance(Balance balance) {
      this.balance = balance;
    }
  }
