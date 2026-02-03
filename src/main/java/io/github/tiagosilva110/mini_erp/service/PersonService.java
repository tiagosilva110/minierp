package io.github.tiagosilva110.mini_erp.service;

import io.github.tiagosilva110.mini_erp.controller.dto.PersonCreateDTO;
import io.github.tiagosilva110.mini_erp.controller.dto.PersonDTO;
import io.github.tiagosilva110.mini_erp.controller.dto.PersonUpdateDTO;
import io.github.tiagosilva110.mini_erp.controller.dto.mapper.AddressMapper;
import io.github.tiagosilva110.mini_erp.controller.dto.mapper.ContactMapper;
import io.github.tiagosilva110.mini_erp.controller.dto.mapper.PersonMapper;
import io.github.tiagosilva110.mini_erp.model.Department;
import io.github.tiagosilva110.mini_erp.model.Person;
import io.github.tiagosilva110.mini_erp.repository.DepartmentRepository;
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
    private final DepartmentRepository departmentRepository;

    private final PersonMapper personMapper;
    private final ContactMapper contactMapper;
    private final AddressMapper addressMapper;

    public PersonDTO create(PersonCreateDTO dto){
        Person person = personMapper.toEntity(dto);

        if (dto.contact() != null){
            person.setContact(
                    contactMapper.toEntity(dto.contact())
            );
        }

        if (dto.address() != null){
            person.setAddress(
                    addressMapper.toEntity(dto.address())
            );
        }

        if (dto.department() != null) {
            Department department = (Department) departmentRepository
                    .findById(dto.department())
                    .orElseThrow(() ->
                            new IllegalArgumentException("Department not found")
                    );
            person.setDepartment(department);
        }

        Person saved = repository.save(person);

        return personMapper.toDTO(saved);

    }

    public PersonDTO findById(UUID id) {
        Person person = repository.findById(id)
                .orElseThrow(() ->
                        new IllegalArgumentException("Person not found")
                );
        return personMapper.toDTO(person);
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
            Boolean isSupply,
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
        if (isSupply != null){
            specs = specs.and(PersonSpecs.isSupply(isSupply));
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
