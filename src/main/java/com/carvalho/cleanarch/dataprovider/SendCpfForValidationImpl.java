package com.carvalho.cleanarch.dataprovider;

import com.carvalho.cleanarch.core.dataprovider.SendCpfForValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCpfForValidationImpl implements SendCpfForValidation {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send(String cpf) {
    kafkaTemplate.send("tp-cpf-validation", cpf);
    }

}
