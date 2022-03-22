package se.andreas.accountservice.dto;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class RoleInformationSerializer extends JsonSerializer<RoleInformation> {
    @Override
    public void serialize(RoleInformation roleInformation, JsonGenerator generator, SerializerProvider serializerProvider) throws IOException {
        generator.writeStartObject();
        generator.writeFieldName(roleInformation.getClass().getSimpleName());
        generator.writeStartObject();
        generator.writeStringField("name", roleInformation.getName());
        generator.writeStringField("role", roleInformation.getRole().name());
        generator.writeEndObject();
        generator.writeEndObject();
    }
}
