package com.zenkey.service;

import org.springframework.http.ResponseEntity;

public interface DiscoveryIssuerService {

    ResponseEntity callDiscoveryIssuerService(String clientId, String mccmnc, String sub, String phoneNumber);

}
