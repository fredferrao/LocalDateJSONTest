package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import play.data.format.Formats;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Criado por ferrao em 30/09/2015.
 */
    @Entity
    public class Person extends Model {

        @Id
        public Long id;

        public String name;

        public LocalDate dayOfBirth;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
        public LocalDate anotherDate;

        @Formats.DateTime(pattern = "dd/MM/yyyy")
        public LocalDate andAnotherOne;

        public static Model.Finder<Long, Person> find = new Model.Finder<Long, Person>(Person.class);
    }
