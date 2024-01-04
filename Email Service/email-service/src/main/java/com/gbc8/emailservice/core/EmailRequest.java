package com.gbc8.emailservice.core;

public record EmailRequest(String to, String subject, String body) {

}
