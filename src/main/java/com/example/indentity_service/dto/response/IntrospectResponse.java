package com.example.indentity_service.dto.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class IntrospectResponse {
    boolean valid;
}
