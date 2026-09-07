package app.domain.enums;

public enum OwnerTypeEnum {
    DIRECT ("Propietario Directo"),
    FIDUCIA ("Fiducia"),
    COMPANY ("Compañia"),
    IN_CHARGE ("Encarcado");

    private final String value;

    OwnerTypeEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
