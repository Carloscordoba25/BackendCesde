package app.domain.enums;

public enum MaritalStated {
    SOLTERO("Soltero"),
    CASADO("Casado"),
    VIUDO("Viudo"),
    UNION_LIBRE("Union Libre");

    private final String value;

    MaritalStated (String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
