package controllers;

import models.Person;
import play.libs.Json;
import play.mvc.*;

/**
 * Criado por ferrao em 30/09/2015.
 */
    public class PersonController extends Controller {

        public Result create() {
            Person person = Json.fromJson(request().body().asJson(), Person.class);

            person.save();

            return ok(Json.toJson(person));
        }

        public Result all() {
            return ok(Json.toJson(Person.find.all()));
        }
    }
