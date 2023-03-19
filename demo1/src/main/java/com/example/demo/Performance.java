package com.example.demo;
// Object Relational Mapping (ORM) is concept/process of converting the data from Object oriented language to relational DB and vice versa
// Hibernate: Its the implementation of above concept.
import jakarta.persistence.Entity; // аннотация для указания, что класс является сущностью и относится к ORM JPA
import jakarta.persistence.GeneratedValue; // аннотация для работы со столбцами SQL
import jakarta.persistence.GenerationType; // класс, отвечающий за тип данных перечисления. Определяет типы стратегий (случаев) генерации первичного ключа.
import jakarta.persistence.Id; // аннотация, отвечающая за определение первичного ключа объекта
// By marking the @Id field with @GeneratedValue we are now enabling id generation.
// Which means that the persistence layer will generate an Id value for us and handle the auto incrementing

@Entity // позволяет Джава-класс представлять, как объект базы данных. defines that a class can be mapped to a table.
public class Performance {
    private Long id; //ID
    private String spectacle; // название спектакля
    private String cast_name; // название коллектива актеров
    private String date_time; // дата и время спектакля
    private int amount_of_tickets; // общее количество билетов
    private int available_tickets; // доступные билеты

    protected Performance() {
    }

    @Id // indicating the member field below is the primary key of current entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // to configure the way of increment of the specified column(field). you may specify auto_increment in the definition of table to make it self-incremental, and then use the following
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpectacle() {
        return spectacle;
    }

    public void setSpectacle(String spectacle) {
        this.spectacle = spectacle;
    }

    public String getCast_name() {
        return cast_name;
    }

    public void setCast_name(String cast_name) {
        this.cast_name = cast_name;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public int getAmount_of_tickets() {
        return amount_of_tickets;
    }

    public void setAmount_of_tickets(int amount_of_tickets) {
        this.amount_of_tickets = amount_of_tickets;
    }

    public int getAvailable_tickets() {
        return available_tickets;
    }

    public void setAvailable_tickets(int available_tickets) {
        this.available_tickets = available_tickets;
    }

    @Override
    public String toString() {
        return "performance [id=" + id + ", spectacle=" + spectacle + ", cast_name=" + cast_name + ", date_time=" + date_time + ", amount_of_tickets=" + amount_of_tickets + ", available_tickets=" + available_tickets + "]";
    }
}







