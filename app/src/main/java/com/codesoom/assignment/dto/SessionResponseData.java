package com.codesoom.assignment.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class SessionResponseData {

    private String accessToken;

    @Builder
    public SessionResponseData(String accessToken) {
        this.accessToken = accessToken;
    }
}
