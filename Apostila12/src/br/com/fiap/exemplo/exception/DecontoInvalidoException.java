package br.com.fiap.exemplo.exception;

public class DecontoInvalidoException extends RuntimeException {
    public DecontoInvalidoException(String message) {
        super(message);
    }
}
