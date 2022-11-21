package com.DigitalVisionProject.service.repositories;

public interface EmailSender {
    void send(String to, String email);
}
