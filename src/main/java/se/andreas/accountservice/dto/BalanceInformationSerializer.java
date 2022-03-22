package se.andreas.accountservice.dto;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class BalanceInformationSerializer extends JsonSerializer<BalanceInformation> {
    @Override
    public void serialize(BalanceInformation balanceInformation, JsonGenerator generator, SerializerProvider serializerProvider) throws IOException {
        generator.writeStartObject();
        generator.writeFieldName(balanceInformation.getClass().getSimpleName());
        generator.writeStartObject();
        generator.writeStringField("balance", balanceInformation.getBalance().toString());
        generator.writeStringField("currency", balanceInformation.getCurrency());
        generator.writeStringField("interest", balanceInformation.getInterest().toString());
        generator.writeEndObject();
        generator.writeEndObject();
    }
}
