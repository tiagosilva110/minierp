package io.github.tiagosilva110.mini_erp.service;

import io.github.tiagosilva110.mini_erp.model.Person;
import io.github.tiagosilva110.mini_erp.repository.PersonRepository;
import io.github.tiagosilva110.mini_erp.repository.specs.PersonSpecs;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    public Person save(Person person){
        return repository.save(person);
    }

    public void update(Person person) {
        if(person.getId() == null){
            throw new IllegalArgumentException("Requires saved person");
        }
        repository.save(person);
    }

    public Optional<Person> findById(UUID id){
        return repository.findById(id);
    }

    public void delete(Person person){
        repository.delete(person);
    }

    public List<Person> search(
            Boolean isPerson,
            String cpfCnpj,
            String name,
            String fantasyName,
            Integer department,
            String phone,
            String email,
            String district,
            String city,
            String country,
            String cep,
            String adress,
            String complement,
            String stateReg,
            Boolean isSuply,
            Boolean isClient,
            Boolean isEmployee,
            UUID enterprise
    ){
        Specification<Person> specs = Specification.where(((root, query, criteriaBuilder) -> criteriaBuilder.conjunction()));

        if (isPerson != null){
            specs = specs.and(PersonSpecs.isPerson(isPerson));
        }
        if (cpfCnpj != null){
            specs = specs.and(PersonSpecs.cpfCnpjEquals(cpfCnpj));
        }
        if (name != null){
            specs = specs.and(PersonSpecs.nameLike(name));
        }
        if (fantasyName != null){
            specs = specs.and(PersonSpecs.fantasyNameLike(fantasyName));
        }
        if (department != null){
            specs = specs.and(PersonSpecs.departmentEquals(department));
        }
        if (phone != null){
            specs = specs.and(PersonSpecs.phoneEquals(phone));
        }
        if (email != null){
            specs = specs.and(PersonSpecs.emailLike(email));
        }
        if (district != null){
            specs = specs.and(PersonSpecs.districtLike(district));
        }
        if (city != null){
            specs = specs.and(PersonSpecs.cityLike(city));
        }
        if (country != null){
            specs = specs.and(PersonSpecs.countryLike(country));
        }
        if (cep != null){
            specs = specs.and(PersonSpecs.cepEquals(cep));
        }
        if (adress != null){
            specs = specs.and(PersonSpecs.adressLike(adress));
        }
        if (complement != null){
            specs = specs.and(PersonSpecs.complementLike(complement));
        }
        if (stateReg != null){
            specs = specs.and(PersonSpecs.stateRegEquals(stateReg));
        }
        if (isSuply != null){
            specs = specs.and(PersonSpecs.isSuply(isSuply));
        }
        if (isClient != null){
            specs = specs.and(PersonSpecs.isClient(isClient));
        }
        if (isEmployee != null){
            specs = specs.and(PersonSpecs.isEmployee(isEmployee));
        }
        if (enterprise != null){
            specs = specs.and(PersonSpecs.enterpriseEquals(enterprise));
        }
        return repository.findAll((Sort) specs);
        }




}
