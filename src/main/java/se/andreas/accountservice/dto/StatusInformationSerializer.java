package se.andreas.accountservice.dto;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class StatusInformationSerializer extends JsonSerializer<StatusInformation> {
    @Override
    public void serialize(StatusInformation statusInformation, JsonGenerator generator, SerializerProvider serializerProvider) throws IOException {
        generator.writeStartObject();
        generator.writeFieldName(statusInformation.getClass().getSimpleName());
        generator.writeStartObject();
        generator.writeStringField("status", statusInformation.getStatus().name());
        generator.writeEndObject();
        generator.writeEndObject();
    }
}
