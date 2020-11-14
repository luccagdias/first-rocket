package com.example.firstrocket.services.validation;

import com.example.firstrocket.domain.Mentorado;
import com.example.firstrocket.dto.MentoradoNewDTO;
import com.example.firstrocket.repositories.MentoradoRepository;
import com.example.firstrocket.resources.exception.FieldMessage;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;

public class MentoradoInsertValidator implements ConstraintValidator<MentoradoInsert, MentoradoNewDTO> {

    @Autowired
    private MentoradoRepository repo;

    @Override
    public void initialize(MentoradoInsert ann) {
    }

    @Override
    public boolean isValid(MentoradoNewDTO objDto, ConstraintValidatorContext context) {
        List<FieldMessage> list = new ArrayList<>();

        Mentorado aux = repo.findByEmail(objDto.getEmail());

        if (aux != null) {
            list.add(new FieldMessage("email", "Este E-mail já está cadastrado!"));
        }

        for (FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
                    .addConstraintViolation();
        }
        return list.isEmpty();
    }
}
