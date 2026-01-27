package io.github.tiagosilva110.mini_erp.repository.specs;

import io.github.tiagosilva110.mini_erp.model.Person;
import org.springframework.data.jpa.domain.Specification;

import java.time.Instant;

public class PersonSpecs {

    public static Specification<Person> isPerson(){
        return ((root, query, cb) -> cb.isTrue(root.get("isPerson")));
    }

    public static Specification<Person> nameLike(String name){
        return ((root, query, cb) -> cb.like(cb.upper(root.get("name")), "%"+name.toUpperCase()+"%"));
    }

    public static Specification<Person> fantasyNameLike(String name){
        return ((root, query, cb) -> cb.like(cb.upper(root.get("fantasyName")), "%"+name.toUpperCase()+"%"));
    }

    public static Specification<Person> departmentEquals(int departmentNumber){
        return ((root, query, cb) -> cb.equal(root.get("department"), departmentNumber));
    }

    public static Specification<Person> phoneEquals(int phone){
        return ((root, query, cb) -> cb.equal(root.get("phone"), phone));
    }

    public static Specification<Person> emailLike(String email){
        return ((root, query, cb) -> cb.like(cb.upper(root.get("email")), "%"+email.toUpperCase()+"%"));
    }

    public static Specification<Person> districtLike(String district){
        return ((root, query, cb) -> cb.like(cb.upper(root.get("district")), "%"+district.toUpperCase()+"%"));
    }

    public static Specification<Person> cityLike(String city){
        return ((root, query, cb) -> cb.like(cb.upper(root.get("city")), "%"+city.toUpperCase()+"%"));
    }

    public static Specification<Person> countryLike(String country){
        return ((root, query, cb) -> cb.like(cb.upper(root.get("country")), "%"+country.toUpperCase()+"%"));
    }

    public static Specification<Person> cepEquals(String cep){
        return ((root, query, cb) -> cb.equal(cb.upper(root.get("cep")), cep.toUpperCase()));
    }

    public static Specification<Person> adressLike(String adress){
        return ((root, query, cb) -> cb.like(cb.upper(root.get("adress")), "%"+adress.toUpperCase()+"%"));
    }

    public static Specification<Person> complementLike(String complement){
        return ((root, query, cb) -> cb.like(cb.upper(root.get("adress")), "%"+complement.toUpperCase()+"%"));
    }

    public static Specification<Person> stateRegEquals(String stateReg){
        return ((root, query, cb) -> cb.equal(cb.upper(root.get("stateReg")), stateReg.toUpperCase()));
    }

    public static Specification<Person> isSuply(){
        return ((root, query, cb) -> cb.isTrue(root.get("isSuply")));
    }

    public static Specification<Person> isClient(){
        return ((root, query, cb) -> cb.isTrue(root.get("isClient")));
    }

    public static Specification<Person> isEmployee(){
        return ((root, query, cb) -> cb.isTrue(root.get("isEmployee")));
    }

    public static Specification<Person> timestampRegBetween(
            Instant start, Instant end) {

        return (root, query, cb) ->
                cb.between(root.get("timestampReg"), start, end);
    }

    public static Specification<Person> enterpriseEquals(String enterprise){
        return ((root, query, cb) -> cb.equal(root.get("enterprise"), enterprise));
    }

}
