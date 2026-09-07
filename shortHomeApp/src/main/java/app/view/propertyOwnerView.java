package app.view;

import app.domain.PropertyOwner;
import app.domain.enums.DocumentsTypeEnum;
import app.domain.enums.OwnerTypeEnum;

import java.util.Scanner;

public class propertyOwnerView {

    Scanner sc = new Scanner(System.in);

    private final PropertyOwnerService propertyOwnerService;

    public PropertyOwnerView(PropertyOwnerService propertyOwnerService){
        this.propertyOwnerService = propertyOwnerService;
    }

    public void createPropertyOwner() {
        System.out.println("Ingrese ID del Propietario");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Seleccione el Tipo de Documento");
        String docType = setDocType();
        System.out.println("Ingrese noombre Propietario");
        String name = sc.nextLine();
        System.out.println("Ingrese apellido Propietario");
        String lastName = sc.nextLine();
        System.out.println("Ingrese Telefono Propietario");
        String Phone = sc.nextLine();
        System.out.println("Ingrese Correo Propietario");
        String mail = sc.nextLine();
        System.out.println("Ingrese Direccion Propietario");
        String address = sc.nextLine();
        System.out.println("Ingrese Contraseña Propietario");
        String Password = sc.nextLine();
        System.out.println("Ingrese Fecha cumpleaños Propietario");
        String birthDayDate = sc.nextLine();
        System.out.println("Ingrese Tipo Propietario");
        String propiertyType = setOwnerType();

        propertyOwnerService.createPropertyOwner(id, docType, name, lastName, birthDayDate,address, propiertyType, mail, Phone, Password);
    }
//Metodo helper

    public String setDocType() {
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
