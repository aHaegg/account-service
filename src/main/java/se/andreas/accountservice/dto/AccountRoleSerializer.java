package se.andreas.accountservice.dto;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class AccountRoleSerializer extends JsonSerializer<AccountRole> {
    @Override
    public void serialize(AccountRole accountRole, JsonGenerator generator, SerializerProvider serializerProvider) throws IOException {
        generator.writeStartObject();
        generator.writeFieldName(accountRole.getClass().getSimpleName());
        generator.writeStartObject();
        generator.writeStringField("name", accountRole.getName());
        generator.writeStringField("role", accountRole.getRole().name());
        generator.writeEndObject();
        generator.writeEndObject();
    }
}
