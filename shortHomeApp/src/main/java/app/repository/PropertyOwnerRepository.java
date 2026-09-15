package app.repository;

import app.domain.Person;
import app.domain.PropertyOwner;
import app.domain.enums.DocumentsTypeEnum;
import app.domain.enums.OwnerTypeEnum;

public class PropertyOwnerRepository {

public PropertyOwner create (){
    System.out.println("Guardando en tabla PROPERTY_OWNER:");
    System.out.println("ID -> " + PropertyOwner.getPropertyOwnerId());
    System.out.println("Nombre -> " + PropertyOwner.getPropertyOwnerName());
    return null;
}
}
