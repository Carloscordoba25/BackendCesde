package app.domain.enums;

public enum DocumentsTypeEnum {

    CEDULA_CIUDADANIA("Cedula de Ciudadania"),
    TARJETA_IDENTIDAD("Tarjeta de Identidad"),
    CEDULA_EXTRANJERIA("Cedula Extrangeria"),
    PASAPORTE("Pasaporte");

    private final String value;

     DocumentsTypeEnum (String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
