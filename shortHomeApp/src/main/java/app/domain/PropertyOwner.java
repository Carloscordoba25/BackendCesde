package app.domain;

import app.domain.enums.DocumentsTypeEnum;
import app.domain.enums.OwnerTypeEnum;

import java.sql.Date;

public class PropertyOwner extends Person {
    private OwnerTypeEnum OwnerType;


    public PropertyOwner(int id, String name, String lastname, String phone, String mail, String adders, String password, java.util.Date birthday, String propertyType) {
        super();
    }

    public PropertyOwner(int id, DocumentsTypeEnum docType, String name, String lastName, String phone, String email, String address, String password, Date birthDay, OwnerTypeEnum ownerType) {
        super(id, docType, name, lastName, phone, email, address, password, birthDay);
        OwnerType = ownerType;
    }

    public OwnerTypeEnum getOwnerType() {
        return OwnerType;
    }

    public void setOwnerType(OwnerTypeEnum ownerType) {
        OwnerType = ownerType;
    }

    private static int id;

    public static int getPropertyOwnerId() {
        return id;
    }

    public static void setId(int id) {
        PropertyOwner.id = id;
    }

    private static String name;

    public static String getPropertyOwnerName(){
        return name;
    }

}
