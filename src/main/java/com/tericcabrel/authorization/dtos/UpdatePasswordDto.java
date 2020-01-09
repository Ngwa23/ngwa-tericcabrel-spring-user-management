package com.tericcabrel.authorization.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UpdatePasswordDto {
    @Size(min = 6, message = "Must be at least 6 characters")
    @NotBlank(message = "This field is required")
    private String currentPassword;

    @Size(min = 6, message = "Must be at least 6 characters")
    @NotBlank(message = "This field is required")
    private String newPassword;

    public String getCurrentPassword() {
        return currentPassword;
    }

    public UpdatePasswordDto setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
        return this;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public UpdatePasswordDto setNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }
}