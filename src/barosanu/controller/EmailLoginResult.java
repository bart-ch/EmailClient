package barosanu.controller;

/**
 * Created by "Bartosz Chodyla" on 2020-08-16.
 */
public enum EmailLoginResult {
    SUCCESS,
    FAILED_BY_CREDENTIALS,
    FAILED_BY_NETWORK,
    FAILED_BY_UNEXPECTED_ERROR;
}
