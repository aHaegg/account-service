package se.andreas.accountservice.dto;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class StatusSerializer extends JsonSerializer<Status> {
    @Override
    public void serialize(Status accountRole, JsonGenerator generator, SerializerProvider serializerProvider) throws IOException {
        generator.writeStartObject();
        generator.writeFieldName(accountRole.getClass().getSimpleName());
        generator.writeStartObject();
        generator.writeStringField("statusType", accountRole.getStatusType().name());
        generator.writeEndObject();
        generator.writeEndObject();
    }
}
