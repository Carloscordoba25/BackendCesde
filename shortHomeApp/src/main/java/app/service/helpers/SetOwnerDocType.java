package app.service.helpers;

import app.domain.enums.DocumentsTypeEnum;
import app.domain.enums.OwnerTypeEnum;

import java.util.Random;
import java.util.Scanner;

public class SetOwnerDocType {
    //Metodo helper
    static Scanner sc = new Scanner(System.in);

    public static String setDocType() {
        System.out.println("Seleccione 1. Cedula 2. TI 3. CE 4. Pasaporte ");
        int option = sc.nextInt();
        String value = "";
        switch (option) {
            case 1:
                value = DocumentsTypeEnum.CEDULA_CIUDADANIA.getValue();
                break;
            case 2:
                value = DocumentsTypeEnum.TARJETA_IDENTIDAD.getValue();
                break;
            case 3:
                value = DocumentsTypeEnum.CEDULA_EXTRANJERIA.getValue();
                break;
            case 4:
                value = DocumentsTypeEnum.PASAPORTE.getValue();
                break;
            default:
                System.out.println("Seleccione Una Opcion Valida");

        }
        return value;
}
    public String setOwnerType() {
        System.out.println("Seleccione el tipo de Arrendador");
        System.out.println("Seleccione 1. Directo 2. Fiducia 3. Compañia 4. Encargado");

        int option = sc.nextInt();
        String value = "";
        switch (option) {
            case 1:
                value = OwnerTypeEnum.DIRECT.getValue();
                break;
            case 2:
                value = OwnerTypeEnum.FIDUCIA.getValue();
                break;
            case 3:
                value = OwnerTypeEnum.COMPANY.getValue();
                break;
            case 4:
                value = OwnerTypeEnum.IN_CHARGE.getValue();
                break;
            default:
                System.out.println("Seleccione Una Opcion Valida");
        }
        return value;
    }
}