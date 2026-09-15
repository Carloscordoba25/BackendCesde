package app.view;

import app.domain.PropertyOwner;
import app.service.PropertyOwnerServiceImpl;

import java.util.Date;
import java.util.Scanner;

import static app.service.helpers.SetOwnerDocType.setDocType;

public class propertyOwnerView {
    private final PropertyOwnerServiceImpl propertyOwnerServiceImpl;

    Scanner sc = new Scanner(System.in);

    PropertyOwnerView(PropertyOwnerServiceImpl propertyOwnerServiceImpl){
        this.propertyOwnerServiceImpl = propertyOwnerServiceImpl;

public void create PropertyOwner(){
            System.out.println("Ingrese su Tipo de documento");
            int DocumentsType = sc.nextLine();
            System.out.println("Ingrese su Nombre");
            String name = sc.nextLine();
            System.out.println("Ingrese su Apellido");
            String lastname = sc.nextLine();
            System.out.println("Ingrese su Telefono");
            String phone = sc.nextLine();
            System.out.println("Ingrese su Correo");
            String mail = sc.nextLine();
            System.out.println("Ingrese su Direccion");
            String address = sc.nextLine();
            System.out.println("Ingrese su Contraseña");
            String password = sc.nextLine();
            System.out.println("Ingrese su Fecha de cumpleaños");
            String birthday = sc.nextLine();
            System.out.println("Ingrese Tipo de propietario");
            String ownerType = sc.nextLine();


            propertyOwnerServiceImpl.create(DocumentsType, name, lastname, phone, address, mail,  password, birthday, ownerType);



        }
    }
}





